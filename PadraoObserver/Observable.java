package modelo.PadraoObserver;

import java.util.ArrayList;

public class Observable {

    private ArrayList<Observer> observadores = new ArrayList<>();

    public void addObserver(Observer ob) {this.observadores.add(ob);}
    public void deleteObserver(Observer ob){
        observadores.remove(ob);
    }
    public void notifyObserver(){
        for(Observer ob : observadores){
            ob.update(this);
        }
    }
}
