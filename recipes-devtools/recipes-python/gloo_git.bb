DESCRIPTION = "Gloo is a collective communications library useful for machine learning applications."
HOMEPAGE = "https://github.com/facebookincubator/gloo"
# FIXME !!!
LICENSE = "CLOSED"


SRC_URI = "git://github.com/facebookincubator/gloo.git;protocol=https;branch=main"
SRCREV = "c82c8b9387151372fce889215316225cdd44565b"

S = "${WORKDIR}/git"

DEPENDS = "cmake"

inherit cmake
