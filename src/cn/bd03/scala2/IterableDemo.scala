package cn.bd03.scala2

object IterableDemo {
  /**
   * java中的集合根类
   * Collection List Set
   * Map  HashMap TreeMap
   * 数组的长度一旦确定不能修改,集合的长度是可变的
   *
   *
   * Scala集合Iterable
   * 序列    Seq
   * 集      Set
   * 映射    Map
   *
   * 集合主要分两种:  可变的集合和不可变的集合
   * 可变的集合  scala.collection.mutable
   *  不可变的集合  scala.collection.immutable ,默认的集合都是不可变的
   *  数组的长度是不可变的
   *
   *  数组
   *  元祖
   */
  //数组的声明和赋值
  def main(args: Array[String]): Unit = {
    var arr:Array[Int] = Array(8,5,10,4)
    //Nothing表示错误  ,不能array.foreach(println),但是把Nothing换成Any
    //null表示空值
    val array:Array[Nothing] = new Array(5)
    //数组的长度,数组的长度是不可变的
    println(arr.length)
    //array.foreach(println)
    for( i <- 0 until array.length) println(array(i))
    //ArrayBuffer 可变的数组
    import scala.collection.mutable.ArrayBuffer

    val ints = new ArrayBuffer[Int]()
    println(ints.length,"----------------")
    ints+=0//使用 +=往数组里添加元素,注意必须是ArrayBuffer
    ints++=arr//使用++=往数组里添加新的数组
    //ints(index)
    //使用.sorted方法来进行排序,排序后生成的是新的数组,默认是升序
    //reverse是逆序,将原来的数组进行逆序排列
    val sorted = ints.sorted.reverse
    sorted.map(println(_))
    println(ints.max)
    println(ints.min)
    println(ints.sum)
    println(ints.sum*1.0/ints.length)
    //ints.clear()//清空
    val i = ints.remove(0)//移除元素
    println(i)
    println(ints.mkString)
    println(ints.mkString(","))

  }
}
