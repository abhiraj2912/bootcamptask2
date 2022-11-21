import java.util.Scanner;

public class Menu2 {
    static int largestOfThree(int a,int b,int c){
        return ((a>b&&a>c)?a:((b>c)?b:c));
    }
    static int smallestOfThree(int a, int b, int c){
        return ((a<b&&a<c)?a:((b<c)?b:c));
    }

    static void primeOrNot(int a){
        int f=1;
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                f=2;
                break;

            }
        }
        if (f==2){
            System.out.println("Not a prime number");

        }else
        {
            System.out.println("Prime number");
        }
    }
    static void evenOrNot(int a){
        if(a%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("not a even number");
        }
    }
    public static void main(String[] args) {
        int x= 1,n, a, b, c;
        while (x==1){
            System.out.println("Enter your choice");
            System.out.println("1. Largest of 3 number");
            System.out.println("2. Smallest of 3 number");
            System.out.println("3. Prime or not");
            System.out.println("4. Even or not");
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
                case 3:
                    System.out.println("Enter the number");
                    a=sc.nextInt();
                    primeOrNot(a);
                    break;
                case 4:
                    System.out.println("Enter the number");
                    a=sc.nextInt();
                    evenOrNot(a);
                    break;


                case 6:
                    System.out.println("Thanks for using");
                    x=0;
                    break;
            }
        }
    }
}
