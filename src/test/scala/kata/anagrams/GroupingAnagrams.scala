package kata.anagrams

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GroupingAnagramsSpec extends FlatSpec {

  ignore should "group anagrams" in {
    val words = List("dzone", "java", "one", "node")
    val anagramGroups = GroupingAnagrams.solve(words)
    
    assert(anagramGroups === List(List("dzone", "one", "node"), List("java")))
  }

}