package com.learning.priorityqueue;

/**
 * @Auther:yinzhen
 * @Date:2021/1/2 16:44
 * @Description:com.learning.priorityqueue
 * @version: 1.0
 */
public class Task implements Comparable<Task> {

    private int id;
    private String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Task task) {
        return this.id > task.id ? 1 : this.id < task.id ? -1 : 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
