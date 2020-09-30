package leetcode

object one_zero_one {
  """
    |给定一个二叉树，检查它是否是镜像对称的。
    |
    | 
    |
    |例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
    |
    |    1
    |   / \
    |  2   2
    | / \ / \
    |3  4 4  3
    | 
    |
    |但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
    |
    |    1
    |   / \
    |  2   2
    |   \   \
    |   3    3
    |""".stripMargin
  class TreeNode(var _value: Int) {
       var value: Int = _value
       var left: TreeNode = null
       var right: TreeNode = null
     }

  def main(args: Array[String]): Unit = {
    def isSymmetric(root: TreeNode): Boolean = {
      root == null || check(root.left,root.right)
      }

    def check(left:TreeNode, right:TreeNode):Boolean = {
      if(left == null && right == null){
        true
      }else if(left == null || right == null || left.value != right.value){
        false
      }else{
        check(left.left,right.right) && check(left.right,right.left)
      }
    }
  }

}
