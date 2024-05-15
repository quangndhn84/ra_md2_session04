package ra.excercise;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        //Xóa phần tử trong mảng
        //Input: [1,3,5,0,0,0]: 6 phần tử
        //Xóa phần tử có chỉ số 1 --> pt giá trị 3
        //Output: [1,5,0,0,0,0]
        //B1: Nhập số phần tử(n), khai báo mảng gồm n phần tử số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[length];
        //B2: Nhập giá trị cho các phần tử (m<n)
        System.out.println("Nhập vào số phần tử cần nhập dữ liệu:");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.printf("numbers[%d]=", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi xóa:");
        for (int element : numbers) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");
        //B3: Xóa phần tử có chỉ số index<m
        System.out.println("Nhập vào chỉ số phần tử cần xóa:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < size) {
            //thực hiện xóa phần tử có chỉ số index
            for (int i = index; i < size - 1; i++) {
                numbers[index] = numbers[index + 1];
            }
            //Gán phần tử có giá trị cuối cùng bằng 0
            numbers[size - 1] = 0;
        }
        System.out.println("Mảng sau khi xóa phần tử:");
        for (int element : numbers) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");
    }
}
