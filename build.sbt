enablePlugins(ScalaJSPlugin)

name := "scalajs.snowpack"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.1.1"
scalaJSUseMainModuleInitializer := true
libraryDependencies += "com.raquo" %%% "laminar" % "0.14.2"