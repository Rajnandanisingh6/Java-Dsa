public class Main2 {
    public static boolean main(String[] args){           //void
        String word="madam";
        char[] charArray=word.toCharArray();
        int start =0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
    
    
}
