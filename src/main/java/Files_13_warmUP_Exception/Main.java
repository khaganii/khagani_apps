package Files_13_warmUP_Exception;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    ArrayList<String> sentences = new ArrayList<>();
    ArrayList<String> subj_verb = new ArrayList<>();
    ArrayList<String> verb_obj = new ArrayList<>();
    HashMap <String, List<String>> hashMap1 = new HashMap();
    HashMap <String, List<String>> hashMap2 = new HashMap();
    File file1 = new File("src\\main\\java\\Files_13_warmUP_Exception\\subj_verb_.txt");
    File file2 = new File("src\\main\\java\\Files_13_warmUp_Exception\\ver_obj_.txt");
    File file3 = new File("src\\main\\java\\Files_13_warmUp_Exception\\sentence.txt");

    //read from subj_verb.txt;
    subj_verb.addAll(readFromFile(file1));
    //read from verb_obj.txt;
    verb_obj.addAll(readFromFile(file2));

    //split List and pick up elements of HashMap1
    hashMap1.putAll(splitting(subj_verb));

    //split List and pick up elements of HashMap2
    hashMap2.putAll(splitting(verb_obj));

    //Getting sentences in a list
    sentences.addAll(makingSentence(hashMap1, hashMap2));

    //WriteToFile
    writeToFile(file3, sentences);
  }

  public static List<String> readFromFile(File file) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    List<String> read = new ArrayList<>();
    try{
      while ((st = br.readLine()) != null){
        read.add(st);
      }
      br.close();
      return read;
    }
    catch (Exception e){
      System.out.println("File not Found! " + e);
      return read;
    }
  }

  public static HashMap<String, List<String>> splitting(List<String> list){
    HashMap<String, List<String>> hashMap  = new HashMap<>();

    String key;
    for (int i = 0; i < list.size(); i++) {
      List <String> list1 = new ArrayList<>();
      String [] sp = list.get(i).split(":");
      String[] sp1 = sp[1].trim().split(",");
      key = sp[0].trim();
      for (int j = 0; j < sp1.length; j++) {
          list1.add(sp1[j].trim());
      }
      hashMap.put(key, list1);
    }
    return hashMap;
  }

  public static List<String> makingSentence(HashMap<String, List<String>> hashMap1, HashMap<String, List<String>> hashMap2){
    ArrayList<String> list = new ArrayList<>();
    String line;
    for (String s: hashMap1.keySet()) {
      for (String v: hashMap1.get(s)) {
        for (String o: hashMap2.get(v)) {
          list.add((s + " " + v + " " + o));
        }
      }
    }
    return list;
  }

  public static void writeToFile(File file, List<String> list) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (String a: list) {
      bw.write(a);
      bw.write("\n");
    }
    bw.close();
  }
}
