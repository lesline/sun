1.树的前中后序遍历写代码，
2.快速排序写代码，
3.hashmap为什么线程不安全，及put过程，扩容过程，死循环产生的过程
https://coolshell.cn/articles/9606.html



4.final类型变量垃圾回收过程
5.内存结构和垃圾回收算法及垃圾回收器适用场景

6.dubbo原理和热部署

7.zookeeper选举算法及分布式锁实现
排它锁：建临时节点
同享锁：建临时顺序节点

8.redis数据结构及分布式锁的实现方式，
https://redis.io/topics/distlock
http://ifeve.com/redis-lock/

9.mysql不同引擎的区别，数据结构，事务隔离级别以及如何实现隔离，sql优化
MyISAM与InnoDB的区别
　　InnoDB和MyISAM是许多人在使用MySQL时最常用的两个表类型，这两个表类型各有优劣，视具体应用而定。基本的差别为：MyISAM类型不支持事务处理等高级处理，而InnoDB类型支持。MyISAM类型的表强调的是性能，其执行数度比InnoDB类型更快，但是不提供事务支持，而InnoDB提供事务支持已经外部键等高级数据库功能。


一般来说，MyISAM适合：
(1)做很多count 的计算；
(2)插入不频繁，查询非常频繁；
(3)没有事务。

InnoDB适合：
(1)可靠性要求比较高，或者要求事务；
(2)表更新和查询都相当的频繁，并且表锁定的机会比较大的情况

http://www.ligphp.com/post/76.html

表上的每一个唯一性索引（其中包括主键索引，可以为索引中的部分字段）必须用于分区表的表达式上：

分区列和索引列不匹配如果定义的索引列和分区列不匹配，会导致查询无法进行分区过滤。假设在列a上定义了索引，而在列b上定义的分区。因为每个分区都有其独立的索引，
所以扫描列b上的索引就需要扫描每个分区内对应的索引。要避免这个问题，应该避免建立和分区列不匹配的索引，除非查询中还同时包含了可以过滤分区的条件。

10.java自带的的分析问题工具
11.jdk1.8新特性
12.更新缓存与db同步
13.线程池怎么设置更合理
14.ioc aop原理，拦截器是怎么实现
15.mq如何保证不丢失消息
16.遇到哪些难题，怎么解决的



动太规划
http://www.cnblogs.com/bourbon/archive/2011/08/23/2151044.html



jmx上报加日志收集分析系统，比如zabbix，falcon
jstack简单使用，定位死循环、线程阻塞、死锁等问题
https://jingyan.baidu.com/article/4f34706e3ec075e387b56df2.html

1、dock 引用外部磁盘
[root@localhost ~]# docker run -it -v /test:/soft centos /bin/bash
/test 为主机目录 /soft为docker的目录
