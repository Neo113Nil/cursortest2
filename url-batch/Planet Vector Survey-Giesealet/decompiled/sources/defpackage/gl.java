package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gl extends vq {
    public static final gl g;
    public ak f;

    static {
        int i = cv0.c;
        int i2 = cv0.d;
        long j = cv0.e;
        String str = cv0.a;
        gl glVar = new gl();
        glVar.f = new ak(i, i2, j, str);
        g = glVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        ak.c(this.f, runnable, 6);
    }

    @Override // defpackage.uj
    public final String toString() {
        return "Dispatchers.Default";
    }
}
