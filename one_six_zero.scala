package leetcode

object one_six_zero {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
      var x = headA
      var y = headB
      var flag = 0
      var x_round = 1
      var y_round = 1
      var r: ListNode = null
      if(x == null || y == null){
        return r
      }
      while (flag == 0) {
        if (x == y) {
          flag = 1
          r = x
        }else{
          if(x.next == null && x_round == 1){
            x = headB
            x_round = 2
          }else if(x.next == null && x_round == 2){
            flag = 1
          }else{
            x = x.next
          }
          if(y.next == null && y_round == 1){
            y = headA
            y_round = 2
          }else if(y.next == null && y_round == 2){
            flag = 1
          }else{
            y = y.next
          }
        }
      }
      r
    }
  }

}
