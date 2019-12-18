# Java

### Instance - 实例

##### main方法（MainMethod）



##### String类的应用（UseString）

​	`String类是JDK提供的类，用来表示一串字符数据`

>String是由多个字符组成的，每个字符都有一个索引号，这个索引号从0开始；
>
>测试String类中常用方法的使用

**使用到的方法：**

​	**charAt(int index)**	—	返回指定索引处的char值

```java
参数：
	index - char的索引
返回：
    此字符串指定索引处的 char 值
    第一个 char 值位于索引 0 处
```



​	**trim()**	—	返回字符串的副本，忽略前导空白和尾部空白

​	**indexOf(String str)**	—	返回指定子字符串在此字符串中第一次出现处的索引

```Java
参数：
    str - 任意字符串
返回：
    如果字符串参数作为一个子字符串在此对象中出现，则返回第一个这种子字符串的第一个字符的索引；如果它不作为一个子字符串出现，则返回 -1
```



​	**equals(Object anbject)**	—	将此字符串与指定的对象比较。当且仅当该参数不为 null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。  

``` Java
参数:
	anObject - 与此 String 进行比较的对象
返回：
	如果给定对象表示的 String 与此 String 相等，则返回 true ；否则返回 false 。
```



​	**equalsIgnoreCase(String anotherString)**	—	将此String与另一个String比较，不考虑大小写。如果两个字符串的长度相同，并且其中的相应字符都相等（忽略大小写），则认为这两个字符串是相等的。

```java
- 在忽略大小写的情况下，如果下列至少一项为 true，则认为 c1 和 c2 这两个字符相同：
    这两个字符相同（使用 == 运算符进行比较）。 
    对每个字符应用方法 Character.toUpperCase(char) 生成相同的结果。 
    对每个字符应用方法 Character.toLowerCase(char) 生成相同的结果。
参数：
    anotherString - 与此 String 进行比较的 String
返回：
    如果参数不为 null，且这两个 String 相等（忽略大小写），则返回 true；否则返回 false
```



##### 某航空公司保存为航班班期查询程序（Flight）

>**描述：**
>
>​	航班的班期是指在一周之内的哪天有这个航班，哪天没有这个航班。某航班的班期保存为一个byte的数据，byte数据最高为0，以后每一位分别代表某一天是否有航班，依次从周六到周日。若这天有航班，则该位用1表示；若没有，则用0表示。如下表
>
>| 0    | 1    | 0    | 1    | 0    | 1    | 0    | 0    |
>| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
>|      | 六   | 五   | 四   | 三   | 二   | 一   | 日   |
>
>​	以上byte数据表示，在周二、周四、周六有该航班，而其他日期没有。
>
>​	编写程序根据给定的班期数据（byte值），输出哪些日期有航班

> **分析：**
>
> ​	此案例其实是要求某个整数的每一个二进制位的数值，一般有两种思路。
>
> 1. 将该整数循环除2取余，每一个余数就是对应二进制位的数值；
> 2. 使用位运算&，求出每个二进制位上的数值。
>
> ​    相比而言，第二种方法更整洁

- 摄氏温度与华氏温度的转换（CelsiusFahrenheit）

  > 描述：

  > 分析：
  >
  > ​	华氏温度与摄氏温度转化的公式为：
  >
  > ​		C = 5（F - 32）/ 9
  >
  > ​		F = 9C / 5 + 32
  >
  > ​	要求输入的温度值是整数，输出的温度值也是四舍五入后的整数



### Java基础

##### - 房屋租赁系统





