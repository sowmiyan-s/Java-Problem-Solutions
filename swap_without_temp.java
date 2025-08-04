public class swap_without_temp {
    public static void main(String[] args) {

        /* 
         *25/07/2025 - coding class - swap two var without temp - sowmiyan s 
        */
        
        int a = 10;
        int b = 20;
        System.out.println("---Before swapping--- " + " \n A = "+ a + "\n B = " + b );
        a= a + b;
        b = a-b;
        a = a - b;
        System.out.println("---After  swapping--- " + " \n A = "+ a + "\n B = " + b );

    }
    
}
