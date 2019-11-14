package exercises

class p16DropFrequencyListElements {
  def dropEvery[A](dropFrequency: Int, l: List[A]): List[A] =
    l.zipWithIndex filter { v =>
      (v._2 + 1) % dropFrequency != 0
    } map { _._1 }
}
