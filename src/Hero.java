public class Hero {
    private String name;
    private int hp = 100;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public int getHP() {
        return hp;
    }
    public void introduce() {
        System.out.println("Hero: " + name + "HP: " + hp);
    }
    public void attack(Hero enemy) {
        enemy.hp -= this.damage;

        if (enemy.hp < 0) {
            enemy.hp = 0;
        }
    }
}
