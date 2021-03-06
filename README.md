Scalajs-Snowpack
----------------
>How to use [Snowpack](https://snowpack.dev) with [ScalaJs](https://scala-js.org).

Install
-------
1. brew install node
2. npm install jsdom ( must install **locally** )
3. npm install ( in project root directory )
>See **package.json** for installable dependencies.

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS
>See **target/public** directory.

Test
----
1. sbt clean test fastLinkJS

Dev
---
>Edits are reflected in both sessions.
1. sbt ( new session )
2. ~ fastLinkJS
3. npx snowpack dev ( new session )
>See **snowpack.config.json** and [Snowpack Config](https://www.snowpack.dev/reference/configuration) for configurable options.

Package
-------
1. sbt clean test fullLinkJS
2. npx snowpack build ( see **build** directory )

Source
------
>See [Lorenzo Gabriele's](https://github.com/lolgab/scalajs-snowpack-example) original work for more inspiration.
