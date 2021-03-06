package kata.math

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks

class FactorialSpec extends FlatSpec with TableDrivenPropertyChecks {

  val factorials = Table(
    ("input", "expected"),
    (0, 1),
    (1, 1),
    (5, 120))

  "A factorial" should "be calculated" in {
    forAll(factorials) {
      (input, expected) =>
        val result = Factorial.factorial(input)
        assert(result === expected)
    }
  }

}