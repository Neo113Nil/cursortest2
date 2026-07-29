package o;

import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539Ur implements Closeable {
    public static final Logger k;
    public final N8 h;
    public final C0513Tr i;
    public final C2314yr j;

    static {
        Logger logger = Logger.getLogger(AbstractC0228Ir.class.getName());
        AbstractC0048Bt.m(logger, "getLogger(Http2::class.java.name)");
        k = logger;
    }

    public C0539Ur(JL jl) {
        AbstractC0048Bt.n(jl, Constants.ScionAnalytics.PARAM_SOURCE);
        this.h = jl;
        C0513Tr c0513Tr = new C0513Tr(jl);
        this.i = c0513Tr;
        this.j = new C2314yr(c0513Tr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x024e, code lost:
    
        throw new java.io.IOException(o.AbstractC2188wx.g(r13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(boolean z, C1401l0 c1401l0) {
        int i;
        int i2;
        Object[] array;
        try {
            this.h.y(9L);
            int r = HY.r(this.h);
            if (r > 16384) {
                throw new IOException(AbstractC2188wx.g(r, "FRAME_SIZE_ERROR: "));
            }
            int readByte = this.h.readByte() & 255;
            byte readByte2 = this.h.readByte();
            int i3 = readByte2 & 255;
            int readInt = this.h.readInt();
            int i4 = readInt & Integer.MAX_VALUE;
            Logger logger = k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0228Ir.a(true, i4, r, readByte, i3));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = AbstractC0228Ir.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : HY.g("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i5 = 3;
            int i6 = 2;
            switch (readByte) {
                case 0:
                    c(c1401l0, r, i3, i4);
                    return true;
                case 1:
                    k(c1401l0, r, i3, i4);
                    return true;
                case 2:
                    if (r != 5) {
                        throw new IOException(AbstractC1888sN.h(r, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    N8 n8 = this.h;
                    n8.readInt();
                    n8.readByte();
                    return true;
                case 3:
                    if (r != 4) {
                        throw new IOException(AbstractC1888sN.h(r, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.h.readInt();
                    int[] x = AbstractC1888sN.x(14);
                    int length = x.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            int i8 = x[i7];
                            if (AbstractC1888sN.v(i8) == readInt2) {
                                i = i8;
                            } else {
                                i7++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(AbstractC2188wx.g(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    C0461Rr c0461Rr = (C0461Rr) c1401l0.j;
                    if (i4 != 0 && (readInt & 1) == 0) {
                        r2 = 1;
                    }
                    if (r2 == 0) {
                        C0643Yr j = c0461Rr.j(i4);
                        if (j == null) {
                            return true;
                        }
                        j.j(i);
                        return true;
                    }
                    c0461Rr.p.c(new C0331Mr(c0461Rr.j + '[' + i4 + "] onReset", c0461Rr, i4, i, 1), 0L);
                    return true;
                case 4:
                    N8 n82 = this.h;
                    if (i4 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) == 0) {
                        if (r % 6 != 0) {
                            throw new IOException(AbstractC2188wx.g(r, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        XQ xq = new XQ();
                        C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, r), 6);
                        int i9 = Y.h;
                        int i10 = Y.i;
                        int i11 = Y.j;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                short readShort = n82.readShort();
                                byte[] bArr = HY.a;
                                int i12 = readShort & 65535;
                                int readInt3 = n82.readInt();
                                if (i12 != 2) {
                                    if (i12 == i5) {
                                        i12 = 4;
                                    } else if (i12 != 4) {
                                        if (i12 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        }
                                    } else {
                                        if (readInt3 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    }
                                } else if (readInt3 != 0 && readInt3 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                xq.c(i12, readInt3);
                                if (i9 != i10) {
                                    i9 += i11;
                                    i5 = 3;
                                }
                            }
                        }
                        C0461Rr c0461Rr2 = (C0461Rr) c1401l0.j;
                        c0461Rr2.f101o.c(new Lr(AbstractC1888sN.l(new StringBuilder(), c0461Rr2.j, " applyAndAckSettings"), c1401l0, xq, i6), 0L);
                        return true;
                    }
                    if (r != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    m(c1401l0, r, i3, i4);
                    return true;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (r != 8) {
                        throw new IOException(AbstractC2188wx.g(r, "TYPE_PING length != 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int readInt4 = this.h.readInt();
                    int readInt5 = this.h.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        ((C0461Rr) c1401l0.j).f101o.c(new C0331Mr(AbstractC1888sN.l(new StringBuilder(), ((C0461Rr) c1401l0.j).j, " ping"), (C0461Rr) c1401l0.j, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    C0461Rr c0461Rr3 = (C0461Rr) c1401l0.j;
                    synchronized (c0461Rr3) {
                        try {
                            if (readInt4 == 1) {
                                c0461Rr3.s++;
                            } else if (readInt4 == 2) {
                                c0461Rr3.u++;
                            } else if (readInt4 == 3) {
                                c0461Rr3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (r < 8) {
                        throw new IOException(AbstractC2188wx.g(r, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.h.readInt();
                    int readInt7 = this.h.readInt();
                    int i13 = r - 8;
                    int[] x2 = AbstractC1888sN.x(14);
                    int length2 = x2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            i2 = x2[i14];
                            if (AbstractC1888sN.v(i2) != readInt7) {
                                i14++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(AbstractC2188wx.g(readInt7, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C1347k9 c1347k9 = C1347k9.k;
                    if (i13 > 0) {
                        c1347k9 = this.h.i(i13);
                    }
                    AbstractC0048Bt.n(c1347k9, "debugData");
                    c1347k9.b();
                    C0461Rr c0461Rr4 = (C0461Rr) c1401l0.j;
                    synchronized (c0461Rr4) {
                        array = c0461Rr4.i.values().toArray(new C0643Yr[0]);
                        c0461Rr4.m = true;
                    }
                    C0643Yr[] c0643YrArr = (C0643Yr[]) array;
                    int length3 = c0643YrArr.length;
                    while (r2 < length3) {
                        C0643Yr c0643Yr = c0643YrArr[r2];
                        if (c0643Yr.a > readInt6 && c0643Yr.g()) {
                            c0643Yr.j(8);
                            ((C0461Rr) c1401l0.j).j(c0643Yr.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (r != 4) {
                        throw new IOException(AbstractC2188wx.g(r, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long readInt8 = this.h.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i4 == 0) {
                        C0461Rr c0461Rr5 = (C0461Rr) c1401l0.j;
                        synchronized (c0461Rr5) {
                            c0461Rr5.B += readInt8;
                            c0461Rr5.notifyAll();
                        }
                        return true;
                    }
                    C0643Yr c = ((C0461Rr) c1401l0.j).c(i4);
                    if (c != null) {
                        synchronized (c) {
                            c.f += readInt8;
                            if (readInt8 > 0) {
                                c.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.h.skip(r);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(C1401l0 c1401l0, int i, int i2, int i3) {
        int i4;
        boolean z;
        long j;
        boolean z2;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.h.readByte();
            byte[] bArr = HY.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int u0 = PX.u0(i, i2, i4);
        N8 n8 = this.h;
        AbstractC0048Bt.n(n8, Constants.ScionAnalytics.PARAM_SOURCE);
        C0461Rr c0461Rr = (C0461Rr) c1401l0.j;
        long j2 = 0;
        if (i3 == 0 || (i3 & 1) != 0) {
            C0643Yr c = c0461Rr.c(i3);
            if (c == null) {
                ((C0461Rr) c1401l0.j).t(i3, 2);
                long j3 = u0;
                ((C0461Rr) c1401l0.j).m(j3);
                n8.skip(j3);
            } else {
                byte[] bArr2 = HY.a;
                C0591Wr c0591Wr = c.i;
                long j4 = u0;
                c0591Wr.getClass();
                long j5 = j4;
                while (true) {
                    if (j5 <= j2) {
                        C0643Yr c0643Yr = c0591Wr.m;
                        byte[] bArr3 = HY.a;
                        c0643Yr.b.m(j4);
                        break;
                    }
                    synchronized (c0591Wr.m) {
                        z = c0591Wr.i;
                        j = j2;
                        z2 = c0591Wr.k.i + j5 > c0591Wr.h;
                    }
                    if (z2) {
                        n8.skip(j5);
                        c0591Wr.m.e(4);
                        break;
                    }
                    if (z) {
                        n8.skip(j5);
                        break;
                    }
                    long read = n8.read(c0591Wr.j, j5);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j5 -= read;
                    C0643Yr c0643Yr2 = c0591Wr.m;
                    synchronized (c0643Yr2) {
                        try {
                            if (c0591Wr.l) {
                                c0591Wr.j.b();
                            } else {
                                G8 g8 = c0591Wr.k;
                                boolean z4 = g8.i == j;
                                g8.E(c0591Wr.j);
                                if (z4) {
                                    c0643Yr2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j;
                }
                if (z3) {
                    c.i(HY.b, true);
                }
            }
        } else {
            G8 g82 = new G8();
            long j6 = u0;
            n8.y(j6);
            n8.read(g82, j6);
            c0461Rr.p.c(new C0357Nr(c0461Rr.j + '[' + i3 + "] onData", c0461Rr, i3, g82, u0, z3), 0L);
        }
        this.h.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    public final List j(int i, int i2, int i3, int i4) {
        C0513Tr c0513Tr = this.i;
        c0513Tr.l = i;
        c0513Tr.i = i;
        c0513Tr.m = i2;
        c0513Tr.j = i3;
        c0513Tr.k = i4;
        C2314yr c2314yr = this.j;
        JL jl = c2314yr.c;
        ArrayList arrayList = c2314yr.b;
        while (!jl.b()) {
            byte readByte = jl.readByte();
            byte[] bArr = HY.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e = c2314yr.e(i5, 127);
                int i6 = e - 1;
                if (i6 >= 0) {
                    C1721pr[] c1721prArr = AbstractC0020Ar.a;
                    if (i6 <= c1721prArr.length - 1) {
                        arrayList.add(c1721prArr[i6]);
                    }
                }
                int length = c2314yr.e + 1 + (i6 - AbstractC0020Ar.a.length);
                if (length >= 0) {
                    C1721pr[] c1721prArr2 = c2314yr.d;
                    if (length < c1721prArr2.length) {
                        C1721pr c1721pr = c1721prArr2[length];
                        AbstractC0048Bt.k(c1721pr);
                        arrayList.add(c1721pr);
                    }
                }
                throw new IOException(AbstractC2188wx.g(e, "Header index too large "));
            }
            if (i5 == 64) {
                C1721pr[] c1721prArr3 = AbstractC0020Ar.a;
                C1347k9 d = c2314yr.d();
                AbstractC0020Ar.a(d);
                c2314yr.c(new C1721pr(d, c2314yr.d()));
            } else if ((readByte & 64) == 64) {
                c2314yr.c(new C1721pr(c2314yr.b(c2314yr.e(i5, 63) - 1), c2314yr.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = c2314yr.e(i5, 31);
                c2314yr.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2314yr.a);
                }
                int i7 = c2314yr.g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        C1721pr[] c1721prArr4 = c2314yr.d;
                        P6.g0(c1721prArr4, 0, c1721prArr4.length);
                        c2314yr.e = c2314yr.d.length - 1;
                        c2314yr.f = 0;
                        c2314yr.g = 0;
                    } else {
                        c2314yr.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C1721pr[] c1721prArr5 = AbstractC0020Ar.a;
                C1347k9 d2 = c2314yr.d();
                AbstractC0020Ar.a(d2);
                arrayList.add(new C1721pr(d2, c2314yr.d()));
            } else {
                arrayList.add(new C1721pr(c2314yr.b(c2314yr.e(i5, 15) - 1), c2314yr.d()));
            }
        }
        List J0 = AbstractC0720ac.J0(arrayList);
        arrayList.clear();
        return J0;
    }

    public final void k(C1401l0 c1401l0, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i4 = 0;
        int i5 = 1;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.h.readByte();
            byte[] bArr = HY.a;
            i4 = readByte & 255;
        }
        if ((i2 & 32) != 0) {
            N8 n8 = this.h;
            n8.readInt();
            n8.readByte();
            byte[] bArr2 = HY.a;
            i -= 5;
        }
        List j = j(PX.u0(i, i2, i4), i4, i2, i3);
        C0461Rr c0461Rr = (C0461Rr) c1401l0.j;
        if (i3 != 0 && (i3 & 1) == 0) {
            c0461Rr.p.c(new C0383Or(c0461Rr.j + '[' + i3 + "] onHeaders", c0461Rr, i3, j, z), 0L);
            return;
        }
        synchronized (c0461Rr) {
            C0643Yr c = c0461Rr.c(i3);
            if (c != null) {
                c.i(HY.t(j), z);
                return;
            }
            if (c0461Rr.m) {
                return;
            }
            if (i3 <= c0461Rr.k) {
                return;
            }
            if (i3 % 2 == c0461Rr.l % 2) {
                return;
            }
            C0643Yr c0643Yr = new C0643Yr(i3, c0461Rr, false, z, HY.t(j));
            c0461Rr.k = i3;
            c0461Rr.i.put(Integer.valueOf(i3), c0643Yr);
            c0461Rr.n.e().c(new Lr(c0461Rr.j + '[' + i3 + "] onStream", c0461Rr, c0643Yr, i5), 0L);
        }
    }

    public final void m(C1401l0 c1401l0, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.h.readByte();
            byte[] bArr = HY.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.h.readInt() & Integer.MAX_VALUE;
        List j = j(PX.u0(i - 4, i2, i4), i4, i2, i3);
        C0461Rr c0461Rr = (C0461Rr) c1401l0.j;
        synchronized (c0461Rr) {
            if (c0461Rr.F.contains(Integer.valueOf(readInt))) {
                c0461Rr.t(readInt, 2);
                return;
            }
            c0461Rr.F.add(Integer.valueOf(readInt));
            c0461Rr.p.c(new C0383Or(c0461Rr.j + '[' + readInt + "] onRequest", c0461Rr, readInt, j), 0L);
        }
    }
}
