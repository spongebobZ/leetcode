package leetcode

object six_four {
  def main(args: Array[String]): Unit = {
    def minPathSum(grid: Array[Array[Int]]): Int = {
      val (m, n) = (grid.length, grid(0).length)
      val notebook = Array.ofDim[Int](m, n)
      for (i <- 0 until m; j <- 0 until n) {
        if (i + j == 0)
          notebook(i)(j) = grid(0)(0)
        else if (i == 0)
          notebook(i)(j) = notebook(i)(j - 1) + grid(i)(j)
        else if (j == 0)
          notebook(i)(j) = notebook(i - 1)(j) + grid(i)(j)
        else
          notebook(i)(j) = math.min(notebook(i - 1)(j), notebook(i)(j - 1)) + grid(i)(j)
      }
      notebook(m - 1)(n - 1)
    }
    println(minPathSum(Array(Array(1,3,1),Array(1,5,1),Array(4,2,1))))
  }


}
