package Console_Calculator;

import java.util.Scanner;

public class MakeNumber {
  public static void main(String[] args) {
    String a = "";
    Scanner sc = new Scanner(System.in);
      while (true)
      {
        if ("quit".equals(a.toLowerCase()))
          break;
        System.out.println("enter your String! \n ");
        a = sc.nextLine().trim();
        calculate(a);
      }
  }
  public static void calculate(String a)
  {
    int num1 = 0;
    int num2 = 0;
    String sub="";
    String op = "*/-+";
    char operator=' ';
    char [] ch_mas = a.toCharArray();
    for (int i = 0; i<ch_mas.length; i++) {
      boolean contains = op.contains(String.valueOf(ch_mas[i]));
      if(!contains){
        sub += ch_mas[i];
      }
      else
      {
        operator = ch_mas[i];
        num1 = parsing(sub.trim());
        num1 = num1 * (-1);
        sub = "";
      }
    }
    num2 = parsing(sub.trim());
    total_calculate(num1, num2, operator);
  }
  public static void total_calculate(int num1, int num2, char operator){
    int total = 0;
    switch (operator)
    {
      case '+':
        total = num1+num2;
        break;
      case '-':
        total = num1-num2;
        break;
      case '/':
        if(num2 != 0) total = num1/num2;
        else throw new IllegalArgumentException("Argument 'divisor' is 0");
        break;
      case '*':
        total = num1*num2;
        break;
      default:
        System.out.println("You have not selected the operator!");
    }
    System.out.println("Total: " + total);
  }
  public static int parsing(String a)
  {
    try {
      return Integer.parseInt(a);
    }
    catch (Exception e) {
      throw new IllegalArgumentException("Parsing error");
    }
  }
}
