package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Shooter;
import Game3.Units.Abstract_Class.Unit;

public class Crossbowman extends Shooter {     
    
    public Crossbowman(){
        super(7, 8, 7, "Арбалетчик", 2);
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
        super.step(team, team2);
       
        System.out.println("Арбалетчик: Могу стрелять"); 
           
    }

    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Сила атаки - %d, Стрелы - %d\n",
                this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows);
        return role;
    }

   

}
