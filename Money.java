

public class Money {

    private int MIN_MONEY = 1000;
    private int money = 0;
    private int count =0; 

    Input input = new Input();

    public void setCount(){
        this.money = input.InputMoney();
    }

    public int getCount(){
        setCount();
        return count = money/MIN_MONEY;
    }

}
