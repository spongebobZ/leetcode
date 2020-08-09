package leetcode

object one_night_eight {
  /*
  你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
  如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的
  情况下，能够偷窃到的最高金额。
   */
  def main(args: Array[String]): Unit = {
    def rob(nums: Array[Int]): Int = {
      if (nums.length == 0)
        return 0
      val notebook = new Array[Int](nums.length)
      for (house <- nums.indices) {
        house match {
          case 0 => notebook(house) = nums(0)
          case 1 => notebook(house) = math.max(nums(0), nums(1))
          case other => notebook(house) = math.max(notebook(other - 2) + nums(other), notebook(other - 1))
        }
      }
      notebook(notebook.length - 1)
    }

    val house = Array(2, 7, 9, 3, 1)
    println(rob(house))
  }

}
