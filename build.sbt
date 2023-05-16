enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs.snowpack"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.0-RC6"
scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0"
scalacOptions ++= Seq(
  "-Wunused:all"
)
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
