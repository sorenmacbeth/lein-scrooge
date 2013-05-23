# lein-scrooge

A Leiningen plugin to run the Twitter Scrooge compiler on thrift IDL files

## Usage

Use this for user-level plugins:

##### Leiningen 2.x

Put `[lein-scrooge "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile

##### Leiningen 1.x 

`lein plugin install lein-scrooge 0.1.0-SNAPSHOT`.

Use this for project-level plugins:

Put `[lein-scrooge "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

Usage: 

    $ lein scrooge

## License

Copyright © 2013 

Distributed under the Eclipse Public License, the same as Clojure.
