# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=61c228c3bfec53a02febeb414da0992e"

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "http://www.tarsnap.com/spiped/spiped-1.5.0.tgz"
SRC_URI[sha256sum] = "b2f74b34fb62fd37d6e2bfc969a209c039b88847e853a49e91768dec625facd7"
SRC_URI[md5sum] = "43cfcbc4009887faf92a27d7d2a6351d"

# NOTE: some of these dependencies may be optional, check the Makefile and/or upstream documentation
DEPENDS = "openssl"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake BINDIR=${D}/usr/bin/ install
}

