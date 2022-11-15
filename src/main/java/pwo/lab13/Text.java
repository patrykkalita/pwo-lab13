package pwo.lab13;

public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }
    
    static boolean countNums(String str) {
        int count=0;
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i)))
                count++;
        }
        return count > 0;
    }
    
    static boolean noNums(String str) {
        char[] chars = str.toCharArray();
        for(char c : chars){
           if(Character.isDigit(c)){
              return false;
           }
        }
        return true;
    }
    
    static boolean noChars(String str) {
        char[] chars = str.toCharArray();
        for(char c : chars){
           if(Character.isDigit(c)){
              continue;
           } else {
               return false;
           }
        }
        return true;
    }
    
    
}
