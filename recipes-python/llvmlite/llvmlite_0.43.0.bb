# llvmlite_0.42.0.bb
DESCRIPTION = "llvmlite prebuilt binary"
HOMEPAGE = "https://github.com/numba/llvmlite"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/llvmlite-0.43.0/llvmlite-0.43.0.dist-info/LICENSE;md5=a15ea9843f27327e08f3c5fbf8043a2b"

SRC_URI = "https://files.pythonhosted.org/packages/00/5f/323c4d56e8401c50185fd0e875fcf06b71bf825a863699be1eb10aa2a9cb/llvmlite-0.43.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl"
SRC_URI[md5sum] = "f21e07569b21555779afe5686dd92d0e"
SRC_URI[sha256sum] = "df6509e1507ca0760787a199d19439cc887bfd82226f5af746d6977bd9f66844"

do_unpack(){
    unzip ${WORKDIR}/llvmlite-0.43.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl -d ${WORKDIR}/llvmlite-0.43.0  
}

DEPENDS += " unzip-native"

RDEPENDS:${PN} += " zlib"

do_install() {
    install -d ${D}/usr/lib/python3.12/site-packages
    cp -R ${WORKDIR}/llvmlite-0.43.0/* ${D}/usr/lib/python3.12/site-packages/
}

do_configure:prepend() {
    export LD_LIBRARY_PATH="${D}/usr/lib/python3.12/site-packages/llvmlite/binding:${LD_LIBRARY_PATH}"
}

FILES:${PN} += "/usr/lib/python3.12/site-packages/* "
