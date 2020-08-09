package leetcode

object nine_one {
  def main(args: Array[String]): Unit = {
    def numDecodings(s: String): Int = {
      if (s(0) == '0' || s.count(_ == '0') == s.length)
        return 0
      val notebook = new Array[Int](s.length)
      notebook(0) = 1
      for (i <- 1 until s.length) {
        val w = s.substring(i - 1, i + 1).toInt
        if (w == 0)
          return 0
        if (w > 26) {
          if (w % 10 == 0)
            return 0
          else
            notebook(i) = notebook(i - 1)
        } else {
          if (w % 10 == 0 && notebook(i - 1) > 1)
            notebook(i) = notebook(i - 1) - 1
          else if (w %10 == 0 || w < 10)
            notebook(i) = notebook(i - 1)
          else if(w > 10)
            notebook(i) = notebook(i - 1) + 2
          else
            notebook(i) = notebook(i - 1) + 1
        }
      }
      notebook(s.length - 1)
    }
    println(numDecodings("1212"))
  }

}
