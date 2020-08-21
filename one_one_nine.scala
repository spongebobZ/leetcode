package leetcode

object one_one_nine {
  """
    |给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def getRow(rowIndex: Int): List[Int] = {
      var r = Array(1)
      var i = 1
      while (i <= rowIndex) {
        val tmp = new Array[Int](i+1)
        tmp(0) = 1
        tmp(i) = 1
        for (j <- 1 until i) {
          tmp(j) = r(j-1) + r(j)
        }
        i += 1
        r = tmp
      }
      r.toList
    }
    getRow(4).foreach(x => println(x))
  }

}
