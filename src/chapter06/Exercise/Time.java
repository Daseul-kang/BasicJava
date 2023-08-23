package chapter06.Exercise;
//값을 셋팅할때는 생성자 또는 세터 메소드를 이용한다!
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time() {
    }
    public Time(int hour, int minute, int second) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute > 0 && minute < 60 ) {
            this.minute = minute;
        }
        if (second > 0 && second < 60) {
            this.second = second;
        }
    }
    public String toString() {
        // 12:04:33 / %d는 숫자, 사이에 02에서 2는 두자리숫자, 0은 한자리 숫자일 경우
        // 앞 자리에 0을 넣겠다 (패딩하겠다)
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
