import java.util.Scanner;
public class random{
    public static void main(String[] args){
        String random = "RANDOM";
        String output = "";
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please take a guess at my six letter word");
        while(!input.equals(random)){
            int cha = 1;
            while(input.length()<7){
                    input = sc.nextLine();
                    input.toUpperCase();
                }
            for(int i = 0; i<6; i++){
                if(input.charAt(cha) == (random.charAt(cha))){
                    output = output + input.charAt(cha);
                }else{
                    output = output + '?';
                }
                cha ++;
            }
            System.out.println(output);
            System.out.println("Guess again");
        }
        System.out.println("You guessed right the word is RANDOM");
    }
}
                    