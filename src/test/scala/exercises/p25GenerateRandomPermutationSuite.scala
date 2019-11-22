package exercises

import com.typesafe.scalalogging.Logger
import org.scalatest.FunSuite
import org.slf4j.LoggerFactory

class p25GenerateRandomPermutationSuite extends FunSuite {
  private val log = Logger(LoggerFactory.getLogger(this.getClass))

  test("Should randomly generate a permutation of the given list") {
    val fromList = List("a", "b", "c", "d", "e", "f")
    val permuted = new p25GenerateRandomPermutation().permute(fromList)
    log.info(s"Permuted list is $permuted from original $fromList")
    assert(permuted.size == fromList.size)
    assert(permuted.forall(p ⇒ fromList.contains(p)))
  }

  test("Should support empty lists") {
    assertResult(List.empty) {
      new p25GenerateRandomPermutation().permute(List.empty)
    }
  }
}
