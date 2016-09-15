DESCRIPTION = "Redox C++ redis lib"
PR = "r1"
LICENSE = "APACHE2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=521fc6591d7f89e0075735c17386214b"

SRCREV = "64becf28f3dd454b83331b82d3ccc149f1c243ce"
SRC_URI = "git://github.com/hmartiro/redox.git;protocol=http;branch=master"

DEPENDS = "hiredis libev"
RDEPENDS_${PN} = "hiredis libev"

inherit cmake

S = "${WORKDIR}/git"

# do_install_append() {
# 	mkdir -p ${D}${includedir}/qmqtt/
# 	cp ${S}/*.h ${D}${includedir}/qmqtt/
# }

# FILES_${PN}-dbg += "${libdir}/${P}/.debug"
# FILES_${PN} += "${libdir}"
# FILES_${PN} += "${includedir}/*.h"
