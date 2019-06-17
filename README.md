# lein-shell-cat [![Build Status](https://travis-ci.org/rubicks/lein-shell-cat.png?branch=master)](https://travis-ci.org/rubicks/lein-shell-cat)

Can [lein-shell](https://github.com/hyPiRion/lein-shell) play nice with a simple `cat` implementation? It used to have an [issue](https://github.com/hyPiRion/lein-shell/issues/13), but now it works just fine.

## Usage

```shell
$ echo "hello stdin" | lein run -- && \
  echo "hello stdin" | lein trampoline run --
hello lein-shell
hello stdin
hello lein-shell
hello stdin
```

## License

Copyright © 2014 rubicks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
