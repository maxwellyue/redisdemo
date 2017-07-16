# RedisDemo

---
### 整体框架
* springboot + mybatis + redis
* 为啥用springboot：避免复制粘贴一大堆配置，只在默认不满足需求的时候配置。

---
### 运行步骤

#### redis 安装、运行、访问
centos7.2 环境
```
$ wget http://download.redis.io/releases/redis-3.2.9.tar.gz
$ tar xzf redis-3.2.9.tar.gz
$ cd redis-3.2.9
$ make

```


安装之后的配置，默认是不允许远程访问的，需要修改redis.conf配置文件。

①找到bind 127.0.0.1 ，注释掉

②找到protected-mode yes，将yes改为no

通过修改这两处配置，即可远程访问。


启动redis服务时，指定配置文件位置：

`src/redis-server ./redis.conf`。

启动redis客户端时，指定IP（默认127.0.0.1）和端口（默认6379）：

`src/redis-cli -h 127.0.0.1 -p 6380`。


---
#### 项目主要文件
* application.yml 项目配置文件，主要是mybatis和redis的配置
* RedisCacheConfig 主要是重写生成key的默认生成方式

---
### 注解：

@Cacheable

@CacheEvict


---
### 目的：
学习springboot、整合mybatis、redis基本配置

---
### 遗留问题
①由于对spring的Cache机制还没有研究，对注解的几个属性还不明白，如value?有key了为啥还要value。
②mybatis日志不输出问题，虽然通过配置spring.logging.level属性可以输出了，但是总觉得不正常，太啰嗦了，不太符合springboot倡导的思想。

