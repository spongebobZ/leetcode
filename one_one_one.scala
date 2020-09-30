package leetcode

object one_one_one {
  """
    |给定一个二叉树，找出其最小深度。
    |
    |最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
    |
    |说明: 叶子节点是指没有子节点的节点。
    |
    |示例:
    |
    |给定二叉树 [3,9,20,null,null,15,7],
    |
    |    3
    |   / \
    |  9  20
    |    /  \
    |   15   7
    |返回它的最小深度  2.
    |""".stripMargin
  class TreeNode(var _value: Int) {
       var value: Int = _value
       var left: TreeNode = null
       var right: TreeNode = null
     }

  def main(args: Array[String]): Unit = {
    def minDepth(root: TreeNode): Int = {
      val queue = new collection.mutable.Queue[TreeNode]()
      if(root == null){
        return 0
      }
      queue.enqueue(root)
      var ret = 1
      var unreadNodes = 1
      var childNodes = 0
      var flag = true
      while (flag && queue.nonEmpty){
        val node = queue.dequeue
        if(unreadNodes == 0){
          ret += 1
          unreadNodes = childNodes
          childNodes = 0
        }
        unreadNodes -= 1
        if(node.left != null){
          queue.enqueue(node.left)
          childNodes += 1
        }
        if(node.right != null){
          queue.enqueue(node.right)
          childNodes += 1
        }else if(node.left == null){
          flag = false
        }
      }
      ret
    }
    val n1 = new TreeNode(1)
    val n2 = new TreeNode(2)
    val n3 = new TreeNode(2)
    val n4 = new TreeNode(2)
    val n5 = new TreeNode(2)
    n1.left = n2
    n1.right = n3
    n2.left = n4
    n3.right = n5
    println(minDepth(n1))
  }

}
