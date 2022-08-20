enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs.snowpack"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.0-RC4"
scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0"
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
