package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Shooter;

public class Crossbowman extends Shooter {     
    
    public Crossbowman(){
        super(5, 6, 8, "Арбалетчик", 56);
    }

    @Override
    public void step() {       
        super.step();
        System.out.println("Арбалетчик выстрелил! Вжик");
    }

    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Атаки - %d, Стрелы - %d\n",
                this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows);
        return role;
    }

}
