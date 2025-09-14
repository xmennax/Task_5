public class PDAPatientWatcher implements IWatcher{
    String name;

    public PDAPatientWatcher(String name){
        this.name = name;
    }

    @Override
    public void update(double rate) {
        System.out.println("(PDA Watcher) Patient Name: " + name + ", Patient rate: " + rate) ;
    }
}
