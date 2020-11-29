import akka.actor.ActorSystem

object WatsonIntegration extends App {
  val actorSystem = ActorSystem("HelloAkka")
  println(actorSystem)
}
