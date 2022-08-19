package OLD;
public class UserInterface {

    Money m = new Money();
    Numbers n = new Numbers();
    InputData i = new InputData();

    UserInterface(){
        Run();
    }

    public void DrawUI(){
        System.out.println("##### Lotto ######");       
        System.out.println(""); 
    }

    public void ShowResult(){
        m.setCount(i.Input());
        n.RandomNumbers(m.getCount());
        
    }
    
    public void Run(){
        DrawUI();
        ShowResult();

    }
}
