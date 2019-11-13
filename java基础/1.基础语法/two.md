### 1、数据类型转换

```java
package com.java.demo;

public class Demo_1 {
    public static void main(String[] args){
        int i = 1;
        byte b = 2;
        //byte x = b + i; 会报错
        //int类型和byte类型运算，结果是int类型
        int c = b + i;
        System.out.println(c);
    }
}

```



**转换规则：**

​	范围小的类型向范围大的

