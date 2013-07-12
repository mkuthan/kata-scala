package kata.math

import scala.annotation.tailrec
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GreatestCommonDivisorSpec extends FlatSpec with TableDrivenPropertyChecks {

  val numbers = Table(
    ("input", "expected"),
    ((21, 7), 7),
    ((7, 21), 7),
    ((35, 28), 7))

  "The greatest common divisor" should "be calculated" in {
    forAll(numbers) {
      (input, expected) =>
        val result = GreatestCommonDivisor.gcd(input._1, input._2)
        assert(result === expected)
    }
  }

}