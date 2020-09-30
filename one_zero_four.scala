package leetcode

object one_zero_four {
  """
    |给定一个二叉树，找出其最大深度。
    |
    |二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    |
    |说明: 叶子节点是指没有子节点的节点。
    |
    |示例：
    |给定二叉树 [3,9,20,null,null,15,7]，
    |
    |    3
    |   / \
    |  9  20
    |    /  \
    |   15   7
    |返回它的最大深度 3 。
    |""".stripMargin

  class TreeNode(_value:Int){
    val value:Int = _value
    val left:TreeNode = null
    val right:TreeNode = null
  }
  def main(args: Array[String]): Unit = {
    def maxDepth(root: TreeNode): Int = {
      if(root == null){
        0
      }else{
        val left = maxDepth(root.left)
        val right = maxDepth(root.right)
        if(left > right) left else right
      }
    }
  }

}
