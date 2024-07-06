public class Pattern{
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern2(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern3(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern4(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern5(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern6(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern7(5);
        System.out.println();
        System.out.println("< - - - - - - - - - - - - - - >");
        System.out.println();
        pattern8(5);
    }

    /* *****
       *****
       *****
       *****
       *****
     */
    static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /* *
       **
       ***
       ****
       *****
     */
    static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

     /*1
       12
       123
       1234
       12345
     */
    static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* 
       1
       22
       333
       4444
       55555
     */
    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /* *****
       ****
       ***
       **
       *
     */
    static void pattern5(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /* 12345
       1234
       123
       12
       1
     */
    static void pattern6(int n){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

       /* 
         *
        ***
       *****
      *******
    ***********
       */
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

        /* 
         *********
          *******
           *****
            ***
             *
       */
      static void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (n * 2) - i - 1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
      }
}