import akka.actor.Props
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

object ActorManager extends App with LazyLogging {
  val config = ConfigFactory.load()
  val watsonConfig = config.getConfig("watson-credentials")
  val watsonName = watsonConfig.getString("name")
  val watsonPassword = watsonConfig.getString("password")
  logger.debug(s"Watson Name: $watsonName, Watson password: $watsonPassword")
  val actorSystem = ActorSystem("actor-manager")
  val actor = actorSystem.actorOf(Props[Watson])
  actor ! "Hello Watson!"
}