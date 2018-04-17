import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Shane on 2018/4/5 20:50
 */
public class Test1 {
    public Test1() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        RandomAccessFile raf = new RandomAccessFile("new.dat", "rw");

    }
}
