SUMMARY = "C library and tools for the Linux GPIO character device"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=2caced0b25dfefd4c601d92bd15116de"

PV = "0.3.1"

SRC_URI = "https://www.kernel.org/pub/software/libs/libgpiod/${BP}.tar.xz"
SRC_URI[sha256sum] = "6dfd6aeb544e8b7baf484a05c9ae0e67022c109362a41d87005393046b6beacf"

S = "${WORKDIR}/${BP}"

inherit autotools pkgconfig

# Build the CLI tools
EXTRA_OECONF += "--enable-tools"

# Ensure the tools go into a subpackage that is packed BEFORE ${PN}
PACKAGE_BEFORE_PN += "${PN}-tools"
FILES:${PN}-tools = "${bindir}/*"
RDEPENDS:${PN}-tools = "${PN}"

