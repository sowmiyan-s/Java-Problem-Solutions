public class swapvar {

    public static void main(String[] args) {
        int a = 10,b =20;
        System.out.println(" -----Before swapping variables-----");
        System.out.println("\t A :"+ a + " \n \t B :"+ b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("-----After swapping variables-----");
        System.out.println("\t A :"+ a + "\n \t B :"+ b);

        System.out.println();


    }

    
}
