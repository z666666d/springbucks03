# Apollo部署   

使用quick-start包快速部署

1、解压

```shell
unzip apollo-quick-start-1.8.0.zip 
```

2、创建数据库

解压后执行sql目录下apolloconfigdb.sql、apolloportaldb.sql两个sql文件，创建ApolloPortalDB和ApolloConfigDB两个数据库

3、修改demo.sh，配置数据库连接

```shell
# apollo config db info
apollo_config_db_url="jdbc:mysql://192.168.17.102:3306/ApolloConfigDB?characterEncoding=utf8&serverTimezone=Asia/Shanghai"
apollo_config_db_username=root
apollo_config_db_password=123456

# apollo portal db info
apollo_portal_db_url="jdbc:mysql://192.168.17.102:3306/ApolloPortalDB?characterEncoding=utf8&serverTimezone=Asia/Shanghai"
apollo_portal_db_username=root
apollo_portal_db_password=123456
```

4、启动apollo

```shell
./demo.sh start
```

注：apollo启动会开启8070、8080、8090三个端口，需要注意端口是否被暂用，并修改防火墙配置开放端口

5、使用

启动完成后，可以通过8070端口访问管理端使用。默认账号密码为：**apollo/admin**

apollo启动时会同时启动eureka注册中心，端口为8080