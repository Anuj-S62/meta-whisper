## Introduction

`meta-whisper` is a Yocto layer for integrating Whisper AI into Automotive Grade Linux (AGL) images.

## Layer Dependencies

* OpenEmbedded `meta-python-ai` Layer:
  - URI: https://github.com/zboszor/meta-python-ai.git
  - Branch: scarthgap

## Add meta-whisper layer to your build
 
```shell
$ bitbake-layers add-layer meta-whisper 
```

Add the following to the conf/local.conf:

```shell
DISTRO_FEATURES:append = " vulkan"

IMAGE_INSTALL:append = " whisper"
```

## Maintenance

All patches must be submitted via the AGL Gerrit instance at
<https://gerrit.automotivelinux.org>.  See this wiki page for
details:

<https://wiki.automotivelinux.org/agl-distro/contributing>

Layer maintainers:
* Anuj Solanki <anuj603362@gmail.com>
* Jan-Simon Möller <jsmoeller@linuxfoundation.org>
