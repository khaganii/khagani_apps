package ArrayListFoundation;


import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListsConcat {
  public static void main(String[] args) {

    final int list_1_length = 10;                                   //initializing
    final int list_2_length = 5;
    ArrayList<Integer> arrayList1;
    ArrayList<Integer> arrayList2;
    ArrayList<Integer> arrayList3;

    arrayList1 = (ArrayList<Integer>) Joiner.listing(list_1_length); //process
    arrayList2 = (ArrayList<Integer>) Joiner.listing(list_2_length);
    arrayList3 = Joiner.checking(arrayList1, arrayList2);

    System.out.println("array_list_1: " + arrayList1);                //printing
    System.out.println("array_list_2: " + Joiner.listing(list_2_length).toString());
    System.out.println("Hash_SET: " + arrayList3.toString());


  }


}
