package Booking_step_project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Flights implements DAO<Flights>{
  ArrayList<Flights> flyarraylist = new ArrayList<>();
  int id;
  String from;
  String to;
  String time;
  int seats;

  Flights(int id, String from, String to, String time, int seats){
    this.id = id;
    this.from = from;
    this.to = to;
    this.time = time;
    this.seats = seats;
  }
  @Override
  public void get(int id) {
    for (Flights flight: flyarraylist) {
      if (flight.id == id) System.out.println(represent(flight));
    }
  }

  @Override
  public void getAll() {
    for (Flights flight: flyarraylist) {
      System.out.println(represent(flight));
    }
  }

  @Override
  public void searchAndBook() {

  }

  @Override
  public void cancel() {

  }

  public void read() {
    ArrayList<String> arrayList = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader("all_flights.txt"));
      String st;
      while ((st = br.readLine()) != null)
      {
        arrayList.add(st);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    makeFlight(arrayList);
  }

  public void write() {

  }

  public String represent(Flights flight){
    String rep = "Flight ID: " + flight.id + " , From " + flight.from + " To " + flight.to + " , Date: " + flight.time + " , free seats: " + flight.seats;
    return rep;
  }

  public void makeFlight(List<String> list){
    for (int i = 0; i < list.size(); i++) {
      String [] arr = list.get(i).split(":");
      flyarraylist.add(new Flights(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4])));
    }
  }
}
