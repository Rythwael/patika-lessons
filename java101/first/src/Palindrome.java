import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz : ");
        String kel = input.next();
        System.out.println(isPalindrome(kel));
    }
}
