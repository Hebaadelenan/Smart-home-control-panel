include recipes-sato/images/core-image-sato.bb
INHERIT += "systemd"
IMAGE_FEATURES += " ssh-server-dropbear"
# IMAGE_INSTALL += " tera-app qtbase qtwayland"
IMAGE_INSTALL:append = " apt apt-utils make cmake"
IMAGE_INSTALL:append = " qtwayland tera-app qtdeclarative ffmpeg qtmultimedia-dev qtmultimedia-qmlplugins qtimageformats qtmultimedia qtmultimedia-plugins qtmultimedia-staticdev qtbase-plugins liberation-fonts"
IMAGE_INSTALL:append = " \
    v4l-utils \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gstreamer1.0-libav \
    htop \
    iotop \
    wpa-supplicant \
"
PACKAGECONFIG_FONTS:append_pn-qtbase = " fontconfig"
IMAGE_INSTALL:append = " openssh-sftp-server rsync"


# IMAGE_INSTALL:append = " \
#     python3 \
#     python3-flask \
#     python3-opencv \
#     python3-pyqt5 \
#     "