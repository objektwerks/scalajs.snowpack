Scalajs-Snowpack
----------------
>How to use [Snowpack](https://snowpack.dev) with [Scalajs](https://scala-js.org).

Install
-------
>jsdom must be installed **locally** - not globally!
1. brew install node
2. npm install jsdom
3. npm install ( in project root directory )
>See **package.json** for installable dependencies.

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS | fullLinkJS

Dev
---
>Edits are reflected in each terminal.
1. sbt ( unique terminal session )
2. ~fastLinkJS
3. npx snowpack dev ( unique terminal session )
>See **snowpack.config.json** and [Snowpack Config](https://www.snowpack.dev/reference/configuration) for configurable options.

Package
-------
1. npx snowpack build ( see build directory )

Source
------
>See [Lorenzo Gabriele's](https://github.com/lolgab/scalajs-snowpack-example) original work for more inspiration.