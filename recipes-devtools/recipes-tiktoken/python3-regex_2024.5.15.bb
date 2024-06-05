
SUMMARY = "Alternative regular expression module, to replace re."
HOMEPAGE = "https://github.com/mrabarnett/mrab-regex"
AUTHOR = "Matthew Barnett <regex@mrabarnett.plus.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

SRC_URI = "https://files.pythonhosted.org/packages/7a/db/5ddc89851e9cc003929c3b08b9b88b429459bf9acbf307b4556d51d9e49b/regex-2024.5.15.tar.gz"
SRC_URI[md5sum] = "ae95e2e37bb82641bb852dd5e1b5701f"
SRC_URI[sha256sum] = "d3ee02d9e5f482cc8309134a91eeaacbdd2261ba111b0fef3748eeb4913e6a2c"

S = "${WORKDIR}/regex-2024.5.15"

RDEPENDS_${PN} = ""

inherit setuptools3
