package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Shooter;
import Game3.Units.Abstract_Class.Unit;

public class Peasant extends Shooter {
    protected int products = 100;
   
   //protected int pitchfork = 1;
    public Peasant() {
        super(7, 2, 1, "Крестьянин", 1);               
    }



    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, Сила атаки - %d, Вилы - %d, Продукты - %d\n",
            this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows, this.products   );
        return role;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
            
        System.out.println("Крестьянин: Могу накормить");        
    }


}
