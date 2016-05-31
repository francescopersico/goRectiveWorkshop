package ContentBasedRouting

import ContentBasedRouting.Messages.TypeB
import akka.actor.Actor

class TypeBProcessor extends Actor  with Processor{

  def receive: Receive = {
    case m: String =>
      println("B received the message: " + m)

  }
}