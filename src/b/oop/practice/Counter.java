package b.oop.practice;

public class Counter {

    // 문제 5: Counter 클래스
    // 카운터를 나타내는 클래스를 만드세요.

    // 요구사항:
    // 필드: count (int)
    // 생성자: 기본값 0으로 초기화
    // 메서드:
    // increment(): count 1 증가
    // decrement(): count 1 감소
    // getCount(): count 반환
    // reset(): count를 0으로 리셋

    int count;

    public Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
    void decrement() {
        count--;
    }
    public int getCount() {
        return count;
    }
    void reset() {
        count = 0;
    }
}
