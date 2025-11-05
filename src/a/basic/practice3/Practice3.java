package a.basic.practice3;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        // 문제 1: 배열 최댓값/최솟값
        // 배열에서 최댓값과 최솟값을 찾으세요.
        int[] numbers = {45, 23, 78, 12, 89, 34};
        Arrays.sort(numbers);
        System.out.println("최댓값: " + numbers[numbers.length-1]);
        System.out.println("최솟값: " + numbers[0]);


        // 문제 2: 배열 뒤집기
        // 배열을 역순으로 뒤집으세요.
        // case 1
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[(arr.length - 1) - i];
        }
        System.out.println("원본: " + Arrays.toString(arr));
        System.out.println("뒤집기: " + Arrays.toString(reversedArr));

        // case 2
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("뒤집기: " + Arrays.toString(arr)); // 원본 자체가 변경


        // 문제 3: 특정 값 찾기
        // 배열에서 특정 값이 있는 인덱스를 찾으세요. 없으면 -1을 반환하세요.
        int[] arr2 = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(target + "의 인덱스: " + index);


        // 문제 4: 배열 요소 개수 세기
        // 배열에서 각 숫자가 몇 번 나오는지 세세요.
        int[] arr3 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int max = arr3[0];
        for (int num : arr3) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];
        for (int num : arr3) {
            count[num]++;
        }
        System.out.println(Arrays.toString(count));


        // 문제 5: 2차원 배열 합계
        // 2차원 배열의 모든 요소의 합을 구하세요.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum =0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("합계: " + sum);


        // 문제 6: 배열에서 두 번째로 큰 수
        // 배열에서 두 번째로 큰 수를 찾으세요.
        // case 1
        int[] arr4 = {45, 23, 78, 12, 89, 34};
        Arrays.sort(arr4);
        System.out.println("두 번째로 큰 수: " + arr4[arr4.length-2]);

        // case 2
        int maxm = arr4[0];
        int secondMax = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > maxm) {
                secondMax = maxm;
                maxm = arr4[i];
            } else if (arr4[i] > secondMax && arr4[i] != maxm) {
                secondMax = arr4[i];
            }
        }
        System.out.println(secondMax);

    }
}
