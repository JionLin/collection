package set_;

import java.util.LinkedHashSet;

/**
 * @author johnny
 * @Classname LinkedHashSetStructure
 * @Description linedhashset 结构
 * @Date 2022/1/13 10:28 上午
 */
@SuppressWarnings({"all"})
public class LinkedHashSetStructure {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet=new LinkedHashSet<>();
//
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(i);
        }
        linkedHashSet.add("tom");
        linkedHashSet.add("smith");
        linkedHashSet.add("jack");

        System.out.println(linkedHashSet);
    }
}
