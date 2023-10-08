public class Main {
  public static void main(String[] args) {
    PasserelleServicePaiement paiement = new PasserelleServicePaiement ();
    paiement.PasserelleServiece ();
    double montant = 70.0;
    paiement.effectuerPaiement(montant);
  }
}
