package kata.sort

object MergeSort {

  def sort(xs: List[Int]): List[Int] = xs match {
    case Nil | List(_) => xs
    case _ =>
      // halve the list
      val (left, right) = xs splitAt (xs.length / 2)
      merge(sort(left), sort(right))
  }

  private def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
    case (x :: xs, y :: ys) =>
      if (x < y) {
        // left is 
        x :: merge(xs, right)
      } else {
        y :: merge(left, ys)
      }
    case _ =>
      if (!left.isEmpty) {
        left
      } else {
        right
      }
  }
}