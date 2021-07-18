object Q5 extends App {
def even_or_odd(num:Int):Boolean = {
 
    if(num==0){
         return true;
     }
    else if(num==1){
         return false;
     }
    else if(num<0){
         return even_or_odd(-num);
     }
     else{
         return even_or_odd(num-2);
   }
}
  def evenSum(num:Int):Int ={
    if (num == 1){
      return 0;
    }else if(evenSum(num)== true){
      return num+evenSum(num-1)
    }else {
      return evenSum(num-1)
    }
}
  //print("Enter a number:")
  //val num:Int=scala.io.StdIn.readInt()

  
  var num = 12;
  print(evenSum(num));

}
