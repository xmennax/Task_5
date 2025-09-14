import java.util.Observable;
import java.util.Random;
import java.util.Observer;
public class Subject2 extends Observable implements IDependency{
    public void addObservers(Observer observer){
        addObserver(observer);
    }
    public void getNumber() {
        Random random = new Random();
        setChanged();
        notifyObservers(random.nextInt(-101,0));
    }
}