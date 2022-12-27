package hello.javaObject;

import java.io.File;

public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File f = createFile("abc");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String filename) throws Exception {

        if (filename == null || filename.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다");
        }
        File file = new File(filename);
        file.createNewFile();
        return file;
    }
}
