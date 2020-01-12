package com.cjc.annotation;
@SetTable("user_table")
public class UserEntity {
    @SetProperty(value = "user_name",length = 10)
    private String name;
    @SetProperty(value = "user_id",length = 10)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
