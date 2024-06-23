SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c"

DEPENDS = "llvm-native llvm python3-numpy-native"

PYPI_PACKAGE = "numba"

inherit pypi setuptools3


SRC_URI = "https://files.pythonhosted.org/packages/bb/84/468592513867604800592b58d106f5e7e6ef61de226b59c1e9313917fbbb/numba-0.59.1.tar.gz"
SRC_URI[md5sum] = "e3b956b6129aa5f6d448119c18006e58"
SRC_URI[sha256sum] = "76f69132b96028d2774ed20415e8c528a34e3299a40581bae178f0994a2f370b"


export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	llvmlite \
"
