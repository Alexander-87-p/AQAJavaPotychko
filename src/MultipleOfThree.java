public class MultipleOfThree {
    static void findNumbers(int[] array) {
        int multiple = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiple == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 15, 7, 3, 4, 12, 33, 7, 9};
        findNumbers(array);
    }
}
