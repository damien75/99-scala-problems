package exercises

import scala.reflect.ClassTag
import scala.util.Random

class p25GenerateRandomPermutation {
  def permute[A: ClassTag](l: List[A]): List[A] = {
    val r = Random
    val permuted = l.toArray
    for (i ← l.length - 1 to 1 by -1) {
      val i1 = r.nextInt(i + 1)
      val t = permuted(i)
      permuted.update(i, permuted(i1))
      permuted.update(i1, t)
    }
    permuted.toList
  }
}
