package leetcode

object eigth_six_seven {
  def main(args: Array[String]): Unit = {
    object Solution {
      def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
        val m = Array.ofDim[Int](A(0).length, A.length)
        for (i <- A.indices; j <- A(0).indices) {
          m(j)(i)=A(i)(j)
        }
        m
      }
    }
  }


}
