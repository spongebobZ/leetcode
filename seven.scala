package leetcode

object seven {
  def main(args: Array[String]): Unit = {
    def reverse(x: Int): Int = {
      if (x==math.pow(-2,31))
        return 0
      if (math.abs(x) < 10)
        return x
      val s = math.abs(x).toString.toArray
      var i = 0
      var j = s.length - 1
      while (i < j) {
        if(s(i)!=s(j)){
          val tmp = s(i)
          s(i) = s(j)
          s(j) = tmp
        }
        i += 1
        j -= 1
      }
      if (x < 0) {
        if(("-" + s.mkString("")).toDouble <= math.pow(-2, 31))
          0
        else
          ("-" + s.mkString("")).toInt
      } else {
        if(s.mkString("").toDouble >= math.pow(2, 31)-1)
          0
        else
          s.mkString("").toInt
      }
    }
    println(reverse(900000))
  }
}
