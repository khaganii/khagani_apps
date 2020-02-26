package Testing;

public class StringTest implements Filterable{

  @Override
  public String filter(String origin){
    origin = origin.toLowerCase().trim();
    String end = "";
    boolean find = false;
    char [] v_chars = {'a', 'e', 'i', 'o', 'u'};
    char [] g_chars = origin.toCharArray();
    for (int i = 0; i < g_chars.length; i++) {
      for (int j = 0; j < 5; j++)
      {
        if(g_chars[i] == v_chars[j])
          find  = true;
      }
      if(!find) end = end + g_chars[i];
      find = false;
    }
    return end.toString();
  }
}
