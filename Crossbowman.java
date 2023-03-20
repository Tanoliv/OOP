

public class Crossbowman extends Shooter {
    
    public Crossbowman(){
        super(50, 6, 8, 56);
    }

    public String getInfo() {
        return String.format("Арбалетчик: жизнь - %.1f  скорость - %d  Атаки - %d, Стрелы - %d",
                this.hp, this.speed, this.damage, this.arrows);
    }

}
