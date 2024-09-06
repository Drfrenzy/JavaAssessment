public class Divisible{
    public static void main(String...args) {
        int start = 100;
        int end = 200;
        int per_line = 10;
        int count = 0;

        for (int i = start; i <= end; i++) {
            
            if ((i % 3 == 0) ^ (i % 4 == 0)) {
                System.out.print(i + " ");
                count++;
                
                if (count % per_line == 0) {
                    System.out.println();
                }
            }
        }
    }
}
