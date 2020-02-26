package ArrayListFoundation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Joiner {

  public static ArrayList<Integer> checking(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
    HashSet <Integer> hashSet = null;
    for (Integer integer : arrayList1) { //process
      hashSet.add(integer);
    }
    for (Integer integer : arrayList2) { //process
      hashSet.add(integer);
    }
    return new ArrayList<>(hashSet);
  }

  public static List<Integer> listing(int length){
    ArrayList <Integer> arrayList1 = new ArrayList<>();
    filling(arrayList1,length);
    return arrayList1;
  }

  public static int randomGenerate(){
    Random random = new Random();
    return random.nextInt(10);
  }

  public static void filling(ArrayList<Integer> arrayList, int number) {
    for(int i = 0; i < number;i++)
      arrayList.add(randomGenerate());
  }
}
