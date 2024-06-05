# lets strongly consider meta-python-ai ... 
# recipe python3-pytorch is arch-independent
# we are bound to qemux86 here !


#
# hmm , did you look at the layerindex for example ... 
#  layers.openembedded.org
#
# you can search for recipes there as well  (scarthgap branch!)
#
#
# I did find: https://layers.openembedded.org/layerindex/branch/scarthgap/layer/meta-python-ai/ 
# And it has: https://layers.openembedded.org/layerindex/recipe/403843/  
# A recipe for python3-pytorch 2.1.2 .
# Try to use that layer ... if not it is at least a good source to import from. But direct use is preferred.
# ok i'll check it out.
# https://github.com/zboszor/meta-python-ai/blob/main/recipes-python/pytorch/python3-pytorch_2.1.2.bb
# 
# try the layer ... getting all these details right takes a lot of time ...
# ping you if you have it imported and are trying out builds.
# it has a scarthgap branch, so that is compatible with our master.


# PyTorch
#

SUMMARY = "PyTorch"
DESCRIPTION = "Tensors and Dynamic neural networks in Python with strong GPU acceleration"

# Version to use
SRCREV = "97ff6cfd9c86c5c09d7ce775ab64ec5c99230f5d"
PV = "2.3.0"
PR = "r0"

S = "${WORKDIR}/git"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=5c853508d63a8090fa952ff1af58217d"


# "gitsm" not working? v# gitsm should work, but its not ideal
SRC_URI = " \
    git://github.com/pytorch/pytorch.git;protocol=https;branch=release/2.3 \
    file://0001-Add-support-for-Yocto-build.patch \
"

RDEPENDS:${PN} += "protobuf gflags glog python3-numpy "
DEPENDS += " \
    python3-native \
    python3-pip-native \
    python3-numpy \
    protobuf-native \
    coreutils-native \
    sleef-native \
    python3-pyyaml-native \
    python3-typing_extensions-native \
    protobuf-native \
"

inherit cmake setuptools3

do_configure[network] = "1"
do_configure:prepend(){
    # alternative to "gitsm"
    cd ${S}
    git submodule sync
    git submodule update --init --recursive 
    #--jobs=$(nproc)

    # install required modules 
    #pip3 install opt-einsum
    # FIXME:: 
    ########## --> need recipe for python3-opt_einsum  <---
    ########## --> 
}

do_compile() {
    export _GLIBCXX_USE_CXX11_ABI=1
    export NATIVE_BUILD_DIR=${STAGING_DIR_NATIVE}/usr
    export CAFFE2_CUSTOM_PROTOC_EXECUTABLE=${STAGING_DIR_NATIVE}/usr/bin/protoc
    export USE_CUDA=OFF
    export USE_DISTRIBUTED=OFF
    export USE_NUMPY=ON
    export USE_XNNPACK=OFF
    export BUILD_CUSTOM_PROTOBUF=OFF
    export PYTHON_EXECUTABLE=${PYTHON}
    export CMAKE_SYSTEM_NAME=Linux
    export CMAKE_BUILD_TYPE=Release
    export CMAKE_SYSTEM_PROCESSOR=qemux86-64
    export NUMPY_INCLUDE_DIR=${PKG_CONFIG_SYSROOT_DIR}/usr/lib/python${PYTHON_BASEVERSION}/site-packages/numpy/core/include
    export CMAKE_PREFIX_PATH=${STAGING_DIR_TARGET}/usr
    #export CAFFE2_CPU_FLAGS="-mfpu=neon -mfloat-abi=hard"
    export BUILD_TEST=0
    setuptools3_do_compile
}

INSANE_SKIP:${PN} += "already-stripped"
# since v2.2.0
