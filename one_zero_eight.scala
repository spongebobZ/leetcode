package leetcode

object one_zero_eight {
  """
    |将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
    |
    |本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
    |
    |示例:
    |
    |给定有序数组: [-10,-3,0,5,9],
    |
    |一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
    |
    |      0
    |     / \
    |   -3   9
    |   /   /
    | -10  5
    |""".stripMargin
  class TreeNode(var _value: Int) {
       var value: Int = _value
       var left: TreeNode = null
       var right: TreeNode = null
     }

  def main(args: Array[String]): Unit = {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
      if(nums.isEmpty){
        null
      }else{
        val node = new TreeNode(nums(nums.length / 2))
        node.left = sortedArrayToBST(nums.slice(0, nums.length / 2))
        node.right = sortedArrayToBST(nums.slice(nums.length / 2 + 1, nums.length))
        node
      }
    }
  }

}
