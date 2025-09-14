public class HeartPatientData extends Subject{
    @Override
    public void PrintRate(double rate){
        System.out.println("Heart rate:");
        notifyAllWatchers(rate);
    }
}
