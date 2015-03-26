name := "Datapp"

version := "0.0.1"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-Xlint",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings"
)

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"