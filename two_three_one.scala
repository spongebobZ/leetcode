package leetcode

object two_three_one {
  """
    |给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
    |
    |示例 1:
    |
    |输入: 1
    |输出: true
    |解释: 20 = 1
    |示例 2:
    |
    |输入: 16
    |输出: true
    |解释: 24 = 16
    |示例 3:
    |
    |输入: 218
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def isPowerOfTwo(n: Int): Boolean = {
      var q = n
      var sum = 0
      while (q > 0 && sum < 2){
        sum += (q % 2)
        q /= 2
      }
      sum == 1
    }
    println(isPowerOfTwo(-64))

  }

}
