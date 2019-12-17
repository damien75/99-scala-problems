package exercises

import org.scalatest.FunSuite

class p12RunLengthDecodingSuite extends FunSuite {
  test("Decoding run length should expand list of elements with occurence") {
    assertResult(
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
           "e")) {
      new p12RunLengthDecoding().decode(
        List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e")))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p12RunLengthDecoding().decode(List.empty)
    }
  }
}
