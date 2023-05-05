public class maxVowels {
    public static int maxVowels(String s, int k) {
        int max = 0;
        int count;
        for(int i=0; i<=s.length() - k; i++){
            String sub = s.substring(i,i+k);
            count = countVowels(sub);
            System.out.println(sub + "-" + count);
            if(count > max)
                max = count;
        }
        return max;
    }
    public static boolean isVowel(char x){
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            return true;
        else
            return false;
    }
    public static int countVowels(String substring){
        int count = 0;
        for(int i=0;i<substring.length(); i++){
            if(isVowel(substring.charAt(i)))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou",7));
    }
}
