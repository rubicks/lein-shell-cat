# lein-shell-cat [![Build Status](https://travis-ci.org/rubicks/lein-shell-cat.png)](https://travis-ci.org/rubicks/lein-shell-cat)

Can lein-shell play nice with a simple `cat` implementation?

## Usage

```shell
$ echo "hello stdin" | lein run && echo "hello stdin" | lein trampoline run
hello lein-shell
hello stdin
hello lein-shell
```

## License

Copyright © 2014 rubicks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
