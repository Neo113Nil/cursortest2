package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class gk1 extends fo {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public nn0 A0;
    public jw0 B;
    public cb0 B0;
    public jw0 C;
    public long C0;
    public um0 D;
    public long D0;
    public um0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public xj1 K;
    public jw0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public fk1 Q;
    public ck1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public wq d0;
    public long e0;
    public int f0;
    public int g0;
    public ByteBuffer h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final vj1 n;
    public boolean n0;
    public final ik1 o;
    public int o0;
    public final boolean p;
    public int p0;
    public final float q;
    public int q0;
    public final fb0 r;
    public boolean r0;
    public final fb0 s;
    public boolean s0;
    public final fb0 t;
    public boolean t0;
    public final qo u;
    public long u0;
    public final b73 v;
    public long v0;
    public final ArrayList w;
    public boolean w0;
    public final MediaCodec.BufferInfo x;
    public boolean x0;
    public final long[] y;
    public boolean y0;
    public final long[] z;
    public boolean z0;

    public gk1(int i, vj1 vj1Var, ik1 ik1Var, boolean z, float f) {
        super(i);
        this.n = vj1Var;
        ik1Var.getClass();
        this.o = ik1Var;
        this.p = z;
        this.q = f;
        this.r = new fb0(0);
        this.s = new fb0(0);
        this.t = new fb0(2);
        qo qoVar = new qo();
        this.u = qoVar;
        this.v = new b73();
        this.w = new ArrayList();
        this.x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.y = new long[10];
        this.z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        qoVar.c(0);
        qoVar.d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.o0 = 0;
        this.f0 = -1;
        this.g0 = -1;
        this.e0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.p0 = 0;
        this.q0 = 0;
    }

    public abstract float a(float f, jw0[] jw0VarArr);

    public abstract int a(ik1 ik1Var, jw0 jw0Var);

    @Override // yads.fo
    public final int a(jw0 jw0Var) {
        try {
            return a(this.o, jw0Var);
        } catch (lk1 e) {
            throw a((Exception) e, jw0Var, false, 4002);
        }
    }

    public abstract ArrayList a(ik1 ik1Var, jw0 jw0Var, boolean z);

    public abstract hb0 a(ck1 ck1Var, jw0 jw0Var, jw0 jw0Var2);

    public abstract uj1 a(ck1 ck1Var, jw0 jw0Var, MediaCrypto mediaCrypto, float f);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j, long j2);

    public void a(fb0 fb0Var) {
    }

    public abstract void a(jw0 jw0Var, MediaFormat mediaFormat);

    public abstract boolean a(long j, long j2, xj1 xj1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, jw0 jw0Var);

    public boolean a(ck1 ck1Var) {
        return true;
    }

    public abstract void b(fb0 fb0Var);

    public boolean b(jw0 jw0Var) {
        return false;
    }

    public final boolean c(int i) {
        kw0 kw0Var = this.c;
        kw0Var.a = null;
        kw0Var.b = null;
        this.r.b();
        int a = a(kw0Var, this.r, i | 4);
        if (a == -5) {
            a(kw0Var);
            return true;
        }
        if (a != -4 || !this.r.b(4)) {
            return false;
        }
        this.w0 = true;
        s();
        return false;
    }

    @Override // yads.fo
    public boolean e() {
        return this.x0;
    }

    @Override // yads.fo
    public boolean f() {
        boolean c;
        if (this.B == null) {
            return false;
        }
        if (d()) {
            c = this.l;
        } else {
            ys2 ys2Var = this.h;
            ys2Var.getClass();
            c = ys2Var.c();
        }
        if (!c) {
            if (!(this.g0 >= 0) && (this.e0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.e0)) {
                return false;
            }
        }
        return true;
    }

    @Override // yads.fo
    public final int k() {
        return 8;
    }

    public final boolean l() {
        if (this.r0) {
            this.p0 = 1;
            if (this.U || this.W) {
                this.q0 = 3;
                return false;
            }
            this.q0 = 2;
        } else {
            x();
        }
        return true;
    }

    public final boolean m() {
        boolean z;
        int i;
        int i2;
        xj1 xj1Var = this.K;
        if (xj1Var == null || this.p0 == 2 || this.w0) {
            return false;
        }
        if (this.f0 < 0) {
            int b = xj1Var.b();
            this.f0 = b;
            if (b < 0) {
                return false;
            }
            this.s.d = this.K.b(b);
            this.s.b();
        }
        if (this.p0 == 1) {
            if (!this.c0) {
                this.s0 = true;
                this.K.a(this.f0, 0, 0L, 4);
                this.f0 = -1;
                this.s.d = null;
            }
            this.p0 = 2;
            return false;
        }
        if (this.a0) {
            this.a0 = false;
            this.s.d.put(F0);
            this.K.a(this.f0, 38, 0L, 0);
            this.f0 = -1;
            this.s.d = null;
            this.r0 = true;
            return true;
        }
        if (this.o0 == 1) {
            for (int i3 = 0; i3 < this.L.o.size(); i3++) {
                this.s.d.put((byte[]) this.L.o.get(i3));
            }
            this.o0 = 2;
        }
        int position = this.s.d.position();
        kw0 kw0Var = this.c;
        kw0Var.a = null;
        kw0Var.b = null;
        try {
            int a = a(kw0Var, this.s, 0);
            if (d()) {
                this.v0 = this.u0;
            }
            if (a == -3) {
                return false;
            }
            if (a == -5) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                a(kw0Var);
                return true;
            }
            if (this.s.b(4)) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                this.w0 = true;
                if (!this.r0) {
                    s();
                    return false;
                }
                try {
                    if (!this.c0) {
                        this.s0 = true;
                        this.K.a(this.f0, 0, 0L, 4);
                        this.f0 = -1;
                        this.s.d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    jw0 jw0Var = this.B;
                    int errorCode = e.getErrorCode();
                    int i4 = sb3.a;
                    if (errorCode != 2 && errorCode != 4) {
                        if (errorCode != 10) {
                            if (errorCode != 7) {
                                if (errorCode != 8) {
                                    switch (errorCode) {
                                        case 15:
                                            break;
                                        case 16:
                                        case 18:
                                            break;
                                        case 17:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                    i2 = 6002;
                                                    break;
                                                default:
                                                    i2 = 6006;
                                                    break;
                                            }
                                    }
                                    throw a((Exception) e, jw0Var, false, i2);
                                }
                                i2 = 6003;
                                throw a((Exception) e, jw0Var, false, i2);
                            }
                        }
                        i2 = 6004;
                        throw a((Exception) e, jw0Var, false, i2);
                    }
                    i2 = 6005;
                    throw a((Exception) e, jw0Var, false, i2);
                }
            }
            if (!this.r0 && !this.s.b(1)) {
                this.s.b();
                if (this.o0 == 2) {
                    this.o0 = 1;
                }
                return true;
            }
            boolean b2 = this.s.b(1073741824);
            if (b2) {
                q20 q20Var = this.s.c;
                if (position == 0) {
                    q20Var.getClass();
                } else {
                    if (q20Var.d == null) {
                        int[] iArr = new int[1];
                        q20Var.d = iArr;
                        q20Var.i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = q20Var.d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.T && !b2) {
                ByteBuffer byteBuffer = this.s.d;
                int position2 = byteBuffer.position();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = i5 + 1;
                    if (i7 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i8 = byteBuffer.get(i5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (i6 == 3) {
                        if (i8 == 1 && (byteBuffer.get(i7) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.position(i5 - 3);
                            duplicate.limit(position2);
                            byteBuffer.position(0);
                            byteBuffer.put(duplicate);
                            break;
                        }
                    } else if (i8 == 0) {
                        i6++;
                    }
                    if (i8 != 0) {
                        i6 = 0;
                    }
                    i5 = i7;
                }
                if (this.s.d.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            fb0 fb0Var = this.s;
            long j = fb0Var.f;
            wq wqVar = this.d0;
            if (wqVar != null) {
                jw0 jw0Var2 = this.B;
                if (wqVar.b == 0) {
                    wqVar.a = j;
                }
                if (!wqVar.c) {
                    ByteBuffer byteBuffer2 = fb0Var.d;
                    byteBuffer2.getClass();
                    int i9 = 0;
                    for (int i10 = 0; i10 < 4; i10++) {
                        i9 = (i9 << 8) | (byteBuffer2.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    }
                    int b3 = dw1.b(i9);
                    if (b3 == -1) {
                        wqVar.c = true;
                        wqVar.b = 0L;
                        wqVar.a = fb0Var.f;
                        gh1.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = fb0Var.f;
                    } else {
                        long max = wqVar.a + Math.max(0L, ((wqVar.b - 529) * 1000000) / jw0Var2.A);
                        wqVar.b += b3;
                        j = max;
                    }
                }
                long j2 = this.u0;
                wq wqVar2 = this.d0;
                jw0 jw0Var3 = this.B;
                wqVar2.getClass();
                this.u0 = Math.max(j2, Math.max(0L, ((wqVar2.b - 529) * 1000000) / jw0Var3.A) + wqVar2.a);
            }
            long j3 = j;
            if (this.s.b(Integer.MIN_VALUE)) {
                this.w.add(Long.valueOf(j3));
            }
            if (this.y0) {
                this.v.a(this.B, j3);
                this.y0 = false;
            }
            this.u0 = Math.max(this.u0, j3);
            this.s.c();
            if (this.s.b(268435456)) {
                a(this.s);
            }
            b(this.s);
            try {
                if (b2) {
                    this.K.a(this.f0, this.s.c, j3);
                } else {
                    this.K.a(this.f0, this.s.d.limit(), j3, 0);
                }
                this.f0 = -1;
                this.s.d = null;
                this.r0 = true;
                this.o0 = 0;
                this.B0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                jw0 jw0Var4 = this.B;
                int errorCode2 = e2.getErrorCode();
                int i11 = sb3.a;
                if (errorCode2 != 2 && errorCode2 != 4) {
                    if (errorCode2 != 10) {
                        if (errorCode2 != 7) {
                            if (errorCode2 != 8) {
                                switch (errorCode2) {
                                    case 15:
                                        break;
                                    case 16:
                                    case 18:
                                        break;
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                        break;
                                    default:
                                        switch (errorCode2) {
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case 28:
                                                z = false;
                                                i = 6002;
                                                break;
                                            default:
                                                z = false;
                                                i = 6006;
                                                break;
                                        }
                                }
                                throw a(e2, jw0Var4, z, i);
                            }
                            z = false;
                            i = 6003;
                            throw a(e2, jw0Var4, z, i);
                        }
                    }
                    z = false;
                    i = 6004;
                    throw a(e2, jw0Var4, z, i);
                }
                z = false;
                i = 6005;
                throw a(e2, jw0Var4, z, i);
            }
        } catch (eb0 e3) {
            a(e3);
            c(0);
            n();
            return true;
        }
    }

    public final void n() {
        try {
            this.K.flush();
        } finally {
            v();
        }
    }

    public final boolean o() {
        if (this.K == null) {
            return false;
        }
        int i = this.q0;
        if (i == 3 || this.U || ((this.V && !this.t0) || (this.W && this.s0))) {
            t();
            return true;
        }
        if (i == 2) {
            int i2 = sb3.a;
            if (i2 < 23) {
                throw new IllegalStateException();
            }
            if (i2 >= 23) {
                try {
                    x();
                } catch (nn0 e) {
                    gh1.d("MediaCodecRenderer", gh1.a("Failed to update the DRM session, releasing the codec instead.", e));
                    t();
                    return true;
                }
            }
        }
        n();
        return false;
    }

    public boolean p() {
        return false;
    }

    public final void q() {
        jw0 jw0Var;
        if (this.K != null || this.k0 || (jw0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(jw0Var)) {
            jw0 jw0Var2 = this.B;
            this.m0 = false;
            this.u.b();
            this.t.b();
            this.l0 = false;
            this.k0 = false;
            String str = jw0Var2.m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.u.k = 32;
            } else {
                this.u.k = 1;
            }
            this.k0 = true;
            return;
        }
        um0 um0Var = this.E;
        um0.a(this.D, um0Var);
        this.D = um0Var;
        String str2 = this.B.m;
        if (um0Var != null) {
            if (this.F == null) {
                a(um0Var);
                if (this.D.a() == null) {
                    return;
                }
            }
            if (rw0.a) {
                int c = this.D.c();
                if (c == 1) {
                    wk0 a = this.D.a();
                    a.getClass();
                    throw a((Exception) a, this.B, false, a.b);
                }
                if (c != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (fk1 e) {
            throw a(e, this.B, false, 4001);
        }
    }

    public abstract void r();

    public final void s() {
        int i = this.q0;
        if (i == 1) {
            n();
            return;
        }
        if (i == 2) {
            n();
            x();
        } else if (i != 3) {
            this.x0 = true;
            u();
        } else {
            t();
            q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        try {
            xj1 xj1Var = this.K;
            if (xj1Var != null) {
                xj1Var.release();
                this.B0.b++;
                a(this.R.a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void u() {
    }

    public void v() {
        this.f0 = -1;
        this.s.d = null;
        this.g0 = -1;
        this.h0 = null;
        this.e0 = -9223372036854775807L;
        this.s0 = false;
        this.r0 = false;
        this.a0 = false;
        this.b0 = false;
        this.i0 = false;
        this.j0 = false;
        this.w.clear();
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        wq wqVar = this.d0;
        if (wqVar != null) {
            wqVar.a = 0L;
            wqVar.b = 0L;
            wqVar.c = false;
        }
        this.p0 = 0;
        this.q0 = 0;
        this.o0 = this.n0 ? 1 : 0;
    }

    public final void w() {
        v();
        this.A0 = null;
        this.d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.c0 = false;
        this.n0 = false;
        this.o0 = 0;
        this.G = false;
    }

    public final void x() {
        try {
            a(this.E);
            throw null;
        } catch (MediaCryptoException e) {
            throw a((Exception) e, this.B, false, 6006);
        }
    }

    public final void b(long j) {
        Object a;
        b73 b73Var = this.v;
        synchronized (b73Var) {
            a = b73Var.a(j, true);
        }
        jw0 jw0Var = (jw0) a;
        if (jw0Var == null && this.N) {
            jw0Var = (jw0) this.v.b();
        }
        if (jw0Var != null) {
            this.C = jw0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    @Override // yads.fo
    public final void a(jw0[] jw0VarArr, long j, long j2) {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 == -9223372036854775807L) {
                this.C0 = j;
                this.D0 = j2;
                return;
            }
            throw new IllegalStateException();
        }
        int i = this.E0;
        if (i == this.z.length) {
            gh1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.z[this.E0 - 1]);
        } else {
            this.E0 = i + 1;
        }
        long[] jArr = this.y;
        int i2 = this.E0 - 1;
        jArr[i2] = j;
        this.z[i2] = j2;
        this.A[i2] = this.u0;
    }

    public final boolean c(long j, long j2) {
        boolean z;
        boolean z2;
        boolean a;
        xj1 xj1Var;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int a2;
        boolean z3;
        if (this.g0 < 0) {
            if (this.X && this.s0) {
                try {
                    a2 = this.K.a(this.x);
                } catch (IllegalStateException unused) {
                    s();
                    if (this.x0) {
                        t();
                    }
                    return false;
                }
            } else {
                a2 = this.K.a(this.x);
            }
            if (a2 < 0) {
                if (a2 == -2) {
                    this.t0 = true;
                    MediaFormat a3 = this.K.a();
                    if (this.S != 0 && a3.getInteger("width") == 32 && a3.getInteger("height") == 32) {
                        this.b0 = true;
                    } else {
                        if (this.Z) {
                            a3.setInteger("channel-count", 1);
                        }
                        this.M = a3;
                        this.N = true;
                    }
                    return true;
                }
                if (this.c0 && (this.w0 || this.p0 == 2)) {
                    s();
                }
                return false;
            }
            if (this.b0) {
                this.b0 = false;
                this.K.a(false, a2);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                s();
                return false;
            }
            this.g0 = a2;
            ByteBuffer c = this.K.c(a2);
            this.h0 = c;
            if (c != null) {
                c.position(this.x.offset);
                ByteBuffer byteBuffer2 = this.h0;
                MediaCodec.BufferInfo bufferInfo3 = this.x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j3 = this.u0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j3;
                    }
                }
            }
            long j4 = this.x.presentationTimeUs;
            int size = this.w.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) this.w.get(i2)).longValue() == j4) {
                    this.w.remove(i2);
                    z3 = true;
                    break;
                }
                i2++;
            }
            this.i0 = z3;
            long j5 = this.v0;
            long j6 = this.x.presentationTimeUs;
            this.j0 = j5 == j6;
            b(j6);
        }
        if (this.X && this.s0) {
            try {
                xj1Var = this.K;
                byteBuffer = this.h0;
                i = this.g0;
                bufferInfo = this.x;
                z = false;
                z2 = true;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                a = a(j, j2, xj1Var, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.i0, this.j0, this.C);
            } catch (IllegalStateException unused3) {
                s();
                if (this.x0) {
                    t();
                }
                return z;
            }
        } else {
            z = false;
            z2 = true;
            xj1 xj1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.h0;
            int i3 = this.g0;
            MediaCodec.BufferInfo bufferInfo5 = this.x;
            a = a(j, j2, xj1Var2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.i0, this.j0, this.C);
        }
        if (a) {
            a(this.x.presentationTimeUs);
            boolean z4 = (this.x.flags & 4) != 0 ? z2 : z;
            this.g0 = -1;
            this.h0 = null;
            if (!z4) {
                return z2;
            }
            s();
        }
        return z;
    }

    @Override // yads.fo
    public void a(long j, boolean z) {
        int i;
        this.w0 = false;
        this.x0 = false;
        this.z0 = false;
        if (this.k0) {
            this.u.b();
            this.t.b();
            this.l0 = false;
        } else if (o()) {
            q();
        }
        b73 b73Var = this.v;
        synchronized (b73Var) {
            i = b73Var.d;
        }
        if (i > 0) {
            this.y0 = true;
        }
        this.v.a();
        int i2 = this.E0;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.D0 = this.z[i3];
            this.C0 = this.y[i3];
            this.E0 = 0;
        }
    }

    public final List b(boolean z) {
        ArrayList a = a(this.o, this.B, z);
        if (a.isEmpty() && z) {
            a = a(this.o, this.B, false);
            if (!a.isEmpty()) {
                gh1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.m + ", but no secure decoder available. Trying to proceed with " + a + ".");
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean b(long j, long j2) {
        boolean z;
        if (!this.x0) {
            qo qoVar = this.u;
            int i = qoVar.j;
            if (i <= 0) {
                z = 0;
            } else {
                if (!a(j, j2, null, qoVar.d, this.g0, 0, i, qoVar.f, qoVar.b(Integer.MIN_VALUE), this.u.b(4), this.C)) {
                    return false;
                }
                a(this.u.i);
                this.u.b();
                z = 0;
            }
            if (this.w0) {
                this.x0 = true;
                return z;
            }
            if (this.l0) {
                if (this.u.a(this.t)) {
                    this.l0 = z;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.m0) {
                qo qoVar2 = this.u;
                if (qoVar2.j > 0) {
                    return true;
                }
                this.m0 = z;
                qoVar2.b();
                this.t.b();
                this.l0 = z;
                this.k0 = z;
                this.m0 = z;
                q();
                if (!this.k0) {
                    return z;
                }
            }
            if (!this.w0) {
                kw0 kw0Var = this.c;
                kw0Var.a = null;
                kw0Var.b = null;
                this.t.b();
                while (true) {
                    this.t.b();
                    int a = a(kw0Var, this.t, (int) z);
                    if (a == -5) {
                        a(kw0Var);
                        break;
                    }
                    if (a != -4) {
                        if (a != -3) {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (this.t.b(4)) {
                            this.w0 = true;
                            break;
                        }
                        if (this.y0) {
                            jw0 jw0Var = this.B;
                            jw0Var.getClass();
                            this.C = jw0Var;
                            a(jw0Var, (MediaFormat) null);
                            this.y0 = z;
                        }
                        this.t.c();
                        if (!this.u.a(this.t)) {
                            this.l0 = true;
                            break;
                        }
                    }
                }
                qo qoVar3 = this.u;
                if (qoVar3.j > 0) {
                    qoVar3.c();
                }
                if (this.u.j > 0 || this.w0 || this.m0) {
                    return true;
                }
                return z;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.fo
    public void a(float f, float f2) {
        this.I = f;
        this.J = f2;
        c(this.L);
    }

    @Override // yads.fo
    public final void a(long j, long j2) {
        boolean z = false;
        if (this.z0) {
            this.z0 = false;
            s();
        }
        nn0 nn0Var = this.A0;
        if (nn0Var == null) {
            try {
                if (this.x0) {
                    u();
                    return;
                }
                if (this.B != null || c(2)) {
                    q();
                    if (this.k0) {
                        t73.a("bypassRender");
                        while (b(j, j2)) {
                        }
                        t73.a();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        t73.a("drainAndFeed");
                        while (c(j, j2) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.H)) {
                        }
                        while (m() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.H)) {
                        }
                        t73.a();
                    } else {
                        cb0 cb0Var = this.B0;
                        int i = cb0Var.d;
                        ys2 ys2Var = this.h;
                        ys2Var.getClass();
                        cb0Var.d = i + ys2Var.b(j - this.j);
                        c(1);
                    }
                    synchronized (this.B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e) {
                int i2 = sb3.a;
                if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e;
                    }
                }
                a(e);
                if (i2 >= 21) {
                    if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                        z = true;
                    }
                }
                if (z) {
                    t();
                }
                throw a(a(e, this.R), this.B, z, 4003);
            }
        }
        this.A0 = null;
        throw nn0Var;
    }

    public bk1 a(IllegalStateException illegalStateException, ck1 ck1Var) {
        return new bk1(illegalStateException, ck1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaCrypto mediaCrypto, boolean z) {
        fk1 fk1Var;
        if (this.P == null) {
            try {
                List b = b(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.p) {
                    arrayDeque.addAll(b);
                } else if (!b.isEmpty()) {
                    this.P.add((ck1) b.get(0));
                }
                this.Q = null;
            } catch (lk1 e) {
                throw new fk1(this.B, e, z, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            ck1 ck1Var = (ck1) this.P.peekFirst();
            while (this.K == null) {
                ck1 ck1Var2 = (ck1) this.P.peekFirst();
                if (!a(ck1Var2)) {
                    return;
                }
                try {
                    a(ck1Var2, mediaCrypto);
                } catch (Exception e2) {
                    if (ck1Var2 == ck1Var) {
                        try {
                            gh1.d("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            a(ck1Var2, mediaCrypto);
                        } catch (Exception e3) {
                            gh1.d("MediaCodecRenderer", gh1.a("Failed to initialize decoder: " + ck1Var2, e3));
                            this.P.removeFirst();
                            fk1 fk1Var2 = new fk1(this.B, e3, z, ck1Var2);
                            a(fk1Var2);
                            fk1Var = this.Q;
                            if (fk1Var != null) {
                                this.Q = fk1Var2;
                            } else {
                                this.Q = new fk1(fk1Var.getMessage(), fk1Var.getCause(), fk1Var.b, fk1Var.c, fk1Var.d, fk1Var.e);
                            }
                            if (!this.P.isEmpty()) {
                                throw this.Q;
                            }
                        }
                    } else {
                        throw e2;
                    }
                    gh1.d("MediaCodecRenderer", gh1.a("Failed to initialize decoder: " + ck1Var2, e3));
                    this.P.removeFirst();
                    fk1 fk1Var22 = new fk1(this.B, e3, z, ck1Var2);
                    a(fk1Var22);
                    fk1Var = this.Q;
                    if (fk1Var != null) {
                    }
                    if (!this.P.isEmpty()) {
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new fk1(this.B, (lk1) null, z, -49999);
    }

    public final boolean c(jw0 jw0Var) {
        if (sb3.a >= 23 && this.K != null && this.q0 != 3 && this.g != 0) {
            float f = this.J;
            jw0[] jw0VarArr = this.i;
            jw0VarArr.getClass();
            float a = a(f, jw0VarArr);
            float f2 = this.O;
            if (f2 == a) {
                return true;
            }
            if (a == -1.0f) {
                if (this.r0) {
                    this.p0 = 1;
                    this.q0 = 3;
                    return false;
                }
                t();
                q();
                return false;
            }
            if (f2 == -1.0f && a <= this.q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a);
            this.K.a(bundle);
            this.O = a;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0265, code lost:
    
        if (r1.B().equals(r5) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x018b, code lost:
    
        if (r5.L().equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x019f, code lost:
    
        if (r5.z().equals(r2) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:
    
        if (r16.v().equals(r2) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        if (r16.p().equals(r2) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ck1 ck1Var, MediaCrypto mediaCrypto) {
        float a;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        hk1 hk1Var;
        boolean z4;
        String str = ck1Var.a;
        int i2 = sb3.a;
        if (i2 < 23) {
            a = -1.0f;
        } else {
            float f = this.J;
            jw0[] jw0VarArr = this.i;
            jw0VarArr.getClass();
            a = a(f, jw0VarArr);
        }
        float f2 = a > this.q ? a : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        uj1 a2 = a(ck1Var, this.B, mediaCrypto, f2);
        if (i2 >= 31) {
            ff2 ff2Var = this.f;
            ff2Var.getClass();
            ek1.a(a2, ff2Var);
        }
        try {
            t73.a("createCodec:" + str);
            this.K = this.n.a(a2);
            t73.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.R = ck1Var;
            this.O = f2;
            this.L = this.B;
            if (i2 <= 25) {
                hk1 hk1Var2 = tk2.b;
                if (hk1Var2.p().equals(str)) {
                    String str2 = sb3.d;
                    if (str2.startsWith(hk1Var2.J()) || str2.startsWith(hk1Var2.F()) || str2.startsWith(hk1Var2.G()) || str2.startsWith(hk1Var2.I())) {
                        i = 2;
                        this.S = i;
                        this.T = i2 >= 21 && this.L.o.isEmpty() && tk2.b.r().equals(str);
                        if (i2 >= 18) {
                            if (i2 == 18) {
                                hk1 hk1Var3 = tk2.b;
                                if (!hk1Var3.u().equals(str)) {
                                }
                            }
                            if (i2 == 19) {
                                String str3 = sb3.d;
                                hk1 hk1Var4 = tk2.b;
                                if (str3.startsWith(hk1Var4.H())) {
                                    if (!hk1Var4.o().equals(str)) {
                                    }
                                }
                            }
                            z = false;
                            this.U = z;
                            this.V = i2 != 29 && tk2.b.d().equals(str);
                            if (i2 <= 23 || !tk2.b.D().equals(str)) {
                                if (i2 <= 19) {
                                    hk1 hk1Var5 = tk2.b;
                                    String l = hk1Var5.l();
                                    String str4 = sb3.b;
                                    if (!l.equals(str4)) {
                                    }
                                    if (!hk1Var5.y().equals(str)) {
                                    }
                                }
                                z2 = false;
                                this.W = z2;
                                this.X = i2 != 21 && tk2.b.C().equals(str);
                                if (i2 < 21) {
                                    hk1 hk1Var6 = tk2.b;
                                    if (hk1Var6.w().equals(str) && hk1Var6.K().equals(sb3.c)) {
                                        String str5 = sb3.b;
                                        if (str5.startsWith(hk1Var6.c()) || str5.startsWith(hk1Var6.j()) || str5.startsWith(hk1Var6.h()) || str5.startsWith(hk1Var6.i()) || str5.startsWith(hk1Var6.m()) || str5.startsWith(hk1Var6.n())) {
                                            z3 = true;
                                            this.Y = z3;
                                            this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
                                            String str6 = ck1Var.a;
                                            if ((i2 <= 25 || !tk2.b.E().equals(str6)) && (i2 > 17 || !tk2.b.x().equals(str6))) {
                                                if (i2 <= 29) {
                                                    hk1 hk1Var7 = tk2.b;
                                                    if (!hk1Var7.A().equals(str6)) {
                                                    }
                                                }
                                                hk1Var = tk2.b;
                                                if ((hk1Var.b().equals(sb3.c) || !hk1Var.a().equals(sb3.d) || !ck1Var.f) && !p()) {
                                                    z4 = false;
                                                    this.c0 = z4;
                                                    this.K.getClass();
                                                    if (tk2.b.e().equals(ck1Var.a)) {
                                                        this.d0 = new wq();
                                                    }
                                                    if (this.g == 2) {
                                                        this.e0 = SystemClock.elapsedRealtime() + 1000;
                                                    }
                                                    this.B0.a++;
                                                    a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                                }
                                            }
                                            z4 = true;
                                            this.c0 = z4;
                                            this.K.getClass();
                                            if (tk2.b.e().equals(ck1Var.a)) {
                                            }
                                            if (this.g == 2) {
                                            }
                                            this.B0.a++;
                                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                        }
                                    }
                                }
                                z3 = false;
                                this.Y = z3;
                                this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
                                String str62 = ck1Var.a;
                                if (i2 <= 25) {
                                }
                                if (i2 <= 29) {
                                }
                                hk1Var = tk2.b;
                                if (hk1Var.b().equals(sb3.c)) {
                                }
                                z4 = false;
                                this.c0 = z4;
                                this.K.getClass();
                                if (tk2.b.e().equals(ck1Var.a)) {
                                }
                                if (this.g == 2) {
                                }
                                this.B0.a++;
                                a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                            z2 = true;
                            this.W = z2;
                            this.X = i2 != 21 && tk2.b.C().equals(str);
                            if (i2 < 21) {
                            }
                            z3 = false;
                            this.Y = z3;
                            this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
                            String str622 = ck1Var.a;
                            if (i2 <= 25) {
                            }
                            if (i2 <= 29) {
                            }
                            hk1Var = tk2.b;
                            if (hk1Var.b().equals(sb3.c)) {
                            }
                            z4 = false;
                            this.c0 = z4;
                            this.K.getClass();
                            if (tk2.b.e().equals(ck1Var.a)) {
                            }
                            if (this.g == 2) {
                            }
                            this.B0.a++;
                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        }
                        z = true;
                        this.U = z;
                        this.V = i2 != 29 && tk2.b.d().equals(str);
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z2 = false;
                        this.W = z2;
                        this.X = i2 != 21 && tk2.b.C().equals(str);
                        if (i2 < 21) {
                        }
                        z3 = false;
                        this.Y = z3;
                        this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
                        String str6222 = ck1Var.a;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 29) {
                        }
                        hk1Var = tk2.b;
                        if (hk1Var.b().equals(sb3.c)) {
                        }
                        z4 = false;
                        this.c0 = z4;
                        this.K.getClass();
                        if (tk2.b.e().equals(ck1Var.a)) {
                        }
                        if (this.g == 2) {
                        }
                        this.B0.a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            if (i2 < 24) {
                hk1 hk1Var8 = tk2.b;
                if (hk1Var8.s().equals(str) || hk1Var8.t().equals(str)) {
                    String f3 = hk1Var8.f();
                    String str7 = sb3.b;
                    if (f3.equals(str7) || hk1Var8.g().equals(str7) || hk1Var8.k().equals(str7) || hk1Var8.M().equals(str7)) {
                        i = 1;
                        this.S = i;
                        this.T = i2 >= 21 && this.L.o.isEmpty() && tk2.b.r().equals(str);
                        if (i2 >= 18) {
                        }
                        z = true;
                        this.U = z;
                        this.V = i2 != 29 && tk2.b.d().equals(str);
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z2 = false;
                        this.W = z2;
                        this.X = i2 != 21 && tk2.b.C().equals(str);
                        if (i2 < 21) {
                        }
                        z3 = false;
                        this.Y = z3;
                        this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
                        String str62222 = ck1Var.a;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 29) {
                        }
                        hk1Var = tk2.b;
                        if (hk1Var.b().equals(sb3.c)) {
                        }
                        z4 = false;
                        this.c0 = z4;
                        this.K.getClass();
                        if (tk2.b.e().equals(ck1Var.a)) {
                        }
                        if (this.g == 2) {
                        }
                        this.B0.a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            i = 0;
            this.S = i;
            this.T = i2 >= 21 && this.L.o.isEmpty() && tk2.b.r().equals(str);
            if (i2 >= 18) {
            }
            z = true;
            this.U = z;
            this.V = i2 != 29 && tk2.b.d().equals(str);
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z2 = false;
            this.W = z2;
            this.X = i2 != 21 && tk2.b.C().equals(str);
            if (i2 < 21) {
            }
            z3 = false;
            this.Y = z3;
            this.Z = i2 > 18 && this.L.z == 1 && tk2.b.q().equals(str);
            String str622222 = ck1Var.a;
            if (i2 <= 25) {
            }
            if (i2 <= 29) {
            }
            hk1Var = tk2.b;
            if (hk1Var.b().equals(sb3.c)) {
            }
            z4 = false;
            this.c0 = z4;
            this.K.getClass();
            if (tk2.b.e().equals(ck1Var.a)) {
            }
            if (this.g == 2) {
            }
            this.B0.a++;
            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            t73.a();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (l() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0097, code lost:
    
        if (l() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        if (l() == false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hb0 a(kw0 kw0Var) {
        int i;
        boolean z = true;
        this.y0 = true;
        jw0 jw0Var = kw0Var.b;
        jw0Var.getClass();
        if (jw0Var.m != null) {
            um0 um0Var = kw0Var.a;
            um0.a(this.E, um0Var);
            this.E = um0Var;
            this.B = jw0Var;
            if (this.k0) {
                this.m0 = true;
                return null;
            }
            xj1 xj1Var = this.K;
            if (xj1Var == null) {
                this.P = null;
                q();
                return null;
            }
            ck1 ck1Var = this.R;
            jw0 jw0Var2 = this.L;
            um0 um0Var2 = this.D;
            if (um0Var2 == um0Var) {
                boolean z2 = um0Var != um0Var2;
                if (z2 && sb3.a < 23) {
                    throw new IllegalStateException();
                }
                hb0 a = a(ck1Var, jw0Var2, jw0Var);
                int i2 = a.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (c(jw0Var)) {
                            this.L = jw0Var;
                            if (!z2) {
                                if (this.r0) {
                                    this.p0 = 1;
                                    if (!this.U && !this.W) {
                                        this.q0 = 1;
                                    } else {
                                        this.q0 = 3;
                                        i = 2;
                                    }
                                }
                            }
                        }
                        i = 16;
                    } else if (i2 == 2) {
                        if (c(jw0Var)) {
                            this.n0 = true;
                            this.o0 = 1;
                            int i3 = this.S;
                            if (i3 != 2 && (i3 != 1 || jw0Var.r != jw0Var2.r || jw0Var.s != jw0Var2.s)) {
                                z = false;
                            }
                            this.a0 = z;
                            this.L = jw0Var;
                            if (z2) {
                            }
                        }
                        i = 16;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        if (c(jw0Var)) {
                            this.L = jw0Var;
                            if (z2) {
                            }
                        }
                        i = 16;
                    }
                    return (a.d != 0 || (this.K == xj1Var && this.q0 != 3)) ? a : new hb0(ck1Var.a, jw0Var2, jw0Var, 0, i);
                }
                if (this.r0) {
                    this.p0 = 1;
                    this.q0 = 3;
                } else {
                    t();
                    q();
                }
                i = 0;
                if (a.d != 0) {
                }
            }
            if (um0Var != null && um0Var2 != null && sb3.a >= 23) {
                UUID uuid = xq.e;
                if (!uuid.equals(um0Var2.b()) && !uuid.equals(um0Var.b())) {
                    a(um0Var);
                }
            }
            if (this.r0) {
                this.p0 = 1;
                this.q0 = 3;
            } else {
                t();
                q();
            }
            return new hb0(ck1Var.a, jw0Var2, jw0Var, 0, 128);
        }
        throw a((Exception) new IllegalArgumentException(), jw0Var, false, 4005);
    }

    public void a(long j) {
        while (true) {
            int i = this.E0;
            if (i == 0 || j < this.A[0]) {
                return;
            }
            long[] jArr = this.y;
            this.C0 = jArr[0];
            this.D0 = this.z[0];
            int i2 = i - 1;
            this.E0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            r();
        }
    }

    public final rw0 a(um0 um0Var) {
        um0Var.getClass();
        return null;
    }
}
