package Game3.Units.Abstract_Class;

import java.util.ArrayList;



public abstract class Shooter extends Unit {
   
    protected int arrows;

    public Shooter(float hp, int speed, int damage, String role, int arrows){
        super( hp, speed, damage, role);
        this.arrows= arrows;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) {
        super.step(team, team2);
        if(this.arrows >0 && this.hp >0){
            for(Unit unit: team){
                if(unit.hp > 0 && this.arrows > 0){
                   this.attack(unit, this.damage);
                   this.arrows--;
                    break;
                   
                }
            this.getArrow(team2);
           
            }
         
         System.out.println("После атаки стрел осталось: "+ String.valueOf(this.arrows));
       }     
         
    }

    public void getArrow( ArrayList<Unit> team2){
         for(Unit unit: team2){
        if(unit.getInfo().equals("Peasant")){
            this.arrows++; 
            break;                      
            }          
        }  
           System.out.println("Нашел крестьянина, теперь стрел: "+ String.valueOf(this.arrows)); 
    }

   @Override
   public String toString(){
    return "Стрел"+ String.valueOf(arrows);
   }


  

}
