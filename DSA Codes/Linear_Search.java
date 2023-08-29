public class Linear_Search {
    public static void main(String[] args) {
int[] num = {1,2,3,5,6,7,4,3,12};

int n = 12;

 int ans = search(num,n);
        System.out.println(ans);
    }

    static int search(int[] arr, int n) {

        if (arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == n) {
                return i;

            }
        }
        return 0;
    }
}
