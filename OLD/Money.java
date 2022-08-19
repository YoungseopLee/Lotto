package OLD;
public class Money {

    private int MIN_MONEY = 1000;
    private int money = 0;
    private int count = 0; 

    public void setCount(int money){
        this.money = money;
    }

    public int getCount(){  
        return count = money/MIN_MONEY;
    }
}
