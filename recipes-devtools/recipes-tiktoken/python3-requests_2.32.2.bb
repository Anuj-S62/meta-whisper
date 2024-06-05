
SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "https://requests.readthedocs.io"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/86/ec/535bf6f9bd280de6a4637526602a146a68fde757100ecf8c9333173392db/requests-2.32.2.tar.gz"
SRC_URI[md5sum] = "b84969b48f0d4ba34d1e4ed141106376"
SRC_URI[sha256sum] = "dd951ff5ecf3e3b3aa26b40703ba77495dab41da839ae72ef3c8e5d8e2433289"

S = "${WORKDIR}/requests-2.32.2"

RDEPENDS_${PN} = "python3-charset-normalizer python3-idna python3-urllib3 python3-certifi"

inherit setuptools3
