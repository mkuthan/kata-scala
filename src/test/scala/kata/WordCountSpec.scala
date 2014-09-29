package kata

import org.scalatest.FlatSpec

class WordCountSpec extends FlatSpec {

  it should "count words" in {
    val sentence = "aaa bbb ccc aaa ccc ddd ccc eee ddd"
    val wordCount = WordCount.count(sentence)

    assert(wordCount("aaa") === 2)
    assert(wordCount("bbb") === 1)
    assert(wordCount("ccc") === 3)
    assert(wordCount("ddd") === 2)
    assert(wordCount("eee") === 1)
  }

}