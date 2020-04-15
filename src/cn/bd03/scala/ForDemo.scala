package cn.bd03.scala

object ForDemo {
  def main(args: Array[String]): Unit = {

    var arr  = Array("a","b","c","d")
    //for循环的返回值类型是Unit
    var b = for(a<-arr) {
      println(a)
      5
    }
    println(b)

    //to until
    //to 是包含左边和右边
    //数组的取值,数组名(index)
   /* for(i <- 0 to 5){
      print(arr(i))//ArrayIndexOutOfBoundsException
    }*/

    //until包含左边不包含右边
    for(i <- 0 until arr.length){
      print(arr(i)+" ")
    }
    println()

    //带守卫的for循环
   /* for(i<- 0 to 10){
      if(i%2==0){
        println(i)
      }
    }*/
    for(i<-0 to 10 if(i%2==0)){
      println(i)
    }
    println("--------------")
    //嵌套循环
    /*for(i <- 0 to 10){
      for(j <-0 to 10){
        println(i,j)
      }
    }*/
    for(i<- 0 to 10;j<- 0 to 10)
      println(i,j)


    //yield推导式
    var arr2 = Array(1,2,3,4)
    //将集合或者数组里面的所有元素执行yield后面的操作,并返回一个新的集合或数组
    var m:Array[Int] = for (i<- arr2) yield i*10
    m.foreach(println)

 /*   println("--------------")
    arr.foreach(println)
    println("--------------")
    arr.map(println)
    arr.map(t=>println(t+"text"))
    arr.map(println(_))
    */

  }

}
