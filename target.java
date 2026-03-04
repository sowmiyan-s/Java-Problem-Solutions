public class target {

    public static int[][] findpair( int[] arr , int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+ arr[j] == target){
                    count++;
                }
            }
        }

        int[][]  result = new int[count][4];
        int index =0;
        for(int i=0; i<arr.length ; i++ ){
            for(int j= i+1; j<arr.length ; j++){
                if(arr[i]+ arr[j] == target){
                    result[index][0] = arr[i];
                    result[index][1] = arr[j];
                    result[index][2] = i;
                    result[index][3] =j;
                    index++;

                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[] arr = {4,7,1,2,5,3};
        int t = 6;
        int[][] pair = findpair(arr,t);

        for(int[] p : pair){
            System.out.println("Values : (" + p[0] + "," + p[1] + ") At index : (" + p[2] + "," + p[3] + ")");
        }

        
    }
    
}
