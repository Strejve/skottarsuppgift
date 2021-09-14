fun main(args: Array<String>) {
   var a = ""
   while (a != "e") {
      println("för att avsluta programmet mata in e")
      println("skriv in årtalet:")
      a = readLine() ?: ""
      if (a == "e")
         break
      else {
         var c = a.toInt()

         var b = arhundra(c)
         if (b && c>=2021) {
            println("Det är ett skottår")
         }
         else if(b && c<2021){
            println("Det var ett skottår")
         }
            else if (!b)
            println("Det är inte ett skottår")

      }

   }
}
fun arhundra(a:Int):Boolean
{
   if (a%100==0 && a%400 == 0) {
      return true
   }
   else if (a%100 !=0 && a % 4==0) {
      return true
   }
      return false

}