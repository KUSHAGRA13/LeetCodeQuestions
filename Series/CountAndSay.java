package Series;

/**
 * Q38
 */
public class CountAndSay {

    public static void main(String[] args) {
        countAndSay(5);
    }

    public static String countAndSay(int n) {
        String[] words = new String[n];
        words[0] = "1";
        words[1] = "11";

        for (int i=2;i<n;i++) {
            words[i] = getWord(words[i-1]);
        }
        return words[n-1];
    }

    private static String getWord(String word) {

        String originalWord = "";
        for(int i=word.length()-1;i>=0;i--) {
            int count=1;
            String tempWord = ""+word.charAt(i);
            for(int j=i-1;j>=0;j--){
                if(word.charAt(i) == word.charAt(j)) {
                    i--;
                    count ++;
                }
                else break;
            }
            tempWord = count + tempWord;
            originalWord = tempWord + originalWord;
        }
        return originalWord;
    }
}
