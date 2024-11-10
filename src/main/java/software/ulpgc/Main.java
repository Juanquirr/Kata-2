package software.ulpgc;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("title.basics.tsv");
        List<Title> titles = new TsvFileTitleReader(file).read();
        HashMap<Title.TitleType, Integer> map = new HashMap<>();
        for (Title title : titles) map.put(title.titleType(), map.getOrDefault(title.titleType(), 0) + 1);
        for (Title.TitleType titleType : map.keySet()) System.out.println(titleType + " " + map.get(titleType));
    }
}
