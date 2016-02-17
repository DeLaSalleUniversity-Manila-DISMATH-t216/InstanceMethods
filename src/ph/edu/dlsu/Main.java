package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;
import ph.edu.dlsu.OlivePress.OlivePress;

public class Main {

    public static void main(String[] args) {

        Olive[] olives = {new Olive(), new Olive(), new Olive()};
        OlivePress press = new OlivePress();
        press.getOil(olives);
    }
}
