import java.util.ArrayList;

public abstract class Subject implements ISubject {
    public ArrayList<IWatcher> Watchers = new ArrayList<>();
    @Override
    public void addWatcher(IWatcher watcher) {
        Watchers.add(watcher);
    }

    @Override
    public void notifyAllWatchers(double rate) {
        for(IWatcher w : Watchers){
            w.update(rate);
        }
    }
    public static void setWatchers(ISubject iSubject , String patientName){
        iSubject.addWatcher(new PCPatientWatcher(patientName));
        iSubject.addWatcher(new PDAPatientWatcher(patientName));
    }
    public abstract void PrintRate(double rate);
}
