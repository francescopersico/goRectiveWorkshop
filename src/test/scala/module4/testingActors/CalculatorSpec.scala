package module4.testingActors

import akka.actor._
import akka.pattern.ask
import akka.testkit.TestActorRef
import akka.util.Timeout
import suite.TestKitSpec
import scala.concurrent.duration._
import scala.concurrent.{Future, Await}

class CalculatorSpec extends TestKitSpec("test") {

  "A Calculator actor" should "start with current value of 0" in {
    val calculatorRef = TestActorRef[Calculator]
    val calculatorActor = calculatorRef.underlyingActor

    implicit val timeout = Timeout(5 seconds)

    val futureTotal: Future[Any] = calculatorRef ? QueryTotal()
    val answer = Await.result(futureTotal, timeout.duration)
    assert(answer == 0)
  }

  it should "have a total of 1 after adding 1" in {
    val calculatorRef = TestActorRef[Calculator]
    val calculatorActor = calculatorRef.underlyingActor

    implicit val timeout = Timeout(5 seconds)

    calculatorRef ! Add(1)

    val futureTotal: Future[Any] = calculatorRef ? QueryTotal()
    val answer = Await.result(futureTotal, timeout.duration)
    assert(answer == 1)
  }

  it should "have a total of -1 after subtracting 1" in {
    val calculatorRef = TestActorRef[Calculator]
    val calculatorActor = calculatorRef.underlyingActor

    implicit val timeout = Timeout(5 seconds)

    calculatorRef ! Subtract(1)

    val futureTotal: Future[Any] = calculatorRef ? QueryTotal()
    val answer = Await.result(futureTotal, timeout.duration)
    assert(answer == -1)
  }
}
