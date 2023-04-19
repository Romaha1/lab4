public class Main1 {
    //task 2
    public static void main(String[] args) {
        int a = 2;
        int result = 0;
        while (result < 5000) {
            result = 2 * a - 1;
            System.out.print(result + " ");
            a++;
        }
    }
}
