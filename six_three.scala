package leetcode

object six_three {
  def main(args: Array[String]): Unit = {
    def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
      if (obstacleGrid(0)(0) == 1)
        return 0
      val (m, n) = (obstacleGrid.length, obstacleGrid(0).length)
      val notebook = Array.ofDim[Int](m, n)
      for (i <- 0 until m; j <- 0 until n) {
        if (i + j == 0)
          notebook(0)(0) = 1
        else if (i * j == 0 && obstacleGrid(i)(j) == 1)
          notebook(i)(j) = 0
        else if (i == 0)
          notebook(i)(j) = notebook(i)(j - 1)
        else if (j == 0)
          notebook(i)(j) = notebook(i - 1)(j)
        else if (obstacleGrid(i)(j) == 1)
          notebook(i)(j) = 0
        else
          notebook(i)(j) = notebook(i)(j - 1) + notebook(i - 1)(j)
      }
      notebook(m - 1)(n - 1)
    }

    println(uniquePathsWithObstacles(Array(Array(0, 0, 0), Array(0, 1, 0), Array(0, 0, 0))))

  }

}
