
class Shortest_subarray {
    
        public int method1(int[] a1)
        {
            int n = a1.length,l = 0, r = n - 1;

            while (l < n - 1 && a1[l] <= a1[l + 1])
                {
                    l++;
                }
            if (l == n - 1)
                {
                    return 0;
                } 
            while (r >= l && a1[r] >= a1[r - 1])
                {
                    r--;
                }
            int res = Math.min(n - 1 - l, r);

            int i = 0,j = r;
            while (i <= l && j < n)
                {
                if (a1[j] >= a1[i])
                {
                    res = Math.min(res, j - i - 1);
                    i++;
                } 
                else 
                {
                    j++;
                }
            }

            return res;
        }
    
}
public class shortest_subarray2   
{
public static void main(String[] args)
 {
    int a[]=new int [5];
    a[0]=1;
    a[1]=2;
    a[2]=9;
    a[3]=8;
    a[4]=4;
    Shortest_subarray s1 = new Shortest_subarray();
     System.out.println("length of shortest subarray we can remove : " + s1.method1(a));
 }
}