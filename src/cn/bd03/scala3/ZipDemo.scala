package cn.bd03.scala3

/**
  * Date: 2020/2/18 12:10
  * Description:
  * Modify:
  *
  * @author YangD
  */
object ZipDemo {

  def main(args: Array[String]): Unit = {
     val names=Array("xiaoming","xiaoming")
      val ages=Array(24,25,32)
    val tuples:Array[(Int,String)]=ages.zip(names)
    val map:Map[Int,String]=tuples.toMap
    map.map(println)

  }

}
