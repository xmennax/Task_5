public class PCPatientWatcher implements IWatcher{
    String name;

    public PCPatientWatcher (String name){
        this.name = name;
    }

    @Override
    public void update(double rate) {
        System.out.println("(PC Watcher) Patient Name: " + name + ", Patient rate: " + rate) ;
    }
}
