SUMMARY = "OpenDreambox: Emulators Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "CLOSED"

PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += ""

RRECOMMENDS_${PN} += " \
    enigma2-plugin-extensions-retrogamestation \
    advancemame \
    crispy-doom \
    dgen \
    dosbox \
    fbzx \
    gngeo \
    gnuboy \
    scummvm \
    sdlquake \
    snes9x-sdl \
    stella \
    vice \
"
RRECOMMENDS_${PN}_arm_append = " \
    pcsx \
"