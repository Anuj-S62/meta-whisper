# pytorch_%.bbappend

DEPENDS:remove = "gloo"

EXTRA_OECMAKE:remove = "-DUSE_SYSTEM_GLOO=ON"
