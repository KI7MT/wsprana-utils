organization := "io.ki7mt.spark"

version := "1.0"

name := "DeltaCreateTable"

scalaVersion := "2.12.12"

val sparkVersion = "3.0.1"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.0.1" % "provided",
    "org.apache.spark" %% "spark-sql" % "3.0.1" % "provided",
    "io.delta" %% "delta-core" % "0.7.0",
)

// example : convertcsvparquet-2.12-3.0.1-1.0.jar
artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  Artifact.artifactName(sv, module, artifact).replaceAll(s"-${module.revision}", s"-${sparkVersion}-${module.revision}")
}