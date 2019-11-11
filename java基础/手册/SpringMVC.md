## Spring —— 单文件上传与多文件上传实例

****

#### 一、单文件上传

  1. **页面**

  以一个简单的表单提交为例子，文件上传需要将表单的提交方法设置为破石头，将enctype的值设置为“multipart/form-data”

```jsp
<form action="${pageContext.request.contextPath}/test/ipload.do" method="post" enctype="multipart/form-data">
        <input type="file" name="img">
        <input type="submit" name="提交">
</form>
```



2. **控制器**

   在Controller的处理方法中，使用MultipartFile对象作为参数接收前端上传过来的文件

   **MyController.java：**

```java
@Controller
@RequestMapping("/test")
public class MyController {
    @RequestMapping(value = "/upload.do",method= RequestMethod.POST)

    //MultipartFile对象变量名跟表单中的file类型的input标签的name相同，所以框架会自动用MultipartFile对象来接收上传过来的文件，也可以使用 @RequestParam("img")指定对应的参数名称
    public String upload(MultipartFile img, HttpSession session)
        throws Exception{
        
        //如果没有文件上传，MultipartFile不会为null，可以通过调用getSize()方法获取文件的大小来判断是够有上传文件
        if (img.getSize()>0){
            
            //得到项目在服务器的真实根路径，如：/home/tomcat/webapp项目名/images
            String path = session.getServletContext().getRealPath("images");
            
            //得到文件的原始名称
            String fileName = img.getOriginalFilename();
            
            //通过文件的原始名称，可以对上传文件类型做限制，如：只能上传jpg和img的图片文件
            if (fileName.endsWith("jpg")||fileName.endsWith("png")){
                File file = new File(path,fileName);
                img.transferTo(file);
                return "/success.jsp";
            }
        }
        return "/error.jsp";
    }
}

```



3. **springmvc.xml配置**

配置文件中的CommonsMultipartResolver下的属性值不是必须的，可全部不屑

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
     xmlns:context="http://www.springframework.org/schema/context"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd http://www.springframework.org/schema/aop http://www.springframework.org/schema/spring-aop.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/spring-context.xsd">

    <!-- 注意：CommonsMultipartResolver的id是固定不变的，一定是multpartReslover，不可修改 -->
    <bean id="multpartReslover" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">

        <!--如果上传后文件名中文乱码可以使用该属性解决-->
        <property name="defaultEncoding" value="utf-8"/>

        <!-- 单位是字节，不设置默认不限制总的上传文件大小，这里设置总的上传文件大小不超过1M（1*1024*1024） -->
        <property name="maxInMemorySize" value="1048576"/>

        <!-- 跟maxUploadSize差不多，不过maxUploadSizePerFile是限制每个上传文件大小，而maxUploadSize是限制总的上传文件大小 -->
        <property name="maxUploadSizePerFile" value="1048576"/>
    </bean>

    <!-- 这是一个简单的解析器，当文件上传超过大小限制是跳转 -->
    <bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
        <property name="defaultErrorView" value="/error.jsp"/>
    </bean>

</beans>
```



#### 多文件上传









### Waiting for updates>>>>>>>





