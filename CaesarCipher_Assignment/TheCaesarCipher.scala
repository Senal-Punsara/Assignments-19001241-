//19001241
object TheCaesarCipher extends App {
//print("Enter a text: ")
//val text:String=scala.io.StdIn.readLine();
val text = "SenalPunsara";

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
val Encryption=(c:Char,key:Int,alph:String)=>alph((alph.indexOf(c)+key)%alph.size)
val Decryption=(c:Char,key:Int,alph:String)=>alph((alph.indexOf(c)-key)%alph.size);

val cipher=(algo:(Char,Int,String)=>Char,text:String,key:Int,alph:String)=>text.map(algo(_,key,alph))
val ct=cipher(Encryption,text,5,alphabet);
val pt=cipher(Decryption,ct,5,alphabet);

     println("your Text is    : "+text);
     println("After Encryption: "+ct);
     println("After Decryption: "+pt);

}

