package exercises

class p24DrawNFromRange {
  def draw(n: Int, rangeStrictUpperLimit: Int): List[Int] =
    new p23SelectRandomElementsFromList()
      .select(List.range(1, rangeStrictUpperLimit), n)
}
