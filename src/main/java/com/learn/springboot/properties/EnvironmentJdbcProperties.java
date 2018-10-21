package com.learn.springboot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 从 Environment 中获取属性
 */
@Component
public class EnvironmentJdbcProperties {

    @Autowired
    private Environment evn;

    public String getIp(){
        return evn.getProperty("learn.jdbc.ip");
    }

    public String getPort(){
        return evn.getProperty("learn.jdbc.port");
    }

    public String getHosts(){
        String host1=evn.getProperty("learn.jdbc.hosts[0]");
        String host2=evn.getProperty("learn.jdbc.hosts[1]");
        String host3=evn.getProperty("learn.jdbc.hosts[1]");
        return "\""+host1+", "+ host2+", "+host3+"\"";
    }

    @Override
    public String toString() {
        return "EnvironmentJdbcProperties{" +
                "ip=" + getIp() +
                ",port="+getPort()+
                ",hosts="+getHosts()+
                '}';
    }
}
