// Question 1 part 1
public class Main {
    public static void main(String[] args) {
       Subject1 subject = new Subject1();
       Client client = new Client();
       client.setSubject(subject);
        for (int i = 0; i < 10; i++) {
            subject.getNumber();
        }
    }
}
