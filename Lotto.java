import NEW.Money;
import NEW.Numbers;
import NEW.UI;

import java.util.Scanner;

public class Lotto {
   public static void main(String[] args) {

        Run();

    }
    
    public static void Run(){
        
        Money m = new Money();
        Numbers n = new Numbers();
        UI ui = new UI();
        Scanner sc = new Scanner(System.in);

        int input = 0;

        ui.ShowUI_INTRO();
        m.setCount(input = sc.nextInt());
        n.RandomNumbers(m.getCount());
        ui.ShowUI_OUTRO();

    }

}
