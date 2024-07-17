import java.util.Scanner;

public class Reverseword {
    public static void main(String[] args) {
        
        String input = "";
        Scanner scanner = new Scanner(System.in);
        
        for(int i=1; i <=4; i++){
            System.out.println("Enter a string For Test Case " + i + " : ");
            input = scanner.nextLine();
            String result = reverseWordsCharacters(input);
            System.out.println("Output For Test case  " + i + ":-- " + result+"\n");
        }
        
        scanner.close();
    }

    public static String reverseWordsCharacters(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversedString.append(reverseWord.reverse().toString()).append(" ");
        }

        return reversedString.toString().trim();
}
}