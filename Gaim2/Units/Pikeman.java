package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Shooter;

public class Pikeman extends Shooter {
    
    protected int pike= 1;  

    public Pikeman(){
        super(10, 7, 10, "Пехотинец", 0);        
     }

     @Override
    public void step() {       
        super.step();
        System.out.println("Пехотинец уколол! Ой");
    }
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Атаки - %d,  Пика - %d\n",
                this.role, super.getName(), this.hp, this.speed, this.damage,  this.pike);
        return role;
     }
 
}
