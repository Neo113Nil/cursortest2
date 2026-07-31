package com.mbridge.msdk.tracker.network;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes11.dex */
public class e implements x {
    private int a;
    private long b;
    private int c;
    private final int d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.c;
    }

    public e(int i, int i2) {
        this(i, 60000L, i2);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i = this.c + 1;
        this.c = i;
        return i <= this.d;
    }

    public e(int i, long j, int i2) {
        this.b = j;
        this.a = i;
        this.d = i2;
    }
}
