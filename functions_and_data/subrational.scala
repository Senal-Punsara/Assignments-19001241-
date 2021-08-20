object subrational extends App{

class Rational(x: Int, y: Int) {

  
  require(y>0, "denominator must be non-zero")

  
  private def gcd(a: Int, b: Int): Int = (if (b == 0) a else gcd(b, a % b))

  val g = gcd(x, y)

  def numer = x / g
  def denom = y / g
  def this(x: Int) = this(x, 1)

  
  def +(r: Rational): Rational = new Rational(this.numer * r.denom +  this.denom*r.numer , this.denom * r.denom)
  def neg = new Rational(-this.numer,this.denom)
  


  def -(r: Rational)=this+r.neg;
  override def toString = numer+"/"+denom
}
    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);
    val sub = x - y - z;
    println(sub);
}
