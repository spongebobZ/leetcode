package leetcode

object two_three_two {
  """
    |使用栈实现队列的下列操作：
    |
    |push(x) -- 将一个元素放入队列的尾部。
    |pop() -- 从队列首部移除元素。
    |peek() -- 返回队列首部的元素。
    |empty() -- 返回队列是否为空。
    | 
    |
    |示例:
    |
    |MyQueue queue = new MyQueue();
    |
    |queue.push(1);
    |queue.push(2);
    |queue.peek();  // 返回 1
    |queue.pop();   // 返回 1
    |queue.empty(); // 返回 false
    | 
    |
    |说明:
    |
    |你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
    |你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
    |假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
    |""".stripMargin
  class MyQueue() {

    /** Initialize your data structure here. */
    private val _stack = collection.mutable.Stack[Int]()


    /** Push element x to the back of queue. */
    def push(x: Int) {
      _stack.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    def pop(): Int = {
      val len = _stack.size - 1
      val tmpPop = new Array[Int](len)
      for(i <- 0 until len){
        tmpPop(len - i - 1) = _stack.pop()
      }
      val ret = _stack.pop()
      for(i <- tmpPop){
        _stack.push(i)
      }
      ret
    }

    /** Get the front element. */
    def peek(): Int = {
      _stack.last
    }

    /** Returns whether the queue is empty. */
    def empty(): Boolean = {
      _stack.isEmpty
    }

  }

}
