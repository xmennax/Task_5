import java.util.ArrayList;

public abstract class ICU implements IICU {
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
    public static void setWatchers(IICU IICU, String patientName){
        IICU.addWatcher(new PCPatientWatcher(patientName));
        IICU.addWatcher(new PDAPatientWatcher(patientName));
    }
    public abstract void PrintRate(double rate);
}
