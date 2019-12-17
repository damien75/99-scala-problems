package exercises

import org.scalatest.FunSuite

class p08EliminateConsecutiveDuplicatesSuite extends FunSuite {
  test("Should return same list if no consecutive duplicates") {
    val l1 = List("ab", "fb", "sae", "Asd")
    assertResult(l1) {
      new p08EliminateConsecutiveDuplicates().eliminate(l1)
    }
  }

  test("Should return list with consecutive duplicates removed") {
    assertResult(List("ab", "fb", "sae", "Asd")) {
      new p08EliminateConsecutiveDuplicates()
        .eliminate(List("ab", "ab", "fb", "fb", "fb", "fb", "sae", "Asd"))
    }
  }

  test("Should not remove duplicates that are not consecutive") {
    assertResult(List("ab", "fb", "ab", "fb", "sae")) {
      new p08EliminateConsecutiveDuplicates()
        .eliminate(List("ab", "ab", "fb", "ab", "fb", "sae"))
    }
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p08EliminateConsecutiveDuplicates().eliminate(List.empty)
    }
  }
}
