# lein-scrooge

A Leiningen plugin to run the Twitter Scrooge compiler on thrift IDL files

## Installation

Use this for user-level plugins:

##### Leiningen 2.x

Put `[lein-scrooge "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile

##### Leiningen 1.x 

`lein plugin install lein-scrooge 0.1.0-SNAPSHOT`.

Use this for project-level plugins:

Put `[lein-scrooge "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

## Usage

    $ lein scrooge

When no arguments are provided, the plugin will search for thrift files in the directory
specified by the :include-path in your project file (see below). If no `:include-path` 
has been specified, the plugin will default to searching "src/thrift".

    $ lein scrooge <file1> <file2> ... <fileN>

You can also specify specific files to be compiled. If an `:include-path` has been 
provided in the project file, then scrooge will include this directory when resolving
filenames.

#### Project Settings

The following settings are supported: 

    $ example here..

## License

Copyright © 2013 

Distributed under the Eclipse Public License, the same as Clojure.
