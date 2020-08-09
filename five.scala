package leetcode

object five {
  def main(args: Array[String]): Unit = {
    def longestPalindrome(s: String): String = {
      if (s.length < 2) {
        return s
      }
      val notebook = new Array[String](s.length)
      var flag1 = 0
      for (i <- 0 until s.length - 1 if flag1 == 0) {
        var flag2 = 0
        for (j <- s.length - 1 until(i, -1) if flag2 == 0) {
          val currentString = s.substring(i, j + 1)
          if (isPalindrome(currentString) == 1) {
            notebook(i) = currentString
            flag2 = 1
            if (j == s.length - 1) {
              flag1 = 1
              notebook(i + 1) = "e"
            }
          }
        }
      }

      def isPalindrome(subs: String): Int = {
        var (i, j) = (0, subs.length - 1)
        while (j > i) {
          if (subs(i) != subs(j)) {
            return 0
          }
          i += 1
          j -= 1
        }
        1
      }

      var r = ""
      var flag3 = 0
      for (i <- notebook if flag3 == 0) {
        if (i != null && i.length > r.length) {
          r = i
        }
        if (i == "e") {
          flag3 == 1
        }
      }
      if (r == "") {
        r = s(0).toString
      }
      r
    }

    println(longestPalindrome("ac"))


  }

}
