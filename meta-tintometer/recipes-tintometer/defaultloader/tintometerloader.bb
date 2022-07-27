SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = " file://TintometerLoader "

do_compile() {
    return
    # following compilation will not be seen by bitbake
}

do_install() {
    install -d ${D}/opt/Tintometer
    install -d ${D}/opt/Tintometer/bin
    install -m 755 ${WORKDIR}/TintometerLoader ${D}/opt/Tintometer/bin
}

do_package_qa[noexec] = "1"

FILES_${PN} = " /opt/Tintometer/*   "
INSANE_SKIP_${PN} += "installed-vs-shipped"


