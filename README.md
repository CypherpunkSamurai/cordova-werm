# cordova-werm [prototype]
A Web Terminal plugin
This plugin was inspired by cordova-shell-exec plugin. As the plugin is not working on newer android devices, this plugin was created (using plugman).

# Installation
Make sure cordova cli is installed else install it with `npm install -g cordova`. Navigate to the cordova project directory and run the following command
`cordova plugin add https://github.com/CypherpunkArmoury/cordova-werm.git`

# Using the plugin in app
You can access the methods from werm object. Here is an example that calls the 'wermRun' method and displays a javascript alert.
'werm.wermRun(input.value, alert, alert);'

# About
This plugin was created by [CypherpunkArmoury](https://github.com/CypherpunkArmoury) / a.k.a. [Scratch171](https://github.com/scratchie171)( for [Acode-Editor](https://play.google.com/store/apps/details?id=com.foxdebug.acode) (by [foxdebug](https://github.com/foxdebug/) a.k.a [deadlyjack](https://github.com/deadlyjack)) for running shell commands on android devices.
Feel free to request features and updates.

# Credits
Apache Cordova for [Cordova](https://cordova.apache.org/docs/en/latest/guide/platforms/android/plugin.html) and [PlugMan](https://www.npmjs.com/package/plugman)
This StackOverflow Answer.
