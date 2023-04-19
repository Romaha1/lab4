public class Main3 {
    // task 4
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
    }

//    public static void main(String[] args) {
//        int number = 10;
//        int factorial = 1;
//        int i = 1;
//        while (i <= number) {
//            factorial *= i;
//            i++;
//        }
//        System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
//    }
}
