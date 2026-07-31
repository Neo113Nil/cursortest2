package com.my.tracker.obfuscated;

/* loaded from: classes15.dex */
public final class f2 implements d2 {
    private final int a;
    private long b;
    private long c;

    public f2(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.d2, com.my.tracker.obfuscated.e2
    public long b() {
        return this.b;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void c(long j) {
        this.b += j;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void g() {
        this.b = 0L;
        this.c = 0L;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "total time = " + (this.b + this.c) + " ms : ";
        String str4 = "foreground = " + this.b;
        if (this.a == 0) {
            str = "[App Time   TS] id = " + this.a;
            str2 = "useful background = " + this.c;
        } else {
            str = "[Time Based TS] id = " + this.a;
            str2 = "background = " + this.c;
        }
        return str + ", " + str3 + str4 + ", " + str2;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void a(long j) {
        this.c += j;
    }

    @Override // com.my.tracker.obfuscated.d2, com.my.tracker.obfuscated.e2
    public long c() {
        return this.c;
    }

    @Override // com.my.tracker.obfuscated.d2
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f2 m6427clone() {
        try {
            f2 f2Var = (f2) super.clone();
            f2Var.g();
            f2Var.a(this.c);
            f2Var.c(this.b);
            return f2Var;
        } catch (CloneNotSupportedException unused) {
            return new f2(this.a, this.b, this.c);
        }
    }

    public f2(int i) {
        this(i, 0L, 0L);
    }
}
