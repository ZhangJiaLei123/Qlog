

## 默认使用 
``` java
 // 默认log4j.properties在src/main/resources下
 QLog.logger.trace("123");
``` 

## 配置自定义 log4j.properties 
``` java 
  QLog.loadConfigure(new File("E:/Documents/workspace/java/JavaQuick/Qlog/logconfgDemo/log4j.properties"));
```

> 使用demo见test 