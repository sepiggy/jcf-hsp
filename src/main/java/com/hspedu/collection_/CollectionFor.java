package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class CollectionFor {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        // 老韩解读
        // 1. 使用增强 for 在 Collection 集合
        // 2. 增强 for 底层仍然是迭代器 (可以 Debug 验证）
        // 3. 增强 for 可以理解成就是简化版本的迭代器遍历
        // 4. 快捷键方式 I
//        for (Object book : col) {
//            System.out.println("book=" + book);
//        }
        for (Object o : col) {
            System.out.println("book=" + o);
        }

        // 增强 for 也可以在数组使用
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }
    }
}
