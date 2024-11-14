public abstract class Enemy {
    private final String name;
    private int health;
    private final String skill1;
    private final String skill2; 
    private final String skill3; 
 
    public Enemy(String name, int health, String skill1) {
        this.name = name;
        this.health = health;
        this.skill1 = skill1;
        this.skill2 = null;
        this.skill3 = null; 
    }
 
    public Enemy(String name, int health, String skill1, String skill2) {
        this.name = name;
        this.health = health;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = null; 
    }
    
    public Enemy(String name, int health, String skill1, String skill2, String skill3) {
        this.name = name;
        this.health = health;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
    }
 
    public String getName() {
        return this.name;
    }
 
    public int getHealth() {
        return this.health;
    }
 
    public void setHealth(int health) {
        this.health = health;
    }
 
    public String getSkill1() {
        return this.skill1;
    }
    
    public String getSkill2() {
        return this.skill2; // Can return null if no second skill
    }
 
    public String getSkill3() {
        return this.skill3; // Can return null if no third skill
    }
 }