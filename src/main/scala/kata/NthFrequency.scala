package kata

object NthFrequency {
  def nthFrequency(word: String, i: Int): Set[Char] = {
    val frequencyTable = word.groupBy(identity)
      .map {
      case (x, xs) => (x, xs.size)
    }.groupBy(_._2)
      .map {
      case (size, chars) => (size, chars.keySet)
    }.toSeq.sortBy {
      case (size, _) => -size
    }

    if (frequencyTable.size >= i) {
      frequencyTable(i - 1)._2
    } else {
      throw new NoSuchElementException
    }
  }
}