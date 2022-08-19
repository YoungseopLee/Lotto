package NEW;
import java.util.Scanner;

public class Money {

    private int MIN_MONEY = 1000;
    private int input_money = 0;
    private int count = 0;

    public void setCount(int money){
        this.input_money = money;
    }

    public int getCount(){

        return count = input_money/MIN_MONEY;
    }
    
}
