package Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTes1 {
  private Filterable task;
  @BeforeEach
  void setUp(){
    this.task = new StringTest();
  }

  @Test
  void filter6() {
    String origin = "Sometimes to understand a word's meaning you need more than a definition.";
    String expected = "smtms t ndrstnd  wrd's mnng y nd mr thn  dfntn.";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }


}