package practice.string;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "abt";

        int sum = 0;

        for(int i = 0; i < str1.length(); i++) {
            sum += str1.charAt(i);
            sum -= str2.charAt(i);
        }

        if(sum == 0) {
            System.out.println("Anagrams");
        } else {
            System.out.println("NO ");
        }

    }
}
