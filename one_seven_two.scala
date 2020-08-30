package leetcode

object one_seven_two {
  """
    |给定一个整数 n，返回 n! 结果尾数中零的数量。
    |
    |示例 1:
    |
    |输入: 3
    |输出: 0
    |解释: 3! = 6, 尾数中没有零。
    |示例 2:
    |
    |输入: 5
    |输出: 1
    |解释: 5! = 120, 尾数中有 1 个零.
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def trailingZeroes(n: Int): Int = {
      var r = 0
      var quotient = n
      while (quotient > 0){
        quotient /= 5
        r += quotient
      }
      r
    }
    print(trailingZeroes(200))
  }

}
