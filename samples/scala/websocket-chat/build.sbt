name := "websocket-chat"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.10.4")

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3-M1",
  "org.webjars" % "bootstrap" % "1.3.0",
  "org.webjars" % "jquery" % "1.7.2"
)