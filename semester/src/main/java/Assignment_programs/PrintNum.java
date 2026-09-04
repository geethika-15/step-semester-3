package Assignment_programs;

    public class PrintNum {

        static void printNumbersUpToN(int n) {
            for (int i = 1; i <= n; i++)
                System.out.print(i + " ");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            printNumbersUpToN(n);

            sc.close();
        }
    }
}
