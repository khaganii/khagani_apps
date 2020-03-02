package File_working;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Files {
  public static void main(String[] args) throws IOException {
    File file1 = new File("C://Users//khagani//Desktop//file1.txt");
    File file2 = new File("C://Users//khagani//Desktop//file2.txt");
    List<Integer> randoms = new ArrayList<>();
    List<Integer> randoms_2 = new ArrayList<>();
    List<Integer> randoms_sorted = new ArrayList<>();

    writeToFile(generate_randoms(randoms) , file1);
    readFromFile(randoms_2, file1);
    randoms_sorted.addAll(sorting(randoms_2));
    writeToFile(randoms_sorted , file2);
  }

  public static List<Integer> generate_randoms(List<Integer> randoms)
  {
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      randoms.add((random.nextInt(60)+30));
    }
    return randoms;
  }

  public static void writeToFile(List<Integer> randoms, File file) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (int num: randoms) {
      bw.write(String.valueOf(num));
      bw.write("\n");
    }
    bw.close();
  }

  public static void readFromFile(List<Integer> randoms_2, File file) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    while ((st = br.readLine()) != null)
      randoms_2.add((Integer.parseInt(st)));
    br.close();
  }

  public static List<Integer> sorting(List<Integer> randoms_2)
  {
    Collections.sort(randoms_2);
    return randoms_2;
  }

}

