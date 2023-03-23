package Gaim2.Units;

import Gaim2.Units.Abstract_Class.Shooter;

public class Sniper extends Shooter {  

    public Sniper(){
       super(10, 10, 20, "Снайпер", 104);       
    }

    @Override
    public void step() {       
        super.step();
        System.out.println("Снайпер выстрелил! Вжик");
    }

    @Override
    
    public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Атаки - %d, Стрелы - %d\n",
        this.role, super.getName(), this.hp, this.speed, this.damage, this.arrows);       
        return role;        
    }

}
    

  

   

   

