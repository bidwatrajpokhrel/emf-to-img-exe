package v1;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        String input = "EMF.emf";
        String output = "output" + System.nanoTime()  + " .png";
        File outputFile = new File(output);


        Files.createTempFile("hello", ".file");
        try {
            IMOperation img = new IMOperation();
            img.addImage();
            img.addImage();
            ConvertCmd convert = new ConvertCmd();
            convert.setSearchPath("imagemagic");
            convert.run(img, input, output);


//            outputFile.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
