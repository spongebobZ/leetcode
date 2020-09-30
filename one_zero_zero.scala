package leetcode

object one_zero_zero {
  """
    |给定两个二叉树，编写一个函数来检验它们是否相同。
    |
    |如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
    |
    |示例 1:
    |
    |输入:       1         1
    |          / \       / \
    |         2   3     2   3
    |
    |        [1,2,3],   [1,2,3]
    |
    |输出: true
    |示例 2:
    |
    |输入:      1          1
    |          /           \
    |         2             2
    |
    |        [1,2],     [1,null,2]
    |
    |输出: false
    |示例 3:
    |
    |输入:       1         1
    |          / \       / \
    |         2   1     1   2
    |
    |        [1,2,1],   [1,1,2]
    |
    |输出: false
    |""".stripMargin

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
       var value: Int = _value
       var left: TreeNode = _left
       var right: TreeNode = _right
     }
  def main(args: Array[String]): Unit = {
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
      if(p == null && q == null){
        true
      }else if(p != null && q != null && p.value == q.value){
        val ret = isSameTree(p.left, q.left)
        if(ret){
          isSameTree(p.right,q.right)
        }else{
          false
        }
      }else{
        false
      }
    }
    val n1 = new TreeNode(1)
    val n2 = new TreeNode(2)
    val n3 = new TreeNode(3)
    val n4 = new TreeNode(1)
    val n5 = new TreeNode(5)
    val n6 = new TreeNode(6)
    val n7 = new TreeNode(7)

    n1.left = n2
    n4.left = n3

    val n8 = new TreeNode(0)
    println(isSameTree(n1,n4))
  }

}
