public class insertionSortTest {
    private static int a[] = {4, 6, 12, 8, 3, 2, 1};

    private static void printA(String s) {
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(s);
    }

    private static void sortA() {
        int forDurchlaeufe = 0;
        int whileDurchlaeufe = 0;
        int key;
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            forDurchlaeufe++;
            key = a[j];
            i = j - 1;
            //System.out.println("key: "+key+" i: "+i);

            while (i >= 0 && a[i] > key) {
                whileDurchlaeufe++;
                a[i + 1] = a[i];
                printA("While Schleife");
                i--;
            }
            a[i + 1] = key;
            printA("Ende For Schleife");

        }
        System.out.println("For-Durchläufe: " + forDurchlaeufe + " While-Durchläufe: " + whileDurchlaeufe);

    }

    public static void main(String[] args) {
        System.out.println("");
        printA("Anfangswerte");

        sortA();
    }


}
