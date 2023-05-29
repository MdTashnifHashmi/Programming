public class forloop {
    public static void main(String[] args) {
        for(int t=0;t<5;t++)
        System.out.println("*");
       {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
        
                System.out.print(j +" ");
            }
        
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
        
                continue;
        
            }
        
            System.out.print(i + " ");
        
        }
        }
    }
}

