public class Linear_Search2 {
    public static void main(String[] args) {
        int[] num = {1,2,5,6,4,3,7};

        int n = 4;
      int ans = search(num,n);
        System.out.println(ans);
    }



static int search(int[] arr,int n){


    if (arr.length == 0) {
        return 0;

    }
    for (int i = 0; i < arr.length ; i++) {
        int element = arr[i];
        if (element == n) {
            return element;

        }

    }
    return 0;
    }

}
