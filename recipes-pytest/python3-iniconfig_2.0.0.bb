
SUMMARY = "brain-dead simple config-ini parsing"
HOMEPAGE = ""
AUTHOR = " <Ronny Pfannschmidt <opensource@ronnypfannschmidt.de>, Holger Krekel <holger.krekel@gmail.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

SRC_URI = "https://files.pythonhosted.org/packages/d7/4b/cbd8e699e64a6f16ca3a8220661b5f83792b3017d0f79807cb8708d33913/iniconfig-2.0.0.tar.gz"
SRC_URI[md5sum] = "3c030b3f51dcc3aca585de05635600e4"
SRC_URI[sha256sum] = "2d91e135bf72d31a410b17c16da610a82cb55f6b0477d1a902134b24a455b8b3"

S = "${WORKDIR}/iniconfig-2.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
