import akka.actor.Props
import akka.actor.ActorSystem
object ActorManager extends App {
  val actorSystem = ActorSystem("actor-manager")
  val actor = actorSystem.actorOf(Props[Watson])
  actor ! "Hello Watson!"
}