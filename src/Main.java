// Question 1 part 2

public class Main {
    public static void main(String[] args) {
       IDependency subj = new Subject2();
       Client client = new Client();
       client.setSubject(subj);
        for (int i = 0; i < 10; i++) {
            subj.getNumber();
        }

    }
}