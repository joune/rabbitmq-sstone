organization := "ap.test"

name := "rabbitmq-sstone"

libraryDependencies += "com.github.sstone" % "amqp-client_2.10" % "1.3-ML1"

libraryDependencies += "com.typesafe.akka" % "akka-osgi_2.10" % "2.2.3"

osgiSettings

OsgiKeys.privatePackage := Seq("ap.test.rmq.sstone")
