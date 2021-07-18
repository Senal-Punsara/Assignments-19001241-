object Q3 extends App 
{
def addnum(num:Int):Int = {
  if (num == 1){
    return 1;
  }else {
    return num+addnum(num-1);
  }
}
  //print("Enter a number:")
  //val num:Int=scala.io.StdIn.readInt()

   val num = 5;
 print(addnum(num))  ;
}