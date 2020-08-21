package leetcode

object one_four_one {
  """
    |给定一个链表，判断链表中是否有环。
    |
    |为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
    |
    | 
    |
    |示例 1：
    |
    |输入：head = [3,2,0,-4], pos = 1
    |输出：true
    |解释：链表中有一个环，其尾部连接到第二个节点。
    |
    |
    |来源：力扣（LeetCode）
    |链接：https://leetcode-cn.com/problems/linked-list-cycle
    |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    |""".stripMargin

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    def hasCycle(head: ListNode): Boolean = {
      var slow = head
      var fast = head
      var r = false
      var flag = 0
      while (fast != null && flag == 0) {
        slow = slow.next
        fast = fast.next
        if (fast == null) {
          flag = 1
        } else {
          fast = fast.next
          if (slow == fast) {
            r = true
            flag = 1
          }
        }
      }
      r
    }

    println(hasCycle(new ListNode(1)))
  }

}
