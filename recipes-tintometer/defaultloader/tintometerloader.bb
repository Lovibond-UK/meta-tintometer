SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = " file://TintometerLoader "


FILES_${PN} = "${bindir}/TintometerLoader \
               ${bindir}/b2qt \
              "
              
do_install() {
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    lnr ${D}/${bindir}/TintometerLoader ${D}/${bindir}/b2qt
}
