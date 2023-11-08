package com.web.pojo;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1.将java对象转为JSON字符串
        stu s = new stu();
        s.setName("zhangsan");
        s.setAddress("us");
        String jsonString = JSON.toJSONString(s);
        System.out.println(jsonString);//{"address":"us","name":"zhangsan"}


        //2.将JSON字符串转为java对象
        stu s1 = JSON.parseObject("{\"address\":\"us\",\"name\":\"zhangsan\"}", stu.class);
        System.out.println(s1);//stu{name='zhangsan', address='us'}
    }
}
