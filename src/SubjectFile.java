import java.util.ArrayList;

public class SubjectFile {
    public ArrayList<IDE> observers= new ArrayList<>();
    public void addObserver(IDE observer){
        observers.add(observer);
    }
    public void notifyAllUsers(String rename){
        for(IDE observer : observers){
            observer.update(rename);
        }
    }
}
