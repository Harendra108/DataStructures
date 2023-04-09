package practice.string;

public class AnagramSubstring {
    public static void main(String[] args) {
        String s1 = "cbdcbcacbdbcac";
        String s2 = "abcc";

        int targetSum = 0;
        for(int i = 0; i < s2.length(); i++) {
            targetSum += s2.charAt(i);
        }

        int s1Sum = 0;
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < s1.length(); i++) {

            s1Sum += s1.charAt(i);
            while(s1Sum > targetSum) {
                s1Sum -= s1.charAt(startIndex);
                startIndex++;
            }
            if(s1Sum == targetSum) {
                endIndex = i;
                System.out.println("Anagram Substring = " + s1.substring(startIndex, endIndex+1));
            }
        }

    }
}
