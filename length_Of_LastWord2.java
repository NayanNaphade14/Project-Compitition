class length_Of_LastWord
{ 
  public int method(String s) 
  {
    if (s.length() == 0) 
    {
      return 0;
    }
    String[] words = s.split(" ");
    int length = 0;
    for (int i = words.length - 1; i >= 0; i--) 
    {
      length = words[i].length();
      if (length > 0) 
      {
        break;
      }
    }
    return length;
  }
}

public class length_Of_LastWord2   
{
public static void main(String[] args)
 {
        length_Of_LastWord z1 = new length_Of_LastWord();
        System.out.println(z1.method("Welcome!! to CDAC MUMBAI"));
 }

}