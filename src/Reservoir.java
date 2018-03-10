import java.util.Random;

public class Reservoir  {

    public static void main(String []args){
        int k = 5;
        int[] arr = new int[20];
        for (int j = 0; j < 20 ; j++) {
            arr[j] =(int) (10*Math.random()+5);
        }
        int[] reservoir = new int[k];
        for (int i = 0; i < k-1 ; i++) {
            reservoir[i] = arr[i];
        }

        for (int i = k; i < 20 ; i+=2) {
            int j = (int)((i+1)*Math.random()) ;
            if(j < k){
                reservoir[j] = arr[i];
            }
        }
        for (int i = 0; i < k ; i=+2) {
            System.out.println(arr[i]);
        }
    }
}
