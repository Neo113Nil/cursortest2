package com.neptunesoft.qrbarcodescanner;

/* loaded from: classes2.dex */
public class Feedback {
    private String email;
    private String feedback;
    private String phone;
    private String type;
    private String username;

    public void setName(String str) {
        this.username = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setFeedback(String str) {
        this.feedback = str;
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
