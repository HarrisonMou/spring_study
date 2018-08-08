package com.harrison.study.spring_study01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "zhangshan")
public class Constant {
    private String name;
    private Integer age;
    private Date birthday;
    private boolean dead;
    private Byte sex;
    private Map<String, String> relation;
    private List<Map<String, String>> jobs;
    private List<String> brothers;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Map<String, String> getRelation() {
        return relation;
    }

    public void setRelation(Map<String, String> relation) {
        this.relation = relation;
    }

    public List<Map<String, String>> getJobs() {
        return jobs;
    }

    public void setJobs(List<Map<String, String>> jobs) {
        this.jobs = jobs;
    }

    public List<String> getBrothers() {
        return brothers;
    }

    public void setBrothers(List<String> brothers) {
        this.brothers = brothers;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Constant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", dead=" + dead +
                ", sex=" + sex +
                ", relation=" + relation +
                ", jobs=" + jobs +
                ", brothers=" + brothers +
                ", location=" + location +
                '}';
    }
}
