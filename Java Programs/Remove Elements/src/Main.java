public class Main {
    public static int RemoveElement(int arr[], int value) {
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != value) {
                arr[left] = arr[right];
                left++;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int value = 3;
        int arr[] = {3, 2, 2, 3};

        int newLength = RemoveElement(arr, value);

        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}