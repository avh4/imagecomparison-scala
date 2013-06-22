name := "imagecomparison-scala"

version := "0.0.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
    "net.avh4.util" % "imagecomparison" % "0.3.2",
    "org.scalatest" %% "scalatest" % "1.9.1",
    "com.novocode" % "junit-interface" % "0.8" % "test->default",
    "info.cukes" % "cucumber-junit" % "1.1.2" % "test",
    "info.cukes" % "cucumber-picocontainer" % "1.1.2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

seq(cucumberSettingsWithTestPhaseIntegration : _*)
