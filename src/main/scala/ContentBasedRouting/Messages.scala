package ContentBasedRouting

/**
  * Created by danielwallace on 5/23/16.
  */
object Messages {
  trait Message
  case class TypeA(message: String) extends Message
  case class TypeB(message: String) extends Message
  case class TypeC(message: String) extends Message
}
