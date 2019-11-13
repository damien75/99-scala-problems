package exercises

import org.scalatest.FunSuite

class p10RunLengthEncodingSuite extends FunSuite {
  test(
    "Encoding run length should group consecutive similar list elements with occurence") {
    assertResult(
      List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))) {
      new p10RunLengthEncoding().encode(
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
}
