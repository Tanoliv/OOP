package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Shooter;

public class Peasant extends Shooter {
    protected int products = 100;
   
   //protected int pitchfork = 1;
    public Peasant() {
        super(10, 3, 5, "Крестьянин", 1);               
    }

    @Override
    public void step() {       
        super.step();
        System.out.println("Крестьянин накормил");
    }

    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d, Атаки - %d, Вилы - %d, Продукты - %d\n",
            this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows, this.products   );
        return role;
    }

}
