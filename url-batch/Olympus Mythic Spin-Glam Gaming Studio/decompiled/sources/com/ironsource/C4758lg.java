package com.ironsource;

/* renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4758lg {
    protected long a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.a - System.currentTimeMillis());
    }

    public void b(long j) {
        this.c = j;
        this.a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }

    public void a(long j) {
        this.a = System.currentTimeMillis() + j;
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
    }
}
