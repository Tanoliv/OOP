package Game3.Units;

import java.util.ArrayList;

import Game3.Units.Abstract_Class.Shooter;
import Game3.Units.Abstract_Class.Unit;

public class Outlaw extends Shooter {
    public static Object r;
    public static int number;
    protected int blockhead= 1;
    protected int knife= 1;    

    public Outlaw(){
        super(7, 11, 6, "Разбойник", 1);        
     }
     @Override
     public void step(ArrayList<Unit> team, ArrayList<Unit> team2) { 
        super.step(team, team2);
         System.out.println("Разбойник: Поделитесь: могу ограбить!");
         
     }
 
 
     public String getInfo() {
        System.out.printf("%s %s: жизнь - %.1f  скорость - %d  Сила атаки - %d,  Дубина - %d, Нож - %d\n",
                this.role, getName(), this.hp, this.speed, this.damage,  this.blockhead, this.arrows);
        return role;
     }
}
