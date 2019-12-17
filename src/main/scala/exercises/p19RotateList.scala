package exercises

class p19RotateList {
  def rotate[A](l: List[A], rotations: Int): List[A] = {
    val rotationsBounded = if (l.isEmpty) 0 else rotations % l.size
    val rotationsPositive =
      if (rotationsBounded < 0) l.size + rotationsBounded else rotationsBounded
    l.drop(rotationsPositive) ::: l.take(rotationsPositive)
  }
}
