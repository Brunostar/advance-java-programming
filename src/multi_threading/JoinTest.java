package multi_threading;

public class JoinTest {
    public static void main(String args[]) throws Exception{
        int a[] = {2,3,4,0,1}, b[] = {6,9,8,7,5};
        JoinDemo.MyThread t1 = new JoinDemo.MyThread(a);
        JoinDemo.MyThread t2 = new JoinDemo.MyThread(b);
        t1.join();
        t2.join();
        int result[] = merge(a,b);
        for (int i=0; i<result.length; i++)
            System.out.print(result[i]+" ");
    }
    static int[] merge(int[] a, int[] b) {
        int i=0, j=0, k=0;
        int[] result = new int[a.length+b.length];
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) result[k++]=a[i++];
            else result[k++] = b[j++];
        }
        while(i<a.length) result[k++] = a[i++];
        while(j<b.length) result[k++] = b[j++];
        return result;
    }
}
