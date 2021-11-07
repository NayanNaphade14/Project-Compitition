class zigzag_pattern{ 
    public String method(String s, int Rows) 
    {
        if (s.length() == 0) 
        {
            return "invalid string";
        }
        char[] sc = s.toCharArray();
        int len = s.length();
        StringBuffer[] sb = new StringBuffer[Rows];

        for (int i = 0; i < Rows; i++) 
        {
            sb[i] = new StringBuffer();
        }
        int index = 0;
        while (index < len) 
        {
            for (int i = 0; i < Rows && index < len; i++) 
            {
                sb[i].append(sc[index++]);
            }
            for (int i = Rows - 2; i >= 1 && index < len; i--) 
            {
                sb[i].append(sc[index++]);
            }
        }

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < Rows; i++) 
        {
            res.append(sb[i]);
        }

        return res.toString();
    }
}
public class Zigzag_pattern2   
{
public static void main(String[] args)
 {
        zigzag_pattern z1 = new zigzag_pattern();
        System.out.println(z1.method("CDAC_MUMBAI",3));
 }

}