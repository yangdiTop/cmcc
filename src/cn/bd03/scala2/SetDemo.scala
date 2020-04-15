package cn.bd03.scala2

object SetDemo {
  def main(args: Array[String]): Unit = {
    //set可以自动去重
    val ints = collection.Set(9,4,15,6,4,4,4)
    println(ints.size)
    ints.map(println)
    import scala.collection.mutable.Set
    //创建的时候可以加上包名
    val ints2 = collection.mutable.Set(9,4,15,6,4,4,4)

    ints2+=66
    println(ints2.size)



  }

}
