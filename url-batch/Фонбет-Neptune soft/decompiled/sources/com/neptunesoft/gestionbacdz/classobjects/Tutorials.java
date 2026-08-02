package com.neptunesoft.gestionbacdz.classobjects;

/* loaded from: classes.dex */
public class Tutorials {
    private final int icon;
    private final String tutorials;

    public Tutorials(String tutorials, int icon) {
        this.tutorials = tutorials;
        this.icon = icon;
    }

    public String getTutorials() {
        return this.tutorials;
    }

    public int getIcon() {
        return this.icon;
    }
}
