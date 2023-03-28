package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Mag;
import Game3.Units.Abstract_Class.Unit;

public class Monk extends Mag {
  
    public Monk(){
        super(7, 3, 1, 0, 100, "Монах");        
     }
     @Override
     public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
         //super.step(team, team2);    
         System.out.println("Монах: Могу помолиться и вылечить");        
     }
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, лекарства - %d\n",
        this.role, getName(), this.hp, this.speed,   this.medicines);
        return role;
     }
}
