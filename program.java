
      
        
public class program {   

    public static void main(String[] args) {    
        Sniper sniper = new Sniper();       
        Crossbowman crossbowman = new Crossbowman();       
        Pikeman pikeman = new Pikeman();
        Outlaw outlaw = new Outlaw();
        Peasant peasant = new Peasant();
        Monk monk = new Monk();
        Magician magician = new Magician();

        System.out.println(sniper.getInfo());
        System.out.println(crossbowman.getInfo());
        System.out.println(pikeman.getInfo());
        System.out.println(outlaw.getInfo());
        System.out.println(peasant.getInfo());
        System.out.println(monk.getInfo());
        System.out.println(magician.getInfo());
    }   
}
