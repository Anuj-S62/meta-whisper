SUMMARY = "A python binding for crfsuite"
HOMEPAGE = "https://github.com/scrapinghub/python-crfsuite"

LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0a36d267a3ece77cbc8ebc95ca7e2edd"

PYPI_PACKAGE = "numba"

SRC_URI[md5sum] = "e3b956b6129aa5f6d448119c18006e58"
SRC_URI[sha256sum] = "76f69132b96028d2774ed20415e8c528a34e3299a40581bae178f0994a2f370b"

inherit pypi setuptools3

DEPENDS += "python3-numpy-native "
