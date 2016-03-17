package AppliSimu;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

import DomaineVoiture.Voiture;

/**
 * View.
 */
public class IHMVoiture extends JFrame {

    private Voiture maVoiture;
    private CommandeVoiture maCommandeVoiture;

    private void initGraphique() {
        this.setTitle("Simulateur de Voiture");
        this.setSize(505, 505);

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
        contexteGraphique.setColor(Color.red);
        dessinerVoiture(contexteGraphique);
    }


    private void dessinerVoiture(Graphics contexteGraphique) {
        int xPixel = Conversion.calculerPositionPixels(maVoiture.getX());
        contexteGraphique.fillRect(xPixel, 300, 30, 15);
    }

}
