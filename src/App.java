public class App {
    public static void main(String[] args) {
        String pesel = "9611212345";
        String birthYear = "1996";
        PeselCheck peselCheck = new PeselCheck(pesel, birthYear);
        peselCheck.check();
    }
}
