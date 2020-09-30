package leetcode

object two_zero_two {
  """
    |编写一个算法来判断一个数 n 是不是快乐数。
    |
    |「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
    |
    |如果 n 是快乐数就返回 True ；不是，则返回 False 。
    |
    | 
    |
    |示例：
    |
    |输入：19
    |输出：true
    |解释：
    |12 + 92 = 82
    |82 + 22 = 68
    |62 + 82 = 100
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    class ListNode(_x:Int, n:ListNode = null){
      val x: Int = _x
      var next: ListNode = n
    }
    def isHappy(n: Int): Boolean = {
      var value = n
      var flag = 1
      val head = new ListNode(value)
      var ret = false
      var slow = head
      var fast = head
      while (flag == 1){
        var sum = 0
        var quotient = value
        while (quotient != 0){
          sum += math.pow(quotient % 10,2).toInt
          quotient /= 10
        }
        fast.next = new ListNode(sum)
        fast = fast.next
        quotient = sum
        sum = 0
        while (quotient != 0){
          sum += math.pow(quotient % 10,2).toInt
          quotient /= 10
        }
        fast.next = new ListNode(sum)
        fast = fast.next
        slow = slow.next
        value = sum
        if(sum == 1){
          flag = 0
          ret = true
        }else if(fast.x == slow.x){
          flag = 0
        }
      }
      ret
    }
    print(isHappy(19))
  }

}
