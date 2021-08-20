object the_bank extends App {

class Account( id:String , n: Int , b : Double){
    val nic: String = id;
    val number : Int = n;
    var balance : Double = b;

    def withdraw(amount : Double) = this.balance -= amount;

    def deposit (amount : Double) = this.balance += amount;

    def transfer(amount : Double , that : Account): Unit = {
        this.balance =  this.balance - amount;
        that.balance = that.balance + amount;
    }


    @Override
    override def toString() : String = " NIC : " + this.nic + "\n Account Number : " + this.number + "\n Balance : " + this.balance;

}

val account1 = new Account("990001981v",10,10000.0);
val account2 = new Account("650002389v",20,-100.0);
val account3 = new Account("900389785v",30,-200.0);
val account4 = new Account("700005603v",100,5000.0);

    var bank_accs : List[Account] = List( account1,account2,account3,account4 );

    

    val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0);


    def accbal():Double={
      
        var sum:Double=0;
        for(acc<-bank_accs){
         sum=sum+acc.balance;
         }
        sum;
    }
    
    
    def interest(): Unit ={
        for(acc<-bank_accs){
          if(acc.balance>0){
            acc.balance=acc.balance+acc.balance*0.05.toFloat;
          }else if(acc.balance<=0){
            acc.balance=acc.balance+acc.balance*0.1.toFloat;
          }
        }
    }
    
    def print_acc():Unit={
    print("===============================\n");
    for(acc<-bank_accs){
    println(acc);
    print("===============================\n");
     }
    }
    
    
    println("--- bank accounts --- \n " );
    print_acc();
    println;
    
    println;
    println("--- overdraft accounts --- \n" + overdraft(bank_accs ));
    println();
    println("total balance = " + accbal())
    println();

    interest();

    println("--- bank accounts after adding interest ---\n ");
    print_acc();
    println;
    println("--- balance after adding interest ---\n" + accbal());
    println;

}
