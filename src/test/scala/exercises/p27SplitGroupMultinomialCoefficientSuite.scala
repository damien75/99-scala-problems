package exercises

import org.scalatest.FunSuite

class p27SplitGroupMultinomialCoefficientSuite extends FunSuite {
  test("Should split list into disjoints groups of specified size") {
    val groupSizes = List(2, 2, 5)
    val grouped = new p27SplitGroupMultinomialCoefficient().group(groupSizes,
                                                                  List("Aldo",
                                                                       "Beat",
                                                                       "Carla",
                                                                       "David",
                                                                       "Evi",
                                                                       "Flip",
                                                                       "Gary",
                                                                       "Hugo",
                                                                       "Ida"))
    assert(grouped.size == 756)
    assert(grouped.forall(_.size == 3))
    assert(
      grouped.iterator
        .map(_.zipWithIndex.forall(z ⇒ z._1.size == groupSizes(z._2)))
        .forall(_ == true))
  }

  test(
    "Should return empty list if asking for more groups than members provided") {
    assertResult(List.empty) {
      new p27SplitGroupMultinomialCoefficient().group(List(3, 4, 5),
                                                      List("Aldo",
                                                           "Beat",
                                                           "Carla",
                                                           "David",
                                                           "Evi",
                                                           "Flip",
                                                           "Gary",
                                                           "Hugo",
                                                           "Ida"))
    }
  }

  test("Should support empty list") {
    assertResult(List(List.empty)) {
      new p27SplitGroupMultinomialCoefficient().group(List.empty, List.empty)
    }
  }
}
