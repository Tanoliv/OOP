package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Mag;

public class Monk extends Mag {
  
    public Monk(){
        super(10, 3, 10, 0, 100, "Монах");        
     }

     @Override
    public void step() {       
        super.step();
        System.out.println("Монах помолился и вылечил");
    }
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, лекарства - %d\n",
        this.role, getName(), this.hp, this.speed,   this.medicines);
        return role;
     }
}
