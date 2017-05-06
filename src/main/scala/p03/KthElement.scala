package p03

/**
  * Created by damiengoblot on 2017-05-06.
  */
class KthElement {
  def kth[A](l: List[A], k: Int): A = {
    if (k >= 0) l(k)
    else throw new NoSuchElementException
  }
}
