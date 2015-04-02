## Welcome to svg2java ##
The purpose of this library is to load SVG files and
generate java code out of it. Currently I have implemented
a transcoder to convert the SVG files to Java2D code.

## Why this project ##
What is the benefit of this? When you want to use
scalable graphics in your code, e.g. icons that you want
use in different sizes, SVG would be a good way to go.
But to use SVG graphics in java you would have to bundle
a SVG library like Batik or Salamander that have a big
fingerprint and may bloat your product.

To transcode the graphics may give you the advantage
of scalable graphics without this dependency. It has
also the advantage that the painting is no longer
interpreted but compiled painting code that will be faster.

The size of the generated classes is nearly the same as the
size of the original SVG files put in a jar or with pac200
you might even save some space there too.

So transcoding the files gives you all the benefits without the
downsides of using SVG files directly.

## Project Status ##
The library was tested on the Tango icon set and on the
Oxygen icon set and can transcode many of the icons without error.

The current implementation as some known problems:

  * Embedded images are not supported
  * Only basic text rendering support
  * SVG files need to be strictly valid (has problems with e.g. some Oxygen icons)
  * May generate classes with methods that are to long (Java 64K per method limit)

## Project Roadmap ##

  * Add a batch mode to transcode many SVGs to java files at one run.
  * Implement a command line version and ant task.
  * Add a transcoder svg2android
  * Some more experimentation with a Graphics2D recorder approach
  * Bugfixes and new features on request

## Credits ##
The idea and the initial code is taken from the flamingo project (see links)

There the initial version is/was included as an example.
I have taken that code and refactored and restructured most of if.
I fixed some issues and added some more functionality.

Some minor code was taken from the Batik painting code
(mainly the code for the text node transformation).

The Apache Batik library is used to read the SVG files.
It is licensed under Apache License, Version 2.0
and is included in this project.

## How to participate ##

If you are interest to help please contact me per email.
All help is welcome: code contributions, good ideas, bug reports, donation of a logo, ...

Have fun,

- Bernd Rosstauscher