SUMMARY= ""
HOMEPAGE = ""
LICENSE = "CLOSED"

SRC_URI = "git://github.com/ggerganov/whisper.cpp.git;protocol=https;branch=master"
SRCREV = "c2bdb960cdb69af813d3a4bd72a90f852d695127"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

inherit cmake

INSANE_SKIP:${PN} += "ldflags"


do_compile(){
   cd ../git
   oe_runmake CFLAGS="${CFLAGS}" LDFLAGS="${LDFLAGS}" 
}

do_install(){
   install -d ${D}${bindir}
   install -m 0755 ${WORKDIR}/git/main ${D}${bindir}
}

FILE:${PN} = " /src/bin /src/bin/main"


