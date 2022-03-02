Scalajs-Snowpack
----------------
>How to use [Snowpack](https://snowpack.dev) with [Scala.js](https://scala-js.org).

Install
-------
>jsdom must be installed **locally** - not globally!
1. brew install node
2. npm install jsdom
3. npm install ( in project root directory )

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS

Dev
---
>Edits are reflected in each terminal.
1. sbt ( interactive session )
2. ~fastLinkJS
3. npx snowpack dev ( new terminal tab )

Source
------
>See https://github.com/lolgab/scalajs-snowpack-example for original source.