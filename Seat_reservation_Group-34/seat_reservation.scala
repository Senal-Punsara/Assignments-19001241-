import Array._
import io.StdIn._
//Group 34
object seat_reservation extends App{

  print("\n\n");
  println("********************************************     Welcome to Flyus airline     ***************************************************************");
  print("\n\n");


  
  var seats = Array.ofDim[String](5,10);
  
  
  for (i<-0 to 4){
    for (j<-0 to 9){
      seats(i)(j)={" FREE "};
     }
  }
  
  
  def print_Array(seats:Array[Array[String]])={
  println("----------------------------------------------------------------------------------------------------------------------------------------------");
  println("------------------------------------------------------------ Available seats -----------------------------------------------------------------");
  println;
  print("       ");
  for (i<-0 to 9){
  
    print("seat_no");print(i+1);print("      ");
    
    }
  println();
  for (i<-0 to 4){
   print("row_");print(i+1);print("   ");
    for (j<-0 to 9){
      print(seats(i)(j));
      print("        ");
     }
      println();
    }
  println;
  println("----------------------------------------------------------------------------------------------------------------------------------------------");
  println("----------------------------------------------------------------------------------------------------------------------------------------------");
  println;
  }
  
  
  print_Array(seats);
  
  def isfull(seats:Array[Array[String]]):Boolean = {
    for (i<-0 to 4){
       for (j<-0 to 9){
          if (seats(i)(j)==" FREE "){
           return false;
          }
        }
    }
     //println("Sorry! Seats are not available");
     //println("******************************************************************  Thank you   ***************************************************************");  
     return true;
  }
  
  def isbooked(seats:Array[Array[String]]):Boolean = {
    for (i<-0 to 4){
       for (j<-0 to 9){
          if (seats(i)(j)=="BOOKED"){
           return true;
          }
        }
    }
     //println("Sorry! Seats are not available");
     //println("******************************************************************  Thank you   ***************************************************************");  
     return false;
  }
  
  
  def bookSeats(seats:Array[Array[String]],seat_no:Int,row_no:Int):Unit={
      for (i<-0 to 4){
        for (j<-0 to 9){
           if((seat_no<1|| seat_no>10) && (row_no<1|| row_no>5)){
               println("You entered incorrect row number and seat number. Please check it and try again!\n");
               return;
            }else if(row_no<1|| row_no>5){
               println("You entered a incorrect row number. Please check it and try again!\n");
               return;
            }else if(seat_no<1|| seat_no>10 ){
               println("You entered a incorrect seat number. Please check it and try again!\n");
               return;
            }else if (seats(row_no-1)(seat_no-1) == " FREE " ){
           
                     seats(row_no-1)(seat_no-1)= {"BOOKED"};
                     println("You successfully booked a seat. ");
                     print("Your Seat number is R");print(row_no);print("S");print(seat_no);
                     print("\n\n");
                     return;
            }else{
                    println("The relevent seat is already booked ");
                     return;
            }
          }
        }
     
  }
  
  def free_a_seat(seats:Array[Array[String]],seat_no:Int,row_no:Int):Unit = {
       for (i<-0 to 4){
        for (j<-0 to 9){
           if((seat_no<1|| seat_no>10) && (row_no<1|| row_no>5)){
               println("You entered incorrect row number and seat number. Please check it and try again!\n");
               return;
            }else if(row_no<1|| row_no>5){
               println("You entered a incorrect row number. Please check it and try again!\n");
               return;
            }else if(seat_no<1|| seat_no>10 ){
               println("You entered a incorrect seat number. Please check it and try again!\n");
               return;
            }else if (seats(row_no-1)(seat_no-1) == "BOOKED" ){
           
                     seats(row_no-1)(seat_no-1)= {" FREE "};
                     
                     print("You Successfully free the R");print(row_no);print("s");print(seat_no);print(" seat");
                     print("\n\n");
                     return;
            }else{
                    println("The relevent seat is not booked yet. ");
                     return;
            }
          }
        }
   
  }
  
  var i = 1;
  while(i>0){
      print("Do you want to reserve a seat? (Yes/No) :- ");
      val input = scala.io.StdIn.readLine();
   
    if (input == "Yes" ||  input == "yes" ){
        if(isfull(seats) == false){
          print("   #Enter row number :- ");
          val row_num:Int = scala.io.StdIn.readInt();
          print("   #Enter seat number:- ");
          val seat_num:Int = scala.io.StdIn.readInt();
          println;
          bookSeats(seats,seat_num,row_num);
          print_Array(seats);
       }else{
        i = i-1;
        println("\nSorry! Seats are not available\n");
        
        }
   }else {
      i=i-1;
   }
  }
 
  println;
  println("******************************************************************  Thank you   ***************************************************************");  
  println;
  println("----------------------------------------------------------------------------------------------------------------------------------------------");
  println("----------------------------------------------------------   For staff   only   --------------------------------------------------------------\n");
  
  
  var x = 1;
  while (x>0){
      print("Do you want to remove a seat? (Yes/No) :- ");
      val input = scala.io.StdIn.readLine();
    
      if (input == "Yes" ||  input == "yes" ){
          if(isbooked(seats) == true){
              print("   #Enter row number :- ");
              val row_num1:Int = scala.io.StdIn.readInt();
              print("   #Enter seat number:- ");
              val seat_num1:Int = scala.io.StdIn.readInt();
              println;
              free_a_seat(seats,seat_num1,row_num1);
              print_Array(seats);
          }else {
              x=x-1;
              println("All Seats are  available.");
              
          } 
     }else {
         x = x-1;
         
       
     }
  }
  println;
  println("\n----------------------------------------------------------------------------------------------------------------------------------------------");
  println("----------------------------------------------------------------------------------------------------------------------------------------------");
}
