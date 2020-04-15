package cn.bd03.scala2

object MapDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Map
    val map = Map[String,Int](("a",10),("b",20),("c",30),("d",40))
    val map2:Map[String,Int] = Map("m" -> 66,"e" -> 66,"b" -> 66)//key -> value
    map+=(("d",80),("m",66))//如果map中原来有该key,则改值,没有则添加
    map-=("b","c","q")//根据key减去对应的元素,有key值就移除,没有该key值不做操作

    println(map.size)

    println(map.get("d"))//map的取值  Some(Value)
    println(map.get("e"))//map的取值  没有值就是None

    val maybeInt:Option[Int] = map.get("eqeeq")

    val i :Int= map.getOrElse("mm",123)//有值就取值,没值给默认值,返回的是Value的类型

    val keys:Iterable[String] = map.keys
    val values:Iterable[Int] = map.values
    //map.map(println)
    keys.foreach(println)
    values.foreach(println)
    //m -> 66
    println(map.mkString)
    map2.map(t=>println(t))
  }

}
