package ArrayListFoundation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Joiner {

  public ArrayList<Integer> checking(List<Integer> arrayList1, List<Integer> arrayList2){
    HashSet <Integer> hashSet = new HashSet<>();
    //process
    hashSet.addAll(arrayList1);
    //process
    hashSet.addAll(arrayList2);
    return new ArrayList<>(hashSet);
  }

}
