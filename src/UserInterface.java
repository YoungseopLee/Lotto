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
        
    }
    
    public void Run(){
        DrawUI();
        ShowResult();

    }
}
