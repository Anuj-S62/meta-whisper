SUMMARY = "Triton for whisper"
DESCRIPTION = "Triton library for triton"

HOMEPAGE= "https://github.com/triton-lang/triton"

#FIXME
LICENSE = "CLOSED"

SRC_URI = "git://github.com/triton-lang/triton.git;protocol=https;branch=main"
SRCREV = "d86ae7b02e56b9cb454be4f4f7b986c26fb2ae8c"

S = "${WORKDIR}/git/python"

inherit python3native python_setuptools3_rust

#DEPENDS += " \
#	    foo-native \
#	   "
## ${WORKDIR}/recipe-sysroot-native/...  <-------
## This is a binary compiled for and running on your BUILD host.

#DEPENDS +0 " \
#	    bar \
#	   "
## ${WORKDIR}/recipe-sysroot/... <----
## This is a binary compiles for the target (arm) and usually a library required for the app.

# instead of "DEPENDS += python3-native" , we do use "inherit python3native"

DEPENDS += " \
	   cmake-native \
	   ninja-native \
"

#	   python3-pip-native \
#	   python3-certifi \
#	   ca-certificates \
#



do_compile:prepend(){
    export SSL_CERT_FILE=${STAGING_DIR_NATIVE}/etc/ssl/certs/ca-certificates.crt
}


#RDEPENDS:${PN} += ""

BBCLASSEXTEND = "native nativesdk"
