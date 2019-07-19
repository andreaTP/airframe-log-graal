
scalaVersion := "2.12.8"

graalVMNativeImageOptions ++= Seq(
  "--no-fallback"
)

libraryDependencies ++= Seq(
  "org.wvlet.airframe" %% "airframe-log" % "19.7.3+5-b9ddf03a+20190719-1427-SNAPSHOT"
)

enablePlugins(GraalVMNativeImagePlugin)
