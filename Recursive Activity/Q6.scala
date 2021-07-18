object Q6 extends App 
{

  def fibo(num:Int):Int=
  { 
    if(num==0)
    {
      return 0
    }
    else if(num==1||num==2)
    {
      return 1
    }
    else
    {
      return fibo(num-2)+fibo(num-1)
    }
     
  }
  
  //print("Enter a number:")
  //var num=scala.io.StdIn.readInt()
  var num = 10;
  for(x <- 0 until num)
  {
    print(fibo(x)+" ");
  }
  
}