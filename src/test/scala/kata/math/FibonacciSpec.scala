package kata.math

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks

class FibonacciSpec extends FlatSpec with TableDrivenPropertyChecks {

  val fibonaciSeries = Table(
    ("input", "expected"),
    (0, 0),
    (1, 1),
    (8, 21))

  "A fibonacci" should "be calculated" in {
    forAll(fibonaciSeries) {
      (input, expected) =>
        val result = Fibonacci.fib(input)
        assert(result === expected)
    }
  }

}