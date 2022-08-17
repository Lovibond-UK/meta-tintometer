SUMMARY = "Add TintometerLoader to Qt image"
IMAGE_INSTALL_prepend := "TintometerLoader"

#ROOTFS_POSTPROCESS_COMMAND += " do_install_append "

do_install_append() {
    
    # make the folders for the symbolic link and give them 777 rights   
    #mkdir -m777 ${D}/usr
    #mkdir -m777 ${D}/usr/bin
    
    #chown -R 777 ${D}/usr/bin
    #chmod -R 777 ${D}/usr/bin
    
    #lnr ${D}/opt/Tintometer/bin/TintometerLoader_Linux ${D}/usr/bin/b2qt
    
    return
}
