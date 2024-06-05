
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "None"
AUTHOR = "None <Kim Davies <kim+pypi@gumleaf.org>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=204c0612e40a4dd46012a78d02c80fb1"

SRC_URI = "https://files.pythonhosted.org/packages/21/ed/f86a79a07470cb07819390452f178b3bef1d375f2ec021ecfc709fc7cf07/idna-3.7.tar.gz"
SRC_URI[md5sum] = "31cc572cb7a6519159c927c998c64c79"
SRC_URI[sha256sum] = "028ff3aadf0609c1fd278d8ea3089299412a7a8b9bd005dd08b9f8285bcb5cfc"

S = "${WORKDIR}/idna-3.7"

RDEPENDS_${PN} = ""

inherit setuptools3
