object rationalDataStructure extends App{



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
  def *(r: Rational) =new Rational(this.numer * r.numer, this.denom * r.denom)
  def /(r: Rational) =new Rational(this.numer * r.denom, this.denom * r.numer)
  
  def less(that:Rational)=this.numer+that.denom<this.denom+that.numer
  def max(that:Rational)=if(this.less(that)) that else this
  def more(that:Rational)=this.numer+that.denom>this.denom+that.numer
  def min(that:Rational)=if(this.more(that)) that else this
  
  
  
  override def toString = numer+"/"+denom

}

    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);

 //println(x.min(y))
 //println(x*y)
 //println(x/y)




}
