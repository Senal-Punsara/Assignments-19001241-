//Case class assignment 
//19001241

import scala.math._
object caseClass extends App{

case class Point(x:Int,y:Int){
  def +(that:Point)=Point(this.x+that.x,this.y+that.y);
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);

  
  def distance(that:Point):Double={
    val p = BigInt(this.x-that.x).pow(2)+BigInt(this.y-that.y).pow(2);
    math.sqrt(p.toDouble);
  }

  def invert()=Point(this.y,this.x);
  
  override def toString = "("+x+","+y+")" ;

}

  val point1 = Point(0,2);
  val point2 = Point(5,4);

  println("Point 1 coordinates: "+point1);
  println("Point 2 coordinates: "+point2);

  val point3=point1.move(7,2);
  println("Point 1 cordinates after moving: "+point3);

  val point4 = point1+point2;
  println("Cordinates of new point after adding point1 and point2: "+point4);

  val d=point1.distance(point2);
  println("Distance between "+point1+" and "+point2+" is "+ d+" units");

  val point5=point1.invert();
  println("Point 1 cordinates after inverting it: "+point5);
  
}
