public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        System.out.println("Задание 2");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length ) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n" + "Задание 3");
        for (int i = arr3.length-1;i>=0; i--) {
            System.out.print(", "+arr3[i]);}


            System.out.println("\n"+"Задание 4");
        for (int i = 0; i < arr3.length;i++) {
            if (arr3[i] % 3 == 0) {
                arr3[i]=arr3[i]+1;
                System.out.print(", "+arr3[i]);
            }
        }









    }
}







