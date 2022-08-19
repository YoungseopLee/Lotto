package OLD;


public class Numbers {

    private int Result[] = new int[6]; 
    private int MIN = 1;
    private int MAX = 45;
    
    
    public void RandomNumbers(int count){

        for(int i=0; i<count; i++){ 
            if(count < 1 ){
                System.out.println("UnLess 1,000");
            }
            System.out.println("");
            for(int j=0; j<=5; j++){
                Result[j] = (int) ((Math.random() * (MAX - MIN)) + MIN);
               
                if(Result[i] == Result[j]){
                    i--;
                    break;
                }
             }         
            // sort 
            SelectionSort(); 
       }  

       System.out.println(" ");
       System.out.println(" ");
       
    }   

    public void SelectionSort(){

        int tmp = 0;

        for(int i=0; i<Result.length; i++){
            for(int j=0; j<Result.length-1; j++){
                if(Result[j] > Result[j+1]){
                    tmp = Result[j];
                    Result[j] = Result[j+1];
                    Result[j+1] = tmp;
                }
            }
        }
        
        for(int i=0; i<Result.length; i++){
            System.out.print(Result[i]+ " ");
        }
    }
}