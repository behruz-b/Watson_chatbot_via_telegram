name := "Watson_chatbot_via_telegram"

version := "0.1"

scalaVersion := "2.13.4"

val AkkaVersion = "2.6.10"
val ibmWatson =  Seq("com.ibm.watson" % "ibm-watson" % "9.0.0")
val akkaLibs = Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-serialization-jackson" % AkkaVersion % Test
)

libraryDependencies ++= akkaLibs ++ ibmWatson ++ Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.3.0-alpha5",
  "ch.qos.logback" % "logback-core" % "1.3.0-alpha5",
  "org.slf4j" % "log4j-over-slf4j" % "2.0.0-alpha1",
  "org.apache.logging.log4j" % "log4j-api" % "2.14.0"
)
