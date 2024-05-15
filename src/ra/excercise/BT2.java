package ra.excercise;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        //Thêm 1 phần tử vào mảng
        //input: [1,2,3,4 ,5,0,0,0]
        //        //Thêm 1 phần tử 9vào chỉ số 2
        //output: [1,2,9,3,4,5,0,0]
        int[] numbers = {1, 2, 3, 4, 5, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị cần thêm:");
        int element = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chỉ số chèn phần tử vào mảng:");
        int indexInsert = Integer.parseInt(scanner.nextLine());
        if (indexInsert < 0 || indexInsert >= numbers.length) {
            System.err.println("Chỉ số thêm phần tử không tồn tại trong mảng");
        } else {
            //Đẩy các phần tử từ chỉ số cần chèn ra sau
            for (int i = numbers.length - 2; i >= indexInsert; i--) {
                numbers[i + 1] = numbers[i];
            }
            numbers[indexInsert] = element;
        }
        System.out.println("Mảng sau khi thêm phần tử:");
        for (int number : numbers) {
            System.out.printf("%d\t", number);
        }
        System.out.printf("\n");
    }
}
