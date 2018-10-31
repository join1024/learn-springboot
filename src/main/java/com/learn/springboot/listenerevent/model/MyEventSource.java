package com.learn.springboot.listenerevent.model;

public class MyEventSource {
    private String type;
    private String name;

    public MyEventSource(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEventSource{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
