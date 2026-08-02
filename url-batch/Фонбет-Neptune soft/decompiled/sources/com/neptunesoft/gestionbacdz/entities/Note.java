package com.neptunesoft.gestionbacdz.entities;

import java.io.Serializable;

/* loaded from: classes.dex */
public class Note implements Serializable {
    private String color;
    private String date_time;
    private int id_note;
    private String image_path;
    private String note_content;
    private String subtitle;
    private String title;
    private String web_link;

    public int getId_note() {
        return this.id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_time() {
        return this.date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNote_content() {
        return this.note_content;
    }

    public void setNote_content(String note_content) {
        this.note_content = note_content;
    }

    public String getImage_path() {
        return this.image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeb_link() {
        return this.web_link;
    }

    public void setWeb_link(String web_link) {
        this.web_link = web_link;
    }

    public String toString() {
        return this.title + " : " + this.date_time;
    }
}
