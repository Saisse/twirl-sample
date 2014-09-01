name := "twirl-sample"

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

scalaVersion := "2.11.2"

sourceDirectories in (Compile, TwirlKeys.compileTemplates) := (unmanagedSourceDirectories in Compile).value
