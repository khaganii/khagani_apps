package Booking_step_project;

public interface DAO<T> {
  void get(int id);
  void getAll();
  void searchAndBook();
  void cancel();
}
