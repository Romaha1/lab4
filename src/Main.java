public class Main {
    // task 1
    public static void main(String[] args) {
        // використовуємо цикл for
        System.out.println("Використання циклу for:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // використовуємо цикл while
        System.out.println("Використання циклу while:");
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }
        System.out.println();

        // використовуємо цикл do-while
        System.out.println("Використання циклу do-while:");
        int k = 500;
        do {
            System.out.print(k + " ");
            k += 10;
        } while (k <= 650);
        System.out.println();
    }
}
