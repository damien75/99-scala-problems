package exercises

import org.scalatest.FunSuite

class p24DrawNFromRangeSuite extends FunSuite {
  test("Should draw N numbers from the given range") {
    val nFromRange = new p24DrawNFromRange().draw(4, 17)
    assert(nFromRange.forall(el ⇒ el >= 1 && el < 17))
    assertResult(4) {
      nFromRange.size
    }
  }

  test(
    "Should throw NoSuchElementException if asking for more numbers than range has") {
    assertThrows[NoSuchElementException](new p24DrawNFromRange().draw(7, 5))
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p24DrawNFromRange().draw(0, 0)
    }
  }
}
