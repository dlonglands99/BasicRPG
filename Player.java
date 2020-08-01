enum ArmourType {CLOTH, LEATHER, MAIL, PLATE}

class Player {
  protected String name;
  protected int healthPoints;
  protected int level;
  protected ArmourType armourType;

  public Player(String name) {
    this.name = name;
    healthPoints = 100;
    level = 1;
  }

  public void walk() {
    System.out.println(name + " moved forward");
  }

  public void attack() {
    System.out.println(name + " attacks viciously");
  }

  public void sleep() {
    System.out.println(name + " is sleeping");
  }

  public ArmourType getArmourType() {
    return armourType;
  }
}