package exercises

import org.scalatest.FunSuite

class p31PrimeNumberSuite extends FunSuite {
  test("Should tell if a number is a prime until it reaches out of memory") {
    val primeValidator = new p31PrimeNumber()
    assertResult(false) {
      primeValidator.isPrime(0)
    }
    assertResult(false) {
      primeValidator.isPrime(1)
    }
    assertResult(true) {
      primeValidator.isPrime(2)
    }
    assertResult(true) {
      primeValidator.isPrime(3)
    }
    assertResult(false) {
      primeValidator.isPrime(4)
    }
    assertResult(true)(primeValidator.isPrime(Int.MaxValue))
  }
}
