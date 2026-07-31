package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class xe extends rh {
    private float f;
    private float g;

    private xe(String str) {
        super("playheadReachedValue", str, false);
        this.f = -1.0f;
        this.g = -1.0f;
    }

    public static xe b(String str) {
        return new xe(str);
    }

    public void a(float f) {
        this.g = f;
    }

    public float g() {
        return this.g;
    }

    public float h() {
        return this.f;
    }

    public String toString() {
        return "ProgressStat{value=" + this.f + ", pvalue=" + this.g + '}';
    }

    public void b(float f) {
        this.f = f;
    }
}
