package exercises

import org.scalatest.FunSuite

class p05ReverseListSuite extends FunSuite {
  test("Reversing a list should return a list of the same size") {
    assertResult(5) {
      new p05ReverseList().reverse(List(1, 2, 3, 4, 5)).size
    }
  }
  test("Reversing a list should return the list in reverse order") {
    val l1 = List(5, 4, 3, 2, 1)
    assertResult(List(1, 2, 3, 4, 5)) {
      new p05ReverseList().reverse(l1)
    }
  }
  test("Reversing a list twice should return the same list") {
    val l1 = List(1, 3, 4, 5, 6)
    assertResult(l1) {
      val rev = new p05ReverseList()
      val reversed = rev.reverse(l1)
      rev.reverse(reversed)
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p05ReverseList().reverse(List.empty)
    }
  }
}
