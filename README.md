# InstanceMethods

![jcinsanity](Screenshot 001.PNG)
![jcinsanity](Screenshot 002.PNG)
![jcinsanity](Screenshot 003.PNG)




~~~
package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;
import ph.edu.dlsu.OlivePress.OlivePress;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new ArrayList<Olive>();

        Olive olive;

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);


        OlivePress press = new OlivePress();
        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

        press.getOil(olives);

        System.out.println("You got " + press.getTotalOil() + " units of oil");

    }
}

~~~

~~~
package ph.edu.dlsu.OlivePress;

import ph.edu.dlsu.Olive.Olive;

import java.util.ArrayList;

public class OlivePress {

    public int getTotalOil() {
        return totalOil;
    }

    private void setTotalOil(int totalOil) {
        this.totalOil += totalOil;
    }

    private int totalOil = 0;

    public OlivePress(){
    }

    public void getOil(ArrayList<Olive> olives){

        int oil = 0;

        for (Olive olive : olives){
            oil += olive.crush();
        }

        setTotalOil(oil);

    }
}

~~~

~~~
package ph.edu.dlsu.Olive;

public class Olive {

    public String name = "KALAMATA";
    public String flavor = "Grassy";
    public long color = 0x000000;
    private int oil = 3;

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public Olive() {
        System.out.println("Constructor of " + this.name);
    }

    public Olive(int oil) {
        setOil(oil);
    }

    public int crush(){
        System.out.println("Ouch!");
        return oil;
    }
}

~~~
