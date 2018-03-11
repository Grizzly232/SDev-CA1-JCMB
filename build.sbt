name := """JCMB Inc."""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"
PlayKeys.externalizeResources := false

libraryDependencies += guice

libraryDependencies += "com.h2database" % "h2" % "1.4.192" 

libraryDependencies += evolutions

libraryDependencies ++= Seq(evolutions, jdbc)
