package leetcode

object two_zero_six {
  """
    |反转一个单链表。
    |
    |示例:
    |
    |输入: 1->2->3->4->5->NULL
    |输出: 5->4->3->2->1->NULL
    |进阶:
    |你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
    |""".stripMargin
  class ListNode(var _x: Int = 0) {
       var next: ListNode = null
       var x: Int = _x
     }

  def main(args: Array[String]): Unit = {
    def reverseList(head: ListNode): ListNode = {
      var currentNode: ListNode = head
      var preNode:ListNode = null
      while (currentNode != null){
        val nextNode = currentNode.next
        currentNode.next = preNode
        preNode = currentNode
        currentNode = nextNode
      }
      preNode
    }
    val n1 = new ListNode(1)
    val n2 = new ListNode(2)
    val n3 = new ListNode(3)
    val n4 = new ListNode(4)
    val n5 = new ListNode(5)
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    println(reverseList(n1))
  }

}
