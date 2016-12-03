package ProductNumber

import org.scalatest._

class General extends FlatSpec with Matchers {

  "The Products Of Number From 4 to 7" should "always be 840" in {
    Product.generalFun(Product.mul)(4, 7) should be(840)
  }
  "The Products Of Number From 4 to 8" should "always be 6720" in {
    Product.generalFun(Product.mul)(4, 8) should be(6720)
  }

  "The Product Of Number From 4 to 80" should "always be Huge Value" in {
    Product.generalFun(Product.mul)(4, 80).toString should be(new String("11928242841043967049135255620531088694264109557060958762851574176371173209246691473778157477880135680000000000000000000"))
  }
  
  "The Sum Of Number From 4 to 80" should "always be Huge Value" in {
    Product.generalFun(Product.sum)(4, 80) should be(3234)
  }
  
}




