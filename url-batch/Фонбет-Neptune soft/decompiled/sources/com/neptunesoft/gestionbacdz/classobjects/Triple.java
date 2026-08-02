package com.neptunesoft.gestionbacdz.classobjects;

/* loaded from: classes.dex */
public class Triple {
    private final boolean amazight;
    private final String full_name;
    private final int id_triple;
    private final boolean sport;
    private final int triple;

    public Triple(int id_triple, int triple, String full_name, boolean sport, boolean amazight) {
        this.id_triple = id_triple;
        this.triple = triple;
        this.full_name = full_name;
        this.sport = sport;
        this.amazight = amazight;
    }

    public int getId_triple() {
        return this.id_triple;
    }

    public int getTriple() {
        return this.triple;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public boolean isSport() {
        return this.sport;
    }

    public boolean isAmazight() {
        return this.amazight;
    }
}
