package kata

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NthFrequencySpec extends FlatSpec with TableDrivenPropertyChecks {

  val words = Table(
    ("word", "frequency", "expected"),
    ("aabbbc", 2, Set('a')),
    ("aaabbbc", 2, Set('c')),
    ("aaabbbc", 1, Set('a', 'b')))

  "A character with the Nth frequency" should "be found" in {
    forAll(words) {
      (word, frequency, expected) =>
        val result = NthFrequency.nthFrequency(word, frequency)
        assert(result === expected)
    }
  }
  
  "For invalid Nth" should "throw an exception" in {
    intercept[NoSuchElementException] {
      NthFrequency.nthFrequency("abc", 3)
    }
  }
}