# maven的多模块结构
mvn-modules即是父模块，又用来组织module-A与module-B

# 说明
* 子模块自动继承父模块中引入的依赖、插件、version，groupId等等；
* module-A与module-B都是单独的项目，只是这里被mvn-modules组织到了一起，所以如果module-A要引用module-B中的类(即子模块间的引用)，则要在module-A的pom.xml文件中引入对module-B的依赖；
```
<!--子模块都是单独的项目，如果要引用，则需要引入依赖，此时才能调用module-B中的类-->
<dependency>
    <groupId>com.univ</groupId>
    <artifactId>module-B</artifactId>
    <version>${project.version}</version>
</dependency>
```