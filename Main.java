import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
    System.out.println ("What is your players name?");
    String name = scan.next();
    System.out.println ("What is your players number?");
    int num = scan.nextInt();
    int aLayup = 2;
    if (aLayup == 2) {
      System.out.println("You did a slam dunk!!");
        System.out.println("What is the name of your celebration?");
      String output = scan.next();
      System.out.println("Nice that's so cool!");
    } else {
      System.out.println("You missed the shot");

    }
  }
}