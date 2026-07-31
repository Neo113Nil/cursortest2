package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class gc extends oj {
    public final float h;
    public final boolean i;
    private float j;

    protected gc(String str, String str2, float f, int i, boolean z, int i2, boolean z2) {
        super(str, str2, i, i2, z2);
        this.j = 0.0f;
        this.h = f;
        this.i = z;
    }

    public static gc a(String str, float f, int i, boolean z, int i2, boolean z2) {
        return new gc("playheadViewabilityValue", str, f, i, z, i2, z2);
    }

    public float h() {
        return this.j;
    }

    public void a(float f) {
        this.j = f;
    }
}
