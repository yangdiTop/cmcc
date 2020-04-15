package cn.bd03.scala

object FunDemo {
  /**
   * scala函数和方法是有区别
   * 函数,是Scala的头等公民
   * 方法:是一段代码块,功能的封装,但是方法本身不是一个最终的表达式
   * 函数:是功能的封装,也是一个最终的表达式,函数本身也是一个对象
   * @param args
   */
  def main(args: Array[String]): Unit = {
    //method("20")
    var fun1:(Int,Int)=>Int = {
      (a,b)=>(a+b)
    }
    //简化写法
    var fun2 = (a:Int,b:Int)=>a+b

    println(fun1(1,3))

    println(method(1,2,fun2))

  }

  def method(a:Int,b:Int,fun1:(Int,Int)=>Int):Int=fun1(a,b)



}
