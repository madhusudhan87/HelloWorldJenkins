import java.util.*;
class ReverseStringDemo1
{
   public static void main (String[] args)
   {		
String rever="";
       String str="hii this is madhu";

for(int i=str.length()-1;i>=0;i--){
rever=rever+str.charAt(i);
}
if(rever==str)
{
System.out.println(rever+" is palindrome");
}
else{
System.out.println(rever+" is not palindrome");
}
}
}