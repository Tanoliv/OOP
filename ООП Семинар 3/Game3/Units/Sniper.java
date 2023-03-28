package Game3.Units;


import java.util.ArrayList;

import Game3.Units.Abstract_Class.Shooter;
import Game3.Units.Abstract_Class.Unit;

public class Sniper extends Shooter {  


    public Sniper(){
       super(7, 10, 7, "Снайпер", 3);       
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
        super.step(team, team2); 
        System.out.println("Снайпер: Могу стрелять");    
    }

    @Override
    
    public String getInfo() {
        
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Сила атаки - %d, Стрелы - %d\n",
        this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows);       
        return role;        
    }

}
    

  

   

   

