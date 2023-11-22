import java.util.Scanner;
public class CharacterFromUser{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch=scn.next().charAt(0);
        System.out.println("the given character is " + ch);

    }
}
