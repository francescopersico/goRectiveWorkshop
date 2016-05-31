package ContentBasedRouting

import ContentBasedRouting.Messages.TypeC
import akka.actor.Actor

class TypeCProcessor extends Actor  with Processor{

  def receive: Receive = {
    case m: String =>
      println("C received the message: " + m)

  }
}