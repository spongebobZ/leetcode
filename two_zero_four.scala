package leetcode

object two_zero_four {
  """
    |统计所有小于非负整数 n 的质数的数量。
    |
    |示例:
    |
    |输入: 10
    |输出: 4
    |解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def countPrimes(n: Int): Int = {
      if(n < 2){
        return 0
      }
      val markArray = (for (_ <- 0 until n) yield 1).toArray
      for(i <- 2 until (n - 1)){
        var j = 2
        while (i * j < n){
          markArray(i * j) = 0
          j += 1
        }
      }
      markArray.sum - 2
    }

    println(countPrimes(0))
  }

}
