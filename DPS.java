class DPS extends Player {

  public DPS(String name) {
    super(name);
    armourType = ArmourType.LEATHER;
  }

  @Override
  public void walk() {
    System.out.println(name + " dashes forward!");
  }

  @Override
  public void attack() {
    System.out.println(name + " slices and dices the opponent!");
  }
}