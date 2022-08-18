import java.util.Scanner;

public class UserInterface {

    Money m = new Money();
    Numbers n = new Numbers();

    UserInterface(){
        Run();
    }

    public void DrawUI(){
        System.out.println("##### Lotto ######");        
    }
    
    public void ShowResult(){
        System.out.println(m.getCount());        
    }

    public void Run(){
        DrawUI();
        ShowResult();
    }
}
