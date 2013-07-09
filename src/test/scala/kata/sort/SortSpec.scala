package kata.sort

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SortSpec extends FlatSpec with TableDrivenPropertyChecks {

  val lists = Table(
    ("input", "expected"),
    (List(), List()),
    (List(1), List(1)),
    (List(2, 3, 4, 1, 5), List(1, 2, 3, 4, 5)))

  behavior of "A list"

  it should "be sorted using quick sort" in {
    forAll(lists) { (input, expected) =>
      val result = QuickSort.sort(input)
      assert(result === expected)
    }
  }

  it should "be sorted using merge sort" in {
    forAll(lists) { (input, expected) =>
      val result = MergeSort.sort(input)
      assert(result === expected)
    }
  }

}
