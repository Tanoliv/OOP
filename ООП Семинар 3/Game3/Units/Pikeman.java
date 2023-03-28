package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Shooter;
import Game3.Units.Abstract_Class.Unit;

public class Pikeman extends Shooter {
    
    protected int pike= 1;  

    public Pikeman(){
        super(7, 7, 6, "Пехотинец", 1);        
     }
  @Override
     public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
         super.step(team, team2);
        
         System.out.println("Пехотинец: Могу колоть");
         
     }
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Сила атаки - %d,  Пика - %d\n",
                this.role, super.getName(), this.hp, this.speed, this.damage,  this.pike);
        return role;
     }

   
 
 
}
