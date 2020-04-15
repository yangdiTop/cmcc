package cn.bd03.scala4

import scala.collection.mutable.ListBuffer

object Demo02 {
  def main(args: Array[String]): Unit = {
    //MapValues,对Map的所有的v进行操作,生成新的Map
    val sts = Map(("xiaoming",80),("xiaoli",77),("xiaozhang",90))

    val ints:Iterable[Int] = sts.map(_._2)

    val sts2:Map[String,Int] = sts.mapValues(_+10)
    sts2.map(println)

    val ints1 = List(3,1,2,2)

    val f:Int = ints1.reduce(_+_)

    val fun :(Int,Int)=>Int=(a,b)=>{
      a+b
    }
    //归并,元素的聚合,

    val f2:Int = ints1.reduce(_+_)
    val i = ints1.reduceLeft(_ - _)//左聚合a-b-c-d-e,reduce默认就是reduceLeft
    //val i = ints1.reduceRight(_ - _)//右聚合 (a-(b-(c-(d-(e)))))
    println(i)//
   /* import scala.collection.mutable
    val ints2 = ListBuffer(44,2,1)
    val ints3 = ListBuffer(44,2,1)
    ints2+:ints3;*/
    //reduce只能聚合相同的类型,reduceLeft可以聚合不同的数据类型
    val lst:List[Int]= List(4,2)
    //找一个例子,让可以使用reduceLeft聚合,但是不能使用reduce聚合,找一个不同数据类型的聚合
    println(lst.reduce((a, b) => a + b))


  }

}
