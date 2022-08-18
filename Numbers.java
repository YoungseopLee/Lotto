
public class Numbers {

    private int []Result = {};
    private int MIN = 1;
    private int MAX = 45;

    public void RandomNumbers(){
        for(int i=0; i<1; i++){ 
            for(int j=0; j<5; j++){
                Result[j] = (int) ((Math.random() * (MAX - MIN)) + MIN);
                System.out.println(Result[j]);
            }            
        }        
    } 

}