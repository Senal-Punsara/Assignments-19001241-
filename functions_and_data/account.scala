object account extends App{

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
val myaccount = new Account("990001981v",100,100.0)
println(myaccount);

}
