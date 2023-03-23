package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Mag;

public class Magician extends Mag {         
    
    public Magician(){
        super(5, 6, 8, 100, 0,"Маг");
    }

    @Override
    public void step() {       
        super.step();
        System.out.println("Маг поколдовал!");
    }

    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, Мана - %d\n",
            this.role, getName(), this.hp, this.speed,   this.mana);
        return role;
    }

}
