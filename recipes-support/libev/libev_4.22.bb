# libev
DESCRIPTION = "Event Loop Libaray"
HOMEPAGE = "http://software.schmorp.de/pkg/libev.html"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d6ad416afd040c90698edcdf1cbee347"
SRC_URI = "http://dist.schmorp.de/libev/Attic/libev-${PV}.tar.gz"
PR = "r1"

inherit autotools

SRC_URI[md5sum] = "bf0007e37240103d3c2be80ca9bee3f9"
SRC_URI[sha256sum] = "736079e8ac543c74d59af73f9c52737b3bfec9601f020bf25a87a4f4d0f01bd6"

# patches imported from Fedora rpms
# event.h is removed intentionaly, because is there only for
# backward compatibility with libevent
do_install_append() {
    rm -f ${D}/${includedir}/event.h
}
