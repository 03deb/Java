import java.util.*;

public class calculator {
    
    public static void main(String[] args) {
        
        double a,b,ans;
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println(" \n Press 1 for + \n press 2 for - \n press 3 for * \n press 4 for / \n press 5 for %");

        System.out.println("Enter First Number :");
        a = sc.nextInt();
        System.out.println("Enter Operation to perform :");
        option = sc.nextInt();
        System.out.println("Enter Second Number :");
        b = sc.nextInt();
        

        switch(option){

            case 1 :
            ans = a+b;
            System.out.println(ans);
            break;

            case 2 :
            ans = a-b;
            System.out.println(ans);
            break;

            case 3 :
            ans = a*b;
            System.out.println(ans);
            break;

            case 4 :
            ans = a/b;
            System.out.println(ans);
            break;

            case 5 :
            ans = a%b;
            System.out.println(ans);
            break;

            default:
            System.out.println("Invalid Button");
        }


    }
}
