package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class eg extends gc {
    private int k;
    private int l;

    private eg(String str, float f, int i, boolean z, boolean z2) {
        super("playheadViewabilityValue", str, f, i, z, 2, z2);
    }

    public static eg a(String str, float f, int i, boolean z, boolean z2) {
        return new eg(str, f, i, z, z2);
    }

    public void b(int i) {
        this.k = i;
    }

    public int i() {
        return this.l;
    }

    public int j() {
        return this.k;
    }

    public void a(int i) {
        this.l = i;
    }
}
