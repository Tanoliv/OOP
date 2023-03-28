package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Mag;
import Game3.Units.Abstract_Class.Unit;

public class Magician extends Mag {         
    
    public Magician(){
        super(7, 6, 1, 100, 0,"Маг");
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
        //super.step(team, team2);    
        System.out.println("Маг могу погодать и вылечить");        
    }

    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, Мана - %d\n",
            this.role, getName(), this.hp, this.speed,   this.mana);
        return role;
    }

}
