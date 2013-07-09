name := "kata-scala"

version := "1.0"

scalaVersion := "2.10.2"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.withSource := true

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

