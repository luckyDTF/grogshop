package com.gx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @ClassName Index
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/22 21:27
 **/
@Controller
public class Index {

    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test/redis/{value}", method = RequestMethod.GET)
    @ResponseBody
    public String getRedis(@PathVariable("value") String value) {
        redisTemplate.opsForValue().set(value, value);
        return redisTemplate.opsForValue().get(value);
    }

    public static void main(String[] args) {
        List<Student> classStudent = new ArrayList<>();
        classStudent.add(new Student("ge", 2345));
        classStudent.add(new Student("liming", 243));
        classStudent.add(new Student("xiaohua", 2356546));
        classStudent.add(new Student("mina", 24536));
        classStudent.add(new Student("mike", 13354));

        Collections.sort(classStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //1.名字长的在后面
                int count = o1.getName().length() - o2.getName().length();
                if (count == 0) {
                    //2.年龄大的在后面
                    count = o1.getAge() - o2.getAge();
                }
                return count;
            }
        });

        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
        treeMap.put("a", 134);
        treeMap.put("y2", 2353);
        treeMap.put("afdga", 456);
        treeMap.put("gresy", 57624);
        treeMap.put("hadf", 67567);
        System.out.println(treeMap);
        System.out.println(classStudent);
    }

    static class Student {
        private String name;
        private Integer age;


        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Student setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public Student setAge(Integer age) {
            this.age = age;
            return this;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
