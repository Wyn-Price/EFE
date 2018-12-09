# Equilinox File Editor

## Installation

Download the latest version [here](https://github.com/Wyn-Price/EFE/releases/latest)

## Basic usage
If you have any issue or question regarding basic usages, please look at the "Help" section at the bottom of this document.

### Prerequisite
You need to have Java installed to run this program.

### Running EFE
Open CMD or Powershell (or a terminal) and run

`java -jar efe-all-<VERSION>.jar` 

(replace <VERSION> by the version you've downloaded)

### Converting world save to json
`java -jar efe-all-<VERSION>.jar --input world.dat --output worldjson.json`

### Converting Json to World saves
`java -jar efe-all-<VERSION>.jar --input worldjson.json --output world.dat`

### Note
You must provide a path to an existing file after the `--input` flag.

For example if the file is on your Desktop, you can do

`--input C:\Users\YOURUSER\Desktop\world.dat` on Windows

`--input ~/Desktop/word.dat` on GNU/Linux

## Advanced use

### Force
You can force the conversion to finish even if something goes wrong. This is useful for corrupted worlds. To do that simply add the `-f` or `--force` flag.

### Compact
By default the json file will be [pretty printed](https://en.wikipedia.org/wiki/Prettyprint) which takes more space. If you want your json file to NOT be pretty printed, you can add the `-c` or `--compact` flag to the command.

## Help

### What are .dat and .json files?
.dat files are **world save files** used by Equilinox, it is unreadable by humans.

The .json file created by EFE are a human readable version of the Equilinox world save file.

### I don't see .json or .dat at the end of the file names
By default Windows 10 will hide file extension, but you can show file extensions using this [guide](https://www.howtogeek.com/205086/beginner-how-to-make-windows-show-file-extensions/)

### How do I open a CMD/Powershell/Terminal in a folder (directory)?

[How to open CMD/Powershell on windows](https://www.thewindowsclub.com/how-to-open-command-prompt-from-right-click-menu)

If you are on GNU/Linux, simply open a terminal and `cd /path/to/directory`

### Where do I install Java?

Download Java [here](https://www.java.com/en/download/)

### I have an other question or issue
If you have any other question or issue with EFE, open an issue [here](https://github.com/Wyn-Price/EFE/issues)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
EFE is under the [MIT](LICENSE) license
