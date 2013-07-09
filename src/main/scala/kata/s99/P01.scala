package kata.s99

object P01 {
  def last(xs: List[Int]): Int = xs match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}