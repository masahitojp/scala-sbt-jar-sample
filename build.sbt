import AssemblyKeys._

name:= "sbtAssembly-sample"

version:= "1.0"

scalaVersion := "2.9.2"

assemblySettings

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.9" % "test"
)
