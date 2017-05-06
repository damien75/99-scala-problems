package p03

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2017-05-06.
  */
class KthElementSuite extends FunSuite{
  test("kth should return the kth element of the list"){
    assertResult(3){new KthElement().kth(List(2, 64, 43, 7, 3, 4, 78, 32), 4)}
  }

  test("kth should throw an exception if k < 0"){
    assertThrows[NoSuchElementException](new KthElement().kth(List(1, 4, 5), -3))
  }
}
