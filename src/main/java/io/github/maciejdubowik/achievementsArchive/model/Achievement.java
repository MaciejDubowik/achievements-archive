package io.github.maciejdubowik.achievementsArchive.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Achievement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "info")
    private String info;
    @Basic
    @Column(name = "category")
    private String category;

    public Achievement() {
    }

    public Achievement(Date date, String name, String info, String category) {
        this.date = date;
        this.name = name;
        this.info = info;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return id == that.id && Objects.equals(date, that.date) && Objects.equals(name, that.name) && Objects.equals(info, that.info) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, name, info, category);
    }
}
