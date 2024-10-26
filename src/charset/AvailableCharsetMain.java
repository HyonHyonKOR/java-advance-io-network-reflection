package charset;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class AvailableCharsetMain {


    public static void main(String[] args) {
        //이용 가능한 모든 Charset 자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String charsetName : charsets.keySet()) {
            System.out.println("charsetName = " + charsetName);
        }
    }
}
