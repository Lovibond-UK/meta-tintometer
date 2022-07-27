SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"



my_image_postprocess_function() {
    
    chown 777 -R /usr/bin
    chmod 777 -R /usr/bin

    ln -sf /opt/Tintometer/bin/TintometerLoader ${IMAGE_ROOTFS}/opt/b2qt

}

my_remove_function(){

    RDEPENDS_${PN}_append = "libQt5Charts"
}

ROOTFS_POSTPROCESS_COMMAND += "my_image_postprocess_function; "
ROOTFS_POST_PROCESS += "my_remove_function; "


