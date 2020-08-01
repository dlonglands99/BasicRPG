import java.util.Scanner;

class Game {

  private Player player;
  private String playerName;
  private String playerClass;
  private Scanner scanner = new Scanner(System.in);

  public void start() {
    init();
    play();
  }

  public void init() {
    selectClass();
    selectName();
    createCharacter();
  }

  private void selectClass() {
    System.out.println("Please pick a class. \n" +
                      "Press 't' for tank \n" +
                      "Press 'h' for healer\n" +
                      "Press 'd' for dps");
    playerClass = scanner.nextLine();
  }

  private void selectName() {
    System.out.println("Please enter your name");
    playerName = scanner.nextLine();
  }

  private void createCharacter() {
    switch (playerClass) {
      case "t":
      player = new Tank(playerName);
      break;
      case "h":
      player = new Healer(playerName);
      break;
      case "d":
      player = new DPS(playerName);
      break;
      default:
      player = new Player(playerName);
    }
  }

  private void play() {
    boolean exit = false;
    String action = "";
    while (exit == false) {
        System.out.println("Press 'w' to walk, 'a' to attack or 's' to sleep\n" +
                          "Press any other key to exit");
        action = scanner.nextLine();
        switch(action) {
          case "a":
          player.attack();
          break;
          case "s":
          player.sleep();
          break;
          case "w":
          player.walk();
          break;
          default:
          exit = true;
        }
    }
  }
}