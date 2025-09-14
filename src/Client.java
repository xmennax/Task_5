import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    public Subject1 subject;
    public void setSubject(Subject1 subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("Client has been modified: %d%n" , arg);
    }
}