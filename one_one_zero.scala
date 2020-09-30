package leetcode

object one_one_zero {
  """
    |给定一个二叉树，判断它是否是高度平衡的二叉树。
    |
    |本题中，一棵高度平衡二叉树定义为：
    |
    |一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
    |
    |示例 1:
    |
    |给定二叉树 [3,9,20,null,null,15,7]
    |
    |    3
    |   / \
    |  9  20
    |    /  \
    |   15   7
    |返回 true 。
    |
    |示例 2:
    |
    |给定二叉树 [1,2,2,3,3,null,null,4,4]
    |
    |       1
    |      / \
    |     2   2
    |    / \
    |   3   3
    |  / \
    | 4   4
    |返回 false 。
    |""".stripMargin

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }
  def main(args: Array[String]): Unit = {
    def getDepth(node:TreeNode):Int = {
      if(node == null){
        0
      }else{
        val leftDepth = getDepth(node.left)
        val rightDepth = getDepth(node.right)
        if(leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1){
          -1
        }else{
          Math.max(leftDepth,rightDepth) + 1
        }
      }
    }
    def isBalanced(root: TreeNode): Boolean = {
      getDepth(root) != -1
    }
  }
}
