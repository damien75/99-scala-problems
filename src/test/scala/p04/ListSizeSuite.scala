package p04

import org.scalatest.FunSuite

class ListSizeSuite extends FunSuite {
  test("listSize should return size of list") {
    assertResult(3){new ListSize().listSize(List(1, 2, 3))}
  }

  test ("listSize should return 0 if list is empty") {
    assertResult(0){new ListSize().listSize(List.empty)}
  }
}
