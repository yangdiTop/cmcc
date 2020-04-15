package cn.bd03.scala2

object WordCountDemo {
  def main(args: Array[String]): Unit = {
    val lst = List("java scala hadoop scala python hadoop","java scala scala python hadoop","java scala python")
    val lst2 = List("scala python hadoop","java  hadoop","scala python")
    val lst3 = lst::lst2::Nil
    //scala版本的wordcount

    val res = lst3.flatten.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.map(_._2).reduce(_+_))
    res.map(println)

    val stringToInt = Map("a"->11,"ccc"->22)
    //一一映射
    //(key,vaule)  key
    //val strings:Iterable[Int] = stringToInt.map(f=>f._2*1
    val strings:Iterable[Int] = stringToInt.map(_._2*10)
    strings.map(println)

    val tp = List(4,1,23,2)
    val tuples = tp.map(t=>(t,1))
    tuples.map(println)
  }

}
