SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

ROOTFS_POSTPROCESS_COMMAND += " do_install_append "

do_install_append() {
    
    chown 777 -R ${D}/usr/bin
    chmod 777 -R ${D}/usr/bin
    
    ln -sf ${D}/opt/Tintometer/bin/TintometerLoader ${D}/opt/Tintometer
    #${D}/usr/bin/b2qt
}
