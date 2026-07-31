package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class gh extends b {
    private String X;
    private String Y;
    private int Z = 60;

    private gh() {
    }

    public static gh a0() {
        return new gh();
    }

    public void A(String str) {
        this.Y = str;
    }

    public void B(String str) {
        this.X = str;
    }

    public String X() {
        return this.Y;
    }

    public String Y() {
        return this.X;
    }

    public int Z() {
        return this.Z;
    }

    public void e(int i) {
        this.Z = i;
    }
}
