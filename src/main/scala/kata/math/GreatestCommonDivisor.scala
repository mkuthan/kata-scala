package kata.math

import scala.annotation.tailrec

object GreatestCommonDivisor {

  /**
   * http://en.wikipedia.org/wiki/Euclidean_algorithm
   */
  @tailrec
  def gcd(n: Int, m: Int): Int = {
    if (m == 0) n else gcd(m, n % m)
  }

}