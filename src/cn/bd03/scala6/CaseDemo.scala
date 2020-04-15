package cn.bd03.scala6

/**
  * Date: 2020/2/23 17:10
  * Description:
  * Modify:
  *
  * @author YangD
  */
object CaseDemo {

  def main(args: Array[String]): Unit = {
    //没有new 输出值
    val xiaom= Student("xiaoming",12)
    val xiaoz= Student("xiaozhang",42)

    println(xiaom)
    println(xiaoz)
    //样例类支持模式匹配
    Array()
  }

  // case 样例类
  case  class Student( name:String, age:Int)
}
