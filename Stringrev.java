class Stringrev{
    public static void main(String[] args) {
        StringBuilder n=new StringBuilder("Hema Nikitha");
        
        
        for(int i=0;i<n.length()/2;i++){  // till half of the len
            int f=i;      // fix the start index
            int b=n.length()-1-i;  // fix the end index
            char fc=n.charAt(f);   // return the chars at their indexes
            char bc=n.charAt(b);  //''''

            n.setCharAt(f,bc);    // replace the chars from their positions
            
            n.setCharAt(b,fc);   //1. first index ,last index
                                 // 2. chars of indexes  (.charAt())
                                // 3. replace the positions(.setCharAt())
            
        }
        System.out.println(n);
        
    
    }
}