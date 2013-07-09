package kata.sort

object QuickSort {

  def sort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) {
      xs
    } else {
      val pivot = xs.head

      val lower = xs filter (_ < pivot)
      val upper = xs filter (_ > pivot)

      sort(lower) ::: pivot :: sort(upper)
    }
  }

}