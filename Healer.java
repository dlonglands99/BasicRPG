class Healer extends Player {

  protected int manaPoints;

  public Healer(String name) {
    super(name);
    armourType = ArmourType.CLOTH;
    manaPoints = 100;
  }

  @Override
  public void walk() {
    System.out.println(name + " glides forward.");
  }

  @Override
  public void attack() {
    System.out.println(name + " attcaks the enemy with a light cast.");
  }

  public void heal() {
    System.out.println(name + " heals her friends with a massive AOE ability.");
  }

}