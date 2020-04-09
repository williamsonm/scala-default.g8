val CatsVersion = "$cats_version$"

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-core" % CatsVersion
    ),
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.11.0"),
    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
  )

scalacOptions ++= Build.commonScalacOptions
