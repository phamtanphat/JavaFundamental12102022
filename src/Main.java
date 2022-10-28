
public class Main {
    public static void main(String[] args) {
//         Câu lệnh in ra hệ thống
//         System.out.println("Hello Word");
//
//         1: Kiểu dữ liệu
//         Kiểu dữ liệu nguyên thủy (Primitive)
//         Ex: char, int, long, float, double, boolean
//         Kiểu dữ liệu đối tượng (Object)
//         Ex: String, Integer, Long, Float, Double, Boolean
//
//         2: Khai báo biến
//        char word = 'a';
//        int number1 = -1;
//        float number2 = 1.2f;
//        boolean isOnline = true;

//         tên, tuoi, so thich, chieucao
//        String name = "Phạm Tấn Phát";
//        int age = 28;
//        String hobby = "code";
//        float height = 1.75f;
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(hobby);
//        System.out.println(height);

//          3: Toán tử
//        int a = 10;
//        int b = 5;
//        int result = b % a;
//        System.out.println(result);

//        int a = 5;
//        int b = 5;
//        int result = a++ - --b + b-- + a-- - a++ + b++ - b--;
//         5 - --b + b-- + a-- - a++ + b++ - b--; a = 6, b = 5
//         5 - 4 + b-- + a-- - a++ + b++ - b--; a = 6, b = 4
//         5 - 4 + 4 + a-- - a++ + b++ - b--; a = 6, b = 3
//         5 - 4 + 4 + 6 - a++ + b++ - b--; a = 5, b = 3
//         5 - 4 + 4 + 6 - 5 + b++ - b--; a = 6, b = 3
//         5 - 4 + 4 + 6 - 5 + 3 - b--; a = 6, b = 4
//         5 - 4 + 4 + 6 - 5 + 3 - 4; a = 6, b = 3

//         a = 6, b = 3, result = 5
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(result);

//         Toán tử ++
//         Th1: a++
//         1: Gán giá trị vào cho a
//         2: Tăng a lên 1 đơn vị
//         Th2: ++a
//         1: Tăng a lên 1 đơn vị
//         2: Gán giá trị vào cho a


//        4: Câu điều kiện if

//        int year = 392;
//
//         Tính xem năm trên có phải là năm nhuần hay không
//         Xuất ra thông báo

//        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
//            System.out.println("Là năm nhuận");
//        } else {
//            System.out.println("Là năm không nhuận");
//        }

        // Tính chỉ số bmi và đưa ra kết luận cơ thể
        // Công thức bmi = cân nặng (kg) / chiều cao (m) * chiều cao (m)

//        float weight = 75f;
//        float height = 1.75f;
//        float bmi = weight / (height * height);
//
//        String message = "";
//        if (bmi < 18.5) {
//            message = "Phân loại: Gầy";
//        } else if (bmi <= 24.9) {
//            message = "Phân loại: Bình thường";
//        } else if (bmi <= 29.9) {
//            message = "Phân loại: Hơi béo";
//        } else if (bmi <= 34.9) {
//            message = "Phân loại: Béo cấp 1";
//        } else if (bmi <= 39.9) {
//            message = "Phân loại: Béo cấp 2";
//        } else {
//            message = "Phân loại: Béo cấp 3";
//        }
//        System.out.println("Chỉ số bmi của bạn: " + bmi);
//        System.out.println(message);

//        5: Câu điều kiện switch case

//        int month = 5;

        // break : thoát khỏi switch case, vòng lặp
//        switch (month) {
//            case 5:
//                System.out.println("Quý 1");
//                break;
//            case 2:
//                System.out.println("Quý 2");
//                break;
//            default:
//                System.out.println("Không rơi vào trường hợp trên");
//        }

//        6: Vòng lặp for -> Duyệt dữ liệu để xử lý

//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // Cho vòng lặp chạy từ 1 -> 100
        // Chỉ in ra số chẳn
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // Cho vòng lặp chạy từ 100 -> 1
        // In ra số chia hết cho 3

        // Cho 1 số ngẫu nhiên
        // Kiểm số đó có phải số nguyên tố hay không

//        int number = 10512;
//
//        if (number < 2) {
//            System.out.println("Không phải là số nguyên tố");
//        } else {
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    System.out.println("Không phải là số nguyên tố");
//                    return;
//                }
//            }
//
//            System.out.println("Số " + number + " là số nguyên tố");
//        }

//        7: Vòng lặp while
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời bạn nhập năm sinh: ");
//        int year = scanner.nextInt();
//
//        do {
//            if (year > 0){
//                System.out.println("Bạn " + (2022 - year) + " tuổi");
//            } else {
//                System.out.println("Mời bạn nhâp lại: ");
//                year = scanner.nextInt();
//                if (year > 0) {
//                    System.out.println("Bạn " + (2022 - year) + " tuổi");
//                }
//            }
//        }while (year <= 0);

        // Object va class

        Animal meo = new Animal("Milu", "0.1m", "2kg");
        Animal meo1 = new Animal("Aka", "0.12m", "3kg");

        Cat cat = new Cat("Kity", "0.13m", "1.5kg", "gray");
        cat.showInfo();
        // Access modifier (Phạm vi truy cập)
        // Tính đóng gói
        // Tính kế thừa
        // Tính đa hình
        // Tính trườu tượng

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(new PizzaCheese());

    }
}


