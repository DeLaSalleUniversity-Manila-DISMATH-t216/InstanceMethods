package ph.edu.dlsu.OlivePress;

import ph.edu.dlsu.Olive.Olive;

public class OlivePress {
    public void getOil(Olive[] olives){
        for (Olive olive: olives) {
            olive.crush();
            
        }
        
    }

}
