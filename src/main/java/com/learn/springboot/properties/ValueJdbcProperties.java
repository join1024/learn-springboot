package com.learn.springboot.properties;

import com.learn.springboot.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 通过@Value注解获取properties
 */
@Component
public class ValueJdbcProperties {
    @Value("${learn.jdbc.ip}")
    private String ip;

    @Value("${learn.jdbc.port}")
    private String port;

    @Value("${learn.jdbc.hosts[0]}")
    private String host1;

    @Value("${learn.jdbc.hosts[1]}")
    private String host2;

    @Value("${learn.jdbc.hosts[2]}")
    private String host3;

    @Override
    public String toString() {
        return "ValueJdbcProperties{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", host1='" + host1 + '\'' +
                ", host2='" + host2 + '\'' +
                ", host3='" + host3 + '\'' +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost1() {
        return host1;
    }

    public void setHost1(String host1) {
        this.host1 = host1;
    }

    public String getHost2() {
        return host2;
    }

    public void setHost2(String host2) {
        this.host2 = host2;
    }

    public String getHost3() {
        return host3;
    }

    public void setHost3(String host3) {
        this.host3 = host3;
    }
}
