package AppliSimu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

/**
 * controller.
 */
public class CommandeVoiture extends JPanel implements ActionListener {

    private JButton boutonAccelerer;
    private JButton boutonInverserDirection;
    private JButton boutonTournerGauche;
    private JButton boutonTournerDroite;
    private Voiture maVoiture;


    public CommandeVoiture(JFrame fenetre, Voiture maVoiture) {

        super();
        this.setLayout(new FlowLayout());

        boutonAccelerer = new JButton("Accelerer");
        boutonAccelerer.addActionListener(this);
        this.add(boutonAccelerer);

        boutonInverserDirection = new JButton("Changer direction");
        boutonInverserDirection.addActionListener(this);
        this.add(boutonInverserDirection);

        boutonTournerGauche = new JButton("Gauche");
        boutonTournerGauche.addActionListener(this);
        this.add(boutonTournerGauche);

        boutonTournerDroite = new JButton("Droite");
        boutonTournerDroite.addActionListener(this);
        this.add(boutonTournerDroite);

        fenetre.add(this);
        this.maVoiture = maVoiture;
    }


    //@Override
    public void actionPerformed(ActionEvent event) {
        Object bouton = event.getSource();

        if (bouton == boutonAccelerer) {
            maVoiture.accelerer();
        } else if (bouton == boutonInverserDirection) {
            maVoiture.inverserDirection();
        } else if (bouton == boutonTournerDroite) {
            maVoiture.setDirection((Integer) maVoiture.getDirection() + 90);
        } else {
            maVoiture.setDirection((Integer) maVoiture.getDirection() + 270);
        }
    }


}
