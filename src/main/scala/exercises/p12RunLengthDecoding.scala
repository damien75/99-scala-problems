package exercises

class p12RunLengthDecoding {
  def decode[A](l: List[(Int, A)]): List[A] = l flatMap { el ⇒
    List.fill(el._1)(el._2)
  }
}
