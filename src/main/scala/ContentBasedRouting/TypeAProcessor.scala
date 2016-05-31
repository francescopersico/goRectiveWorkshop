package ContentBasedRouting

import ContentBasedRouting.Messages.TypeA
import akka.actor.Actor

class TypeAProcessor extends Actor with Processor{

  def receive: Receive = {
    case m: String =>
      println("A received the message: " + m)

  }
}
