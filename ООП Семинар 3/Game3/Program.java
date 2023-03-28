package Game3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Game3.Units.Crossbowman;
import Game3.Units.Magician;
import Game3.Units.Monk;
import Game3.Units.Outlaw;
import Game3.Units.Peasant;
import Game3.Units.Pikeman;
import Game3.Units.Sniper;
import Game3.Units.Abstract_Class.Unit;

public class Program {
    
    public static void main(String[] args) {  

        ArrayList<Unit>  list = new ArrayList<>();      
        ArrayList<Unit> list2 = new ArrayList<>();
        for(int i=0; i< 4; i++){
            switch(new Random().nextInt(4)){
                case 0:
                list.add(new Sniper());
                break;
                case 1:
                list.add(new Peasant());
                break;
                case 2:
                list.add(new Magician());
                break;
                default:
                list.add(new Outlaw());
                break;
            }
            switch(new Random().nextInt(4)){
                case 0:
                list2.add(new Crossbowman());
                break;
                case 1:
                list2.add(new Peasant());
                break;
                case 2:
                list2.add(new Monk());
                break;
                default:
                list2.add(new Pikeman());
                break;
            }
        }
        final ArrayList<Unit> list3 = new ArrayList<>();
        list3.addAll(list);
        list3.addAll(list2);
        list3.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit u1, Unit u2){
                if(u1.getSpeed() == u2.getSpeed())
                return 0;
                else if(u1.getSpeed() == u2.getSpeed())
                return 1;
                else return -1;
            }
        });

        System.out.println("Общий список");
        list3.forEach(u -> u.getInfo());
        System.out.println();

        
        System.out.println("Красные атакуют");
        list.forEach(u -> u.step(list2, list2 ));
        System.out.println();

        System.out.println("Белые атакуют");
        list2.forEach(u -> u.step(list, list));
        System.out.println(); 
        
        System.out.println("Красные");
        list.forEach(u -> u.getInfo());
        System.out.println();

        System.out.println("Белые");       
        list2.forEach(u -> u.getInfo());
        System.out.println();

       
       
    }
  
    
}

