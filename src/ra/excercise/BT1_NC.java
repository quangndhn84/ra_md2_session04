package ra.excercise;

import java.util.Scanner;

public class BT1_NC {
    public static void main(String[] args) {
        //input: oldArray [1,3,5,7,9]: 5 phần tử
        //output: newArray [1,3,7,9]: 4 phần tử
        /*
         * 1. Nhập số phần tử mảng(n) và khai báo mảng số nguyên
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Nhập chỉ số phần tử cần xóa
         *   - Nếu chỉ số <0 thông báo lỗi chỉ số không tồn tại
         *   - Nếu chỉ số >= n thông báo lỗi chỉ số không tồn tại
         *   - Nếu chỉ số trong khoảng [0,n-1] thì thực hiện xóa bằng cách
         *   khởi tạo mảng mới và copy các phần tử không bị xóa sang mảng mới
         * */
        //1. Nhập số phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[size];
        //2. Nhập giá trị các phần tử của mảng
        for (int i = 0; i < size; i++) {
            System.out.printf("oldNumber[%d]=", i);
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi xóa phần tử:");
        for (int element : oldArray) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");

        //3. Nhập chỉ số phần tử cần xóa và thực hiện xóa
        System.out.println("Nhập vào chỉ số phần tử cần xóa:");
        int indexDelete = Integer.parseInt(scanner.nextLine());
        if (indexDelete < 0 || indexDelete >= size) {
            System.err.println("Chỉ số phần tử cần xóa không tồn tại");
        } else {
            //-B1: Khởi tạo mảng mới chứa các phần tử không bị xóa
            int[] newArray = new int[size - 1];
            //-B2: copy toàn bộ các phần tử không bị xóa sang mảng mới
            for (int i = 0; i < size; i++) {
                if (i < indexDelete) {
                    newArray[i] = oldArray[i];
                } else if (i > indexDelete) {
                    newArray[i - 1] = oldArray[i];
                }
            }
            System.out.println("Mảng sau khi xóa phần tử:");
            for (int element : newArray) {
                System.out.printf("%d\t", element);
            }
            System.out.printf("\n");
        }
    }
}
