package kata.sort

object QuickSort {

  def sort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) {
      xs
    } else {
      // choose any element to be a pivot (e.g: first element)
      val pivot = xs.head

      // all elements less than pivot
      val lower = xs filter (_ < pivot)

      // all elements grater than pivot
      val upper = xs filter (_ > pivot)

      sort(lower) ::: pivot :: sort(upper)
    }
  }

}