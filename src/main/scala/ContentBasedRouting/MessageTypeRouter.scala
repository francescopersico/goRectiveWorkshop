package ContentBasedRouting

import akka.actor._

/**
  * Created by danielwallace on 5/23/16.
  */
class MessageTypeRouter extends Actor{
  import Messages._
  val typeAProcessor    = context.actorOf(Props(classOf[TypeAProcessor]))
  val typeBProcessor    = context.actorOf(Props(classOf[TypeBProcessor]))
  val typeCProcessor    = context.actorOf(Props(classOf[TypeCProcessor]))

  def receive: Receive = {
    case TypeA(m) => typeAProcessor ! m
    case TypeB(m) => typeBProcessor ! m
    case TypeC(m) => typeCProcessor ! m
    case _ => println("Unrecognized message.")
  }



}
