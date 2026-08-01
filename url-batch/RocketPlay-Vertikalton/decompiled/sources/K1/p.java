package K1;

import a1.AbstractC0067d;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f764a;

    /* renamed from: b, reason: collision with root package name */
    public final f f765b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f766c;

    public p(v vVar) {
        i1.f.e(vVar, "source");
        this.f764a = vVar;
        this.f765b = new f();
    }

    public final int D() {
        I(4L);
        return this.f765b.D();
    }

    public final int E() {
        I(4L);
        int D2 = this.f765b.D();
        return ((D2 & 255) << 24) | (((-16777216) & D2) >>> 24) | ((16711680 & D2) >>> 8) | ((65280 & D2) << 8);
    }

    public final short F() {
        I(2L);
        return this.f765b.E();
    }

    public final String G(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long f2 = f((byte) 10, 0L, j3);
        f fVar = this.f765b;
        if (f2 != -1) {
            return L1.a.a(fVar, f2);
        }
        if (j3 < Long.MAX_VALUE && H(j3) && fVar.f(j3 - 1) == 13 && H(1 + j3) && fVar.f(j3) == 10) {
            return L1.a.a(fVar, j3);
        }
        f fVar2 = new f();
        long min = Math.min(32, fVar.f746b);
        long j4 = 0;
        fVar.getClass();
        i1.f.e(fVar2, "out");
        F1.d.p(fVar.f746b, 0L, min);
        if (min != 0) {
            fVar2.f746b += min;
            q qVar = fVar.f745a;
            while (true) {
                i1.f.b(qVar);
                long j5 = qVar.f769c - qVar.f768b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                qVar = qVar.f771f;
            }
            while (min > 0) {
                i1.f.b(qVar);
                q c2 = qVar.c();
                int i = c2.f768b + ((int) j4);
                c2.f768b = i;
                c2.f769c = Math.min(i + ((int) min), c2.f769c);
                q qVar2 = fVar2.f745a;
                if (qVar2 == null) {
                    c2.f772g = c2;
                    c2.f771f = c2;
                    fVar2.f745a = c2;
                } else {
                    q qVar3 = qVar2.f772g;
                    i1.f.b(qVar3);
                    qVar3.b(c2);
                }
                min -= c2.f769c - c2.f768b;
                qVar = qVar.f771f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f746b, j2) + " content=" + fVar2.q(fVar2.f746b).b() + (char) 8230);
    }

    public final boolean H(long j2) {
        f fVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f766c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f765b;
            if (fVar.f746b >= j2) {
                return true;
            }
        } while (this.f764a.z(fVar, 8192L) != -1);
        return false;
    }

    public final void I(long j2) {
        if (!H(j2)) {
            throw new EOFException();
        }
    }

    public final void J(long j2) {
        if (this.f766c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            f fVar = this.f765b;
            if (fVar.f746b == 0 && this.f764a.z(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, fVar.f746b);
            fVar.G(min);
            j2 -= min;
        }
    }

    public final boolean a() {
        if (this.f766c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f765b;
        return fVar.a() && this.f764a.z(fVar, 8192L) == -1;
    }

    @Override // K1.v
    public final x b() {
        return this.f764a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f766c) {
            return;
        }
        this.f766c = true;
        this.f764a.close();
        f fVar = this.f765b;
        fVar.G(fVar.f746b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f746b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(byte b2, long j2, long j3) {
        long j4;
        q qVar;
        p pVar = this;
        long j5 = j3;
        if (pVar.f766c) {
            throw new IllegalStateException("closed");
        }
        long j6 = 0;
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        while (true) {
            if (j6 >= j5) {
                j4 = -1;
                break;
            }
            f fVar = pVar.f765b;
            fVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = fVar.f746b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (qVar = fVar.f745a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (qVar.f769c - qVar.f768b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        qVar = qVar.f771f;
                        i1.f.b(qVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(qVar.f769c, (qVar.f768b + j9) - j7);
                        for (int i = (int) ((qVar.f768b + j12) - j7); i < min; i++) {
                            if (qVar.f767a[i] == b2) {
                                j10 = (i - qVar.f768b) + j7;
                                break;
                            }
                        }
                        j12 = (qVar.f769c - qVar.f768b) + j7;
                        qVar = qVar.f771f;
                        i1.f.b(qVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        qVar = qVar.f772g;
                        i1.f.b(qVar);
                        j8 -= qVar.f769c - qVar.f768b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(qVar.f769c, (qVar.f768b + j9) - j8);
                        for (int i2 = (int) ((qVar.f768b + j13) - j8); i2 < min2; i2++) {
                            if (qVar.f767a[i2] == b2) {
                                j10 = (i2 - qVar.f768b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (qVar.f769c - qVar.f768b);
                        qVar = qVar.f771f;
                        i1.f.b(qVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = fVar.f746b;
            if (j14 >= j3) {
                break;
            }
            pVar = this;
            if (pVar.f764a.z(fVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // K1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(n nVar) {
        i1.f.e(nVar, "options");
        if (this.f766c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f765b;
            int b2 = L1.a.b(fVar, nVar, true);
            if (b2 != -2) {
                if (b2 != -1) {
                    fVar.G(nVar.f759a[b2].a());
                    return b2;
                }
            } else if (this.f764a.z(fVar, 8192L) == -1) {
                break;
            }
        }
    }

    public final byte h() {
        I(1L);
        return this.f765b.h();
    }

    public final i i(long j2) {
        I(j2);
        return this.f765b.q(j2);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f766c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f746b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q() {
        f fVar;
        long j2;
        int i;
        int i2;
        byte f2;
        I(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean H2 = H(i4);
            fVar = this.f765b;
            if (!H2) {
                break;
            }
            f2 = fVar.f(i3);
            if ((f2 < 48 || f2 > 57) && ((f2 < 97 || f2 > 102) && (f2 < 65 || f2 > 70))) {
                break;
            }
            i3 = i4;
        }
        if (i3 == 0) {
            AbstractC0067d.a(16);
            AbstractC0067d.a(16);
            String num = Integer.toString(f2, 16);
            i1.f.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (fVar.f746b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            q qVar = fVar.f745a;
            i1.f.b(qVar);
            int i6 = qVar.f768b;
            int i7 = qVar.f769c;
            int i8 = i5;
            while (i6 < i7) {
                byte b2 = qVar.f767a[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    i = i8;
                    j2 = 0;
                    if (i == 0) {
                        char[] cArr = L1.b.f808a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    z2 = true;
                    if (i6 != i7) {
                        fVar.f745a = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f768b = i6;
                    }
                    if (!!z2 || fVar.f745a == null) {
                        break;
                    }
                    i5 = i;
                    j3 = j2;
                } else {
                    i2 = b2 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    f fVar2 = new f();
                    fVar2.N(j4);
                    fVar2.M(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar2.F(fVar2.f746b, p1.a.f3802a)));
                }
                j4 = (j4 << 4) | i2;
                i6++;
                i8++;
                j3 = 0;
            }
            j2 = j3;
            i = i8;
            if (i6 != i7) {
            }
            if (!z2) {
                break;
            }
            break;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        i1.f.e(byteBuffer, "sink");
        f fVar = this.f765b;
        if (fVar.f746b == 0 && this.f764a.z(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f764a + ')';
    }

    @Override // K1.h
    public final String y(Charset charset) {
        f fVar = this.f765b;
        fVar.L(this.f764a);
        return fVar.F(fVar.f746b, charset);
    }

    @Override // K1.v
    public final long z(f fVar, long j2) {
        i1.f.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f766c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f765b;
        if (fVar2.f746b == 0 && this.f764a.z(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.z(fVar, Math.min(j2, fVar2.f746b));
    }
}
