package p08

import org.scalatest.FunSuite

class EliminateConsecutiveDuplicatesSuite extends FunSuite {
  test("Should return same list if no consecutive duplicates") {
    val l1 = List("ab", "fb", "sae", "Asd")
    assertResult(l1) {
      new EliminateConsecutiveDuplicates().eliminate(l1)
    }
  }

  test("Should return list with consecutive duplicates removed") {
    assertResult(List("ab", "fb", "sae", "Asd")) {
      new EliminateConsecutiveDuplicates()
        .eliminate(List("ab", "ab", "fb", "fb", "fb", "fb", "sae", "Asd"))
    }
  }
}
