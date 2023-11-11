package testTask;

public class TaskThree {
    public void multipleOfThree() {
        int[] arr = {1, 15, -10, 57, 81};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
