
SUMMARY = "Core utilities for Python packages"
HOMEPAGE = ""
AUTHOR = " <Donald Stufft <donald@stufft.io>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faadaedca9251a90b205c9167578ce91"

SRC_URI = "https://files.pythonhosted.org/packages/ee/b5/b43a27ac7472e1818c4bafd44430e69605baefe1f34440593e0332ec8b4d/packaging-24.0.tar.gz"
SRC_URI[md5sum] = "8e3bc7b152efc9ffadabddc9f8465b02"
SRC_URI[sha256sum] = "eb82c5e3e56209074766e6885bb04b8c38a0c015d0a30036ebe7ece34c9989e9"

S = "${WORKDIR}/packaging-24.0"

RDEPENDS_${PN} = ""

inherit setuptools3
