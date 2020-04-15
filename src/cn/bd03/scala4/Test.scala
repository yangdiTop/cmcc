package cn.bd03.scala4

object Test {
  def main(args: Array[String]): Unit = {
    val d1 = Array(("bj", 28.1), ("sh", 28.7), ("gz", 32.0), ("sz", 33.1))
    val d2 = Array(("bj", 27.3), ("sh", 30.1), ("gz", 33.3))
    val d3 = Array(("bj", 28.2), ("sh", 29.1), ("gz", 32.0), ("sz", 30.5))

    val arr: Array[(String, Double)] = d1++d2++d3
    val stringToTuples: Map[String, Array[(String, Double)]] = arr.groupBy(t=>t._1)

    val values = stringToTuples.mapValues(t=>{
      val doubles: Array[Double] = t.map(m=>m._2)
      val d = (doubles.sum/doubles.size).formatted("%.2f")
      d
    })

      values.foreach(println)
  }

}
