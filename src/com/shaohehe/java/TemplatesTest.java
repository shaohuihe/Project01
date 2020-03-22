package com.shaohehe.java;

import com.shaohehe.bean.Customer;

import java.util.ArrayList;

/**
 * @author shaohehe
 * @create 2020-03-20 21:39
 */
public class TemplatesTest {
    //模板六 prsf ,private static final
    private static final Customer cust = new Customer();
    //变形：psf
    public static final  int num = 1;
    //变形：psfi
    public static final int num2 =2;
    //变形：psfs
    public static final String  str1= "hello";

    //模板一：psmv
    public static void main(String[] args) {

        //模板二：
        System.out.println("Hello World");
        //变形：soutp.soutm,soutv,xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num);

        //模板三：fori
        String[] arr = new String[]{"2","3","4"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //模板四;list.for
        ArrayList list = new ArrayList();
        list.add("2");
        list.add("3");
        list.add("4");

        for (Object o : list) {
            System.out.println(o);
        }
        //变形;list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){

        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add("2");
        list.add("3");
        list.add("4");

        if (list == null) {
            
        }

        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }
}
