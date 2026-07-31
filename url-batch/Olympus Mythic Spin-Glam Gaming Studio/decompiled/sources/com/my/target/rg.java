package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class rg extends b {
    private final String X;
    private final long Y;

    private rg(String str, long j) {
        this.Y = j;
        this.F = "shoppable";
        this.X = str;
    }

    public static rg a(String str, long j) {
        return new rg(str, j);
    }

    public long X() {
        return this.Y;
    }

    public String Y() {
        return this.X;
    }
}
