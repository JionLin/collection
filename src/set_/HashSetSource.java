package set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author johnny
 * @Classname HashSetSource
 * @Description
 * @Date 2022/1/12 4:44 下午
 */
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashset=new HashSet<>();
        // 进行模仿红黑树 table>=64 &&node>=8 进行树化
        // size >12 进行扩容 加载因子问题
        for (int i = 0; i < 16; i++) {
            hashset.add(i);
//            hashset.add(new A(i));
        }

        for (int i = 0; i < 12; i++) {
//            hashset.add(new B(i));
        }
//
        // 来新建一个对象,名字和年纪相同,则为同一个对象
//        hashset.add(new Person(18,"tom"));
//        hashset.add(new Person(19,"jack"));
//        hashset.add(new Person(18,"smith"));
//        hashset.add(new Person(18,"tom"));

        hashset.add("jack");
        hashset.add("tom");
        hashset.add("tom");
        hashset.add("smith");
        hashset.add("smith");
        for (Object o : hashset) {
            System.out.println(hashset);
        }
    }
}

class A{
    private int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

class B{
    private int b;

    public B(int b) {
        this.b = b;
    }



    @Override
    public int hashCode() {
        return 200;
    }
}
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}