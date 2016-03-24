package DomaineVoiture;

import java.util.Observable;

/**
 * Model.
 */
public class Voiture extends Observable {

    private int x;
    private int y;
    private int vitesseMetreSeconde;
    private int directionEnDegres;
    private int limiteTerrain = 900;

    public Voiture(int x, int y, int vitesse) {
        this.x = x;
        this.y = y;
        this.vitesseMetreSeconde = vitesse;
        this.directionEnDegres = 0;
    }

    public void miseAJourPosition() {
        miseAJourPositionX();
        miseAJourPositionY();
        notificationObservateur();
    }

    private void miseAJourPositionX() {
        if (directionEnDegres == 0)
            x += vitesseMetreSeconde;
        else if (directionEnDegres == 180)
            x -= vitesseMetreSeconde;

        if (x > limiteTerrain)
            x = limiteTerrain;
        else if (x < 0)
            x = 0;
    }

    private void miseAJourPositionY() {
        if (directionEnDegres == 90)
            y += vitesseMetreSeconde;
        else if (directionEnDegres == 270)
            y -= vitesseMetreSeconde;

        if (y > limiteTerrain)
            y = limiteTerrain;
        else if (y < 0)
            y = 0;
    }

    private void notificationObservateur() {
        this.setChanged();
        this.notifyObservers();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void accelerer() {
        if (vitesseMetreSeconde < 100)
            vitesseMetreSeconde += 10;
    }

    public Object getVitesse() {
        return vitesseMetreSeconde;
    }

    public void setVitesse(int vitesse) {
        vitesseMetreSeconde = vitesse;
    }

    public void setDirection(int angleDirection) {
        this.directionEnDegres = angleDirection;
        directionEnDegres = directionEnDegres % 360;

    }

    public void inverserDirection() {
        directionEnDegres += 180;
        directionEnDegres = directionEnDegres % 360;

    }

    public Object getDirection() {
        return directionEnDegres;
    }

}
