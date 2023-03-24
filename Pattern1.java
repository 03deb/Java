import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pattern1 {
    public static void main(String args[]){

        System.out.println(" \n Rectangle Pattern \n"); 
        int i,j,n;

          for(i=0; i<5; i++){

            for(j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();

           
        }
        System.out.println(" \n #########################################");

        System.out.println(" \n Open Square \n"); 

        for(i=0; i<9; i++){
            
            System.out.print("*");

        }
        System.out.println();
        for(j=0; j<3; j++){

            System.out.println("*\t*");
        }

        for(int k=0; k<9; k++){

            System.out.print("*");
        }


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Left Triangle \n");

       
        for(i=0; i<4; i++){
            System.out.println();

           for(j=0; j<=i; j++){
               System.out.print("*");
           }
        }
        System.out.println();

        
        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Top Triangle \n");
        
        for(i=4; i>=0; i--){
            System.out.println();
            for(j=0; j<=i; j++){
                System.out.print("*");
            }
        }
        
        System.out.println("\n");


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Right Triangle \n");

        for(i=4; i>=1; i--){
           for(j=1; j<i; j++){
               System.out.print(" ");
           }

           for(int k=0; k<=4-i; k++){
               System.out.print("*");
           }
           System.out.println();
        }

        System.out.println("\n");


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Left number triangle \n");

        int sum = 1;
        for(i=1; i<6; i++){
            System.out.println();
            for(j=1; j<=i; j++){
                System.out.print(sum + " ");
                sum++;
            }
        }
        System.out.println();

        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Top Triangle with number \n");
        
        for(i=5; i>=0; i--){
            System.out.println();
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
        }
        
        System.out.println("\n");

        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n butterfly diagram \n");

        int q = 4;

        for(i=1; i<=q; i++){
            System.out.println();
            for(j=1; j<=i; j++){
                System.out.print("*");
            }

            int space = 2 * (q-i);
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }

            for(j=1;j<=i; j++){
                System.out.print("*");
            }
        }

        int w = 4;
        for(i=w; i>=1; i--){
            System.out.println();
            for(j=1; j<=i; j++){
                System.out.print("*");
            }

            int space = 2 * (w-i);
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }

            for(j=1; j<=i; j++){
                System.out.print("*");
            }
        }

        System.out.println();


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n Rohmbus \n");

        int e = 4;
        for(i=1; i<=e; i++){
            System.out.println( );
            for(j=1; j<=e-i; j++){
                System.out.print(" ");
            }

            for(j=1; j<=e; j++){
                System.out.print(" *");
            }
        }
        System.out.println();


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n pyramid \n");

        int r = 5;
        for(i=1;i<=r; i++){
            System.out.println();
            for(j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
        }
        System.out.println();


        System.out.println(" \n #########################################");

        System.out.println("");

        System.out.println(" \n bast pyramid \n");

        int a = 5;
        
        for(i=1; i<=a; i++){
            int p=1;
            int t=5;
            System.out.println();
            for(j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
               // System.out.println();
                for(i=1; i<=t; i++){
                    System.out.print(p);
                }
                p++;
                t--;
            }

            
        }
        System.out.println();

    }
}
