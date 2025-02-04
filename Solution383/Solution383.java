package Solution383;

public class Solution383{
    public boolean canConstruct(String ransomNote, String magazine){
        for(int i = 0; i<ransomNote.length(); i++){
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if(matchingIndex == -1){
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex +1 );
        }

        return true;
    }

    public static void main(String[] args){
        Solution383 solution = new Solution383();
        String ransomNote = "a";
        String magazine = "b";

        boolean result = solution.canConstruct(ransomNote, magazine);

        System.out.println(result);
    }
}