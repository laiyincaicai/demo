package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DemoApplicationTests {

    public static void main(String arg[]) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("===================");
        for (int i = 0; i < list1.size(); i++) {
            if(i == 3){
                System.out.println(String.valueOf(i).equals(list1.get(i - 1)));
            }
            System.out.println("i = " + list1.get(i));
        }
    }

    public void contextLoads() {
        System.out.println("12345");
    }
}
