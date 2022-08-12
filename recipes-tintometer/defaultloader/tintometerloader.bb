SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
PR = "r0"

SRC_URI = " file://TintometerLoader  "

DEPENDS += "qtbase qtdeclarative qtdeclarative-native"

FILES_${PN} = " ${D}/opt/Tintometer/* \
                ${bindir}/b2qt \ "

INSANE_SKIP_${PN} += "installed-vs-shipped"

do_install() {
    install -d 0755 ${D}/opt/Tintometer
    install -d 0755 ${D}/opt/Tintometer/bin
    install -m 0755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin
    
    #unset LD_PRELOAD
    
    #chown root /usr/bin/sudo
    #chmod u+xs /usr/bin/sudo
    #echo "deadalus" | sudo -S -k chown root /usr/bin/sudo
    #echo "deadalus" | sudo -S -k chmod u+xs /usr/bin/sudo
    
    #echo "deadalus" | sudo -S -k chown -R 777 /usr/bin
    #echo "deadalus" | sudo -S -k chmod -R 777 /usr/bin
    
    #lnr ${D}/opt/Tintometer/bin/TintometerLoader /usr/bin/b2qt
    
    #export HISTIGNORE='*sudo -S*'
    #echo "deadalus" | sudo -S -k lnr ${D}/opt/Tintometer/bin/TintometerLoader /usr/bin/b2qt
}


#addtask create_pdb_symlink after do_rootfs before do_image
#do_create_pdb_symlink () {
#    lnr /opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
#
#}

do_package_qa[noexec] = "1"
