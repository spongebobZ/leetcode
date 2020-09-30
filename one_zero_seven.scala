package leetcode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object one_zero_seven {
  """
    |给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
    |
    |例如：
    |给定二叉树 [3,9,20,null,null,15,7],
    |
    |    3
    |   / \
    |  9  20
    |    /  \
    |   15   7
    |返回其自底向上的层次遍历为：
    |
    |[
    |  [15,7],
    |  [9,20],
    |  [3]
    |]
    |""".stripMargin

  class TreeNode(var _value: Int) {
       var value: Int = _value
       var left: TreeNode = null
       var right: TreeNode = null
     }
  def main(args: Array[String]): Unit = {
    def levelOrderBottom(root: TreeNode): List[List[Int]] = {
      if(root == null){
        return List()
      }
      val queue = new mutable.Queue[TreeNode]()
      queue.enqueue(root)
      val ret = new ArrayBuffer[ArrayBuffer[Int]]()
      var levelRootCnt = 1
      var levelChildCnt = 0
      var levelValue = new ArrayBuffer[Int]()
      while (queue.nonEmpty){
        val node = queue.dequeue
        levelValue += node.value
        levelRootCnt -= 1
        if(node.left != null) {
          queue.enqueue(node.left)
          levelChildCnt += 1
        }
        if(node.right != null){
          queue.enqueue(node.right)
          levelChildCnt += 1
        }
        if(levelRootCnt == 0){
          ret += levelValue
          levelValue = new ArrayBuffer[Int]()
          levelRootCnt = levelChildCnt
          levelChildCnt = 0
        }
      }
      ret.map(_.toList).reverse.toList
    }
  }

}
