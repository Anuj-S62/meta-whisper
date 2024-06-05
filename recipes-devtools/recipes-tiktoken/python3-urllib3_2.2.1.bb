
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = ""
AUTHOR = " <Andrey Petrov <andrey.petrov@shazow.net>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=52d273a3054ced561275d4d15260ecda"

SRC_URI = "https://files.pythonhosted.org/packages/7a/50/7fd50a27caa0652cd4caf224aa87741ea41d3265ad13f010886167cfcc79/urllib3-2.2.1.tar.gz"
SRC_URI[md5sum] = "872f7f43af1b48e7c116c7542ab39fab"
SRC_URI[sha256sum] = "d0570876c61ab9e520d776c38acbbb5b05a776d3f9ff98a5c8fd5162a444cf19"

S = "${WORKDIR}/urllib3-2.2.1"

RDEPENDS_${PN} = ""

inherit setuptools3
