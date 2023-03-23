package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Shooter;

public class Outlaw extends Shooter {
    public static Object r;
    public static int number;
    protected int blockhead= 1;
    protected int knife= 1;    

    public Outlaw(){
        super(10, 7, 10, "Разбойник", 0);        
     }

     @Override
    public void step() {       
        super.step();
        System.out.println("Бандит ограбил! Ох");
    }
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Атаки - %d,  Дубина - %d, Нож - %d\n",
                this.role, getName(), this.hp, this.speed, this.damage,  this.blockhead, this.knife);
        return role;
     }
}
