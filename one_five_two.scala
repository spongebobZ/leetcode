package leetcode

object one_five_two {
  def main(args: Array[String]): Unit = {
    def maxProduct(nums: Array[Int]): Int = {
      if (nums.length == 1) {
        return nums(0)
      }
      val notebook = Array.ofDim[Int](nums.length, 2)
      notebook(0)(0) = nums(0)
      notebook(0)(1) = nums(0)
      for (i <- 1 until nums.length) {
        if (nums(i) > 0) {
          notebook(i)(0) = if (nums(i) > nums(i) * notebook(i - 1)(0)) nums(i) else nums(i) * notebook(i - 1)(0)
          notebook(i)(1) = if (nums(i) < nums(i) * notebook(i - 1)(1)) nums(i) else nums(i) * notebook(i - 1)(1)
        } else if (nums(i) < 0) {
          notebook(i)(0) = if (nums(i) > nums(i) * notebook(i - 1)(1)) nums(i) else nums(i) * notebook(i - 1)(1)
          notebook(i)(1) = if (nums(i) < nums(i) * notebook(i - 1)(0)) nums(i) else nums(i) * notebook(i - 1)(0)
        } else {
          notebook(i)(0) = 0
          notebook(i)(1) = 0
        }
      }
      var r = notebook(0)(0)
      for (i <- 1 until notebook.length) {
        if (notebook(i)(0) > r) {
          r = notebook(i)(0)
        }
      }
      r
    }

    println(maxProduct(Array(-1,-2,-9,-6)))
  }

}
