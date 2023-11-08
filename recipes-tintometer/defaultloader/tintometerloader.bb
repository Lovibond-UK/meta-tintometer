SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = "file://TintometerLoader_Linux"

DEPENDS += "qtbase qtdeclarative qtdeclarative-native"

FILES_${PN} = " /opt/Tintometer/* \
		 ${bindir}/b2qt \ "

INSANE_SKIP_${PN} += "installed-vs-shipped"

DO_INSTALL() {
    install -d ${D}/opt/Tintometer
    install -m 755 ${WORKDIR}/TintometerLoader_Linux ${D}/opt/Tintometer
}

do_package_qa[noexec] = "1"
