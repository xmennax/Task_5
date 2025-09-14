// Question 3
public class Main {
    public static void main(String[] args) {

        HeartPatientData heartPatient = new HeartPatientData();
        Subject.setWatchers(heartPatient , "Ahmed");
        heartPatient.PrintRate(85.5);

        BrainPatientData brainPatient = new BrainPatientData();
        Subject.setWatchers(brainPatient,"Mona");
        brainPatient.PrintRate(70.2);






    }
}