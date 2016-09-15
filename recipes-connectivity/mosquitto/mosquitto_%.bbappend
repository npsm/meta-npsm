FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

DEPENDS += " libwebsockets"

SRC_URI += "file://with-websockets.patch"
