package com.learn.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "learn.jdbc")
public class JdbcProperties {
    private String ip;
    private String port;
    private List<String> hosts;

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

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", hosts=" + hosts +
                '}';
    }
}
