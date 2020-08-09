package leetcode

object five_eight {
  def main(args: Array[String]): Unit = {
    def lengthOfLastWord(s: String): Int = {
      if(s.length==0)
        return 0
      var cnt=0
      var flag=0
      var mark=0
      val len=s.length-1
      for(i <- len to (0,-1) if mark==0){
        if(s(i)!=' ' && flag==0){
          flag=1
          cnt=1
        }
        else if(s(i)!=' '){
          cnt+=1
        }
        else if(flag==1){
          mark=1
        }
      }
      cnt
    }
    println(lengthOfLastWord("a  aa "))
  }

}
