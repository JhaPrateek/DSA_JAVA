import java.util.*;

class Practice{

    static boolean validAnagram(String s,String t){

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }

    static String outermostParenthesis(String s){
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int open=1;
        for(int i=1;i<s.length();i++){
            if(arr[i]=='('){
                open++;
                if(open>1){
                    sb.append(arr[i]);
                }
            }
            else{
                if(open>1){
                    sb.append(')');
                }
                open--;
                
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        // boolean anagram=validAnagram(s,t);
        // System.out.println(anagram);

        String s = "(()())(())";
        String ans=outermostParenthesis(s);
        System.out.println(ans);

        
    }
}