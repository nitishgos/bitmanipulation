public class swap {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.println("Before swap the number is ");
        System.out.println(a);
        System.out.println(b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Before swap the number is ");
        System.out.println(a);
        System.out.println(b);
    }
}
