import akka.actor.Actor
import com.typesafe.scalalogging.LazyLogging

class Watson extends Actor with LazyLogging {
  override def receive: Receive = {
    case x: String =>
      logger.debug(s"I'm receiving command: $x")
    case cmd =>
      logger.error(s"Unknown command received: $cmd")
  }
} 