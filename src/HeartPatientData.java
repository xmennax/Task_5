public class HeartPatientData extends ICU {
    @Override
    public void PrintRate(double rate){
        System.out.println("Heart rate:");
        notifyAllWatchers(rate);
    }
}
