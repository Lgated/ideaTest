package com.web.pojo;

public class stu {
    String name;
    String address;

    public stu() {
    }

    public stu(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
