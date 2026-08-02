package com.neptunesoft.gestionbacdz.classobjects;

/* loaded from: classes.dex */
public class Avg {
    private final double avg;
    private final boolean dark;
    private final String full_name;
    private final int id_triple;
    private final int triple;

    public Avg(int id_triple, String full_name, int triple, double avg, boolean dark) {
        this.id_triple = id_triple;
        this.full_name = full_name;
        this.triple = triple;
        this.avg = avg;
        this.dark = dark;
    }

    public int getId_triple() {
        return this.id_triple;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public int getTriple() {
        return this.triple;
    }

    public double getAvg() {
        return this.avg;
    }

    public boolean isDark() {
        return this.dark;
    }
}
