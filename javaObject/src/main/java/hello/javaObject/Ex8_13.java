package hello.javaObject;


public class Ex8_13 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (MemoryException2 e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws MemoryException2, SpaceException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족합니다");
        }
        if (!enoughMemory()) {
            throw new MemoryException2("메모리가 부족합니다.");
        }
    }


    static void copyFiles() {
        System.out.println("파일 복사하기");
    }

    static void deleteTempFiles() {
        System.out.println("임시파일 삭제");
    }

    static boolean enoughSpace() {
        return true;
    }
    static boolean enoughMemory() {
        return false;
    }

}

class InstallException extends Exception {
    public InstallException(String message) {
        super(message);
    }
}

class SpaceException2 extends Exception {
    public SpaceException2(String message) {
        super(message);
    }
}

class MemoryException2 extends Exception {
    public MemoryException2(String message) {
        super(message);
    }
}