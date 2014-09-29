package kata.s99

import kata.math.Factorial.factorial
import org.scalatest.FlatSpec

class P26Spec extends FlatSpec {

  "For non empty list" should "generate combinations" in {
    val list = List("a", "b", "c", "d", "e", "f")
    val k = 3

    val combinations = P26.combinations(k, list)
    val expectedCount = factorial(list.size) / (factorial(k) * factorial(list.size - k))

    assert(combinations.size === expectedCount)
  }

}