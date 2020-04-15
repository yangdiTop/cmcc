package cn.bd03.scala

object MethodDemo {
  /**
   * scala不推荐使用方法,函数是Scala的头等公民
   * @param args
   */
    def main(args:Array[String]):Unit={

      var i :Int = 10
      var a = method("a",i)//方法的调用
      println(a)
      //如果方法没有参数列表,调用的时候不能写小括号
      var b = method2
      println(b)

      var m = method4(5)
      println(m)
    }
    //方法的声明 def 方法名(参数列表(名字:类型),多个参数使用逗号隔开):返回值类型={//方法体}
    //默认参数列表中的值是val,不能改变
  //方法可以不写返回值类型,由系统推倒出
    def method( a:String, b:Int)={
      //方法体
      var c=b+5
    }
    //如果方法没有返回值  def 方法名={方法体},
  //scala也有return关键字,如果返回值使用return修饰,则必须指定返回值类型
  //Scala不推荐使用return
  //如果使用return关键字,则不返回最后一行,返回return的结果
    def method2:Any={
      return 222
      println("fds")
    }
    def method3:Int = 222

    //如果方法里面存在有递归调用,则必须指定返回值类型
    def method4(a:Int):Int ={
      if(a>0){
        method4(a-1)
      }else{
        0
      }
    }

}
