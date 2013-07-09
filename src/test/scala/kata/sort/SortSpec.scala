package kata.sort

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks

class QuickSortSpec extends FlatSpec with TableDrivenPropertyChecks {

  val lists = Table(
    ("input", "expected"),
    (List(), List()),
    (List(1), List(1)),
    (List(2, 3, 4, 1, 5), List(1, 2, 3, 4, 5)))

     
  forAll(lists) { (input, expected) =>
    behavior of "A list " + input
    
    it should "be sorted using quick sort" in {
      val result = QuickSort.sort(input)
      assert(result === expected)
    }

    it should "be sorted using merge sort" in {
      val result = MergeSort.sort(input)
      assert(result === expected)
    }
  }

}
