package Working_files_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task_2 {
  public static void main(String[] args) throws IOException {

    File file1 = new File("C://Users//khagani//Desktop//file1.txt");
    File file2 = new File("C://Users//khagani//Desktop//file2.txt");
    List<Pair> randoms = new ArrayList<>();
    List<Pair> randoms_2 = new ArrayList<>();
    List<Integer> randoms_sorted = new ArrayList<>();

    writeToFile(generate_randoms(randoms) , file1);
    readFromFile(randoms_2, file1);
    randoms_sorted.addAll(sorting(randoms_2));
    WriteToFile(randoms_sorted , file2);
  }

  public static List<Pair> generate_randoms(List<Pair> randoms)
  {
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      randoms.add(new Pair(random.nextInt(60), random.nextInt(60)));
    }
    return randoms;
  }

  public static void writeToFile(List<Pair> randoms, File file) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (int i = 0; i < randoms.size(); i++) {
      bw.write(String.valueOf(randoms.get(i).x));
      bw.write(":");
      bw.write(String.valueOf(randoms.get(i).y));
      bw.write("\n");
    }
    bw.close();
  }

  public static void WriteToFile(List<Integer> randoms, File file) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (int i = 0; i < randoms.size(); i++) {
      bw.write(String.valueOf(randoms.get(i)));
      bw.write("\n");
    }
    bw.close();
  }

  public static void readFromFile(List<Pair> randoms_2, File file) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    String [] a;
    while ((st = br.readLine()) != null)
    {
      a = st.split(":");
      randoms_2.add(new Pair(Integer.parseInt(a[0]), Integer.parseInt(a[1])));
    }
    br.close();
  }


  public static List<Integer> sorting(List<Pair> randoms_2)
  {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < randoms_2.size(); i++) {
      list.add(randoms_2.get(i).x);
      list.add(randoms_2.get(i).y);
    }
    Collections.sort(list);
    return list;
  }

}

