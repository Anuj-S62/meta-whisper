# llvmlite_0.42.0.bb
DESCRIPTION = "llvmlite prebuilt binary"
HOMEPAGE = "https://github.com/numba/llvmlite"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/llvmlite-0.42.0/llvmlite-0.42.0.dist-info/LICENSE;md5=a15ea9843f27327e08f3c5fbf8043a2b"

SRC_URI += "file://llvmlite-0.42.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl"

do_unpack(){
    unzip ${WORKDIR}/llvmlite-0.42.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl -d ${WORKDIR}/llvmlite-0.42.0  
}

DEPENDS += " unzip-native"

RDEPENDS:${PN} += " zlib"

do_install(){
    install -d ${D}/usr/lib/python3.12/site-packages
    cp -R ${WORKDIR}/llvmlite-0.42.0/* ${D}/usr/lib/python3.12/site-packages/
}

do_configure:prepend() {
    export LD_LIBRARY_PATH="${D}/usr/lib/python3.12/site-packages/llvmlite/binding:${LD_LIBRARY_PATH}"
}


FILES:${PN} += "/usr/lib/python3.12/site-packages/* "
