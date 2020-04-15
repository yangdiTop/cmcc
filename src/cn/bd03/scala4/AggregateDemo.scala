package cn.bd03.scala4

object AggregateDemo {
  def main(args: Array[String]): Unit = {
    //聚合
    //如果程序是单机的,那么等价于foldLeft
    //如果是全局的,局部函数和全局函数
    val lst:List[List[Int]] = List(List(1,2,3),List(4,5,6),List(7,8,9))
    //初始值是0,a+b是局部聚合的逻辑,_+_全局聚合的逻辑
    //a是累加值,b是元素值
    //初始值,只参与一次运算
    val i = lst.aggregate(5)((a,b)=>a+b.sum,_*_)
    println(i)
  }
}
