name := "KafkaTut"

version := "0.1"

scalaVersion := "2.11.12"

scalacOptions := Seq("-Xexperimental", "-unchecked", "-deprecation")

parallelExecution in Test := false


libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "2.1.0"

val logback = "1.2.3"
libraryDependencies += "ch.qos.logback" % "logback-core" % logback
libraryDependencies += "ch.qos.logback" % "logback-classic" % logback


libraryDependencies += "org.apache.kafka" % "kafka-streams-test-utils" % "2.1.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.22",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.22" % Test
)

libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0" exclude("com.fasterxml.jackson.core", "jackson-databind")

libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.7.1"
