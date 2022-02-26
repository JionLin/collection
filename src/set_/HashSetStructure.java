package set_;

/**
 * @author johnny
 * @Classname HashSetStructure
 * @Description hashset的数据结构 也就是hashmap的底层(数组+链表+红黑树)
 * @Date 2022/1/12 4:07 下午
 */
public class HashSetStructure {
    // 目的是 索引为2的时候,挂john rose lucy
    // 索引为3 挂 smith
    public static void main(String[] args) {
        Node[] nodes=new Node[16];
        Node john = new Node("john", null);
        nodes[2]=john;
        Node rose = new Node("rose", null);
        john.next=rose;

        Node lucy = new Node("lucy", null);
        rose.next=lucy;

        Node smith = new Node("smith", null);
        nodes[3]=smith;

        System.out.println(nodes);
    }
}


class Node{
    Object name;

    Node next;

    public Node(Object name, Node next) {
        this.name = name;
        this.next = next;
    }
}
