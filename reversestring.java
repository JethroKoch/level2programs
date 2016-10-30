import java.util.Scanner;
public class reversestring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String output = "";
        System.out.print("Please enter a string: ");
        String input = "";
        while(input.equals("")){
            sc.nextLine();
        }
        int nextindex = input.length() - 1 ;
        while(nextindex >= 0){
            output = output + input.charAt(nextindex);
            nextindex --;
        }
        System.out.print("your string in reverse is " + output);
    }
}
