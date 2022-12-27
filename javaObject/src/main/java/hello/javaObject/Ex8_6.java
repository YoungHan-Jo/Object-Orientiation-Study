package hello.javaObject;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            throw new Exception("고의로 발생시킨 에러");
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었음");
    }
}
