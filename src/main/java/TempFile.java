import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempFile {

    public static void main(String[] args) {

        List<String> fileNames = Arrays.asList("F1.txt","F2.txt");

        File[] files = fileNames.stream().map(x -> new File(x)).toArray(File[]::new);
        for (File f : files)
            System.out.println(f.getName());
    }
}
