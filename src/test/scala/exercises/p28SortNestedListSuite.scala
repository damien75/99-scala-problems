package exercises

import org.scalatest.FunSuite

class p28SortNestedListSuite extends FunSuite {
  val inputList: List[List[String]] = List(List("a", "b", "c"),
                                           List("d", "e"),
                                           List("f", "g", "h"),
                                           List("d", "e"),
                                           List("i", "j", "k", "l"),
                                           List("m", "n"),
                                           List("o"))
  val sorter = new p28SortNestedList()
  test("Should order a list of lists with the shortest sublists coming first") {
    assertResult(
      List(List("o"),
           List("d", "e"),
           List("d", "e"),
           List("m", "n"),
           List("a", "b", "c"),
           List("f", "g", "h"),
           List("i", "j", "k", "l"))) {
      sorter.sortShortFirst(inputList)
    }
  }

  test(
    "Should order a list of lists with the least frequent size of sublists first") {
    assertResult(
      List(List("i", "j", "k", "l"),
           List("o"),
           List("a", "b", "c"),
           List("f", "g", "h"),
           List("d", "e"),
           List("d", "e"),
           List("m", "n"))) {
      sorter.sortLeastFrequentSizeFirst(inputList)
    }
  }

  test("Should support empty list") {
    assertResult(List(List.empty)) {
      new p28SortNestedList().sortShortFirst(List(Nil))
    }
    assertResult(List(Nil)) {
      new p28SortNestedList().sortLeastFrequentSizeFirst(List(Nil))
    }
  }
}
