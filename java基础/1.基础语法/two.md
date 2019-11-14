













### **1、数据类型转换**

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

**自动类型转换**

	1. 特点：代码不需要进行特殊处理，自动完成。
 	2. 规则：数据范围**从小到大**

**转换规则：**

​	范围小的类型向范围大的类型提升，`byte、short、char`运算时直接提升为`int`

```java
byte、short、char --> int --> long --> float --> double
```

****

### **2、强制转换**

**转换格式：**

```
数据类型 变量名 = （数据类型）被转数据值
```

```Java
short s = 1;
        /*
        s和1做运算的时候，1是int类型，s会被提升为int类型
        s + 1后的结果是int类型，将结果在赋值short类型是发生错误
        short内存2个字节，int类型4个字节
        必须将int强制转换成short才能完成赋值
        */
        //s = s + 1;编译失败
        s = (short)(s + 1);
        System.out.println(s);
```

**强制类型转换**

 	1. 特点：代码需要进行特殊的格式处理，不能自动完成；
 	2. 格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；
 	3. 一般不推荐使用，因为有可能发生精度损失、数据溢出；
 	4. byte/short/char这三种类型都可以发生数学运算。
 	5. 

例子：

```java
int num = (int) 100L;
System.out.println(num);
```



***注**

- 浮点转成整数，直接取消小数点，可能造成数据损失精度。
- int强制转成short砍掉两个字节，可能造成数据丢失

```Java
//定义z为short范围内最大值
        short z = 32767;
        //运算后，强制转换，砍掉2个字节后会出现不确定的结果
        z = (short)(z + 10);
        System.out.println(z);
```

****

### **3、ASCII编码表**

```java
	//字符类型变量
    char w = 'a';
    int i1 = 1;
    //字符类型和int类型计算
    System.out.println(w + i1);//输出结果为98
```

- **编码表：**就是将人类的文字和一个十进制数进行对应起来组成一张表格。

| 字符 | 数值 |
| :--: | :--: |
|  0   |  48  |
|  9   |  57  |
|  A   |  65  |
|  Z   |  90  |
|  a   |  97  |
|  z   | 122  |

- 将所有的英文字母，数字，符号都和十进制进行了对应，因此产生了世界上第一张编码表ASCII（American Standard Code for Information Interchange美国标准信息交换码）。

>
>
>在char类型和int类型计算的过程中，char类型的字符线查询编码表，得到97，在和1求和，结果为98。char类型提升为了int类型











