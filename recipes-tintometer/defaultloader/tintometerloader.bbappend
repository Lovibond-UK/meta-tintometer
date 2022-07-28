SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

ROOTFS_POSTPROCESS_COMMAND += " do_install_append "

do_install_append() {
    
    #chown 777 -R ${D}/usr/bin
    #chmod 777 -R ${D}/usr/bin
       
    #ln -sf ${D}/opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
    #${D}/usr/bin/b2qt
    return
}

#pkg_postinst_tintometerloader(){}

pkg_postinst_ontarget_${PN} (){
    chown -R 777 ${D}/usr/bin
    ln -sf ${D}/opt/Tintometer/bin/TintometerLoader ${D}/usr/bin/b2qt
    }
