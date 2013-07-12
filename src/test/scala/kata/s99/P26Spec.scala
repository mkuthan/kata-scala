package kata.s99

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

import kata.math.Factorial.factorial

@RunWith(classOf[JUnitRunner])
class P26Spec extends FlatSpec {

  "For non empty list" should "generate combinations" in {
    val list = List("a", "b", "c", "d", "e", "f")
    val k = 3

    val combinations = P26.combinations(k, list)
    val expectedCount = factorial(list.size) / (factorial(k) * factorial (list.size - k))
    
    assert(combinations.size === expectedCount)
  }

}