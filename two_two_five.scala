package leetcode

import scala.collection.mutable

object two_two_five {
  """
    |使用队列实现栈的下列操作：
    |
    |push(x) -- 元素 x 入栈
    |pop() -- 移除栈顶元素
    |top() -- 获取栈顶元素
    |empty() -- 返回栈是否为空
    |注意:
    |
    |你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
    |你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
    |你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
    |""".stripMargin
  class MyStack() {

    /** Initialize your data structure here. */
    private val _queue = new mutable.Queue[Int]()


    /** Push element x onto stack. */
    def push(x: Int) {
      _queue.enqueue(x)
    }

    /** Removes the element on top of the stack and returns that element. */
    def pop(): Int = {
      for(_ <- 0 until _queue.size - 1) _queue.enqueue(_queue.dequeue)
      _queue.dequeue
    }

    /** Get the top element. */
    def top(): Int = {
      _queue.last
    }

    /** Returns whether the stack is empty. */
    def empty(): Boolean = {
      _queue.isEmpty
    }

  }

  def main(args: Array[String]): Unit = {

  }

}
