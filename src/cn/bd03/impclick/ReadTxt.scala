package cn.bd03.impclick



/**
  * Date: 2020/2/20 17:33
  * Description:
  * Modify:
  *
  * @author YangD
  */
object ReadTxt {
  def main(args: Array[String]): Unit = {
    //导入Scala的IO包
    import scala.io.Source
    //以指定的UTF-8字符集读取文件，第一个参数可以是字符串或者是java.io.File
    val source: BufferedSource = Source.fromFile("D:\\study\\Data\\BigData\\home\\impclick.txt", "UTF-8")
     //source.foreach(print)  获取到文本内容
    //将所有行放到数组中
    val line: List[String] = source.getLines().toList
    val stringToStringses: Map[String, List[Array[String]]] = line.flatMap(t=>t.split("\n")).map(_.split(",")).groupBy(t=>t(0))
    stringToStringses.map(tp=>{
      import scala.collection.mutable._
      //可变
      val shows: Map[String, Int] = Map()
      //名词统计次数(名词，出现次数)
      val clicks:Map[String,Int] = Map()//点击量次数
      tp._2.map(arr=>{
        if(arr(2).equals("1"))
          arr(1).split("\\|").map(t=>{
            shows.+=(t->(shows.getOrElse(t,0)+1))//点击量添加到Map中
          })
          //判断关键词点击量，统计单词次数
          if(arr(3).equals("0"))
            arr(1).split("\\|").map(t=>{
              clicks+=(t->(clicks.getOrElse(t,0)+1))
            })
      })
      shows.map(s=>{
        println(tp._1,s._1,s._2,clicks.getOrElse(s._1,0))
      })
    })



  }

}
