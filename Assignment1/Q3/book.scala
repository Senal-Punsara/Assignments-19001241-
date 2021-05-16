object book extends App{
def fun0(x:Int)=x;
def fun1(x:Int):Double=(24.95*60.0/100.0)+3.0*x;

def fun2(x:Int):Double=(24.95*60.0/100.0)+3.0*x+(x-50.0)*0.75;

  if (fun0(60)<=50){
    println(fun1(60));
  }else{
    println(fun2(60));
  }

}
