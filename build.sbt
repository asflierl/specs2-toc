name := "specs2-toc"
scalaVersion := "2.12.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-language:_", "-encoding", "UTF-8")
scalacOptions in Test += "-Yrangepos"

testOptions in Test += Tests.Argument(TestFrameworks.Specs2, "console", "html", "html.toc", "!pandoc")

libraryDependencies ++= Seq(
  "org.specs2" %% s"specs2-core" % "4.0.1" % Test,
  "org.specs2" %% s"specs2-html" % "4.0.1" % Test)
