import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        System.out.println("Введите строку для вычисления хеша: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        BigHash B_Hash = new BigHash();
        LittleHash L_Hash= new LittleHash();
        System.out.println("Слабый хеш: ");
        System.out.println(L_Hash.hash(str));
        System.out.println("Сильный хеш: ");
        System.out.println(B_Hash.hash(str));
    }

}