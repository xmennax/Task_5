public class BrainPatientData extends Subject{
    @Override
    public void PrintRate(double rate){
        System.out.println("Brain rate: ");
        notifyAllWatchers(rate);
    }
}
