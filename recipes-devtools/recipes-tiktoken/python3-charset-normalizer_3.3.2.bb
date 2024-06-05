
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/Ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/63/09/c1bc53dab74b1816a00d8d030de5bf98f724c52c1635e07681d312f20be8/charset-normalizer-3.3.2.tar.gz"
SRC_URI[md5sum] = "0a4019908d9e50ff13138e8a794d9e2b"
SRC_URI[sha256sum] = "f30c3cb33b24454a82faecaf01b19c18562b1e89558fb6c56de4d9118a032fd5"

S = "${WORKDIR}/charset-normalizer-3.3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
