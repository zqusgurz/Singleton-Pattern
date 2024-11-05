//클라이언트 코드
public class SingletonPattern {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance(); // 첫 번째 인스턴스 요청
        logger1.log("첫 번째 로그 메시지");

        Logger logger2 = Logger.getInstance(); // 두 번째 인스턴스 요청
        logger2.log("두 번째 로그 메시지");

        // 동일한 인스턴스를 참조하는지 확인
        System.out.println("logger1 == logger2 : " + (logger1 == logger2));
    }
}