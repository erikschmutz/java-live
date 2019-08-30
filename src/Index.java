import java.util.*;

/*
  Author: Erik Rehn
  ReadMe: Best usage with Instant Java.
  https://github.com/erikschmutz/java-live

  */

class Index {

  // To install run
  // $npm install
  // To start run
  // $npm start

  public static void main(String[] args) {

    // Template code remove me :)
    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Thanks for using C-LIVE the interactive c-live reloader. We support all native <b>html tags</b> and uses the react native css to make sure everyone is comfortable with the style of the website\n");
    System.out.println("\n");
    System.out.println(
        "To check run program simple install with <p style='color:green'> $ npm install </p> then simple run by  running <p style='color:green'>$ npm start </p>");

    String args1 = scanner.nextLine();
    String args2 = scanner.nextLine();

    System.out.println(args1);
    System.out.println(args2);

    System.out.println("<mark>\nhappy hacking</mark>");
  }
}
