
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://github.com/certifi/python-certifi"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11618cb6a975948679286b1211bd573c"

SRC_URI = "https://files.pythonhosted.org/packages/71/da/e94e26401b62acd6d91df2b52954aceb7f561743aa5ccc32152886c76c96/certifi-2024.2.2.tar.gz"
SRC_URI[md5sum] = "13d140d3605e55270a1241a705a05ab4"
SRC_URI[sha256sum] = "0569859f95fc761b18b45ef421b1290a0f65f147e92a1e5eb3e635f9a5e4e66f"

S = "${WORKDIR}/certifi-2024.2.2"

RDEPENDS_${PN} = ""

inherit setuptools3
