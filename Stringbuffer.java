class Stringbuffer{
    public static void main(String[] args) {
        StringBuffer l=new StringBuffer();
         System.out.println(l.capacity()); //>> cannot use return.. as void methods cannot return the values

        StringBuffer h=new StringBuffer("Hello");
        String w=h.toString();
        System.out.println(w);

        //append..
        System.out.println(h.append('k'));

        //delete

        System.out.println(h.deleteCharAt(0));

        // set min capacity
        h.ensureCapacity(300);

        //set length

        h.setLength(45);
    }
}