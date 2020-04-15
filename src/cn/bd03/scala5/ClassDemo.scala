package cn.bd03.scala5

/**
  * Date: 2020/2/21 22:01
  * Description:
  * Modify:
  *
  * @author YangD
  */
object ClassDemo {
  def main(args: Array[String]): Unit = {
     val human = new Human()
    println(human.a)
  }
}
trait FlyAble{
  def fly=print("feifeifie")
  def run:String
}
abstract  class Animal{
  def fight:Int
  var name :String

}
class Human extends  Animal with  FlyAble{
  override def fight: Int = 10

  override var name: String = "asda"

  override def run: String = "跳啊跳"
  val t1,t2,(a,b,c)={
    println("haha")
    (1,2,3)
  }
}
