package cn.bd03.scala5

import scala.util.Random

/**
  * Date: 2020/2/21 22:15
  * Description:
  * Modify:
  *
  * @author YangD
  */
object CaseDemo1 extends App {
  //模式匹配

  val arr = Array("aa","bb","cc")
  val str=arr(Random.nextInt(arr.length))
  str match {
    case "aa"=>println("匹配到第一个元素")
    case "bb"=>println("匹配到第二个元素")
    case "cc"=>println("匹配到第三个元素")
  }
 /* //val v = if(x >= 5) 1 else if(x < 2) 2.0 else "hello"
  val arr2 = Array("hello", 1, 2.0)
  val v = arr2(Random.nextInt(3))
  println(v)
  v match {
    case x: Int => println("afdasfad " + x)
    case y: Double if(y >= 0) => println("fasfagds "+ y)
    case z: String => println("afddgdsga " + z)
    case _ => throw new Exception("not match exception")
  }*/

  val arr3=Array(1, 3, 5)
  arr3 match {
    case Array(1,x,y)=>println(x + " " + y)
    case Array(0) => println("only 0")
    case Array(0, _*) => println("0 ...")
    case _ => println("something else")
  }
  val lst=List(3,-1)
  lst match {
    case 0 :: Nil => println("only 0")
    case x :: y :: Nil => println(s"x: $x y: $y")
    case 0 :: tail => println("0 ...")
    case _ => println("something else")
  }
  val tup = (2, 3, 5)
  tup match {
    case (2, x, y) => println(s"1, $x , $y")
    case (_, z, 5) => println(z)
    case  _ => println("else")
  }

}

