package leetcode

object one_six_seven {
  """
    |给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
    |
    |函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
    |
    |说明:
    |
    |返回的下标值（index1 和 index2）不是从零开始的。
    |你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
    |示例:
    |
    |输入: numbers = [2, 7, 11, 15], target = 9
    |输出: [1,2]
    |解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
    |
    |来源：力扣（LeetCode）
    |链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
    |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
      var x = 0
      var l = 1
      var r = numbers.length - 1
      var y = numbers.length / 2
      var flag = 0
      while (flag == 0) {
        val sum = numbers(x) + numbers(y)
        if (sum == target) {
          flag = 1
        } else if (l >= r) {
          x += 1
          l = x + 1
          r = numbers.length - 1
          y = (x + numbers.length) / 2
        } else if (sum > target) {
          r = y - 1
          y = (l + r) / 2
        } else if (sum < target) {
          l = y + 1
          y = (l + r) / 2
        } else if (x == numbers.length - 2) {
          y = numbers.length - 1
          flag = 1
        }
      }
      Array(x + 1, y + 1)
    }

    twoSum(Array(12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375, 384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997),
      542).foreach(println)
  }

}
