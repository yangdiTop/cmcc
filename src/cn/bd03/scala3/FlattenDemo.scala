package cn.bd03.scala3

/**
  * Date: 2020/2/18 12:28
  * Description:
  * Modify:
  *
  * @author YangD
  */
object FlattenDemo {
  def main(args: Array[String]): Unit = {
    val lst:List[String] = List("aaa String","test split ","scala hadoop spark yarn")
    val lst2:List[Array[String]] = lst.map(t=>t.split(" "))
    //lst2.map(t=>t.map(println))
    //flatten压平内部集合,生成一个非嵌套的集合,炸裂
    val flatten = lst2.flatten
    //flatten.map(println)

    val arr:Array[String] = Array("aaa String","test split ","scala hadoop spark yarn")
    //先执行Map操作,再压平
    val arr2 = arr.flatMap(t=>t.split(" "))
    arr2.map(println)
    println("----")
    //filter删选出所有满足条件的元素()
    //(String)=>Boolean=t=>布尔表达式
    val arr3 = arr2.filter(t=>t.startsWith("s"))
    arr3.map(println)
    //统计满足条件的个数
    val i:Int = arr2.count(t=>t.startsWith("s"))
    println(i)
    //查找满足条件的第一个元素,返回值是Option
    val str:Option[String]= arr2.find(t=>t.startsWith("s"))
    println(str)
  }
}
