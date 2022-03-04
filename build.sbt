enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs.snowpack"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.1.1"
scalaJSUseMainModuleInitializer := true
libraryDependencies += "com.raquo" %%% "laminar" % "0.14.2"
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
fastLinkJS / crossTarget := target.value / public
fullLinkJS / crossTarget := target.value / public