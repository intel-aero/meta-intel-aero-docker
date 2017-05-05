LICENSE = "MIT"
IMAGE_FEATURES += "splash"
inherit core-image
require recipes-core/images/aero-base.inc
CORE_IMAGE_EXTRA_INSTALL += "docker docker-contrib"

