package leetcode

object one_six_nine {
  """
    |给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    |
    |你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    |
    | 
    |
    |示例 1:
    |
    |输入: [3,2,3]
    |输出: 3
    |示例 2:
    |
    |输入: [2,2,1,1,1,2,2]
    |输出: 2
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def majorityElement(nums: Array[Int]): Int = {
      var counter = 0
      var candidate = 0
      for(num <- nums){
        counter match {
          case 0 => candidate = num
            counter = 1
          case _ => if(num == candidate){
            counter += 1
          }else{
            counter -= 1
          }
        }
      }
      candidate
    }
  }

}
