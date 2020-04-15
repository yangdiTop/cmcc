package cn.bd03.scala2

object ListDemo {
  def main(args: Array[String]): Unit = {
    //list  都分为头元素,尾列表   .head    .tail

    val ints = List(1)
    val ints2 = List(5,22,31,42,51)
    val ints3 = List(1,7,3,123,3)
    val ints4=List(4,5,8,6,8,9)
    println(ints2.head)
    println(ints2.tail.head)

    //导入可变的List
    import scala.collection.mutable.ListBuffer
    val lst:ListBuffer[Int] = ListBuffer(32,11,31)
    val lst2:ListBuffer[Int] = ListBuffer(3,1,5,7,9,11)
    lst+=22//往ListBuffer中添加元素
    lst-=55//从ListBuffer中移除元素,如果该list中没有该元素,则不会报错,不会移除
    //lst.map(println)
    println(lst(2))//list的取值
    println(lst.size,"--------------")//list的长度
    //list的拼接,返回的是一个不可变的List.生成的是一个嵌套的list
    val lst3 :List[ListBuffer[Int]]= lst::lst2::Nil
    //::是以右链接的方式来进行拼接的 (lst::(lst2::(Nil)))
    println(lst3.size)//2
    println(lst3.head)
    println(lst3.tail)
    lst3.foreach(println)
    //~3,1,5.7,9,11+  start 开始的符号,sep,分割符号,end 结束的符号
    println(ints2.mkString("啊", "哦", "呵"))








  }

}
