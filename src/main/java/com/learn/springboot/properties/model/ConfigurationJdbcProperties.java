package com.learn.springboot.properties.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 通过@ConfigurationProperties注解获取属性
 */
@Component
@ConfigurationProperties(prefix = "learn.jdbc")
public class ConfigurationJdbcProperties {

    private String ip;
    private String port;
    private List<String> hosts;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", hosts=" + hosts +
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

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }


}
