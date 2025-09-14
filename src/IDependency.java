import java.util.Observer;

public interface IDependency {
     public void getNumber();
     public void addObservers(Observer observer);
}
