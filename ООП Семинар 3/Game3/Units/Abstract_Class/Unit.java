package Game3.Units.Abstract_Class;

import java.util.ArrayList;
import java.util.Random;




public abstract  class Unit implements Unitinterfase {
    protected Random rend = new Random();
    public float hp;
    protected int speed;
    protected int damage;
    protected String role;

       

    public Unit(float hp, int speed, int damage, String role){
        this.hp= hp;
        this.speed= speed;
        this.damage= damage;
        this.role= role;
              
    }

    public int getSpeed(ArrayList<Unit> team){
        return this.speed;
    }


    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) {           
             
    }

    public void getDamage(int damage) {
        if(this.hp - damage > 0){
             this.hp -= damage;
        } else
        this.hp= 0;          
    }

    public void attack(Unit target, int damage) {
        int newDamage = rend.nextInt(1, damage);
        System.out.printf("%s атакует ", getInfo());
        //System.out.printf("%s атаковал %s ", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Сила атаки %d \n", newDamage);
        
        target.getDamage(newDamage);
        System.out.printf("%s Атакован, результат строка выше\n",target.getInfo());
    }

   

    @Override
    public String getInfo() {
     
        return null;
    }

    public final static  String getName(){      
        return Names.values() [new Random().nextInt(Names.values().length)].toString();        
     }
 
   

    public Object getSpeed() {
        return null;
    }

  
}
