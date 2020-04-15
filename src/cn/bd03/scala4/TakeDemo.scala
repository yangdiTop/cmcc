package cn.bd03.scala4

object TakeDemo {
  def main(args: Array[String]): Unit = {
    //TopN
    val ints = List(33,11,22,14,2,55)
    //take取前几个元素
    //val ints2 = ints.sortBy(-_).take(3)
    val ints2 = ints.sortBy(t=>(-t)).take(3)
    val ints1 = ints.sorted.reverse.take(3)
    ints2.foreach(println)
    //slice截取指定范围的
    ints.slice(2,5).foreach(println)
  }

}
