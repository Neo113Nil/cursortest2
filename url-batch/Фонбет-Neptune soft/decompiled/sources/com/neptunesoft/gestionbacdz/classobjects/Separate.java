package com.neptunesoft.gestionbacdz.classobjects;

/* loaded from: classes.dex */
public class Separate {
    final boolean darkmode;
    final String title;

    public Separate(String title, boolean darkmode) {
        this.title = title;
        this.darkmode = darkmode;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isDarkmode() {
        return this.darkmode;
    }
}
