public class PasserelleServicePaiement {
  private Facturation facturation;
  private Recu recu;
  private Compte compte;
  private Emplacement emplacement;

  public void PasserelleServiece() {
    this.facturation = new Facturation();
    this.recu = new Recu();
    this.compte = new Compte();
    this.emplacement = new Emplacement();
  }

  public void effectuerPaiement(double montant) {
    if (emplacement.checkDisponibilité()) {
      facturation.checkFacture();
      compte.checkMontant(montant);
      recu.checkRecu();
      System.out.println("Votre Paiement est effectué avec succès!");
    } else {
      System.out.println("Système indique problème pour votre paiement.");
    }
  }
}
