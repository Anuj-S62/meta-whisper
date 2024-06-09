SUMMARY = "Whisper AI Python Example"
HOMEPAGE = "github.com"

LICENSE = "CLOSED"

SRC_URI += "file://example.py"
SRC_URI += "file://audio.wav"
SRC_URI += "file://audio4s.wav"
do_install(){
    install -d ${D}/usr/share/whisper-example

    cp -R ${WORKDIR}/example.py ${D}/usr/share/whisper-example/
    cp -R ${WORKDIR}/audio.wav ${D}/usr/share/whisper-example/
cp -R ${WORKDIR}/audio4s.wav ${D}/usr/share/whisper-example/
}

FILES:${PN} = " /usr/share/whisper-example /usr/share/whisper=example/example.py /usr/share/whisper=example/audio.wav "
