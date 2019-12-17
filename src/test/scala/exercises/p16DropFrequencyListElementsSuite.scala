package exercises

import org.scalatest.FunSuite

class p16DropFrequencyListElementsSuite extends FunSuite {
  test("Should drop every n element from list") {
    assertResult(List("a", "b", "d", "e", "g", "h", "j", "k")) {
      new p16DropFrequencyListElements().dropEvery(
        3,
        List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p16DropFrequencyListElements().dropEvery(2, List.empty)
    }
  }
}
