package Booking_step_project;

import Testing.Main;

import java.util.Scanner;

public class Menu_operations {
  public int enter_number() {
    int number = 0;
    System.out.print("Enter your selection: ");
    boolean t = true;
    while (t) {
      try {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        t = false;
      } catch (Exception e) {
        System.out.println("Try again!");
      }
    }
    return number;
  }

  Main_Menu main_menu = new Main_Menu();
  public void switchOperation() {
    switch (enter_number()) {
      case 1:

        break;
      case 2:
        System.out.println("item2");
        break;
      case 3:
        System.out.println("item3");
        break;
      case 4:
        System.out.println("item4");
        break;
      case 5:
        System.out.println("item5");
        break;
      case 6:
        System.out.println("\n\n\nThanks for choosing us!\n\n\n");
        break;
      default:
        System.out.println("Please, Enter correct number!");
        switchOperation();
    }
  }
}

