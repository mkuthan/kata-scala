package kata.s99

import org.scalatest.FlatSpec

class P01Spec extends FlatSpec {

  "For non-empty list" should "return the last element" in {
    val list = List(1, 2, 3)

    val last = P01.last(list)

    assert(last === 3)
  }

  "For empty list" should "throw an exception" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }
}