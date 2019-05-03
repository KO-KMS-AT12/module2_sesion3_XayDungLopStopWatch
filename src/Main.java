
public class Main {
    public static void main(String[] args) {

        int[] arr = randomArray();

        StopWatch watch = new StopWatch();

        watch.start();
        System.out.println("Thoi gian bat dau chay ham selection sort(millis): "+watch.getStartTime());

        selectionSort(arr);

        watch.end();
        System.out.println("Thoi gian chay xong ham selection sort(millis): "+watch.getEndTime());

        System.out.println("Khoang thoi gian chay ham selection sort(millis): "+watch.getElapsedTime());
    }

    static int[] randomArray() {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            int rd = (int) Math.round(Math.random()) * 9 + i;
            arr[i] = rd;
        }
        return arr;
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
