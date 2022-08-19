package OLD;
import java.util.Scanner;

// 행위에 가까운 것이라 꼭 class 로 나누지 않아도 되는 것 같다. 

public class InputData {

    public int Input(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}

