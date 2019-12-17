package exercises

import scala.collection.mutable

class p28SortNestedList {
  def sortShortFirst[A](l: List[List[A]]): List[List[A]] =
    l.sortWith(_.size < _.size)

  def sortLeastFrequentSizeFirst[A](l: List[List[A]]): List[List[A]] = {
    val encoder = new p10RunLengthEncoding()
    val freqs = Map(encoder.encode(l.map(_.size).sorted).map(_.swap): _*)
    l.sortWith((leftList, rightList) ⇒
      freqs(leftList.size) < freqs(rightList.size))
  }
}
