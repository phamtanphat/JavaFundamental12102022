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

        int a = 5;
        int b = 5;
        int result = a++ - --b + b-- + a-- - a++ + b++ - b--;
        // 5 - --b + b-- + a-- - a++ + b++ - b--; a = 6, b = 5
        // 5 - 4 + b-- + a-- - a++ + b++ - b--; a = 6, b = 4
        // 5 - 4 + 4 + a-- - a++ + b++ - b--; a = 6, b = 3
        // 5 - 4 + 4 + 6 - a++ + b++ - b--; a = 5, b = 3
        // 5 - 4 + 4 + 6 - 5 + b++ - b--; a = 6, b = 3
        // 5 - 4 + 4 + 6 - 5 + 3 - b--; a = 6, b = 4
        // 5 - 4 + 4 + 6 - 5 + 3 - 4; a = 6, b = 3

        // a = 6, b = 3, result = 5
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);

        // Toán tử ++
        // Th1: a++
        // 1: Gán giá trị vào cho a
        // 2: Tăng a lên 1 đơn vị
        // Th2: ++a
        // 1: Tăng a lên 1 đơn vị
        // 2: Gán giá trị vào cho a


    }
}


