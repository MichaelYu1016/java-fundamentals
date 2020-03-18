package com.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Function接口
        Function<Integer,Integer> a = e -> e*2;
        Function<Integer,Integer> b = e -> e*e;

        System.out.println(a.compose(b).apply(4));
        System.out.println(a.andThen(b).apply(4));
        System.out.println(a.compose(b).compose(b).andThen(b).apply(4));
        System.out.println(b.apply(a.apply(b.apply(b.apply(4)))));

        // Consumer接口
        Consumer<String> f = System.out::println;
        Consumer<String> f2 = n -> System.out.println(n + "-F2");

        //执行完F后再执行F2的Accept方法
        f.andThen(f2).accept("test");

        //连续执行F的Accept方法
        f.andThen(f2).andThen(f).andThen(f2).accept("test1");

        // Predicate接口
        Predicate<String> p = o -> o.equals("test");
        Predicate<String> g = o -> o.startsWith("t");

        System.out.println(p.test("test"));
        System.out.println(p.test("prod"));
        System.out.println(p.negate().test("test"));
        System.out.println(p.and(g).test("test"));
        System.out.println(p.or(g).test("test"));

        // Optional
        Optional<String> optional = Optional.of("ynx");
        optional.isPresent();
        optional.get();
        optional.orElse("fallback");

        optional.ifPresent(s -> System.out.println(s.charAt(0)));

        // stream操作
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

        stringCollection.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        long startsWithA = stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println(startsWithA);

        Optional<String> reduced = stringCollection
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
//        int max = 1000000;
//        List<String> values = new ArrayList<>(max);
//        for (int i = 0; i<max;i++){
//            UUID uuid = UUID.randomUUID();
//            values.add(uuid.toString());
//        }
        // stream串行
//        long t0 = System.nanoTime();
//        long count = values.stream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("sequential sort took: %d ms",millis));

        // stream并行
//        long t0 = System.nanoTime();
//        long count = values.parallelStream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("sequential sort took: %d ms",millis));
        // 双括号初始化
        System.out.println(new ArrayList<String>(){{add("ynx");add("first");}});
    }
}
