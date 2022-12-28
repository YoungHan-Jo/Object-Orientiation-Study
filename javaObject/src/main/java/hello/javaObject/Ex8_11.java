package hello.javaObject;

public class Ex8_11 {
    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하세요");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요");
        } finally {
            deleteTempFiles();
        }

    }


    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {
        System.out.println("파일 복사");
    }

    static void deleteTempFiles() {
        System.out.println("임시 파일 삭제");
    }

    static boolean enoughSpace() {
        return true;
    }

    static boolean enoughMemory() {
        return false;
    }

}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}

class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}
