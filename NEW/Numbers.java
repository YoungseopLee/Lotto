package NEW;
import java.util.Arrays;
import java.util.Random;

public class Numbers {

    Money m = new Money();
    Random r = new Random();
    
    int result[] = new int[6];
    
    public void RandomNumbers(int count){
        
        for(int i=0; i<count; i++){

            for(int j=0; j<result.length; j++){

                result[j] = r.nextInt(45)+1;

                // Duplication
                for(int k=0; k<j; k++){
                    if(result[j]==result[k]){
                        j--;
                        break;
                    }
                }

            }
            SelectionSort();
            System.out.println("[" + (i+1) + "]회 : " + Arrays.toString(result));
            System.out.println("");
        }
    }

    public void SelectionSort(){

        int tmp = 0;

        for(int i=0; i<result.length; i++){

            for(int j=0; j<result.length-1; j++){

                if(result[j] > result[j+1]){
                    tmp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = tmp;
                }
            }
        }
    }

}
