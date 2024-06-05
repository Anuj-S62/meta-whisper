
SUMMARY = "plugin and hook calling mechanisms for python"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"
AUTHOR = "Holger Krekel <holger@merlinux.eu>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

SRC_URI = "https://files.pythonhosted.org/packages/96/2d/02d4312c973c6050a18b314a5ad0b3210edb65a906f868e31c111dede4a6/pluggy-1.5.0.tar.gz"
SRC_URI[md5sum] = "ac0870be78ba0ee227a5c3955efeba59"
SRC_URI[sha256sum] = "2cffa88e94fdc978c4c574f15f9e59b7f4201d439195c3715ca9e2486f1d0cf1"

S = "${WORKDIR}/pluggy-1.5.0"

RDEPENDS_${PN} = ""

inherit setuptools3
