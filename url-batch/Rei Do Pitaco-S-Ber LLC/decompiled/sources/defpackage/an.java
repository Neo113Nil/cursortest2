package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class an extends xm {
    public boolean i;

    @Override // defpackage.xm, defpackage.p20
    public final long b(long j, m8 m8Var) {
        if (this.g) {
            l8.u("closed");
            return 0L;
        }
        if (this.i) {
            return -1L;
        }
        long b = super.b(8192L, m8Var);
        if (b != -1) {
            return b;
        }
        this.i = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        if (!this.i) {
            m();
        }
        this.g = true;
    }
}
