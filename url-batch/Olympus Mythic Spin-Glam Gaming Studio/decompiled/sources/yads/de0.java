package yads;

/* loaded from: classes5.dex */
public final class de0 {
    public final ub0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public int i;
    public boolean j;

    public de0() {
        this(new ub0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public final void a(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.i = i;
        this.j = false;
        if (z) {
            ub0 ub0Var = this.a;
            synchronized (ub0Var) {
                ub0Var.a(0);
            }
        }
    }

    public de0(ub0 ub0Var, int i, int i2, int i3, int i4, int i5, boolean z) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = ub0Var;
        this.b = sb3.a(i);
        this.c = sb3.a(i2);
        this.d = sb3.a(i3);
        this.e = sb3.a(i4);
        this.f = i5;
        this.i = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = sb3.a(0);
    }

    public static void a(int i, int i2, String str, String str2) {
        oh.a(str + " cannot be less than " + str2, i >= i2);
    }
}
