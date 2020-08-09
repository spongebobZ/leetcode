package leetcode

object six_six {
  def main(args: Array[String]): Unit = {
    def plusOne(digits: Array[Int]): Array[Int] = {
      digits(digits.length-1)+=1
      for(i <- digits.length-1 to (1,-1)){
        if(digits(i)==10){
          digits(i)=0
          digits(i-1)+=1
        }
      }
      if(digits(0)==10){
        val newDigits = new Array[Int](digits.length+1)
        newDigits(0)=1
        digits(0)=0
        digits.copyToArray(newDigits,1)
        newDigits
      }else{
        digits
      }
    }
    plusOne(Array(9,9)).foreach(println(_))
  }

}
