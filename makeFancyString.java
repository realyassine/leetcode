import java.util.*;

class makeFancyString {
    public static String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (char i : s.toCharArray()){
            if(res.length() >= 2 && res.charAt(res.length()-1) == i && res.charAt(res.length()-2)== i){
                continue; 
            }
            res.append(i);
        }
        return res.toString();
    }

}