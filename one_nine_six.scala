package leetcode

object one_nine_six {
  """
    |编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。
    |
    |+----+------------------+
    || Id | Email            |
    |+----+------------------+
    || 1  | john@example.com |
    || 2  | bob@example.com  |
    || 3  | john@example.com |
    |+----+------------------+
    |Id 是这个表的主键。
    |例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:
    |
    |+----+------------------+
    || Id | Email            |
    |+----+------------------+
    || 1  | john@example.com |
    || 2  | bob@example.com  |
    |+----+------------------+
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    val sql = "DELETE t1 FROM Person t1, Person t2 WHERE t1.Email = t2.Email AND t1.Id > t2.Id"
  }

}
