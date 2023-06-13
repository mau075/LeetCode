/**
     744. Find Smallest Letter Greater Than Target
     @author Brisa Castillo
     @version 9 June 2023 13:18 BOT
 */
public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        //Arrays.sort(letters);
        //System.out.println(letters);
        char current = 'a';
        for(int i=0; i<letters.length; i++){
            if(letters[i] > target)
                return letters[i];
        }
        return letters[0];
    }
}
