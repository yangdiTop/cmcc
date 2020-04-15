package cn.bd03.scala

object IfDemo {
  /**
   * 表达式 a  a + 2  if
   * scala中,所有的表达式都是有返回值的
   * 分支结构
   * @param args
   */
  def main(args: Array[String]):Unit = {
    var a :Int= 20

    //println的返回值是Unit
    var s2:Unit = println(11111)
    println(s2)

    //所有的表达式都是有返回值的
    //默认if else表达式的返回值就是代码的最后一行
    //println语句的返回值是Unit  ()
    //if else可以不写大括号,如果没有大括号只控制一行
    //如果分支返回的结果是不同的类型,那么只能使用他们共有的父类来接收
    var s:Any = if(a>10){
      5
    }else{
      "hehehe"
    }
    println(s)


  }
}
