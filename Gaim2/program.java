package Gaim2;

import java.util.ArrayList;


import Gaim2.Units.Crossbowman;
import Gaim2.Units.Magician;
import Gaim2.Units.Monk;
import Gaim2.Units.Outlaw;
import Gaim2.Units.Peasant;
import Gaim2.Units.Pikeman;
import Gaim2.Units.Sniper;
import Gaim2.Units.Abstract_Class.Unit;

public class program {   
    public static void main(String[] args) {  

        ArrayList<Unit> list = new ArrayList<>();
        list.add(new Sniper());
        list.add(new Crossbowman());
        list.add(new Pikeman());
        list.add(new Outlaw());
        list.add(new Magician());
        list.add(new Monk());
        list.add(new Peasant());

        ArrayList<Unit> list2 = new ArrayList<>();
        list2.add(new Sniper());
        list2.add(new Crossbowman());
        list2.add(new Pikeman());
        list2.add(new Outlaw());
        list2.add(new Magician());
        list2.add(new Monk());
        list2.add(new Peasant());

        System.out.println("Красные");
       // list.forEach(u -> u.step());
        list.forEach(u -> u.getInfo());

        list2.forEach(u -> u.step());
         System.out.println("Белые");
        list2.forEach(u -> u.getInfo());
        
    }
  
    

    



   
    



    


   
}
