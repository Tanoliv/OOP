package Gaim2.Units.Abstract_Class;

import java.util.Random;



public abstract  class Unit implements Unitinterfase {
    protected float hp;
    protected int speed;
    protected int damage;
    protected String role;      

    public Unit(float hp, int speed, int damage, String role){
        this.hp= hp;
        this.speed= speed;
        this.damage= damage;
        this.role= role;
              
    }

    @Override
    public void step() {
        System.out.println();        
    }

    @Override
    public String getInfo() {
     
        return null;
    }

    public static  String getName(){      
        return Names.values() [new Random().nextInt(Names.values().length)].toString();        
     }
  
}
