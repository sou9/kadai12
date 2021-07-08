import javax.security.auth.Subject;

public class SubtractionDisplay {
    private int countDownValue =1000;
    public void update(Subject subject){
        countDownValue=countDownValue-1;
        System.out.print(countDownValue);

    }
}
