public class Card {
    private Integer damages;
    private String name;
    private Double health;

    public Card(String name, Double health, Integer damages) {
        this.damages = damages;
        this.name = name;
        this.health = health;

    }
    public Integer getDamages() {
        return damages;
    }
    public String getName() {
        return name;
    }
    public Double getHealth() {
        return health;
    }
    public void setDamages(Integer newDamages) {
        this.damages = newDamages;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setHealth(Double newHealth) {
        this.health = newHealth;
    }
    


}
