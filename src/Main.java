class Logger {
    // 유일한 인스턴스를 저장할 정적 변수
    private static Logger instance;

    // private 생성자: 외부에서 객체 생성 불가
    private Logger() {
        System.out.println("Logger 인스턴스가 생성되었습니다.");
    }

    // 정적 메서드를 통해 인스턴스를 제공
    public static Logger getInstance() {
        if (instance == null) { // 인스턴스가 없으면 생성
            instance = new Logger();
        }
        return instance;
    }

    // 로그 메시지를 출력하는 메서드
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
