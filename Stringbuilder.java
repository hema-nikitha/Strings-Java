// Strings are immutable ., once we create them memory allocated to it ., we cannot again remanipulate ( we have to again create more strings)for that it occupies more space
// Strings are non primitive types
//String builders are mutable
import java .util.*;
class Stringbuilder{
    public static void main(String[] args){
        StringBuilder k=new StringBuilder("sammy");

        // append  >> added at the end
        System.out.println(k.append("k"));
        System.out.println(k.append('l'));

        //insert  >> won't replace any char / str

        System.out.println(k.insert(0,"ui"));

        // delete
        System.out.println(k.delete(2,3));

        // Return chars

        System.out.println(k.charAt(2));

        // set chars >> replace the char/str  (cannot put in sout)., first modify then print
    

        k.setCharAt(0,'p');
        System.out.println(k);

        // return substring..

        System.out.println(k.substring(2));


        // return length
        System.out.println(k.length());







    }
}

