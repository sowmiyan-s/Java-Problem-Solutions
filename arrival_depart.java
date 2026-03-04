public class arrival_depart{


 public static int platform(int[] a , int[] b ){
        int p = 1;

        for(int i=1;i<a.length;i++){
            if(b[i-1] > a[i]){
                p++;
            }
        }

        return p;
    }

    public static void main(String[] args) {

        int[] a = {9,13,16,18};
        int[] b = {15,17,19,20};

        System.out.println(platform(a, b));
        
    }
    
}
