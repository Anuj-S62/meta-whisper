SUMMARY = "Triton for whisper"
DESCRIPTION = "Triton library for triton"

HOMEPAGE= "https://github.com/triton-lang/triton"

LICENSE = "CLOSED"

SRC_URI = "git://github.com/triton-lang/triton.git;protocol=https;branch=main"
SRCREV = "d86ae7b02e56b9cb454be4f4f7b986c26fb2ae8c"

S = "${WORKDIR}/git/python"

inherit python_setuptools3_rust

DEPENDS += " \
	   cmake-native (>=3.18) \
	   ninja (>=1.11.1) \
	   python3-certifi \
	   python3-native \
	   python3-wheel \
	   ca-certificates \
	   python3-pip-native \
"



do_compile:prepend(){
    export SSL_CERT_FILE=${STAGING_DIR_NATIVE}/etc/ssl/certs/ca-certificates.crt
}

RDEPENDS:${PN} += " \
           python3-certifi \
           ninja \
           python3-native \
           python3-wheel \
           cmake \
           ca-certificates \
"
BBCLASSEXTEND = "native nativesdk"
