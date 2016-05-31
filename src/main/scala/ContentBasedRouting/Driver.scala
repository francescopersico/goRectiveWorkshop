package ContentBasedRouting

import akka.actor
import akka.actor.Props
import Messages._


object Driver extends App{
  val system = actor.ActorSystem("MessageTypeRouterSystem")

  val messageTypeRouter = system.actorOf(Props(classOf[MessageTypeRouter]))

  messageTypeRouter ! TypeA("Hello Processor A!")
  messageTypeRouter ! TypeB("Hello Processor B!")
  messageTypeRouter ! TypeC("Hello Processor C!")





}
