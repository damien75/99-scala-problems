package exercises

import org.scalatest.FunSuite

class p06ListPalindromeSuite extends FunSuite {
  test("Should return true if the input list of odd size is a palindrome") {
    assertResult(true) {
      new p06ListPalindrome().isPalindrome(List(1, 2, 3, 4, 3, 2, 1))
    }
  }

  test("Should return false if the input list of odd size is not a palindrome") {
    assertResult(false) {
      new p06ListPalindrome().isPalindrome(List(1, 2, 3, 4, 7, 2, 1))
    }
  }

  test("Should return true if the input list of even size is a palindrome") {
    assertResult(true) {
      new p06ListPalindrome().isPalindrome(List(1, 2, 3, 3, 2, 1))
    }
  }

  test("Should return false if the input list of even size is not a palindrome") {
    assertResult(false) {
      new p06ListPalindrome().isPalindrome(List(1, 2, 3, 3, 4, 5))
    }
  }

  test("Should support empty lists") {
    assertResult(true) {
      new p06ListPalindrome().isPalindrome(List.empty)
    }
  }
}
