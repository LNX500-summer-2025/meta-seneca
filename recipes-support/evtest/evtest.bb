SUMMARY = "Input device event monitor (evdev)"
DESCRIPTION = "evtest prints evdev kernel events and device info."
HOMEPAGE = "https://gitlab.freedesktop.org/libevdev/evtest/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PV = "1.34"

SRC_URI = "https://gitlab.freedesktop.org/libevdev/evtest/-/archive/evtest-${PV}/evtest-evtest-${PV}.tar.gz"
SRC_URI[sha256sum] = "0e7a2eeff380af796e5e9b21b6f48fd706c58c931162c151c2c1074bdfeb85c6"

S = "${WORKDIR}/evtest-evtest-${PV}"

inherit autotools pkgconfig

FILES:${PN} += "${bindir}/evtest"

