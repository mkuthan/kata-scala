package kata

object WordCount {

  def count(sentence: String): Map[String, Int] = {
    sentence.split(" ").map(word => (word, 1)).groupBy(_._1).map {
      case (key, tuple) => (key, tuple.foldLeft(0)((x, y) => x + y._2))
    }
  }

}
