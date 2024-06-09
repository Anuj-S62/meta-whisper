# llvmlite_0.42.0.bb
DESCRIPTION = "llvmlite prebuilt binary"
HOMEPAGE = "https://github.com/numba/llvmlite"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#SRC_URI = "file://llvmlite-0.42.0-cp39-cp39-manylinux_2_31_x86_64.whl"
#SRC_URI[md5sum] = "7b3ecf5f9fe3cb894ab1f1ff98faa745"
#SRC_URI[sha256sum] = "4e306648d1dea6bf442c3fa1070c41137cac37d2955b1c8de2bebc9c9a4505da"
#SCR_URI = "https://files.pythonhosted.org/packages/62/af/c3df8a3f26c3cff7730ab1cb7c7a4c899f8c4fb4acd9020150d1599575ac/llvmlite-0.42.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl"
SRC_URI = "file://llvmlite-0.42.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl"
SRC_URI[md5sum] = "c4e0140f0c1b81f03b45ef2dcb66e2a0"
SRC_URI[sha256sum] = "d47494552559e00d81bfb836cf1c4d5a5062e54102cc5767d5aa1e77ccd2505c"

#inherit pypi

DEPENDS += " unzip-native"

RDEPENDS:${PN} += " zlib"

do_install() {
    rm -rf ${WORKDIR}/llvmlite
    install -d ${D}/usr/lib/python3.12/site-packages
    unzip ${WORKDIR}/llvmlite-0.42.0-cp312-cp312-manylinux_2_17_x86_64.manylinux2014_x86_64.whl -d ${WORKDIR}/llvmlite
    cp -R ${WORKDIR}/llvmlite/* ${D}/usr/lib/python3.12/site-packages/
}

# Set the library path
do_configure:prepend() {
    export LD_LIBRARY_PATH="${D}/usr/lib/python3.12/site-packages/llvmlite/binding:${LD_LIBRARY_PATH}"
}


#FILES_${PN} += "/usr/lib/python3.12/site-packages/*  /usr/lib/python3.12/site-packages/llvmlite"

FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/binding"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/binding/*"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/__init__.py"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/ir"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/tests"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/utils.py"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite/_version.py"
FILES:${PN} += " /usr/lib/python3.12/site-packages/llvmlite-0.42.0.dist-info"
FILES:${PN} += " /usr/lib/python3.12/site-packages/llvmlite-0.42.0.dist-info/*"
FILES:${PN} += "/usr/lib/python3.12/site-packages/llvmlite.libs"
