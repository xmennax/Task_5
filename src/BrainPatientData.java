public class BrainPatientData extends ICU {
    @Override
    public void PrintRate(double rate){
        System.out.println("Brain rate: ");
        notifyAllWatchers(rate);
    }
}
