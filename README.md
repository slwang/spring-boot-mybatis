#spring-boot 整合mybatis 提供restful接口服务

##配置
	服务端口配置： application.properties。 也可以放在application.yml中
	数据库等配置：application.yml

##运行： mvn spring-boot:run

##访问:
  http://127.0.0.1:8089/user/showUser?id=1
  http://127.0.0.1:8089/springboot/getUserByGet?userName=1111

参考:http://www.cnblogs.com/peterxiao/p/7779188.html
