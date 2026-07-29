package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class V6 implements YR {
    public final /* synthetic */ int h = 1;
    public final FS i;
    public final Object j;

    public V6(OutputStream outputStream, FS fs) {
        this.j = outputStream;
        this.i = fs;
    }

    @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.h) {
            case 0:
                V6 v6 = (V6) this.j;
                FS fs = this.i;
                fs.h();
                try {
                    v6.close();
                    if (fs.i()) {
                        throw fs.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!fs.i()) {
                        throw e;
                    }
                    throw fs.k(e);
                } finally {
                    fs.i();
                }
            default:
                ((OutputStream) this.j).close();
                return;
        }
    }

    @Override // o.YR, java.io.Flushable
    public final void flush() {
        switch (this.h) {
            case 0:
                V6 v6 = (V6) this.j;
                FS fs = this.i;
                fs.h();
                try {
                    v6.flush();
                    if (fs.i()) {
                        throw fs.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!fs.i()) {
                        throw e;
                    }
                    throw fs.k(e);
                } finally {
                    fs.i();
                }
            default:
                ((OutputStream) this.j).flush();
                return;
        }
    }

    @Override // o.YR
    public final NV timeout() {
        switch (this.h) {
        }
        return this.i;
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "AsyncTimeout.sink(" + ((V6) this.j) + ')';
            default:
                return "sink(" + ((OutputStream) this.j) + ')';
        }
    }

    @Override // o.YR
    public final void write(G8 g8, long j) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
                EB.f(g8.i, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C1694pQ c1694pQ = g8.h;
                    AbstractC0048Bt.k(c1694pQ);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += c1694pQ.c - c1694pQ.b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                c1694pQ = c1694pQ.f;
                                AbstractC0048Bt.k(c1694pQ);
                            }
                        }
                    }
                    V6 v6 = (V6) this.j;
                    FS fs = this.i;
                    fs.h();
                    try {
                        try {
                            v6.write(g8, j3);
                            if (fs.i()) {
                                throw fs.k(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!fs.i()) {
                                throw e;
                            }
                            throw fs.k(e);
                        }
                    } catch (Throwable th) {
                        fs.i();
                        throw th;
                    }
                }
            default:
                AbstractC0048Bt.n(g8, Constants.ScionAnalytics.PARAM_SOURCE);
                EB.f(g8.i, 0L, j);
                while (j > 0) {
                    this.i.f();
                    C1694pQ c1694pQ2 = g8.h;
                    AbstractC0048Bt.k(c1694pQ2);
                    int min = (int) Math.min(j, c1694pQ2.c - c1694pQ2.b);
                    ((OutputStream) this.j).write(c1694pQ2.a, c1694pQ2.b, min);
                    int i = c1694pQ2.b + min;
                    c1694pQ2.b = i;
                    long j4 = min;
                    j -= j4;
                    g8.i -= j4;
                    if (i == c1694pQ2.c) {
                        g8.h = c1694pQ2.a();
                        AbstractC1825rQ.a(c1694pQ2);
                    }
                }
                return;
        }
    }

    public V6(FS fs, V6 v6) {
        this.i = fs;
        this.j = v6;
    }
}
