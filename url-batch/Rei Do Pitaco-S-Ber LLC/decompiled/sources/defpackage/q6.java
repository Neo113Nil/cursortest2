package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q6 implements f20 {
    public final /* synthetic */ int f = 1;
    public final l20 g;
    public final Object h;

    public q6(OutputStream outputStream, l20 l20Var) {
        this.h = outputStream;
        this.g = l20Var;
    }

    @Override // defpackage.f20
    public final e50 a() {
        int i = this.f;
        return this.g;
    }

    @Override // defpackage.f20, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                q6 q6Var = (q6) obj;
                l20 l20Var = this.g;
                l20Var.h();
                try {
                    q6Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.f20
    public final void e(long j, m8 m8Var) {
        long j2;
        int i = this.f;
        Object obj = this.h;
        l20 l20Var = this.g;
        switch (i) {
            case 0:
                vv.f(m8Var.g, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    e10 e10Var = m8Var.f;
                    e10Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += e10Var.c - e10Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                e10Var = e10Var.f;
                                e10Var.getClass();
                            }
                        }
                    }
                    q6 q6Var = (q6) obj;
                    l20Var.h();
                    try {
                        q6Var.e(j2, m8Var);
                        if (l20Var.i()) {
                            throw l20Var.k(null);
                        }
                    } catch (IOException e) {
                        if (!l20Var.i()) {
                            throw e;
                        }
                        throw l20Var.k(e);
                    } finally {
                        l20Var.i();
                    }
                }
                return;
            default:
                vv.f(m8Var.g, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    l20Var.f();
                    e10 e10Var2 = m8Var.f;
                    e10Var2.getClass();
                    int min = (int) Math.min(j4, e10Var2.c - e10Var2.b);
                    ((OutputStream) obj).write(e10Var2.a, e10Var2.b, min);
                    int i2 = e10Var2.b + min;
                    e10Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    m8Var.g -= j5;
                    if (i2 == e10Var2.c) {
                        m8Var.f = e10Var2.a();
                        f10.a(e10Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.f20, java.io.Flushable
    public final void flush() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                q6 q6Var = (q6) obj;
                l20 l20Var = this.g;
                l20Var.h();
                try {
                    q6Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return "AsyncTimeout.sink(" + ((q6) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public q6(l20 l20Var, q6 q6Var) {
        this.g = l20Var;
        this.h = q6Var;
    }
}
