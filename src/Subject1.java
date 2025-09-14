import java.util.Observable;

public class Subject1 extends Observable {
    public int num = 0;
    public void getNumber(){
        num++;
        setChanged();
        notifyObservers(num);
    }
}
