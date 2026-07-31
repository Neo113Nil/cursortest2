package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ke extends oj {
    private boolean h;
    private float i;
    private float j;

    private ke(String str, String str2, int i, int i2, boolean z) {
        super(str, str2, i, i2, z);
        this.i = -1.0f;
        this.j = -1.0f;
    }

    public static ke a(String str, int i, int i2, boolean z) {
        return new ke("ovvStat", str, i, i2, z);
    }

    public void b(boolean z) {
        this.h = z;
    }

    public float h() {
        return this.j;
    }

    public float i() {
        return this.i;
    }

    public boolean j() {
        return this.h;
    }

    public void a(float f) {
        this.j = f;
    }

    public void b(float f) {
        this.i = f;
    }
}
