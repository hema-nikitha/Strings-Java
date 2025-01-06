import java.util.*;
class Strings{
    public static void main(String[] args){
        String a="hello";
        String b="heiii";
        //concatenate
        String c=a+b;
        System.out.println(c + " @ ");

        // Return length

        System.out.println(c.length());
    

        // Return each charater 

        for(int i=0;i<=c.length()-1;i++){
            System.out.println(c.charAt(i) + "  ");
        }


        //Compare..

        if(a.compareTo(b)==0){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }


        // Compare String objects..


        if(new String(a)==new String(b)){
            System.out.println("Equal");

        }
        else{
            System.out.println("Not equal");

        }

        


        // covertion

        

        String k="9";
        int y=Integer.parseInt(k);
        System.out.println(y);



        //Substring..


       String w=a.substring(3,a.length());
       System.out.println(w);

        // compare: 
        // if(String(a).isequals(b))

        

        


        


        

    }
    
}
