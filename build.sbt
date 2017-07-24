name := "parse4s"

version := "1.0"

scalaVersion := "2.12.2"

// Dependencies
libraryDependencies += "joda-time" % "joda-time" % "2.9.9"

val circeVersion = "0.8.0"
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)