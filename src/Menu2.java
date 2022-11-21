import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        int x= 1,n, a, b, c;
        while (x==1){
            System.out.println("Enter your choice");
            System.out.println("1. Largest of 3 number");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter 3 numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    c=sc.nextInt();
                    int large =(a>b&&a>c)?a:((b>c)?b:c);
                    System.out.println("Largest is"+large);
                case 6:
                    System.out.println("Thanks for using");
                    x=0;
            }
        }
    }
}
