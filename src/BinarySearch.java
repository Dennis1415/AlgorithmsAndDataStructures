public class BinarySearch {

    private static boolean binarySearch(int a[], int l, int r, int element) {
        int mid = (l + r) / 2;
        if (l > r) {
            return false;
        } else if (a[mid] == element) {
            return true;

        } else if (a[mid] > element) {
             return binarySearch(a, l, mid - 1, element); // recursive!
        } else {
            return binarySearch(a, mid + 1, r, element);
        }
    }

    public static void main(String[] args) {
                    //0 1 2 3 4
        int amk[] = {3,6,7,9,10};
    System.out.println(binarySearch(amk, 0,amk.length-1,10));

    }
}
