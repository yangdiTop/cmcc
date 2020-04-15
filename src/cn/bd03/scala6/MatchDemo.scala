package cn.bd03.scala6

/**
  * Date: 2020/2/23 16:59
  * Description:
  * Modify:
  *
  * @author YangD
  */
object MatchDemo extends App {
  //list匹配
  val lst = List(4,2,1,2)
  val aa:Unit = lst match {
    case 1::Nil=>println("匹配只有元素1的lst")
    case List(2)=>println("匹配只有元素2的lst")
    case List(a,b,c,d)=>println("匹配4个元素的lst",a,b,c,d)
    case a::Nil=>println("匹配了一个只有一个元素的lst",a)
    case a::b::c::Nil=>println("匹配了一个三个元素的lst",a,b,c)
    case _ => println("没匹配上")
  }
  val bb:Int = lst match {
    case 1::Nil=>1
    case List(2)=>2
    case List(a,b,c,d)=>3
    case a::Nil=>4
    case a::b::c::Nil=>5
    case _ => 6
  }
  println(bb)

}
