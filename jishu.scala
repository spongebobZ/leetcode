package leetcode

import scala.collection.mutable.ArrayBuffer

object jishu {
  def main(args: Array[String]): Unit = {
    def getAns(s:String):Int = {
      val a = (for(_ <- s.indices) yield 1).toArray
      var flag = true
      var value = 1
      for(i <- 66 to 90 if flag){
        value = value * 2 + i - 64
        var j = 0
        var cnt = 0
        while (j < s.length) {
          if (i - s(j) <= 0) {
            a(j) = value
          }else{
            cnt += 1
          }
          j += 1
          if(cnt == s.length){
            flag = false
          }
        }
      }
      a.sum
    }
    println(getAns("BCAASDJFOWJEFSSDJFOWEJFSDLFJWEOFJSLDJFLSDJFDJFSDJFSJDF"))
  }
}
