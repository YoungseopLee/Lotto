import java.util.Scanner;

public class UserInterface {

    Money m = new Money();
    Numbers n = new Numbers();
    Input i = new Input();

    UserInterface(){
        Run();
    }

    public void DrawUI(){
        System.out.println("##### Lotto ######");       
        System.out.println(""); 
    }

    public void ShowResult(){
        m.setCount(i.InputMoney());
        n.RandomNumbers(m.getCount());
        System.out.println("");
    }

    public void Run(){
        DrawUI();
        ShowResult();

    }
}
