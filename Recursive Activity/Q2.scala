object Q2 extends App 
{

  def isprime(n:Int, i:Int = 2):Boolean =
  { 
    if (n <= 2)
        if (n == 2) 
           return true;
        else 
           return false;
    if (n % i == 0)
        return false;
    if (i * i > n)
        return true;
 
    
    return isprime(n, i + 1);
  }
  
  def printprime(num:Int):Unit={
   for(x <- 0 until num){
     if (num<=1){
       print("Error");
       return ;
     }
     if (isprime(x)==true){
        print(x+" ")
     }
   }
    
  }
  //print("Enter a number:")
  //val num:Int=scala.io.StdIn.readInt()

    var num = 1;
 
    printprime(num);

   
} 