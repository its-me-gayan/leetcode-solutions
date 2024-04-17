package org.example;

import java.util.UUID;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/7/24
 * Time: 6:54 PM
 */
public class RequestSession {
    private UUID uuid;
    private String name;
    private Integer salary;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
