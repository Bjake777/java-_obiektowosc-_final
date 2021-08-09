public class PeselCheck {
    String pesel;
    String birthYear;

    public PeselCheck(String pesel, String birthYear) {
        this.pesel = pesel;
        this.birthYear = birthYear;
    }

    public void check() {
        if (pesel.substring(0, 2).equals(birthYear.substring(2, 4))) {
            System.out.println("porawny rok peselu");
        } else {
            System.out.println("rok nie zgodny z peselem");
        }
    }
}
