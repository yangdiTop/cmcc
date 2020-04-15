package cn.bd03.scala

/**
  * Date: 2020/2/16 14:26
  * Description:
  * Modify:
  *
  * @author YangD
  */
object ForDemo2 {
  def main(args: Array[String]): Unit = {
    var arr =Array("a","b","c","d")
    //for循环的返回值类型是Unit
    var b=for(a<-arr){
      println(a)
      5
    }
    println(b)

    for (i<-0 until arr.length){
      println(arr(i)+"")
    }
  }
}
