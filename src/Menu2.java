import java.util.Scanner;

public class Menu2 {
    static int largestOfThree(int a,int b,int c){
        return ((a>b&&a>c)?a:((b>c)?b:c));
    }
    static int smallestOfThree(int a, int b, int c){
        return ((a<b&&a<c)?a:((b<c)?b:c));
    }
    public static void main(String[] args) {
        int x= 1,n, a, b, c;
        while (x==1){
            System.out.println("Enter your choice");
            System.out.println("1. Largest of 3 number");
            System.out.println("2. Smallest of 3 number");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter 3 numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    c=sc.nextInt();
                    System.out.println("Largest is "+largestOfThree(a,b,c));
                    break;
                case 2:
                    System.out.println("Enter 3 numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    c=sc.nextInt();
                    System.out.println("Smallest is "+smallestOfThree(a,b,c));
                    break;

                case 6:
                    System.out.println("Thanks for using");
                    x=0;
                    break;
            }
        }
    }
}
