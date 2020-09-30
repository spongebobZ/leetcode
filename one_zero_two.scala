package leetcode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object one_zero_two {
  """
    |给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
    |
    | 
    |
    |示例：
    |二叉树：[3,9,20,null,null,15,7],
    |
    |    3
    |   / \
    |  9  20
    |    /  \
    |   15   7
    |返回其层次遍历结果：
    |
    |[
    |  [3],
    |  [9,20],
    |  [15,7]
    |]
    |""".stripMargin

  class TreeNode(var _value: Int) {
       var value: Int = _value
       var left: TreeNode = null
       var right: TreeNode = null
     }
  def main(args: Array[String]): Unit = {
    def levelOrder(root: TreeNode): List[List[Int]] = {
      if(root == null){
        return List()
      }
      val ret = new ArrayBuffer[ArrayBuffer[Int]]()
      var levelValues = new ArrayBuffer[Int]()
      var levelRootCnt = 1
      var levelChildCnt = 0
      val queue = new mutable.Queue[TreeNode]()
      queue.enqueue(root)
      while (queue.nonEmpty){
        val node = queue.dequeue
        levelRootCnt -= 1
        levelValues += node.value
        if(node.left != null){
          queue.enqueue(node.left)
          levelChildCnt += 1
        }
        if(node.right != null){
          queue.enqueue(node.right)
          levelChildCnt += 1
        }
        if(levelRootCnt == 0){
          ret += levelValues
          levelRootCnt = levelChildCnt
          levelChildCnt = 0
          levelValues = new ArrayBuffer[Int]()
        }
      }
      ret.map(_.toList).toList
    }
  }

}
