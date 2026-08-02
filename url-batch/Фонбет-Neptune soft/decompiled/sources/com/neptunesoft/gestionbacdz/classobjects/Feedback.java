package com.neptunesoft.gestionbacdz.classobjects;

/* loaded from: classes.dex */
public class Feedback {
    private String email;
    private String feedback;
    private String phone;
    private String type;
    private String username;

    public void setName(String name) {
        this.username = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getType() {
        return this.type;
    }

    public String getFeedback() {
        return this.feedback;
    }
}
