public class SwapIndexes {

    public static int[] swapIndexes(int[] numbersgiven) {
        for (int index = 0; index < numbersgiven.length - 1; index += 2) {
            int temp = numbersgiven[index];
            numbersgiven[index] = numbersgiven[index + 1];
            numbersgiven[index + 1] = temp;
        }
        return numbersgiven;
    }

    public static void main(String[] args) {
        int[] given = {1, 2, 3, 4, 5, 6};
        int[] result = swapIndexes(given);
        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
