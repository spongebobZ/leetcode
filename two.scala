package leetcode

object two {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    def initNextNode(currentNode: ListNode): Unit = {
      currentNode.next = new ListNode()
      if (currentNode.x > 9) {
        currentNode.next.x = 1
        currentNode.x -= 10
      }
    }

    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
      var n1 = l1
      var n2 = l2
      val rs = new ListNode()
      var r = new ListNode(n1.x + n2.x)
      initNextNode(r)
      rs.next = r
      while (n1.next != null && n2.next != null) {
        r = r.next
        n1 = n1.next
        n2 = n2.next
        r.x += n1.x + n2.x
        initNextNode(r)
      }
      while (n1.next != null) {
        r = r.next
        n1 = n1.next
        r.x += n1.x
        initNextNode(r)
      }
      while (n2.next != null) {
        r = r.next
        n2 = n2.next
        r.x += n2.x
        initNextNode(r)
      }
      if (r.next.x == 0) {
        r.next = null
      }
      rs.next
    }

    val n1 = new ListNode(2)
    val n2 = new ListNode(4)
    val n3 = new ListNode(3)
    n1.next = n2
    n2.next = n3
    val m1 = new ListNode(5)
    val m2 = new ListNode(6)
    val m3 = new ListNode(4)
    m1.next = m2
    m2.next = m3
    val rs = addTwoNumbers(n1, m1)
    println(rs)
  }

}
