package AppliSimu;

import DomaineVoiture.Voiture;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Matteo on 17/03/2016.
 *
 */
public class Observateur implements Observer {

    IHMVoiture ihmVoiture;
    Voiture voiture;

    public Observateur(Voiture voit, IHMVoiture ihm){
        voiture = voit;
        ihmVoiture = ihm;
        voit.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        ihmVoiture.repaint();
    }
}
