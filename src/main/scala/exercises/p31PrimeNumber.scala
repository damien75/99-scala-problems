package exercises

class p31PrimeNumber {
  def isPrime(n: Int): Boolean =
    n > 1 && p31PrimeNumber.primes
      .takeWhile(_ <= Math.sqrt(n))
      .forall(n % _ != 0)
}

object p31PrimeNumber {
  val primes: LazyList[Int] = {
    val primeNumber = new p31PrimeNumber()
    LazyList.cons(2, LazyList.from(3, 2).filter(primeNumber.isPrime))
  }
}
