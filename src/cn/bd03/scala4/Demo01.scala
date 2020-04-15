package cn.bd03.scala4

import scala.collection.mutable

object Demo01 {
  def main(args: Array[String]): Unit = {

    import scala.collection.mutable._
    val lst = List(22,4,5,6)
    //一一映射
    val lst2 = lst.map(t=>t*10)
    //zip 两两拉链操作,数量是两个中少的数量
    //zipAll(lst,v1,v2),所有的都进行拉链操作,没有的给默认值
    val lst3 = lst.zipWithIndex

    //压平,炸裂内部集合,生成新的集合
    val arr = Array(ListBuffer(3,1,23,2),ListBuffer(3,2,1))
    val flatten = arr.flatten
    val ints = ListBuffer(3,1,23,2)
    //先map在flatten,优先选择flatMap
    arr.flatMap(t=>t+=10).map(println)
    //filter count find
    //filter判断是否有指定条件的元素,留下符合条件的生成新的集合
    //find找到符号条件的第一个元素
    //count统计符合条件的数量
    val ints1:Array[Int] = arr.flatten.filter(_>10)
    val ints2:Option[Int] = arr.flatten.find(_>10)
    val ints3:Int = arr.flatten.count(_>10)
    ints1.map(print(_," "))


    val lst5 = List(4,8,12,2)

    val intToInt:scala.collection.Map[Int,scala.List[Int]] = lst5.groupBy(t=>t)
    intToInt.map(println)

    //排序,默认是升序
    //val lst6 = lst5.sorted//默认是 升序
    val lst6 = lst5.sortBy(t=>0-t)
    lst6.map(println)
    lst5.sortWith((a,b)=>a>b)
  }

}
