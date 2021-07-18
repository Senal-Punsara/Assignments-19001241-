object Q1 extends App 
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

  

  //print("Enter a number:")
  //val num:Int=scala.io.StdIn.readInt()

   val num = 10;
   print(isprime(num));
  }