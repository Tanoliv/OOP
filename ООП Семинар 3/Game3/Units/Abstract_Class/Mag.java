package Game3.Units.Abstract_Class;

public abstract class Mag extends Unit {

    protected int mana;
    protected int medicines;

    public Mag(float hp, int speed, int damage, int mana, int medicines, String role) {
        super(hp, speed, damage, role);
        this.mana= mana;
        this.medicines= medicines;
        
    }
    
}
