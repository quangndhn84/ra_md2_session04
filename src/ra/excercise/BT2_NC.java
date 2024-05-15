package ra.excercise;

import java.util.Scanner;

public class BT2_NC {
    public static void main(String[] args) {
        /*
         * Chèn 1 phần tử vào mảng
         * 1. Nhập số phần tử(n) và khai báo mảng (oldArray)
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Nhập giá trị, chỉ số phần tử cần chèn vào mảng
         * 4. Chèn phần tử vào mảng
         *   - Khai báo mảng mới có (n+1) phần tử (newArray)
         *   - Copy và chèn phần tử mới vào mảng mới
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("oldArray[%d]=", i);
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập vào giá trị phần tử cần chèn:");
        int element = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chỉ số cần chèn:");
        int indexInsert = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[size + 1];
        //Copy các phần tử cũ và chèn phần tử vào mảng mới
        if (indexInsert < 0 || indexInsert >= size) {
            System.err.println("Chỉ số phần tử cần chèn không tồn tại");
        } else {
            for (int i = 0; i <= size; i++) {
                if (i < indexInsert) {
                    newArray[i] = oldArray[i];
                } else if (i == indexInsert) {
                    newArray[i] = element;
                } else {
                    newArray[i] = oldArray[i-1];
                }
            }
        }
        System.out.println("Mảng sau khi chèn phần tử:");
        for (int number : newArray) {
            System.out.printf("%d\t", number);
        }
        System.out.printf("\n");
    }
}
