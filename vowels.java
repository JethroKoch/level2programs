import java.util.Scanner;
public class vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        System.out.print("Please enter a string ");
        while(str1.equals("")){
            str1 = sc.nextLine();}
        int cons = 0;
        int vowel = 0;
        int space = 0;
        str1.toLowerCase();
        int length = str1.length() - 1;
        while(length>=0){
            switch(str1.charAt(length)){
                case 'a': 
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel ++;
                    break;
                case ' ':
                    space ++;
                    break;
                default:
                    cons ++;
                    break;
                }
                length --;
            }
        System.out.println("vowels = "+ vowel);
        System.out.println("Consonants = "+ cons);
    }
}
