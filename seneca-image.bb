SUMMARY = "Base image for Seneca labs"
LICENSE = "MIT"
inherit core-image

IMAGE_LINGUAS = " "

IMAGE_FEATURES:append = " ssh-server-openssh splash tools-debug tools-sdk"

IMAGE_INSTALL:append = " usbutils usbinit i2c-tools evtest libgpiod libgpiod-tools"

DISTRO_FEATURES:append = " usbgadget"
MACHINE_FEATURES:append = " usbgadget usbhost"

