import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array You Want To Create :");
        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int[][]Num = new int[rows][colms];
       // int l = Num.length;
       // System.out.println(l);
        System.out.print("Enter Elements In Array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                Num[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter The Number You Want To Find :");
        int key = sc.nextInt();
        
        int flag = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                if(key==Num[i][j]){
                    System.out.println("Element Found at index "+Num[i][j]);
                    flag = 1;
                }
            }
        }
        if(flag==0){
            System.out.println("you have entered wrong element");
        }


        

    }
}
