package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class pn implements Closeable {
    public static final Logger i;
    public final o8 f;
    public final on g;
    public final um h;

    static {
        Logger logger = Logger.getLogger(cn.class.getName());
        logger.getClass();
        i = logger;
    }

    public pn(px pxVar) {
        pxVar.getClass();
        this.f = pxVar;
        on onVar = new on(pxVar);
        this.g = onVar;
        this.h = new um(onVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        defpackage.l8.y(defpackage.n20.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x023d, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z, hn hnVar) {
        int i2;
        int i3;
        int i4;
        Object[] array;
        try {
            this.f.h(9L);
            int q = z60.q(this.f);
            if (q > 16384) {
                l8.y(n20.e("FRAME_SIZE_ERROR: ", q));
                return false;
            }
            int readByte = this.f.readByte() & 255;
            byte readByte2 = this.f.readByte();
            int i5 = readByte2 & 255;
            int readInt = this.f.readInt();
            int i6 = readInt & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cn.a(true, i6, q, readByte, i5));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = cn.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : z60.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (readByte) {
                case 0:
                    n(hnVar, q, i5, i6);
                    return true;
                case 1:
                    p(hnVar, q, i5, i6);
                    return true;
                case 2:
                    if (q != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q + " != 5");
                    }
                    if (i6 == 0) {
                        l8.y("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    o8 o8Var = this.f;
                    o8Var.readInt();
                    o8Var.readByte();
                    return true;
                case 3:
                    if (q != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q + " != 4");
                    }
                    if (i6 == 0) {
                        l8.y("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.f.readInt();
                    int[] k = n20.k(14);
                    int length = k.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i9 = k[i8];
                            if (n20.h(i9) == readInt2) {
                                i2 = i9;
                            } else {
                                i8++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        l8.y(n20.e("TYPE_RST_STREAM unexpected error code: ", readInt2));
                        return false;
                    }
                    mn mnVar = hnVar.g;
                    if (i6 != 0 && (readInt & 1) == 0) {
                        mnVar.n.c(new gn(mnVar.h + '[' + i6 + "] onReset", mnVar, i6, i2, 1), 0L);
                        return true;
                    }
                    tn o = mnVar.o(i6);
                    if (o == null) {
                        return true;
                    }
                    synchronized (o) {
                        if (i2 == 0) {
                            throw null;
                        }
                        if (o.m == 0) {
                            o.m = i2;
                            o.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    o8 o8Var2 = this.f;
                    if (i6 != 0) {
                        l8.y("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q % 6 != 0) {
                            l8.y(n20.e("TYPE_SETTINGS length % 6 != 0: ", q));
                            return false;
                        }
                        k10 k10Var = new k10();
                        ko Z = m60.Z(m60.b0(0, q), 6);
                        int i10 = Z.f;
                        int i11 = Z.g;
                        int i12 = Z.h;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                short readShort = o8Var2.readShort();
                                byte[] bArr = z60.a;
                                int i13 = readShort & 65535;
                                int readInt3 = o8Var2.readInt();
                                if (i13 == 2) {
                                    boolean z2 = r2;
                                    i3 = z2;
                                    i3 = z2;
                                    if (readInt3 != 0 && readInt3 != 1) {
                                        l8.y("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i13 == 3) {
                                    i3 = r2;
                                    i13 = 4;
                                } else if (i13 == 4) {
                                    boolean z3 = r2;
                                    if (readInt3 < 0) {
                                        l8.y("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z3;
                                    }
                                    i13 = 7;
                                    i3 = z3;
                                } else if (i13 == 5) {
                                    boolean z4 = r2;
                                    if (readInt3 < 16384) {
                                        break;
                                    } else {
                                        i3 = z4;
                                        if (readInt3 > 16777215) {
                                            break;
                                        }
                                    }
                                } else {
                                    i3 = r2;
                                }
                                k10Var.b(i13, readInt3);
                                if (i10 != i11) {
                                    i10 += i12;
                                    r2 = i3;
                                }
                            }
                        }
                        mn mnVar2 = hnVar.g;
                        mnVar2.m.c(new fn(mnVar2.h + " applyAndAckSettings", hnVar, k10Var, i7), 0L);
                        return true;
                    }
                    if (q != 0) {
                        l8.y("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    q(hnVar, q, i5, i6);
                    return true;
                case 6:
                    if (q != 8) {
                        l8.y(n20.e("TYPE_PING length != 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        l8.y("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.f.readInt();
                    int readInt5 = this.f.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    mn mnVar3 = hnVar.g;
                    if (r2 == 0) {
                        mnVar3.m.c(new gn(hnVar.g.h + " ping", hnVar.g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (mnVar3) {
                        try {
                            if (readInt4 == 1) {
                                mnVar3.q++;
                            } else if (readInt4 == 2) {
                                mnVar3.s++;
                            } else if (readInt4 == 3) {
                                mnVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q < 8) {
                        l8.y(n20.e("TYPE_GOAWAY length < 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        l8.y("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.f.readInt();
                    int readInt7 = this.f.readInt();
                    int i14 = q - 8;
                    int[] k2 = n20.k(14);
                    int length2 = k2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i4 = k2[i15];
                            if (n20.h(i4) != readInt7) {
                                i15++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        l8.y(n20.e("TYPE_GOAWAY unexpected error code: ", readInt7));
                        return false;
                    }
                    r8 r8Var = r8.i;
                    if (i14 > 0) {
                        r8Var = this.f.c(i14);
                    }
                    r8Var.getClass();
                    r8Var.a();
                    mn mnVar4 = hnVar.g;
                    synchronized (mnVar4) {
                        array = mnVar4.g.values().toArray(new tn[0]);
                        mnVar4.k = true;
                    }
                    tn[] tnVarArr = (tn[]) array;
                    int length3 = tnVarArr.length;
                    while (r2 < length3) {
                        tn tnVar = tnVarArr[r2];
                        if (tnVar.a > readInt6 && tnVar.f()) {
                            synchronized (tnVar) {
                                if (tnVar.m == 0) {
                                    tnVar.m = 8;
                                    tnVar.notifyAll();
                                }
                            }
                            hnVar.g.o(tnVar.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (q != 4) {
                        l8.y(n20.e("TYPE_WINDOW_UPDATE length !=4: ", q));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.f.readInt();
                    if (readInt8 == 0) {
                        l8.y("windowSizeIncrement was 0");
                        return false;
                    }
                    mn mnVar5 = hnVar.g;
                    if (i6 == 0) {
                        synchronized (mnVar5) {
                            mnVar5.z += readInt8;
                            mnVar5.notifyAll();
                        }
                        return true;
                    }
                    tn n = mnVar5.n(i6);
                    if (n != null) {
                        synchronized (n) {
                            n.f += readInt8;
                            if (readInt8 > 0) {
                                n.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f.skip(q);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void n(hn hnVar, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        if (i4 == 0) {
            l8.y("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            l8.y("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = z60.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int w = oo.w(i2, i3, i5);
        o8 o8Var = this.f;
        o8Var.getClass();
        mn mnVar = hnVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            m8 m8Var = new m8();
            long j = w;
            o8Var.h(j);
            o8Var.b(j, m8Var);
            mnVar.n.c(new in(mnVar.h + '[' + i4 + "] onData", mnVar, i4, m8Var, w, z3), 0L);
        } else {
            tn n = mnVar.n(i4);
            if (n == null) {
                hnVar.g.s(i4, 2);
                long j2 = w;
                hnVar.g.q(j2);
                o8Var.skip(j2);
            } else {
                byte[] bArr2 = z60.a;
                rn rnVar = n.i;
                long j3 = w;
                rnVar.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        rnVar.m(j3);
                        break;
                    }
                    synchronized (rnVar.k) {
                        z = rnVar.g;
                        z2 = rnVar.i.g + j4 > rnVar.f;
                    }
                    if (z2) {
                        o8Var.skip(j4);
                        rnVar.k.e(4);
                        break;
                    }
                    if (z) {
                        o8Var.skip(j4);
                        break;
                    }
                    long b = o8Var.b(j4, rnVar.h);
                    if (b == -1) {
                        throw new EOFException();
                    }
                    j4 -= b;
                    tn tnVar = rnVar.k;
                    synchronized (tnVar) {
                        try {
                            if (rnVar.j) {
                                m8 m8Var2 = rnVar.h;
                                m8Var2.skip(m8Var2.g);
                            } else {
                                m8 m8Var3 = rnVar.i;
                                boolean z4 = m8Var3.g == 0;
                                m8Var3.v(rnVar.h);
                                if (z4) {
                                    tnVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    n.h(z60.b, true);
                }
            }
        }
        this.f.skip(i5);
    }

    public final List o(int i2, int i3, int i4, int i5) {
        on onVar = this.g;
        onVar.j = i2;
        onVar.g = i2;
        onVar.k = i3;
        onVar.h = i4;
        onVar.i = i5;
        um umVar = this.h;
        px pxVar = umVar.c;
        ArrayList arrayList = umVar.b;
        while (!pxVar.m()) {
            byte readByte = pxVar.readByte();
            byte[] bArr = z60.a;
            int i6 = readByte & 255;
            if (i6 == 128) {
                l8.y("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = umVar.e(i6, 127);
                int i7 = e - 1;
                if (i7 >= 0) {
                    mm[] mmVarArr = wm.a;
                    if (i7 <= mmVarArr.length - 1) {
                        arrayList.add(mmVarArr[i7]);
                    }
                }
                int length = umVar.e + 1 + (i7 - wm.a.length);
                if (length >= 0) {
                    mm[] mmVarArr2 = umVar.d;
                    if (length < mmVarArr2.length) {
                        mm mmVar = mmVarArr2[length];
                        mmVar.getClass();
                        arrayList.add(mmVar);
                    }
                }
                l8.y(n20.e("Header index too large ", e));
                return null;
            }
            if (i6 == 64) {
                mm[] mmVarArr3 = wm.a;
                r8 d = umVar.d();
                wm.a(d);
                umVar.c(new mm(d, umVar.d()));
            } else if ((readByte & 64) == 64) {
                umVar.c(new mm(umVar.b(umVar.e(i6, 63) - 1), umVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = umVar.e(i6, 31);
                umVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + umVar.a);
                }
                int i8 = umVar.g;
                if (e2 < i8) {
                    if (e2 == 0) {
                        mm[] mmVarArr4 = umVar.d;
                        o6.q0(mmVarArr4, 0, mmVarArr4.length);
                        umVar.e = umVar.d.length - 1;
                        umVar.f = 0;
                        umVar.g = 0;
                    } else {
                        umVar.a(i8 - e2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                mm[] mmVarArr5 = wm.a;
                r8 d2 = umVar.d();
                wm.a(d2);
                arrayList.add(new mm(d2, umVar.d()));
            } else {
                arrayList.add(new mm(umVar.b(umVar.e(i6, 15) - 1), umVar.d()));
            }
        }
        List c0 = ua.c0(arrayList);
        arrayList.clear();
        return c0;
    }

    public final void p(hn hnVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            l8.y("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = z60.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            o8 o8Var = this.f;
            o8Var.readInt();
            o8Var.readByte();
            byte[] bArr2 = z60.a;
            i2 -= 5;
        }
        List o = o(oo.w(i2, i3, i5), i5, i3, i4);
        mn mnVar = hnVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            mnVar.n.c(new jn(mnVar.h + '[' + i4 + "] onHeaders", mnVar, i4, o, z2), 0L);
            return;
        }
        synchronized (mnVar) {
            tn n = mnVar.n(i4);
            if (n != null) {
                n.h(z60.s(o), z2);
                return;
            }
            if (mnVar.k) {
                return;
            }
            if (i4 <= mnVar.i) {
                return;
            }
            if (i4 % 2 == mnVar.j % 2) {
                return;
            }
            tn tnVar = new tn(i4, mnVar, false, z2, z60.s(o));
            mnVar.i = i4;
            mnVar.g.put(Integer.valueOf(i4), tnVar);
            mnVar.l.e().c(new fn(mnVar.h + '[' + i4 + "] onStream", mnVar, tnVar, i6), 0L);
        }
    }

    public final void q(hn hnVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            l8.y("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = z60.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int readInt = this.f.readInt() & Integer.MAX_VALUE;
        List o = o(oo.w(i2 - 4, i3, i5), i5, i3, i4);
        mn mnVar = hnVar.g;
        synchronized (mnVar) {
            if (mnVar.D.contains(Integer.valueOf(readInt))) {
                mnVar.s(readInt, 2);
                return;
            }
            mnVar.D.add(Integer.valueOf(readInt));
            mnVar.n.c(new jn(mnVar.h + '[' + readInt + "] onRequest", mnVar, readInt, o), 0L);
        }
    }
}
