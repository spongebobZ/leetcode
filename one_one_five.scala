package leetcode

import scala.collection.mutable.ArrayBuffer

object one_one_five {

  class MinStack() {

    /** initialize your data structure here. */
    private var nums = new ArrayBuffer[Int]()


    def push(x: Int) {
      nums.insert(0, x)
    }

    def pop(): Unit = {
      nums.remove(0)
    }

    def top(): Int = {
      nums(0)
    }

    def getMin(): Int = {
      nums.min
    }
  }

  /**
   * Your MinStack object will be instantiated and called as such:
   * var obj = new MinStack()
   * obj.push(x)
   * obj.pop()
   * var param_3 = obj.top()
   * var param_4 = obj.getMin()
   */

}
