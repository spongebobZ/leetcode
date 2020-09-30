package leetcode

object one_nine_three {
  """
    |给定一个包含电话号码列表（一行一个电话号码）的文本文件 file.txt，写一个 bash 脚本输出所有有效的电话号码。
    |
    |你可以假设一个有效的电话号码必须满足以下两种格式： (xxx) xxx-xxxx 或 xxx-xxx-xxxx。（x 表示一个数字）
    |
    |你也可以假设每行前后没有多余的空格字符。
    |
    |示例:
    |
    |假设 file.txt 内容如下：
    |
    |987-123-4567
    |123 456 7890
    |(123) 456-7890
    |你的脚本应当输出下列有效的电话号码：
    |
    |987-123-4567
    |(123) 456-7890
    |""".stripMargin

  def main(args: Array[String]): Unit = {
    val command = """cat file.txt | grep -E [([0-9]{3}-)(([0-9]{3}\s)))][0-9]{3}-[0-9]{4}"""
  }

}
