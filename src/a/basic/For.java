package a.basic;

public class For {
    public static void main(String[] args) {

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println();

        // 구구단 2단
        int dan = 2;
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "X" + i + "=" + dan * i);
        }
        System.out.println();

        // 구구단 2단부터 9단까지
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
        System.out.println();

        // while
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        System.out.println();

        // do-while
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println();

        // enhanced for
        int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18};

        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        // js에서 for of문 -> for (const number of numbers) {} 과 유사한 enhanced for문
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // 배열 순회
        int[] nums = {1, 2, 3};
        for (int num : nums) {
            num = num * 3;
        }
        for (int num : nums) {
            System.out.println(num);
            // nums를 직접적으로 건드리지 않음.
        }

        // 직접 접근
        for (int a = 0; a < nums.length; a++) {
            nums[a] = nums[a] * 3;
        }
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println();

        // break
        for (int z = 0; z < 10; z++) {
            System.out.println(z);
            if (z == 5){
                break;
            }
        }
        System.out.println();

        // continue
        for (int z = 0; z < 10; z++) {
            if (z % 2 == 0){
                continue;
            }
            System.out.println(z);
        }
        System.out.println();

        outer:
        for (int x = 2; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.println(x + "X" + y + "=" + (x * y));
                if (x > 4){
                    break outer;
                }
            }
        }




    }
}
