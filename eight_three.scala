package leetcode

object eight_three {
  """
    |给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
    |
    |示例 1:
    |
    |输入: 1->1->2
    |输出: 1->2
    |示例 2:
    |
    |输入: 1->1->2->3->3
    |输出: 1->2->3
    |
    |来源：力扣（LeetCode）
    |链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
    |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    |""".stripMargin

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    def deleteDuplicates(head: ListNode): ListNode = {
      if (head == null){
        return head
      }
      var currentNode = head
      var nextNode = head.next
      while (nextNode != null) {
        if (currentNode.x == nextNode.x) {
          currentNode.next = nextNode.next
          nextNode = nextNode.next
        } else {
          currentNode = nextNode
          nextNode = nextNode.next
        }
      }
      head
    }
    val h = new ListNode()
    deleteDuplicates(h)
  }

}
