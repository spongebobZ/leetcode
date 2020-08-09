package leetcode

object one_two_zero {
  def main(args: Array[String]): Unit = {
    def minimumTotal(triangle: List[List[Int]]): Int = {
      if (triangle.length == 1) {
        return triangle.head.head
      }
      val notebook = Array.ofDim[Int](triangle.length, triangle.tail(triangle.length - 2).length)
      notebook(0)(0) = triangle.head.head
      for (i <- 1 until triangle.length) {
        for (j <- triangle(i).indices) {
          if (j == 0)
            notebook(i)(j) = notebook(i - 1)(0) + triangle(i).head
          else if (j == triangle(i).length - 1)
            notebook(i)(j) = notebook(i - 1)(j - 1) + triangle(i)(j)
          else
            notebook(i)(j) = math.min(notebook(i - 1)(j - 1), notebook(i - 1)(j)) + triangle(i)(j)
        }
      }
      notebook.tail(notebook.length - 2).min
    }

    print(minimumTotal(List(List(2), List(3, 4), List(6, 5, 7), List(4, 1, 8, 3))))
  }

}
