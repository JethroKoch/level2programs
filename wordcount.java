import java.util.Scanner;
public class wordcount{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a simple phrase");
        String phrase = "";
        while(phrase.equals("")){
            phrase = sc.nextLine();
        }    
        int wordcount = 1;
        for (int i = 0; i < phrase.length(); i++) 
            {
                if (phrase.charAt(i) == ' ') 
                {
                    wordcount++;
                } 
            }

            System.out.println("Word count is = " + wordcount);
    }
}