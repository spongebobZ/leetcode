package leetcode

object one_six_eight {
  """
    |给定一个正整数，返回它在 Excel 表中相对应的列名称。
    |
    |例如，
    |
    |    1 -> A
    |    2 -> B
    |    3 -> C
    |    ...
    |    26 -> Z
    |    27 -> AA
    |    28 -> AB
    |    ...
    |示例 1:
    |
    |输入: 1
    |输出: "A"
    |示例 2:
    |
    |输入: 28
    |输出: "AB"
    |示例 3:
    |
    |输入: 701
    |输出: "ZY"
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def convertToTitle(n: Int): String = {
      var quotient = n
      var s = ""
      var remainder = 0
      while (quotient > 0){
        var q = quotient / 26
        remainder = quotient % 26
        if(quotient % 26 == 0){
          remainder = 26
          q -= 1
        }
        s = (remainder + 64).toChar.toString + s
        quotient = q
      }
      s
    }
    println(convertToTitle(704))
  }
}
