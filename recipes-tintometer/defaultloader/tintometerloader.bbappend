SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

ROOTFS_POSTPROCESS_COMMAND += " do_install_append "

do_install_append() {
    
    #chown 777 -R /usr/bin
    #chmod 777 -R /usr/bin
    
    ln -sf /opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
}
