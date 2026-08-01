package E1;

import c1.AbstractC0104b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class u implements Closeable {
    public static final Logger d;

    /* renamed from: a, reason: collision with root package name */
    public final K1.p f371a;

    /* renamed from: b, reason: collision with root package name */
    public final t f372b;

    /* renamed from: c, reason: collision with root package name */
    public final C0003d f373c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        i1.f.d(logger, "getLogger(Http2::class.java.name)");
        d = logger;
    }

    public u(K1.p pVar) {
        i1.f.e(pVar, "source");
        this.f371a = pVar;
        t tVar = new t(pVar);
        this.f372b = tVar;
        this.f373c = new C0003d(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0241, code lost:
    
        throw new java.io.IOException(E1.AbstractC0001b.f("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z2, m mVar) {
        int i;
        int i2;
        Object[] array;
        i1.f.e(mVar, "handler");
        int i3 = 0;
        try {
            this.f371a.I(9L);
            int r2 = y1.b.r(this.f371a);
            if (r2 > 16384) {
                throw new IOException(AbstractC0001b.f("FRAME_SIZE_ERROR: ", r2));
            }
            int h = this.f371a.h() & 255;
            byte h2 = this.f371a.h();
            int i4 = h2 & 255;
            int D2 = this.f371a.D();
            int i5 = Integer.MAX_VALUE & D2;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(i5, r2, h, true, i4));
            }
            if (z2 && h != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f312b;
                sb.append(h < strArr.length ? strArr[h] : y1.b.g("0x%02x", Integer.valueOf(h)));
                throw new IOException(sb.toString());
            }
            switch (h) {
                case 0:
                    f(mVar, r2, i4, i5);
                    return true;
                case 1:
                    i(mVar, r2, i4, i5);
                    return true;
                case 2:
                    if (r2 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + r2 + " != 5");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    K1.p pVar = this.f371a;
                    pVar.D();
                    pVar.h();
                    return true;
                case 3:
                    if (r2 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + r2 + " != 4");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int D3 = this.f371a.D();
                    int[] b2 = AbstractC0332e.b(14);
                    int length = b2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = b2[i6];
                            if (AbstractC0332e.a(i) != D3) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(AbstractC0001b.f("TYPE_RST_STREAM unexpected error code: ", D3));
                    }
                    q qVar = mVar.f327b;
                    qVar.getClass();
                    if (i5 != 0 && (D2 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        qVar.i.c(new l(qVar.f340c + '[' + i5 + "] onReset", qVar, i5, i, 1), 0L);
                    } else {
                        y h3 = qVar.h(i5);
                        if (h3 != null) {
                            h3.j(i);
                        }
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((h2 & 1) != 0) {
                        if (r2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (r2 % 6 != 0) {
                            throw new IOException(AbstractC0001b.f("TYPE_SETTINGS length % 6 != 0: ", r2));
                        }
                        D d2 = new D();
                        m1.a A2 = AbstractC0104b.A(AbstractC0104b.B(0, r2), 6);
                        int i7 = A2.f3557a;
                        int i8 = A2.f3558b;
                        int i9 = A2.f3559c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                K1.p pVar2 = this.f371a;
                                short F = pVar2.F();
                                byte[] bArr = y1.b.f4648a;
                                int i10 = F & 65535;
                                int D4 = pVar2.D();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (D4 < 16384 || D4 > 16777215)) {
                                        }
                                    } else {
                                        if (D4 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (D4 != 0 && D4 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                d2.c(i10, D4);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        q qVar2 = mVar.f327b;
                        qVar2.h.c(new k(qVar2.f340c + " applyAndAckSettings", mVar, d2, 2), 0L);
                    }
                    return true;
                case 5:
                    q(mVar, r2, i4, i5);
                    return true;
                case 6:
                    if (r2 != 8) {
                        throw new IOException(AbstractC0001b.f("TYPE_PING length != 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int D5 = this.f371a.D();
                    int D6 = this.f371a.D();
                    if ((h2 & 1) != 0) {
                        q qVar3 = mVar.f327b;
                        synchronized (qVar3) {
                            try {
                                if (D5 == 1) {
                                    qVar3.f346l++;
                                } else if (D5 == 2) {
                                    qVar3.f348n++;
                                } else if (D5 == 3) {
                                    qVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        mVar.f327b.h.c(new l(mVar.f327b.f340c + " ping", mVar.f327b, D5, D6, 0), 0L);
                    }
                    return true;
                case 7:
                    if (r2 < 8) {
                        throw new IOException(AbstractC0001b.f("TYPE_GOAWAY length < 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int D7 = this.f371a.D();
                    int D8 = this.f371a.D();
                    int i11 = r2 - 8;
                    int[] b3 = AbstractC0332e.b(14);
                    int length2 = b3.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            i2 = b3[i12];
                            if (AbstractC0332e.a(i2) != D8) {
                                i12++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(AbstractC0001b.f("TYPE_GOAWAY unexpected error code: ", D8));
                    }
                    K1.i iVar = K1.i.d;
                    if (i11 > 0) {
                        iVar = this.f371a.i(i11);
                    }
                    i1.f.e(iVar, "debugData");
                    iVar.a();
                    q qVar4 = mVar.f327b;
                    synchronized (qVar4) {
                        array = qVar4.f339b.values().toArray(new y[0]);
                        qVar4.f342f = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (i3 < length3) {
                        y yVar = yVarArr[i3];
                        if (yVar.f383a > D7 && yVar.g()) {
                            yVar.j(8);
                            mVar.f327b.h(yVar.f383a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (r2 != 4) {
                        throw new IOException(AbstractC0001b.f("TYPE_WINDOW_UPDATE length !=4: ", r2));
                    }
                    long D9 = this.f371a.D() & 2147483647L;
                    if (D9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar5 = mVar.f327b;
                        synchronized (qVar5) {
                            qVar5.f355u += D9;
                            qVar5.notifyAll();
                        }
                    } else {
                        y f2 = mVar.f327b.f(i5);
                        if (f2 != null) {
                            synchronized (f2) {
                                f2.f387f += D9;
                                if (D9 > 0) {
                                    f2.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f371a.J(r2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f371a.close();
    }

    public final void f(m mVar, int i, int i2, int i3) {
        int i4;
        int i5;
        y yVar;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte h = this.f371a.h();
            byte[] bArr = y1.b.f4648a;
            i5 = h & 255;
            i4 = i;
        } else {
            i4 = i;
            i5 = 0;
        }
        int a2 = s.a(i4, i2, i5);
        K1.p pVar = this.f371a;
        mVar.getClass();
        i1.f.e(pVar, "source");
        mVar.f327b.getClass();
        long j2 = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            q qVar = mVar.f327b;
            qVar.getClass();
            K1.f fVar = new K1.f();
            long j3 = a2;
            pVar.I(j3);
            pVar.z(fVar, j3);
            qVar.i.c(new n(qVar.f340c + '[' + i3 + "] onData", qVar, i3, fVar, a2, z4), 0L);
        } else {
            y f2 = mVar.f327b.f(i3);
            if (f2 == null) {
                mVar.f327b.E(i3, 2);
                long j4 = a2;
                mVar.f327b.q(j4);
                pVar.J(j4);
            } else {
                byte[] bArr2 = y1.b.f4648a;
                w wVar = f2.i;
                long j5 = a2;
                wVar.getClass();
                long j6 = j5;
                while (true) {
                    if (j6 <= j2) {
                        yVar = f2;
                        wVar.a(j5);
                        break;
                    }
                    synchronized (wVar.f381f) {
                        z2 = wVar.f378b;
                        yVar = f2;
                        z3 = wVar.d.f746b + j6 > wVar.f377a;
                    }
                    if (z3) {
                        pVar.J(j6);
                        wVar.f381f.e(4);
                        break;
                    }
                    if (z2) {
                        pVar.J(j6);
                        break;
                    }
                    long z5 = pVar.z(wVar.f379c, j6);
                    if (z5 == -1) {
                        throw new EOFException();
                    }
                    j6 -= z5;
                    y yVar2 = wVar.f381f;
                    synchronized (yVar2) {
                        try {
                            if (wVar.f380e) {
                                K1.f fVar2 = wVar.f379c;
                                fVar2.G(fVar2.f746b);
                                j2 = 0;
                            } else {
                                K1.f fVar3 = wVar.d;
                                j2 = 0;
                                boolean z6 = fVar3.f746b == 0;
                                fVar3.L(wVar.f379c);
                                if (z6) {
                                    yVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    f2 = yVar;
                }
                if (z4) {
                    yVar.i(y1.b.f4649b, true);
                }
            }
        }
        this.f371a.J(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f297a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List h(int i, int i2, int i3, int i4) {
        int e2;
        t tVar = this.f372b;
        tVar.f369e = i;
        tVar.f367b = i;
        tVar.f370f = i2;
        tVar.f368c = i3;
        tVar.d = i4;
        while (true) {
            C0003d c0003d = this.f373c;
            K1.p pVar = c0003d.f299c;
            boolean a2 = pVar.a();
            ArrayList arrayList = c0003d.f298b;
            if (a2) {
                List z02 = W0.j.z0(arrayList);
                arrayList.clear();
                return z02;
            }
            byte h = pVar.h();
            byte[] bArr = y1.b.f4648a;
            int i5 = h & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((h & 128) == 128) {
                e2 = c0003d.e(i5, 127);
                int i6 = e2 - 1;
                if (i6 >= 0) {
                    C0002c[] c0002cArr = f.f309a;
                    if (i6 <= c0002cArr.length - 1) {
                        arrayList.add(c0002cArr[i6]);
                    }
                }
                int length = c0003d.f300e + 1 + (i6 - f.f309a.length);
                if (length < 0) {
                    break;
                }
                C0002c[] c0002cArr2 = c0003d.d;
                if (length >= c0002cArr2.length) {
                    break;
                }
                C0002c c0002c = c0002cArr2[length];
                i1.f.b(c0002c);
                arrayList.add(c0002c);
            } else if (i5 == 64) {
                C0002c[] c0002cArr3 = f.f309a;
                K1.i d2 = c0003d.d();
                f.a(d2);
                c0003d.c(new C0002c(d2, c0003d.d()));
            } else if ((h & 64) == 64) {
                c0003d.c(new C0002c(c0003d.b(c0003d.e(i5, 63) - 1), c0003d.d()));
            } else if ((h & 32) == 32) {
                int e3 = c0003d.e(i5, 31);
                c0003d.f297a = e3;
                if (e3 < 0 || e3 > 4096) {
                    break;
                }
                int i7 = c0003d.f302g;
                if (e3 < i7) {
                    if (e3 == 0) {
                        C0002c[] c0002cArr4 = c0003d.d;
                        W0.i.u0(c0002cArr4, 0, c0002cArr4.length);
                        c0003d.f300e = c0003d.d.length - 1;
                        c0003d.f301f = 0;
                        c0003d.f302g = 0;
                    } else {
                        c0003d.a(i7 - e3);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C0002c[] c0002cArr5 = f.f309a;
                K1.i d3 = c0003d.d();
                f.a(d3);
                arrayList.add(new C0002c(d3, c0003d.d()));
            } else {
                arrayList.add(new C0002c(c0003d.b(c0003d.e(i5, 15) - 1), c0003d.d()));
            }
        }
        throw new IOException(AbstractC0001b.f("Header index too large ", e2));
    }

    public final void i(m mVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte h = this.f371a.h();
            byte[] bArr = y1.b.f4648a;
            i4 = h & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            K1.p pVar = this.f371a;
            pVar.D();
            pVar.h();
            byte[] bArr2 = y1.b.f4648a;
            mVar.getClass();
            i -= 5;
        }
        List h2 = h(s.a(i, i2, i4), i4, i2, i3);
        mVar.getClass();
        mVar.f327b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            q qVar = mVar.f327b;
            qVar.getClass();
            qVar.i.c(new o(qVar.f340c + '[' + i3 + "] onHeaders", qVar, i3, h2, z3), 0L);
            return;
        }
        q qVar2 = mVar.f327b;
        synchronized (qVar2) {
            y f2 = qVar2.f(i3);
            if (f2 != null) {
                f2.i(y1.b.t(h2), z3);
                return;
            }
            if (qVar2.f342f) {
                return;
            }
            if (i3 <= qVar2.d) {
                return;
            }
            if (i3 % 2 == qVar2.f341e % 2) {
                return;
            }
            y yVar = new y(i3, qVar2, false, z3, y1.b.t(h2));
            qVar2.d = i3;
            qVar2.f339b.put(Integer.valueOf(i3), yVar);
            qVar2.f343g.e().c(new k(qVar2.f340c + '[' + i3 + "] onStream", qVar2, yVar, i5), 0L);
        }
    }

    public final void q(m mVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte h = this.f371a.h();
            byte[] bArr = y1.b.f4648a;
            i4 = h & 255;
        } else {
            i4 = 0;
        }
        int D2 = this.f371a.D() & Integer.MAX_VALUE;
        List h2 = h(s.a(i - 4, i2, i4), i4, i2, i3);
        mVar.getClass();
        q qVar = mVar.f327b;
        qVar.getClass();
        synchronized (qVar) {
            if (qVar.f359y.contains(Integer.valueOf(D2))) {
                qVar.E(D2, 2);
                return;
            }
            qVar.f359y.add(Integer.valueOf(D2));
            qVar.i.c(new o(qVar.f340c + '[' + D2 + "] onRequest", qVar, D2, h2), 0L);
        }
    }
}
