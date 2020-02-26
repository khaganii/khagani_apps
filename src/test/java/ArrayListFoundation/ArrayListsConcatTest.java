package ArrayListFoundation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListsConcatTest {
  private Joiner task;
  @BeforeEach
  void setUp(){
    this.task = new Joiner();
  }

  @Test
  void list1() {
    List <Integer> original1 =  Arrays.asList(1,3,5);
    List <Integer> original2 =  Arrays.asList(3,5,7);
    List<Integer> expected = Arrays.asList(1,3,5,7);
    ArrayList <Integer> actual = task.checking(original1, original2);
    assertEquals(expected, actual);
  }

}