enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs.snowpack"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.2-RC1"
scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.3.0"
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
