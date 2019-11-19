package exercises

class p18SliceList {
  def slice[A](l: List[A],
               startFromIndex: Int,
               finishBeforeIndex: Int): List[A] =
    l.slice(startFromIndex, finishBeforeIndex)
}
