package ProductNumber

object Product {
  def generalFun(f: (BigInt, BigInt) => BigInt)(x: BigInt, y: BigInt): BigInt =
    {

      def localLoop(x: BigInt, res: BigInt = 0): BigInt = {
        if (x > y) { res }
        else { localLoop(x + 1, f(x, res)) }
      }
      localLoop(x)
    }

  def mul(x: BigInt, y: BigInt): BigInt = {
    (x, y) match {
      case (x, y) if (x == 0) => y
      case (x, y) if (y == 0) => x
      case (x, y)             => x * y
    }

  }
  def sum(x: BigInt, y: BigInt): BigInt = { x + y }

  def main(args: Array[String]): Unit = {

    val kSum = generalFun(sum)(4, 80)
    val kProd = generalFun(mul)(4, 80)    
    //    val kProd = generalFun({(x1,y1)=>x1*y1})(10,20)
    println(kSum)
    println(kProd)

  }
}