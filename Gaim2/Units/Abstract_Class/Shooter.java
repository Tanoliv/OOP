package Gaim2.Units.Abstract_Class;

public abstract class Shooter extends Unit {
   
    protected int arrows;

    public Shooter(float hp, int speed, int damage, String role, int arrows){
        super( hp, speed, damage, role);
        this.arrows= arrows;
    }

   

  

}
