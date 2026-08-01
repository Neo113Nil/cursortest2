package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class r6 implements p20 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ r6(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.p20
    public final e50 a() {
        switch (this.f) {
            case 0:
                return (l20) this.g;
            default:
                return (e50) this.h;
        }
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                l20 l20Var = (l20) obj;
                r6 r6Var = (r6) obj2;
                l20Var.h();
                try {
                    long b = r6Var.b(8192L, m8Var);
                    if (l20Var.i()) {
                        throw l20Var.k(null);
                    }
                    return b;
                } catch (IOException e) {
                    if (l20Var.i()) {
                        throw l20Var.k(e);
                    }
                    throw e;
                } finally {
                    l20Var.i();
                }
            default:
                try {
                    ((e50) obj2).f();
                    e10 t = m8Var.t(1);
                    int read = ((InputStream) obj).read(t.a, t.c, (int) Math.min(8192L, 8192 - t.c));
                    if (read == -1) {
                        if (t.b == t.c) {
                            m8Var.f = t.a();
                            f10.a(t);
                        }
                        return -1L;
                    }
                    t.c += read;
                    long j2 = read;
                    m8Var.g += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (m60.G(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                l20 l20Var = (l20) obj;
                r6 r6Var = (r6) this.h;
                l20Var.h();
                try {
                    r6Var.close();
                    if (l20Var.i()) {
                        throw l20Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!l20Var.i()) {
                        throw e;
                    }
                    throw l20Var.k(e);
                } finally {
                    l20Var.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "AsyncTimeout.source(" + ((r6) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.g) + ')';
        }
    }
}
