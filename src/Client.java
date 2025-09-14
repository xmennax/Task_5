import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    public IDependency iDependency;

    public void setSubject(IDependency iDependency){
        this.iDependency = iDependency;
        iDependency.addObservers(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.printf("Client has been modified: %d%n" , arg);
    }

}