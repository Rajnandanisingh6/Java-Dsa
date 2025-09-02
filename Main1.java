public class Main1 {
    public static boolean isSubSeq(String str,String seq){
        int i=0;
        int j=0;
        while(i<str.length() && j<seq.length()){
            if(str.charAt(i)==seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j==seq.length();
    }
    public static void main(String[]args){
        // String seq;
        System.out.println(isSubSeq( "abcde",  "ace"));
        System.out.println(isSubSeq( "abcde",  "aec"));

    }
    
}
