#!/usr/bin/bash
cd /cygdrive/c/Users/fprobst/Desktop/code/personal/ElectronConfigurationGame
cp -af ElectronConfigurationGame.jar app/
jpackage -i app -n ElectronGame \
        --main-class Main --main-jar ElectronConfigurationGame.jar \
	--win-menu --vendor "Fred Probst" --app-version 0.2 --win-dir-chooser \
	--win-menu-group ElectronGame --win-shortcut --verbose --win-per-user-install
