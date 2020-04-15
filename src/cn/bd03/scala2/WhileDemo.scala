package cn.bd03.scala2

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var arr = Array("a","b","c","d")
    var i:Int = 0;
   /* while(i<arr.length){
      println(arr(i))
      i=i+1
    }*/
    do{
      println(arr(i))
      i=i+1
    }while(i<arr.length)
  }

}
