SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
PR = "r0"

SRC_URI = " file://TintometerLoader  "

DEPENDS += "qtbase qtdeclarative qtdeclarative-native"

FILES_${PN} = " ${D}/opt/Tintometer/* \
                ${bindir}/b2qt \ "

#INSANE_SKIP_${PN} += "installed-vs-shipped"

do_install() {
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    install -m 755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin
    chown 777 /usr/bin
    chmod 777 /usr/bin
    lnr root::root ${D}/opt/Tintometer/bin/TintometerLoader /usr/bin/b2qt
}


#addtask create_pdb_symlink after do_rootfs before do_image
#do_create_pdb_symlink () {
#    lnr /opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
#
#}

do_package_qa[noexec] = "1"
