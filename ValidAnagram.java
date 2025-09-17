// leetcode 242
public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length()==1 && t.length()==1){
            return s.charAt(0) == t.charAt(0);
        }
        if (s.length()!=t.length()){
            return false;
        }
        int occurance[] = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            occurance[c-'a']++;
        }
        for(char c: t.toCharArray()){
            if (occurance[c-'a'] == 0){
                return false;
            }
            occurance[c-'a']--;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ant";
        String t = "tan";
        isAnagram(s, t);
        System.out.println(isAnagram(s, t));
    }
}
