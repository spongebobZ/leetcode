package leetcode

object six_two {
  def main(args: Array[String]): Unit = {
    def uniquePaths(m: Int, n: Int): Int = {
      val notebook = Array.ofDim[Int](m, n)
      for (i <- 0 until m; j <- 0 until n) {
        if (i * j == 0)
          notebook(i)(j) = 1
        else
          notebook(i)(j) = notebook(i - 1)(j) + notebook(i)(j - 1)
      }
      notebook(m - 1)(n - 1)
    }
    println(uniquePaths(3,7))
  }

}
