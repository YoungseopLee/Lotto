
public class Numbers {

    private int Result[] = new int[6]; 
    private int MIN = 1;
    private int MAX = 45;
    
    
    public void RandomNumbers(int count){

        for(int i=0; i<count; i++){ 
            System.out.println("");
            System.out.print(i+1 + " 번째 : ");
            for(int j=0; j<=5; j++){
                Result[j] = (int) ((Math.random() * (MAX - MIN)) + MIN);
                // if(중복이면 다시) 
                System.out.print(Result[j] + " ");
            }               
            System.out.println(""); 

       }      
    }   
}