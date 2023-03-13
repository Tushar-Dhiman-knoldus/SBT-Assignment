ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Sbt-Assignment",
    idePackagePrefix := Some("com.knoldus.sbt-Assignment")
  )


lazy val core = (project in file("core"))
  .settings(
    name := "core",
    idePackagePrefix := Some("com.knoldus.sbt-Assignment"),
    libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.15" % "test"

  ).dependsOn(utils)

lazy val utils = (project in file("utils"))
  .settings(
    name := "utils",
    idePackagePrefix := Some("com.knoldus.sbt-Assignment")
  )

// Joda-datetime library

libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
libraryDependencies += "org.joda" % "joda-convert" % "2.2.2"

//jdbc Dependency

libraryDependencies += "org.postgresql" % "postgresql" % "42.5.4"

//Cached Resolution

updateOptions := updateOptions.value.withCachedResolution(true)
