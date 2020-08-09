package leetcode

object five_three {
  def main(args: Array[String]): Unit = {
    def maxSubArray(nums: Array[Int]): Int = {
      val notebook = new Array[Int](nums.length)
      for(i <- nums.indices){
        i match {
          case 0 => notebook(0) = nums(0)
          case _ =>
            if(notebook(i-1) <= 0)
              notebook(i) = nums(i)
            else
              notebook(i) = notebook(i-1) + nums(i)
        }
      }
      notebook.max
    }
    println(maxSubArray(Array(-1,-1,2,3,-1,2)))
  }

}
