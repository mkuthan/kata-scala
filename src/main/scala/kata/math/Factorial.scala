package kata.math

import scala.annotation.tailrec

object Factorial {

  def factorial(n: Int): Int = {
 
    @tailrec
    def factorial0(n: Int, acc: Int): Int = {
      if (n <= 0) acc else factorial0(n - 1, n * acc)
    }

    factorial0(n, 1)
  }

}