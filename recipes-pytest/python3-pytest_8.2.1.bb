
SUMMARY = "pytest: simple powerful testing with Python"
HOMEPAGE = "None"
AUTHOR = "Holger Krekel, Bruno Oliveira, Ronny Pfannschmidt, Floris Bruynooghe, Brianna Laugher, Florian Bruhin, Others (See AUTHORS) <None>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd27e41b6550fe0fc45356d1d81ee37c"

SRC_URI = "https://files.pythonhosted.org/packages/cf/4e/0ceea141f0e5d09de4053c5338c62615ae2bd9bd3f013813f5ec62e3cf97/pytest-8.2.1.tar.gz"
SRC_URI[md5sum] = "cb6a6c749aefbff22bf4d5451b9b3ae0"
SRC_URI[sha256sum] = "5046e5b46d8e4cac199c373041f26be56fdb81eb4e67dc11d4e10811fc3408fd"

S = "${WORKDIR}/pytest-8.2.1"

RDEPENDS_${PN} = "python3-iniconfig python3-packaging python3-pluggy"

inherit setuptools3
