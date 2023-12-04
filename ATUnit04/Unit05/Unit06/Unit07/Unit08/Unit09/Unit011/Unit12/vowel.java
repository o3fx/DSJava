package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12;

public class vowel {

    public static int countVowels(String phrase) {
        int vowelCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String testPhrase = "This is a Test Phrase";
        int vowelCount = countVowels(testPhrase);
        System.out.println("The number of vowels in the phrase is: " + vowelCount);
    }
}
