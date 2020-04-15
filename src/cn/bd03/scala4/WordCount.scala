package cn.bd03.scala4

object WordCount {
  def main(args: Array[String]): Unit = {
    //wordcount
    val lst1 = List("hello args java","linux scala java","spark hadoop java")
    val lst2 = List("java args java","spark scala java","spark hdfs java")
    val lst: List[String] = lst1++lst2
    //切割字符串
      val stringses: List[Array[String]] = lst.map(t=>t.split(" "))

    //炸裂flatten
   val flatten: List[String] = stringses.flatten
    //分组
val stringToStrings: Map[String, List[String]] = flatten.groupBy(t=>t)
    //对v进行处理
val stringToInt: Map[String, Int] = stringToStrings.mapValues(t=>t.size)
stringToInt.foreach(println)

    //一行搞定
    lst.flatMap(_.split(" ")).groupBy(t=>t).mapValues(_.size).foreach(println)
  }

}
