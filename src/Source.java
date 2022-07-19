public class Source {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        System.out.println(paperWork(n,m)==25);
    }
    public static int paperWork(int n, int m)
    {
        return (n>0 && m >0)? n*m : 0;
    }
}
