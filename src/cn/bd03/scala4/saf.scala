package cn.bd03.scala4

/**
  * Date: 2020/2/20 11:44
  * Description:
  * Modify:
  *
  * @author YangD
  */
object saf {
  def main(args: Array[String]): Unit = {
    val fruits = List("banana fruit", "apple fruit", "peach", "grapes", "pear")

    val filterFruit = for {
      fruit <- fruits
      if fruit.contains("fruit") && !fruit.startsWith("banana")
    } yield fruit


  }
}
