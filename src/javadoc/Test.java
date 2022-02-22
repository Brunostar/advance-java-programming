public class Test {
    int v = 4;
    public static void main(String[] args) {
        int x = 2, y = 3;
        int z = add(x, y);
        Test t = new Test();
        t.set(6);
        System.out.println(x+'+'+y+'='+z);
    }
    public static int add(int a , int b) {
        int c = a + b;
        return c;
    }
    public void set(int x) { v = x; }
}
