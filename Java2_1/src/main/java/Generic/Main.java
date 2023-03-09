package Generic;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tao tu dien anh viet
        MyDictionary<String, String> myD  = new MyDictionary<>();
        myD.setK("Hello");
        myD.setV("Xin Chao");
        System.out.println(myD);
        // 1 tu  tieng anh ung vs nhieu tieng viet
        MyDictionary<String, List<String>> myD2 = new MyDictionary<>();
        myD2.setK("hi");
        myD2.setV(Arrays.asList("xin chao", "chao"));
        System.out.println(myD2);
    }
}
