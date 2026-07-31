package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class sj {
    private final float a;
    private final long b;
    private final float c;
    private final Runnable d;
    private int e;
    private long f;
    private long g;

    private sj(float f, long j, float f2, Runnable runnable) {
        this.a = f;
        this.b = Math.max(0L, j - 40);
        this.c = f2;
        this.d = runnable;
        a();
    }

    public static sj a(float f, long j, float f2, Runnable runnable) {
        return new sj(f, j, f2, runnable);
    }

    public void a() {
        this.e = 0;
        this.f = 0L;
        this.g = 0L;
    }

    int a(long j, float f) {
        int i = this.e;
        if (i == 0) {
            r4 = -1 != v4.a(f, this.a);
            if (r4) {
                this.g = 0L;
                this.e = 1;
            }
        } else if (i == 1) {
            boolean z = -1 != v4.a(f, this.c);
            if (z) {
                this.g += j - this.f;
            } else {
                this.g = 0L;
                this.e = 0;
            }
            r4 = z;
        }
        this.f = j;
        if (!r4 || this.g < this.b) {
            return 1;
        }
        this.d.run();
        return 2;
    }
}
