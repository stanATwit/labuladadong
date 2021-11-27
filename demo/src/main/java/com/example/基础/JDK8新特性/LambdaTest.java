package com.example.基础.JDK8新特性;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author stan
 * @Date 2021/10/8
 * @Describe  JDK提供了常见的最简单的四种函数式接口,我这里举例了它们的使用方法
 * @Version 1.0
 */
public class LambdaTest {

    public static void test1(){
        printMsg((s)-> System.out.println(s),"你好");
    }
    public static void printMsg(Consumer<String> consumer,String msg){
        /*消费型接口，只有传入参数，没有返回值*/
        consumer.accept(msg);
    }

    public static void test2(){
        Integer content = getContent(() -> new Random().nextInt(100));
        System.out.println(content);
    }

    public static Integer getContent(Supplier<Integer> supplier){
        /*供给型，传入参数为空，带返回值*/
        return supplier.get();
    }

    public static void test4(){
        //传入一个字符串，然后把它都转换成大写字母。
        System.out.println(transfer((str) -> str.toUpperCase(), "My wechat : mistyskys"));
    }

    public static String transfer(Function<String,String> func, String str){
        // 函数型，传入一个参数，对其进行处理之后，返回一个结果
        return func.apply(str);
    }

    public static void test5(){
        //定义一个list，用来做筛选
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("jerry");
        list.add("tom");
        //筛选出集合中，字符串长度大于 3 的，并加入到结果集。
        List<String> filterResult = filter((str) -> str.length() > 3, list);
        System.out.println(filterResult.toString());
    }

    public static List<String> filter(Predicate<String> predicate, List<String> list){
        List<String> result = new ArrayList<>();
        for (String str : list) {
            //断言型，传入一个参数，并返回true或者false。
            //这里的逻辑是，若断言为真，则把当前的字符串加入到结果集中
            if(predicate.test(str)){
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LambdaTest.test5();
    }
}
