package io.github.maciejdubowik.achievementsArchive.dtos;

import com.sun.istack.NotNull;
import io.github.maciejdubowik.achievementsArchive.model.Achievement;


public class AchievementAddDto {
    @NotNull
    private String date;
    @NotNull
    private String name;
    @NotNull
    private String info;
    @NotNull
    private String category;

    public AchievementAddDto() {
    }

    public AchievementAddDto(String date, String name, String info, String category) {
        this.date = date;
        this.name = name;
        this.info = info;
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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


}
