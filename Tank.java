class Tank extends Player {
  
  public Tank(String name) {
    super(name);
    armourType = ArmourType.PLATE;
  }

  @Override
  public void walk() {
    System.out.println(name + " charges forward!");
  }
  
  @Override
  public void attack() {
    System.out.println(name + " attacks the boss, taunting it has they swing!");
  }

  public void AOESlash() {
    System.out.println(name + " throws daggers all around");
  }
}