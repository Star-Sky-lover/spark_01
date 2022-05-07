package leetCode

object Solutions {
  def singleNumber(nums: Array[Int]): Int = {
    if (nums.length % 2 == 0) return 0

    nums.sorted(Ordering.Int)
    for (elem <- nums) {
      println(elem)
    }
    0
  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  import java.math.BigInteger

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))


  def max(x: Int, y: Int): Int = if (x > y) x else y

  def greet(): Unit = println("Hello,world")

  def oushu(a: Int): Boolean = if (a % 2 == 0) true; else false

  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }
}
