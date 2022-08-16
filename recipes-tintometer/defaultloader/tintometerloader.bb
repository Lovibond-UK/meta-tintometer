SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = " file://TintometerLoader  "

DEPENDS += "qtbase qtdeclarative qtdeclarative-native"

FILES_${PN} = " /opt/Tintometer/* \
		 ${bindir}/b2qt \ "

INSANE_SKIP_${PN} += "installed-vs-shipped"

do_install() {
    
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    install -m 755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin
    
}

#do_install_append()
#{
#    # make the folders for the symbolic link and give them 777 rights   
#    mkdir -m777 ${D}/usr
#   mkdir -m777 ${D}/usr/bin
#    
#    chown -R 777 ${D}/usr/bin
#    chmod -R 777 ${D}/usr/bin
#    
#    lnr ${D}/opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
#return
#}


do_package_qa[noexec] = "1"
