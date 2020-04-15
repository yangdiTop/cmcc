package cn.bd03.scala

object VarDemo {
  /**
   * 变量的声明
   */
  def main(args:Array[String])={
    //int i = 10;
    //var x :变量类型 = 值
    val i:String = "10" //声明了一个变量  ,不需要分好
    var i2:Int = 20
    var i3:AnyVal = 20
    var i4:Any = 20
    var i5 = 20
    //scala中的变量的类型永远都在变量名之后,可以写,也可以不写,由系统自动推导

    val str = "abc"
    var str2 = "dfe"

    i2 = 30//var修饰的变量,值是可变的,引用也是可变的
    //i=40//val修饰的是不可变的,相当于java中的final
  }

}
