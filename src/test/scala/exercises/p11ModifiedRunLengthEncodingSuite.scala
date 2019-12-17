package exercises

import org.scalatest.FunSuite

class p11ModifiedRunLengthEncodingSuite extends FunSuite {
  test(
    "Encoding run length should group consecutive similar list elements with occurence if occurence > 1") {
    assertResult(
      List(Right(4, "a"),
           Left("b"),
           Right(2, "c"),
           Right(2, "a"),
           Left("d"),
           Right(4, "e"))) {
      new p11ModifiedRunLengthEncoding().encodeModified(
        List("a",
             "a",
             "a",
             "a",
             "b",
             "c",
             "c",
             "a",
             "a",
             "d",
             "e",
             "e",
             "e",
             "e"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p11ModifiedRunLengthEncoding().encodeModified(List.empty)
    }
  }
}
