package com.astakhdev.todo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;

@Entity
@Table(name = "todo")
public class ToDoLine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String whatToDo;
    private int time;
    private boolean status;
    private Date date;

    public ToDoLine() {
    }

    public ToDoLine(String whatToDo, int time, boolean status, Date date) {
        this.whatToDo = whatToDo;
        this.time = time;
        this.status = status;
        this.date = date;
    }
    public ToDoLine(long id, String whatToDo, int time, boolean status, Date date) {
        this.id = id;
        this.whatToDo = whatToDo;
        this.time = time;
        this.status = status;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public void setWhatToDo(String whatToDo) {
        if(whatToDo.isEmpty() || whatToDo.trim().length() < 1){
            throw new IllegalArgumentException("Значение setWhatToDo < 1");
        }
        this.whatToDo = whatToDo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoLine toDoLine = (ToDoLine) o;
        return id == toDoLine.id && time == toDoLine.time && status == toDoLine.status && Objects.equals(whatToDo, toDoLine.whatToDo) && Objects.equals(date, toDoLine.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, whatToDo, time, status, date);
    }

    @Override
    public String toString() {
        return "ToDoLine{" +
                "id=" + id +
                ", whatToDo='" + whatToDo + '\'' +
                ", time=" + time +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
