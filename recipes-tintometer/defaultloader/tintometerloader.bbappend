SUMMARY = "Add TintometerLoader to Qt image"
IMAGE_INSTALL:prepend := "TintometerLoader"

#ROOTFS_POSTPROCESS_COMMAND += " do_install_append "
ROOTFS_POSTPROCESS_COMMAND += " DO_INSTALL:append "

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                META-TINTOMETER              *");
    bb.plain("*              Applying Easy Loader           *");
    bb.plain("***********************************************");    
}

DO_INSTALL:append() {
    
    # make the folders for the symbolic link and give them 777 rights   
    mkdir -m777 ${D}/usr
    mkdir -m777 ${D}/usr/bin
    
    chown -R 777 ${D}/usr/bin
    chmod -R 777 ${D}/usr/bin
    
    lnr ${D}/opt/Tintometer/bin/TintometerLoader_Linux ${D}/usr/bin/b2qt
    
    return
}
