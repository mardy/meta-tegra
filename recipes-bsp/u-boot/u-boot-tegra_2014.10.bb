UBOOT_BINARY ?= "u-boot-dtb-tegra.${UBOOT_SUFFIX}"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
DESCRIPTION = "U-Boot for Nvidia Tegra platforms, based on Nvidia sources"
COMPATIBLE_MACHINE = "(tegra124)"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

PROVIDES += "u-boot"

DEPENDS = "dtc-native"

UBOOT_TEGRA_REPO ?= "github.com/madisongh/u-boot-tegra.git"
SRCBRANCH ?= "patches-l4t-r21.6"
SRC_URI = "git://${UBOOT_TEGRA_REPO};branch=${SRCBRANCH}"
SRCREV = "fe9a963c484d94e5617aa56281b4b83d94591e87"
PV .= "+git${SRCPV}"

S = "${WORKDIR}/git"
