package cn.bd03.scala2

object TuplesDemo {
  /**
   * 元组
   * @param args
   */
  def main(args: Array[String]): Unit = {
    //元组内本身装的多久是不同类的数据
    //元组的声明和赋值
    //元组最多只能装22个元素
    val tp:(Int,Int,Int,Int,String,Array[Int]) = (3,1,2,6,"aaa",Array(1,2,3))
    var tp2:(Int,Int) = (1,3)//对偶元组,就是有两个元素的元组  Map中装的本身就是一个对偶元组

    println(tp._1)
    println(tp._2)
    println(tp._3)
    println(tp._4)
    println(tp._5)
    println(tp._6)

    val swap = tp2.swap//swap是交换元组的元素,生成新的元组
    println(swap._1)
  }

}
