package by.it.bildziuh.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Test(list);
        System.out.println("----------My ListA----------");
        list = new ListA<>();
        Test(list);

    }



    private static void Test(List<String> list) {
        list.add("one");
        list.add("two");
        System.out.println(list);
        list.add("three");
        System.out.println(list);
        System.out.println("Index 1 value = " + list.get(1));
        list.remove(1);
        System.out.println(list);





    }

/*
        myList.add("One");
        arList.add("One");
        myList.add("Two");
        arList.add("Two");
        myList.add("Four");
        arList.add("Four");
        System.out.println("myList:" + myList + "\narList:" + arList);

        System.out.println("Добавление");
        myList.add(2, "Three");
        arList.add(2, "Three");
        myList.add(0, "Start");
        arList.add(0, "Start");
        System.out.println("myList:" + myList + "\narList:" + arList);

        System.out.println("Удаление");
        myList.remove("Start");
        arList.remove("Start");
        myList.remove(3);
        arList.remove(3);
        System.out.println("myList:" + myList + "\narList:" + arList);

        System.out.println("Получение информации по индексу");
        System.out.println("myList(0):" + myList.get(0) + "\narList(0):" + arList.get(0));

        myList.set(2, "Five");
        arList.set(2, "Five");

        System.out.println(myList);
        System.out.println(arList);

        myList.addAll(arList);
        arList.addAll(arList);

        System.out.println(myList);
        System.out.println(arList);
*/
}

