DESCRIPTION = "Gloo is a collective communications library useful for machine learning applications."
HOMEPAGE = "https://github.com/facebookincubator/gloo"
# FIXME !!!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea1ecec5f757696cea349b925fa70342"


SRC_URI = "git://github.com/facebookincubator/gloo.git;protocol=https;branch=main"
SRCREV = "c82c8b9387151372fce889215316225cdd44565b"

#S = "${WORKDIR}/git"

#DEPENDS = "cmake"

#inherit cmake


DEPENDS = "libuv cmake"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "\
    -DBUILD_TEST=OFF \
    -DUSE_REDIS=OFF \
"
do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp ${B}/gloo/libgloo.a ${D}${libdir}/
}

FILES_${PN} += "${libdir}/libgloo.a "
