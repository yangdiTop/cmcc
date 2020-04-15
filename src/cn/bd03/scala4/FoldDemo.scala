package cn.bd03.scala4

object FoldDemo {
  def main(args: Array[String]): Unit = {
    //fold 带初始值的元素归并
    //相比reduce,多了一个初始值
    //fold调用的是foldLeft
    val lst:List[Int] = List(4,2,1)
    //fold只能归并相同的数据类型,foldLeft可以归并不同的数据类型
    //val i = lst.fold(10.11)(_+_) 报错,数据类型不匹配
    val i = lst.foldLeft(10.11)(_+_)
    val j = lst.foldRight(-11)(_-_)//(4-(2-(1-(-11))))    4+10
    println(j )
  }
}
