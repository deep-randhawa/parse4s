name := "parse4s"

version := "1.0"

scalaVersion := "2.12.2"

// Dependencies
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ahc-ws-standalone" % "1.0.0",

  "joda-time" % "joda-time" % "2.9.9",

  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)