val CatsEffectVersion = "$cats_effect_version$"
val CatsVersion = "$cats_version$"
val CirceVersion = "$circe_version$"
val Fs2Version = "$fs2_version$"
val LogbackVersion = "$logback_version$"
val MUnitVersion = "$munit_version$"
val Specs2Version = "$specs_version$"
val ScalaVersion = "$scala_version$"

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := ScalaVersion,
    libraryDependencies ++= Seq(
      "co.fs2"          %% "fs2-core"            % Fs2Version,
      "org.typelevel"   %% "cats-core"           % CatsVersion,
      "org.typelevel"   %% "cats-effect"         % CatsEffectVersion,
      "io.circe"        %% "circe-generic"       % CirceVersion,
      "org.specs2"      %% "specs2-core"         % Specs2Version % "test",
      "org.scalameta"   %% "munit"               % MUnitVersion % Test,
      "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
    )
  )

scalacOptions ++= Build.commonScalacOptions
