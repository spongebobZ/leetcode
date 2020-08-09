package leetcode

object six_seven {
  def main(args: Array[String]): Unit = {
    def addBinary(a: String, b: String): String = {
      val m = a.length
      val n = b.length
      val l = math.max(m, n)
      val r = new Array[Char](l)
      for (i <- 1 until l) {
        var t = 0
        if (m > i && n > i) {
          t = a(m - i).toInt + b(n - i).toInt
        } else if (m > i) {
          t = a(m - i).toInt
        } else {
          t = b(n - i).toInt
        }
        r(l - i) = (r(l - i).toInt + t).toChar
        if (r(l - i) > 1) {
          r(l - i) = (r(l - i).toInt-2).toChar
          r(l - i - 1) = '1'
        }
      }
      if(m==l){
        r(0)=(r(0).toInt+a(0).toInt).toChar
      }
      if(n==l){
        r(0)=(r(0).toInt+b(0).toInt).toChar
      }
      if(r(0).toInt>1){
        val rs = new Array[Char](l+1)
        rs(0)='1'
        r.copyToArray(rs,1)
        rs.mkString("")
      }else{
        r.mkString("")
      }
    }
    println(addBinary("11","1"))
  }

}
