package a.basic;

public class Practice {
    public static void main(String[] args) {

        // 문제 1: 홀짝 판별
        // 정수를 입력받아 홀수인지 짝수인지 판별하세요.
        int num = 17;
        if (num % 2 == 0) {
            System.out.println(num + "는 짝수입니다.");
        } else {
            System.out.println(num + "는 홀수입니다.");
        }

        // 문제 2: 학점 계산
        // 점수를 입력받아 학점을 출력하세요.
        int score = 85;
        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        }  else if (score >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }

        // 문제 3: 윤년 판별
        // 연도를 입력받아 윤년인지 판별하세요.
        // 윤년 조건:
        // 4로 나누어떨어지면서 100으로 나누어떨어지지 않거나
        // 400으로 나누어떨어지는 해
        int year = 2024;
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println( year + "년은 윤년이 아닙니다.");
        }

        // 문제 4: 삼각형 유효성 검사
        // 세 변의 길이를 입력받아 삼각형을 만들 수 있는지 검사하세요.
        // 삼각형 조건:
        // 세 변의 길이가 모두 양수
        // 가장 긴 변 < 나머지 두 변의 합
        int a = 3, b = 4, c = 5;
        if ( a > 0 && b > 0 && c > 0 && c < a + b ){
            System.out.println("삼각형을 만들 수 있습니다.");
        }

        // 문제 5: 계절 판별
        // 월을 입력받아 계절을 출력하세요. switch 문을 사용하세요.
        int month = 7;
        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 월";
        };
        System.out.println(season);

        // 문제 6: 요일 판별
        // 요일 번호를 입력받아 평일/주말을 구분하세요. 향상된 switch 문을 사용하세요.
        int day = 6;
        String week = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 요일";
        };
        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "평일";
            case 6, 7 -> "주말";
            default -> "잘못된 타입";
        };
        System.out.println(day + ": " + week + "은 " + type + "입니다.");

        // 문제 7: BMI 계산 및 판정
        // 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고 판정하세요.
        // BMI 계산: 몸무게(kg) / (키(m) × 키(m))
        // 판정 기준:
        // 18.5 미만: 저체중
        // 18.5 이상 23 미만: 정상
        // 23 이상 25 미만: 과체중
        // 25 이상: 비만
        double height = 1.75; //(m)
        double weight = 70.0; //(kg)
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("정상 체중입니다.");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("과체중입니다.");
        } else if (bmi >= 25) {
            System.out.println("비만입니다.");
        }

        // 문제 8: 최댓값 구하기
        // 세 개의 정수 중 최댓값을 구하세요. if 문을 사용하세요.
        int maxa = 10, maxb = 25, maxc = 17;
        if (maxa > maxb) {
            if(maxa > maxc) {
                System.out.println("최댓값: " + maxa);
            } else {
                System.out.println("최댓값: " + maxc);
            }
        } else {
            if (maxb > maxc) {
                System.out.println("최댓값: " + maxb);
            } else {
                System.out.println("최댓값: " + maxc);
            }
        }

        // 문제 9: 시험 합격 여부
        // 세 과목의 점수를 입력받아 합격 여부를 판단하세요.
        // 합격 조건:
        // 평균이 60점 이상
        // 모든 과목이 40점 이상
        int math = 70, english = 80, science = 45;
        int avg = math + english + science / 3;
        if (avg >= 60 && math >= 40 && english >= 40 && science >= 40) {
            System.out.println("합격");
        } else {
            System.out.println("불합격 (과목 낙제)");
        }

        // 문제 10: 할인율 계산
        // 구매 금액에 따라 할인율을 적용하세요.
        // 할인 기준:
        // 10만원 이상: 10% 할인
        // 5만원 이상: 5% 할인
        // 5만원 미만: 할인 없음
        // 추가: 회원이면 추가 5% 할인
        int price = 120000;
        double discount =0;
        boolean isMenber = true;
        if (price > 100000) {
            if(isMenber == true) {
                discount = 0.15;
            } else {
                discount = 0.1;
            }
        } else if (price > 50000) {
            if(isMenber == true) {
                discount = 0.1;
            } else {
                discount = 0.05;
            }
        }
        System.out.println("원가: " + price + "원");
        System.out.println("할인율: " + discount*100 + "%");
        System.out.println("최종 금액: " + price*(1-discount) + "원");

    }
}
