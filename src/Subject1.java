import java.util.Observable;
import java.util.Observer;

public class Subject1 extends Observable implements IDependency{
    public int num = 0;
    public void getNumber(){
        num++;
        setChanged();
        notifyObservers(num);
    }

    @Override
    public void addObservers(Observer observer) {
        addObserver(observer);
    }
}
