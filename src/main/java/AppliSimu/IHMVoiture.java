package AppliSimu;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

import DomaineVoiture.Voiture;

/**
 * View.
 */
public class IHMVoiture extends JFrame {

    private Voiture maVoiture;
    private CommandeVoiture maCommandeVoiture;
    private int tailleFenetre = 505;

    private void initGraphique() {
        this.setTitle("Simulateur de Voiture");
        this.setSize(tailleFenetre, tailleFenetre);

        this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);

        this.setVisible(true);
    }

    public IHMVoiture(Voiture maVoiture) {
        super();
        this.maVoiture = maVoiture;
        initGraphique();
    }

    public IHMVoiture() {
        super();
        initGraphique();
        this.maVoiture = null;
    }

    @Override
    public void paint(Graphics contexteGraphique) {
        super.paint(contexteGraphique);
        contexteGraphique.setColor(Color.black);
        dessinerRoutes(contexteGraphique);
        contexteGraphique.setColor(Color.red);
        dessinerVoiture(contexteGraphique);
    }


    private void dessinerVoiture(Graphics contexteGraphique) {
        int xPixel = Conversion.calculerPositionPixels(maVoiture.getX());
        int yPixel = Conversion.calculerPositionPixels(maVoiture.getY());
        int directionVoiture = (Integer) maVoiture.getDirection();
        int largeurVoiture = 30;
        int longueurVoiture = 15;
        if (directionVoiture % 180 == 0) {
            largeurVoiture = 15;
            longueurVoiture = 30;
        }
        contexteGraphique.fillRect(xPixel, yPixel, longueurVoiture, largeurVoiture);
    }

    private void dessinerRoutes(Graphics contexteGraphique) {
        contexteGraphique.fillRect(0, 300, tailleFenetre, 15);
        contexteGraphique.fillRect(tailleFenetre/2, 80, 15, tailleFenetre);
    }

}
