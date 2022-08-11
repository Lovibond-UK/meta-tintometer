SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = " file://TintometerLoader "

#do_compile() {
#    return
#    # following compilation will not be seen by bitbake
#}

#INSANE_SKIP_${PN} += "installed-vs-shipped"

do_install() {
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    install -m 755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin
    
   # lnr ${D}/opt/Tintometer/bin/TintometerLoader ${D}/${bindir}/b2qt
}

FILES_${PN} = " /opt/Tintometer/*
                ${bindir}/b2qt \
"

#addtask create_pdb_symlink after do_rootfs before do_image
#do_create_pdb_symlink () {
#    lnr /opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
#
#}

#do_package_qa[noexec] = "1"
