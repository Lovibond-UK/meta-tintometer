SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = " file://TintometerLoader "
              
do_install() {
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    
    install -m 0755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin/TintometerLoader
    
    lnr ${D}/${bindir}/TintometerLoader ${D}/${bindir}/b2qt
}


FILES_${PN} = "${bindir}/TintometerLoader \
               ${bindir}/b2qt \
              "
              
