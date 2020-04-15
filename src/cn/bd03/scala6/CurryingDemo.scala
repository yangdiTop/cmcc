package cn.bd03.scala6

/**
  * Date: 2020/2/23 21:45
  * Description:
  * Modify:
  *
  * @author YangD
  */
object CurryingDemo {
//科里化函数

  def main(args: Array[String]): Unit = {

  }
  def fun1(a:Int,b:Int):Int=a+b
  //科里化函数
  def fun(a:Int)(b:Int):Int=a+b
}

