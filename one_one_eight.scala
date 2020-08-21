package leetcode

object one_one_eight {
  """
    |给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def generate(numRows: Int): List[List[Int]] = {
      if(numRows == 0){
        return List()
      }
      val r = new Array[List[Int]](numRows)
      r(0) = List(1)
      var i = 1
      while (i < numRows) {
        val tmp = new Array[Int](i + 1)
        tmp(0) = 1
        tmp(i) = 1
        for (j <- 1 until i) {
          tmp(j) = r(i - 1)(j - 1) + r(i - 1)(j)
        }
        r(i) = tmp.toList
        i += 1
      }
      r.toList
    }
    generate(0).foreach(x => println(x.mkString(",")))
  }
}


