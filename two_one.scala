package leetcode

object two_one {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
      var node1 = l1
      var node2 = l2
      val lr = new ListNode()
      var curNode = lr
      while (node1!=null || node2!=null){
        if(node1==null){
          curNode.next = node2
          node2 = node2.next
        }else if(node2==null){
          curNode.next = node1
          node1 = node1.next
        }else{
          if(node1.x > node2.x){
            curNode.next = node2
            node2 = node2.next
          }else{
            curNode.next = node1
            node1 = node1.next
          }
        }
        curNode = curNode.next
      }
      lr.next
    }

    val n3=new ListNode(6)
    val n2=new ListNode(4)
    n2.next=n3
    val n1=new ListNode(1)
    n1.next=n2
    val m3=new ListNode(5)
    val m2=new ListNode(3)
    m2.next=m3
    val m1=new ListNode(3)
    m1.next=m2
    val o=mergeTwoLists(n1,m1)
    println(o)
  }

}
