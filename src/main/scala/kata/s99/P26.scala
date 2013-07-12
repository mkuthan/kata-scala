package kata.s99

object P26 {

  /**
   * xs.combinations(k).toList
   */
  def combinations(k: Int, xs: List[String]): List[List[String]] = (k, xs) match {
    case (0, _) => List(List())
    case (_, Nil) => List()
    case _ => (combinations(k - 1, xs.tail) map (xs.head :: _)) ::: combinations(k, xs.tail)
  }

}