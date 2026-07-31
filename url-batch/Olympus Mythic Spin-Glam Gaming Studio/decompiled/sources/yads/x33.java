package yads;

/* loaded from: classes11.dex */
public final class x33 implements up0 {
    public final pd0 a;
    public final long b;

    public x33(pd0 pd0Var, long j) {
        this.a = pd0Var;
        if (pd0Var.d < j) {
            throw new IllegalArgumentException();
        }
        this.b = j;
    }

    @Override // yads.up0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        return this.a.a(bArr, 0, i2, z);
    }

    @Override // yads.up0
    public final void b(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2, false);
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        return this.a.c(bArr, i, i2);
    }

    @Override // yads.up0
    public final long e() {
        return (this.a.d + r0.f) - this.b;
    }

    @Override // yads.up0
    public final long f() {
        return this.a.d - this.b;
    }

    @Override // yads.up0
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // yads.up0
    public final void c() {
        this.a.f = 0;
    }

    @Override // yads.up0
    public final void a(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2, false);
    }

    @Override // yads.up0
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        return this.a.b(bArr, 0, i2, z);
    }

    @Override // yads.up0
    public final void b(int i) {
        this.a.a(false, i);
    }

    @Override // yads.up0
    public final long a() {
        return this.a.c - this.b;
    }
}
