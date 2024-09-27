package metier;

public class TestMetier {

    public static void main(String[] args) {
        CreditMetierImpl credit = new CreditMetierImpl();

        double c = 200000;
        int d = 240;
        double t = 4.5;
        double m = credit.calculMensualiteCredit(c, t, d);
        
        System.out.println("Monthly payment: " + m);
    }
}
