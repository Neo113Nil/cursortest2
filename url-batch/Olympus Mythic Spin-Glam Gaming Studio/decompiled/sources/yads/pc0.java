package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class pc0 implements gk {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public zj[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public mk X;
    public boolean Y;
    public long Z;
    public final sj a;
    public boolean a0;
    public final ic0 b;
    public boolean b0;
    public final boolean c;
    public final rt d;
    public final n93 e;
    public final zj[] f;
    public final zj[] g;
    public final ry h;
    public final kk i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public oc0 m;
    public final lc0 n;
    public final lc0 o;
    public final rc0 p;
    public ff2 q;
    public yj1 r;
    public hc0 s;
    public hc0 t;
    public AudioTrack u;
    public nj v;
    public kc0 w;
    public kc0 x;
    public re2 y;
    public ByteBuffer z;

    public pc0(gc0 gc0Var) {
        this.a = gc0Var.a;
        ic0 ic0Var = gc0Var.b;
        this.b = ic0Var;
        int i = sb3.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = gc0Var.c;
        ry ryVar = new ry(0);
        this.h = ryVar;
        ryVar.d();
        this.i = new kk(new mc0(this));
        rt rtVar = new rt();
        this.d = rtVar;
        n93 n93Var = new n93();
        this.e = n93Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new tp2(), rtVar, n93Var);
        Collections.addAll(arrayList, ic0Var.a);
        this.f = (zj[]) arrayList.toArray(new zj[0]);
        this.g = new zj[]{new av0()};
        this.J = 1.0f;
        this.v = nj.h;
        this.W = 0;
        this.X = new mk();
        re2 re2Var = re2.e;
        this.x = new kc0(re2Var, false, 0L, 0L);
        this.y = re2Var;
        this.R = -1;
        this.K = new zj[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new lc0();
        this.o = new lc0();
    }

    public final int a(jw0 jw0Var) {
        if (!"audio/raw".equals(jw0Var.m)) {
            return ((this.a0 || !a(this.v, jw0Var)) && this.a.a(jw0Var) == null) ? 0 : 2;
        }
        if (sb3.d(jw0Var.B)) {
            int i = jw0Var.B;
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        gh1.d("DefaultAudioSink", "Invalid PCM encoding: " + jw0Var.B);
        return 0;
    }

    public final void b(long j) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = zj.a;
                }
            }
            if (i == length) {
                a(byteBuffer, j);
            } else {
                zj zjVar = this.K[i];
                if (i > this.R) {
                    zjVar.a(byteBuffer);
                }
                ByteBuffer a = zjVar.a();
                this.L[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final kc0 c() {
        kc0 kc0Var = this.w;
        return kc0Var != null ? kc0Var : !this.j.isEmpty() ? (kc0) this.j.getLast() : this.x;
    }

    public final long d() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean z;
        AudioTrack a;
        ff2 ff2Var;
        hc0 hc0Var;
        ry ryVar = this.h;
        synchronized (ryVar) {
            z = ryVar.a;
        }
        if (!z) {
            return false;
        }
        try {
            hc0Var = this.t;
            hc0Var.getClass();
        } catch (dk e) {
            hc0 hc0Var2 = this.t;
            if (hc0Var2.h > 1000000) {
                hc0 hc0Var3 = new hc0(hc0Var2.a, hc0Var2.b, hc0Var2.c, hc0Var2.d, hc0Var2.e, hc0Var2.f, hc0Var2.g, 1000000, hc0Var2.i);
                try {
                    try {
                        a = hc0Var3.a(this.Y, this.v, this.W);
                        this.t = hc0Var3;
                    } catch (dk e2) {
                        yj1 yj1Var = this.r;
                        if (yj1Var != null) {
                            gh1.b("MediaCodecAudioRenderer", gh1.a("Audio sink error", e2));
                            yj1Var.a.H0.b(e2);
                        }
                        throw e2;
                    }
                } catch (dk e3) {
                    e.addSuppressed(e3);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e;
            }
            this.a0 = true;
            throw e;
        }
        try {
            a = hc0Var.a(this.Y, this.v, this.W);
            this.u = a;
            if (a(a)) {
                AudioTrack audioTrack = this.u;
                if (this.m == null) {
                    this.m = new oc0(this);
                }
                this.m.a(audioTrack);
                if (this.l != 3) {
                    AudioTrack audioTrack2 = this.u;
                    jw0 jw0Var = this.t.a;
                    audioTrack2.setOffloadDelayPadding(jw0Var.C, jw0Var.D);
                }
            }
            int i = sb3.a;
            if (i >= 31 && (ff2Var = this.q) != null) {
                ec0.a(this.u, ff2Var);
            }
            this.W = this.u.getAudioSessionId();
            kk kkVar = this.i;
            AudioTrack audioTrack3 = this.u;
            hc0 hc0Var4 = this.t;
            boolean z2 = hc0Var4.c == 2;
            int i2 = hc0Var4.g;
            int i3 = hc0Var4.d;
            int i4 = hc0Var4.h;
            kkVar.c = audioTrack3;
            kkVar.d = i3;
            kkVar.e = i4;
            kkVar.f = new jk(audioTrack3);
            kkVar.g = audioTrack3.getSampleRate();
            kkVar.h = z2 && i < 23 && (i2 == 5 || i2 == 6);
            boolean d = sb3.d(i2);
            kkVar.q = d;
            kkVar.i = d ? kkVar.a(i4 / i3) : -9223372036854775807L;
            kkVar.s = 0L;
            kkVar.t = 0L;
            kkVar.u = 0L;
            kkVar.p = false;
            kkVar.x = -9223372036854775807L;
            kkVar.y = -9223372036854775807L;
            kkVar.r = 0L;
            kkVar.o = 0L;
            kkVar.j = 1.0f;
            j();
            this.X.getClass();
            this.H = true;
            return true;
        } catch (dk e4) {
            yj1 yj1Var2 = this.r;
            if (yj1Var2 != null) {
                gh1.b("MediaCodecAudioRenderer", gh1.a("Audio sink error", e4));
                yj1Var2.a.H0.b(e4);
            }
            throw e4;
        }
    }

    public final boolean f() {
        return this.u != null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            kk kkVar = this.i;
            kkVar.l = 0L;
            kkVar.w = 0;
            kkVar.v = 0;
            kkVar.m = 0L;
            kkVar.C = 0L;
            kkVar.F = 0L;
            kkVar.k = false;
            if (kkVar.x == -9223372036854775807L) {
                jk jkVar = kkVar.f;
                jkVar.getClass();
                jkVar.a();
                this.u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            jk jkVar = this.i.f;
            jkVar.getClass();
            jkVar.a();
            this.u.play();
        }
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        kk kkVar = this.i;
        long d = d();
        kkVar.z = kkVar.a();
        kkVar.x = SystemClock.elapsedRealtime() * 1000;
        kkVar.A = d;
        this.u.stop();
        this.A = 0;
    }

    public final void j() {
        if (f()) {
            if (sb3.a >= 21) {
                this.u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.u;
            float f = this.J;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206 A[Catch: Exception -> 0x021c, TRY_LEAVE, TryCatch #0 {Exception -> 0x021c, blocks: (B:70:0x01dd, B:72:0x0206), top: B:69:0x01dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long round;
        boolean z2;
        Method method;
        long max;
        long j6;
        long j7;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        kk kkVar = this.i;
        AudioTrack audioTrack = kkVar.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long a = kkVar.a(kkVar.a());
            if (a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - kkVar.m >= 30000) {
                    long[] jArr = kkVar.b;
                    int i = kkVar.v;
                    jArr[i] = a - nanoTime;
                    kkVar.v = (i + 1) % 10;
                    int i2 = kkVar.w;
                    if (i2 < 10) {
                        kkVar.w = i2 + 1;
                    }
                    kkVar.m = nanoTime;
                    kkVar.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = kkVar.w;
                        if (i3 >= i4) {
                            break;
                        }
                        kkVar.l = (kkVar.b[i3] / i4) + kkVar.l;
                        i3++;
                    }
                }
                if (!kkVar.h) {
                    jk jkVar = kkVar.f;
                    jkVar.getClass();
                    ik ikVar = jkVar.a;
                    if (ikVar != null && nanoTime - jkVar.e >= jkVar.d) {
                        jkVar.e = nanoTime;
                        z2 = ikVar.b();
                        int i5 = jkVar.b;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (z2) {
                                        jkVar.a();
                                    }
                                } else if (!z2) {
                                    jkVar.a();
                                }
                            } else if (!z2) {
                                jkVar.a();
                            } else if (jkVar.a.e > jkVar.f) {
                                jkVar.a(2);
                            }
                        } else if (z2) {
                            if (jkVar.a.a() >= jkVar.c) {
                                jkVar.f = jkVar.a.e;
                                jkVar.a(1);
                            }
                        } else if (nanoTime - jkVar.c > 500000) {
                            jkVar.a(3);
                        }
                        if (z2) {
                            ik ikVar2 = jkVar.a;
                            long a2 = ikVar2 != null ? ikVar2.a() : -9223372036854775807L;
                            ik ikVar3 = jkVar.a;
                            long j8 = ikVar3 != null ? ikVar3.e : -1L;
                            if (Math.abs(a2 - nanoTime) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                mc0 mc0Var = kkVar.a;
                                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(j8);
                                sb.append(", ");
                                sb.append(a2);
                                sb.append(", ");
                                sb.append(nanoTime);
                                sb.append(", ");
                                sb.append(a);
                                sb.append(", ");
                                pc0 pc0Var = mc0Var.a;
                                if (pc0Var.t.c == 0) {
                                    j7 = pc0Var.B / r4.b;
                                } else {
                                    j7 = pc0Var.C;
                                }
                                sb.append(j7);
                                sb.append(", ");
                                sb.append(mc0Var.a.d());
                                gh1.d("DefaultAudioSink", sb.toString());
                                jkVar.a(4);
                            } else if (Math.abs(kkVar.a(j8) - a) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                mc0 mc0Var2 = kkVar.a;
                                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(j8);
                                sb2.append(", ");
                                sb2.append(a2);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(a);
                                sb2.append(", ");
                                pc0 pc0Var2 = mc0Var2.a;
                                if (pc0Var2.t.c == 0) {
                                    j6 = pc0Var2.B / r4.b;
                                } else {
                                    j6 = pc0Var2.C;
                                }
                                sb2.append(j6);
                                sb2.append(", ");
                                sb2.append(mc0Var2.a.d());
                                gh1.d("DefaultAudioSink", sb2.toString());
                                jkVar.a(4);
                            } else if (jkVar.b == 4) {
                                jkVar.a();
                            }
                        }
                        if (kkVar.q && (method = kkVar.n) != null && nanoTime - kkVar.r >= 500000) {
                            try {
                                AudioTrack audioTrack2 = kkVar.c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i6 = sb3.a;
                                long intValue = (num.intValue() * 1000) - kkVar.i;
                                kkVar.o = intValue;
                                max = Math.max(intValue, 0L);
                                kkVar.o = max;
                                if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                    gh1.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                    kkVar.o = 0L;
                                }
                            } catch (Exception unused) {
                                kkVar.n = null;
                            }
                            kkVar.r = nanoTime;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                    if (kkVar.q) {
                        AudioTrack audioTrack22 = kkVar.c;
                        audioTrack22.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack22, null);
                        int i62 = sb3.a;
                        long intValue2 = (num2.intValue() * 1000) - kkVar.i;
                        kkVar.o = intValue2;
                        max = Math.max(intValue2, 0L);
                        kkVar.o = max;
                        if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                        }
                        kkVar.r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        jk jkVar2 = kkVar.f;
        jkVar2.getClass();
        boolean z3 = jkVar2.b == 2;
        if (z3) {
            ik ikVar4 = jkVar2.a;
            long a3 = kkVar.a(ikVar4 != null ? ikVar4.e : -1L);
            ik ikVar5 = jkVar2.a;
            long a4 = nanoTime2 - (ikVar5 != null ? ikVar5.a() : -9223372036854775807L);
            float f = kkVar.j;
            int i7 = sb3.a;
            if (f != 1.0f) {
                a4 = Math.round(a4 * f);
            }
            j2 = a4 + a3;
        } else {
            if (kkVar.w == 0) {
                j = kkVar.a(kkVar.a());
            } else {
                j = kkVar.l + nanoTime2;
            }
            j2 = j;
            if (!z) {
                j2 = Math.max(0L, j2 - kkVar.o);
            }
        }
        if (kkVar.D != z3) {
            kkVar.F = kkVar.C;
            kkVar.E = kkVar.B;
        }
        long j9 = nanoTime2 - kkVar.F;
        if (j9 < 1000000) {
            long j10 = kkVar.E;
            float f2 = kkVar.j;
            int i8 = sb3.a;
            if (f2 == 1.0f) {
                j5 = j9;
                round = j5;
            } else {
                j5 = j9;
                round = Math.round(j9 * f2);
            }
            long j11 = round + j10;
            long j12 = (j5 * 1000) / 1000000;
            j2 = (((1000 - j12) * j11) + (j2 * j12)) / 1000;
        }
        if (!kkVar.k) {
            long j13 = kkVar.B;
            if (j2 > j13) {
                kkVar.k = true;
                long b = sb3.b(j2 - j13);
                float f3 = kkVar.j;
                if (f3 != 1.0f) {
                    b = Math.round(b / f3);
                }
                long currentTimeMillis = System.currentTimeMillis() - sb3.b(b);
                yj1 yj1Var = kkVar.a.a.r;
                if (yj1Var != null) {
                    yj1Var.a.H0.b(currentTimeMillis);
                }
            }
        }
        kkVar.C = nanoTime2;
        kkVar.B = j2;
        kkVar.D = z3;
        long min = Math.min(j2, (d() * 1000000) / this.t.e);
        while (!this.j.isEmpty() && min >= ((kc0) this.j.getFirst()).d) {
            this.x = (kc0) this.j.remove();
        }
        kc0 kc0Var = this.x;
        long j14 = min - kc0Var.d;
        if (kc0Var.a.equals(re2.e)) {
            j3 = this.x.c + j14;
        } else if (this.j.isEmpty()) {
            o23 o23Var = this.b.c;
            if (o23Var.o >= 1024) {
                long j15 = o23Var.n;
                o23Var.j.getClass();
                long j16 = j15 - ((r4.k * r4.b) * 2);
                int i9 = o23Var.h.a;
                int i10 = o23Var.g.a;
                if (i9 == i10) {
                    j4 = sb3.a(j14, j16, o23Var.o);
                } else {
                    j4 = sb3.a(j14, j16 * i9, o23Var.o * i10);
                }
            } else {
                j4 = (long) (o23Var.c * j14);
            }
            j3 = j4 + this.x.c;
        } else {
            kc0 kc0Var2 = (kc0) this.j.getFirst();
            long j17 = kc0Var2.d - min;
            float f4 = this.x.a.b;
            int i11 = sb3.a;
            if (f4 != 1.0f) {
                j17 = Math.round(j17 * f4);
            }
            j3 = kc0Var2.c - j17;
        }
        return ((this.b.b.t * 1000000) / this.t.e) + j3;
    }

    public final void b() {
        if (f()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.b0 = false;
            this.F = 0;
            this.x = new kc0(c().a, c().b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                zj[] zjVarArr = this.K;
                if (i >= zjVarArr.length) {
                    break;
                }
                zj zjVar = zjVarArr[i];
                zjVar.flush();
                this.L[i] = zjVar.a();
                i++;
            }
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (a(this.u)) {
                oc0 oc0Var = this.m;
                oc0Var.getClass();
                oc0Var.b(this.u);
            }
            AudioTrack audioTrack2 = this.u;
            this.u = null;
            if (sb3.a < 21 && !this.V) {
                this.W = 0;
            }
            hc0 hc0Var = this.s;
            if (hc0Var != null) {
                this.t = hc0Var;
                this.s = null;
            }
            kk kkVar = this.i;
            kkVar.l = 0L;
            kkVar.w = 0;
            kkVar.v = 0;
            kkVar.m = 0L;
            kkVar.C = 0L;
            kkVar.F = 0L;
            kkVar.k = false;
            kkVar.c = null;
            kkVar.f = null;
            ry ryVar = this.h;
            synchronized (ryVar) {
                ryVar.a = false;
            }
            new dc0(this, audioTrack2).start();
        }
        this.o.a = null;
        this.n.a = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(jw0 jw0Var, int[] iArr) {
        int i;
        zj[] zjVarArr;
        int intValue;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int max;
        zj[] zjVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(jw0Var.m)) {
            if (sb3.d(jw0Var.B)) {
                int a = sb3.a(jw0Var.B, jw0Var.z);
                int i9 = jw0Var.B;
                if (this.c && (i9 == 536870912 || i9 == 805306368 || i9 == 4)) {
                    zjVarArr2 = this.g;
                } else {
                    zjVarArr2 = this.f;
                }
                n93 n93Var = this.e;
                int i10 = jw0Var.C;
                int i11 = jw0Var.D;
                n93Var.i = i10;
                n93Var.j = i11;
                if (sb3.a < 21 && jw0Var.z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i12 = 0; i12 < 6; i12++) {
                        iArr2[i12] = i12;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.d.i = iArr2;
                xj xjVar = new xj(jw0Var.A, jw0Var.z, jw0Var.B);
                for (zj zjVar : zjVarArr2) {
                    try {
                        xj a2 = zjVar.a(xjVar);
                        if (zjVar.isActive()) {
                            xjVar = a2;
                        }
                    } catch (yj e) {
                        throw new ck(e, jw0Var);
                    }
                }
                int i13 = xjVar.c;
                i4 = xjVar.a;
                intValue = sb3.a(xjVar.b);
                i2 = sb3.a(i13, xjVar.b);
                zjVarArr = zjVarArr2;
                i3 = i13;
                i = a;
                i5 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            zj[] zjVarArr3 = new zj[0];
            int i14 = jw0Var.A;
            i = -1;
            if (a(this.v, jw0Var)) {
                String str = jw0Var.m;
                str.getClass();
                zjVarArr = zjVarArr3;
                i3 = vt1.a(str, jw0Var.j);
                i2 = -1;
                intValue = sb3.a(jw0Var.z);
                i4 = i14;
                i5 = 1;
            } else {
                Pair a3 = this.a.a(jw0Var);
                if (a3 != null) {
                    int intValue2 = ((Integer) a3.first).intValue();
                    zjVarArr = zjVarArr3;
                    intValue = ((Integer) a3.second).intValue();
                    i2 = -1;
                    i3 = intValue2;
                    i4 = i14;
                    i5 = 2;
                } else {
                    throw new ck("Unable to configure passthrough for: " + jw0Var, jw0Var);
                }
            }
        }
        rc0 rc0Var = this.p;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i3);
        if (minBufferSize != -2) {
            double d = this.k ? 8.0d : 1.0d;
            rc0Var.getClass();
            if (i5 != 0) {
                int i15 = 80000;
                if (i5 == 1) {
                    i6 = i5;
                    switch (i3) {
                        case 5:
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 6:
                        case 18:
                            i15 = 768000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 7:
                            i15 = 192000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 8:
                            i15 = 2250000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 9:
                            i15 = 40000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 10:
                            i15 = 100000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 11:
                            i15 = 16000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 12:
                            i15 = 7000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            i15 = 3062500;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 15:
                            i15 = 8000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 16:
                            i15 = 256000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                        case 17:
                            i15 = 336000;
                            max = nc1.a((50000000 * i15) / 1000000);
                            break;
                    }
                } else if (i5 == 2) {
                    int i16 = i3 == 5 ? 500000 : 250000;
                    switch (i3) {
                        case 5:
                            i6 = i5;
                            break;
                        case 6:
                        case 18:
                            i6 = i5;
                            i15 = 768000;
                            break;
                        case 7:
                            i6 = i5;
                            i15 = 192000;
                            break;
                        case 8:
                            i6 = i5;
                            i15 = 2250000;
                            break;
                        case 9:
                            i6 = i5;
                            i15 = 40000;
                            break;
                        case 10:
                            i6 = i5;
                            i15 = 100000;
                            break;
                        case 11:
                            i6 = i5;
                            i15 = 16000;
                            break;
                        case 12:
                            i6 = i5;
                            i15 = 7000;
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            i6 = i5;
                            i15 = 3062500;
                            break;
                        case 15:
                            i6 = i5;
                            i15 = 8000;
                            break;
                        case 16:
                            i6 = i5;
                            i15 = 256000;
                            break;
                        case 17:
                            i6 = i5;
                            i15 = 336000;
                            break;
                    }
                    max = nc1.a((i16 * i15) / 1000000);
                } else {
                    throw new IllegalArgumentException();
                }
                i7 = i;
                i8 = i4;
            } else {
                i6 = i5;
                long j = i4;
                long j2 = i2;
                int a4 = nc1.a(((250000 * j) * j2) / 1000000);
                i7 = i;
                i8 = i4;
                int a5 = nc1.a(((750000 * j) * j2) / 1000000);
                int i17 = sb3.a;
                max = Math.max(a4, Math.min(4 * minBufferSize, a5));
            }
            int max2 = (((Math.max(minBufferSize, (int) (max * d)) + i2) - 1) / i2) * i2;
            if (i3 == 0) {
                throw new ck("Invalid output encoding (mode=" + i6 + ") for: " + jw0Var, jw0Var);
            }
            if (intValue != 0) {
                this.a0 = false;
                hc0 hc0Var = new hc0(jw0Var, i7, i6, i2, i8, intValue, i3, max2, zjVarArr);
                if (f()) {
                    this.s = hc0Var;
                    return;
                } else {
                    this.t = hc0Var;
                    return;
                }
            }
            throw new ck("Invalid output channel config (mode=" + i6 + ") for: " + jw0Var, jw0Var);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
    
        if (r6.a() == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ByteBuffer byteBuffer, long j, int i) {
        long j2;
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        ByteBuffer byteBuffer2 = this.M;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (this.s != null) {
            if (!a()) {
                return false;
            }
            hc0 hc0Var = this.s;
            hc0 hc0Var2 = this.t;
            hc0Var.getClass();
            if (hc0Var2.c == hc0Var.c && hc0Var2.g == hc0Var.g && hc0Var2.e == hc0Var.e && hc0Var2.f == hc0Var.f && hc0Var2.d == hc0Var.d) {
                this.t = this.s;
                this.s = null;
                if (a(this.u) && this.l != 3) {
                    if (this.u.getPlayState() == 3) {
                        this.u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.u;
                    jw0 jw0Var = this.t.a;
                    audioTrack.setOffloadDelayPadding(jw0Var.C, jw0Var.D);
                    this.b0 = true;
                }
            } else {
                i();
                if (f() && this.i.b(d())) {
                    return false;
                }
                b();
            }
            a(j);
        }
        if (!f()) {
            try {
                if (!e()) {
                    return false;
                }
            } catch (dk e) {
                if (!e.c) {
                    lc0 lc0Var = this.n;
                    lc0Var.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (lc0Var.a == null) {
                        lc0Var.a = e;
                        lc0Var.b = 100 + elapsedRealtime;
                    }
                    if (elapsedRealtime < lc0Var.b) {
                        return false;
                    }
                    Exception exc = lc0Var.a;
                    if (exc != e) {
                        exc.addSuppressed(e);
                    }
                    Exception exc2 = lc0Var.a;
                    lc0Var.a = null;
                    throw exc2;
                }
                throw e;
            }
        }
        this.n.a = null;
        if (this.H) {
            this.I = Math.max(0L, j);
            this.G = false;
            this.H = false;
            if (this.k && sb3.a >= 23) {
                a(this.y);
            }
            a(j);
            if (this.U) {
                h();
            }
        }
        kk kkVar = this.i;
        long d = d();
        AudioTrack audioTrack2 = kkVar.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (kkVar.h) {
            if (playState == 2) {
                kkVar.p = false;
            } else if (playState == 1) {
            }
            return false;
        }
        boolean z = kkVar.p;
        boolean b3 = kkVar.b(d);
        kkVar.p = b3;
        if (z && !b3 && playState != 1) {
            mc0 mc0Var = kkVar.a;
            int i6 = kkVar.e;
            long b4 = sb3.b(kkVar.i);
            if (mc0Var.a.r != null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                pc0 pc0Var = mc0Var.a;
                pc0Var.r.a.H0.b(i6, b4, elapsedRealtime2 - pc0Var.Z);
            }
        }
        if (this.M == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                hc0 hc0Var3 = this.t;
                if (hc0Var3.c != 0 && this.F == 0) {
                    int i7 = hc0Var3.g;
                    switch (i7) {
                        case 5:
                        case 6:
                        case 18:
                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
                                i2 = 1536;
                                break;
                            } else {
                                i2 = e0.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                break;
                            }
                        case 7:
                        case 8:
                            int position = byteBuffer.position();
                            byte b5 = byteBuffer.get(position);
                            if (b5 != -2) {
                                if (b5 == -1) {
                                    i3 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b2 = byteBuffer.get(position + 7);
                                } else if (b5 != 31) {
                                    i3 = (byteBuffer.get(position + 4) & 1) << 6;
                                    b = byteBuffer.get(position + 5);
                                } else {
                                    i3 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b2 = byteBuffer.get(position + 6);
                                }
                                i4 = b2 & 60;
                                i2 = (((i4 >> 2) | i3) + 1) * 32;
                                break;
                            } else {
                                i3 = (byteBuffer.get(position + 5) & 1) << 6;
                                b = byteBuffer.get(position + 4);
                            }
                            i4 = b & 252;
                            i2 = (((i4 >> 2) | i3) + 1) * 32;
                        case 9:
                            int position2 = byteBuffer.position();
                            int i8 = sb3.a;
                            int i9 = byteBuffer.getInt(position2);
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                i9 = Integer.reverseBytes(i9);
                            }
                            i2 = dw1.b(i9);
                            if (i2 == -1) {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case 10:
                        case 16:
                            i2 = 1024;
                            break;
                        case 11:
                        case 12:
                            i2 = 2048;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException(gg2.a(i7, "Unexpected audio encoding: "));
                        case 14:
                            int position3 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i10 = position3;
                            while (true) {
                                if (i10 <= limit) {
                                    int i11 = sb3.a;
                                    int i12 = byteBuffer.getInt(i10 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i12 = Integer.reverseBytes(i12);
                                    }
                                    if ((i12 & (-2)) == -126718022) {
                                        i5 = i10 - position3;
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    i5 = -1;
                                }
                            }
                            if (i5 != -1) {
                                i2 = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                break;
                            } else {
                                i2 = 0;
                                break;
                            }
                        case 15:
                            i2 = 512;
                            break;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position4 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position4);
                            i2 = i0.a(new wb2(bArr)).c;
                            break;
                    }
                    this.F = i2;
                    if (i2 == 0) {
                        return true;
                    }
                }
                if (this.w != null) {
                    if (!a()) {
                        return false;
                    }
                    a(j);
                    this.w = null;
                }
                long j3 = this.I;
                if (this.t.c == 0) {
                    j2 = this.B / r8.b;
                } else {
                    j2 = this.C;
                }
                long j4 = (((j2 - this.e.o) * 1000000) / r8.a.A) + j3;
                if (!this.G && Math.abs(j4 - j) > 200000) {
                    yj1 yj1Var = this.r;
                    ek ekVar = new ek(j, j4);
                    yj1Var.getClass();
                    gh1.b("MediaCodecAudioRenderer", gh1.a("Audio sink error", ekVar));
                    yj1Var.a.H0.b(ekVar);
                    this.G = true;
                }
                if (this.G) {
                    if (!a()) {
                        return false;
                    }
                    long j5 = j - j4;
                    this.I += j5;
                    this.G = false;
                    a(j);
                    yj1 yj1Var2 = this.r;
                    if (yj1Var2 != null && j5 != 0) {
                        yj1Var2.a.O0 = true;
                    }
                }
                if (this.t.c == 0) {
                    this.B += byteBuffer.remaining();
                } else {
                    this.C = (this.F * i) + this.C;
                }
                this.M = byteBuffer;
                this.N = i;
            } else {
                throw new IllegalArgumentException();
            }
        }
        b(j);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        }
        kk kkVar2 = this.i;
        long d2 = d();
        if (kkVar2.y == -9223372036854775807L || d2 <= 0 || SystemClock.elapsedRealtime() - kkVar2.y < 200) {
            return false;
        }
        gh1.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00dd, code lost:
    
        if (r14 < r13) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer, long j) {
        int write;
        yj1 yj1Var;
        nn2 nn2Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                this.O = byteBuffer;
                if (sb3.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int remaining2 = byteBuffer.remaining();
            int i = sb3.a;
            if (i < 21) {
                kk kkVar = this.i;
                int a = kkVar.e - ((int) (this.D - (kkVar.a() * kkVar.d)));
                if (a > 0) {
                    write = this.u.write(this.P, this.Q, Math.min(remaining2, a));
                    if (write > 0) {
                        this.Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                }
                write = 0;
            } else if (!this.Y) {
                write = this.u.write(byteBuffer, remaining2, 1);
            } else if (j != -9223372036854775807L) {
                AudioTrack audioTrack = this.u;
                if (i >= 26) {
                    write = audioTrack.write(byteBuffer, remaining2, 1, j * 1000);
                } else {
                    if (this.z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, remaining2);
                        this.z.putLong(8, j * 1000);
                        this.z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.z.remaining();
                    if (remaining3 > 0) {
                        int write2 = audioTrack.write(this.z, remaining3, 1);
                        if (write2 < 0) {
                            this.A = 0;
                            write = write2;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining2, 1);
                    if (write < 0) {
                        this.A = 0;
                    } else {
                        this.A -= write;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            this.Z = SystemClock.elapsedRealtime();
            if (write < 0) {
                boolean z = (i >= 24 && write == -6) || write == -32;
                if (z && this.t.c == 1) {
                    this.a0 = true;
                }
                fk fkVar = new fk(write, this.t.a, z);
                yj1 yj1Var2 = this.r;
                if (yj1Var2 != null) {
                    gh1.b("MediaCodecAudioRenderer", gh1.a("Audio sink error", fkVar));
                    yj1Var2.a.H0.b(fkVar);
                }
                if (!fkVar.c) {
                    lc0 lc0Var = this.o;
                    lc0Var.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (lc0Var.a == null) {
                        lc0Var.a = fkVar;
                        lc0Var.b = 100 + elapsedRealtime;
                    }
                    if (elapsedRealtime >= lc0Var.b) {
                        Exception exc = lc0Var.a;
                        if (exc != fkVar) {
                            exc.addSuppressed(fkVar);
                        }
                        Exception exc2 = lc0Var.a;
                        lc0Var.a = null;
                        throw exc2;
                    }
                    return;
                }
                throw fkVar;
            }
            this.o.a = null;
            if (a(this.u)) {
                if (this.E > 0) {
                    this.b0 = false;
                }
                if (this.U && (yj1Var = this.r) != null && write < remaining2 && !this.b0 && (nn2Var = yj1Var.a.Q0) != null) {
                    ((zn0) nn2Var).a.H = true;
                }
            }
            int i2 = this.t.c;
            if (i2 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.M) {
                        throw new IllegalStateException();
                    }
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        int i;
        zj[] zjVarArr;
        if (this.R == -1) {
            this.R = 0;
            z = true;
            i = this.R;
            zjVarArr = this.K;
            if (i < zjVarArr.length) {
                zj zjVar = zjVarArr[i];
                if (z) {
                    zjVar.b();
                }
                b(-9223372036854775807L);
                if (!zjVar.c()) {
                    return false;
                }
                this.R++;
                z = true;
                i = this.R;
                zjVarArr = this.K;
                if (i < zjVarArr.length) {
                    ByteBuffer byteBuffer = this.O;
                    if (byteBuffer != null) {
                        a(byteBuffer, -9223372036854775807L);
                        if (this.O != null) {
                            return false;
                        }
                    }
                    this.R = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.R;
            zjVarArr = this.K;
            if (i < zjVarArr.length) {
            }
        }
    }

    public final void a(re2 re2Var) {
        if (f()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(re2Var.b).setPitch(re2Var.c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                gh1.d("DefaultAudioSink", gh1.a("Failed to set playback params", e));
            }
            float speed = this.u.getPlaybackParams().getSpeed();
            re2Var = new re2(speed, this.u.getPlaybackParams().getPitch());
            kk kkVar = this.i;
            kkVar.j = speed;
            jk jkVar = kkVar.f;
            if (jkVar != null) {
                jkVar.a();
            }
        }
        this.y = re2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r2 != 4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[LOOP:1: B:40:0x00d8->B:42:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[EDGE_INSN: B:43:0x00ec->B:44:0x00ec BREAK  A[LOOP:1: B:40:0x00d8->B:42:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        re2 re2Var;
        int i;
        boolean z;
        zj[] zjVarArr;
        yj1 yj1Var;
        if (!this.Y && "audio/raw".equals(this.t.a.m)) {
            int i2 = this.t.a.B;
            if (this.c) {
                int i3 = sb3.a;
                if (i2 != 536870912) {
                    if (i2 != 805306368) {
                    }
                }
            }
            ic0 ic0Var = this.b;
            re2Var = c().a;
            o23 o23Var = ic0Var.c;
            float f = re2Var.b;
            if (o23Var.c != f) {
                o23Var.c = f;
                o23Var.i = true;
            }
            float f2 = re2Var.c;
            if (o23Var.d != f2) {
                o23Var.d = f2;
                o23Var.i = true;
            }
            re2 re2Var2 = re2Var;
            i = 0;
            if (!this.Y && "audio/raw".equals(this.t.a.m)) {
                int i4 = this.t.a.B;
                if (this.c) {
                    int i5 = sb3.a;
                    if (i4 != 536870912) {
                        if (i4 != 805306368) {
                        }
                    }
                }
                ic0 ic0Var2 = this.b;
                z = c().b;
                ic0Var2.b.m = z;
                this.j.add(new kc0(re2Var2, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
                zj[] zjVarArr2 = this.t.i;
                ArrayList arrayList = new ArrayList();
                for (zj zjVar : zjVarArr2) {
                    if (zjVar.isActive()) {
                        arrayList.add(zjVar);
                    } else {
                        zjVar.flush();
                    }
                }
                int size = arrayList.size();
                this.K = (zj[]) arrayList.toArray(new zj[size]);
                this.L = new ByteBuffer[size];
                while (true) {
                    zjVarArr = this.K;
                    if (i < zjVarArr.length) {
                        break;
                    }
                    zj zjVar2 = zjVarArr[i];
                    zjVar2.flush();
                    this.L[i] = zjVar2.a();
                    i++;
                }
                yj1Var = this.r;
                if (yj1Var == null) {
                    yj1Var.a.H0.b(z);
                    return;
                }
                return;
            }
            z = false;
            this.j.add(new kc0(re2Var2, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
            zj[] zjVarArr22 = this.t.i;
            ArrayList arrayList2 = new ArrayList();
            while (r6 < r5) {
            }
            int size2 = arrayList2.size();
            this.K = (zj[]) arrayList2.toArray(new zj[size2]);
            this.L = new ByteBuffer[size2];
            while (true) {
                zjVarArr = this.K;
                if (i < zjVarArr.length) {
                }
                zj zjVar22 = zjVarArr[i];
                zjVar22.flush();
                this.L[i] = zjVar22.a();
                i++;
            }
            yj1Var = this.r;
            if (yj1Var == null) {
            }
        }
        re2Var = re2.e;
        re2 re2Var22 = re2Var;
        i = 0;
        if (!this.Y) {
            int i42 = this.t.a.B;
            if (this.c) {
            }
            ic0 ic0Var22 = this.b;
            z = c().b;
            ic0Var22.b.m = z;
            this.j.add(new kc0(re2Var22, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
            zj[] zjVarArr222 = this.t.i;
            ArrayList arrayList22 = new ArrayList();
            while (r6 < r5) {
            }
            int size22 = arrayList22.size();
            this.K = (zj[]) arrayList22.toArray(new zj[size22]);
            this.L = new ByteBuffer[size22];
            while (true) {
                zjVarArr = this.K;
                if (i < zjVarArr.length) {
                }
                zj zjVar222 = zjVarArr[i];
                zjVar222.flush();
                this.L[i] = zjVar222.a();
                i++;
            }
            yj1Var = this.r;
            if (yj1Var == null) {
            }
        }
        z = false;
        this.j.add(new kc0(re2Var22, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
        zj[] zjVarArr2222 = this.t.i;
        ArrayList arrayList222 = new ArrayList();
        while (r6 < r5) {
        }
        int size222 = arrayList222.size();
        this.K = (zj[]) arrayList222.toArray(new zj[size222]);
        this.L = new ByteBuffer[size222];
        while (true) {
            zjVarArr = this.K;
            if (i < zjVarArr.length) {
            }
            zj zjVar2222 = zjVarArr[i];
            zjVar2222.flush();
            this.L[i] = zjVar2222.a();
            i++;
        }
        yj1Var = this.r;
        if (yj1Var == null) {
        }
    }

    public final boolean a(nj njVar, jw0 jw0Var) {
        int a;
        boolean isOffloadedPlaybackSupported;
        int i;
        int i2 = sb3.a;
        if (i2 < 29 || this.l == 0) {
            return false;
        }
        String str = jw0Var.m;
        str.getClass();
        int a2 = vt1.a(str, jw0Var.j);
        if (a2 == 0 || (a = sb3.a(jw0Var.z)) == 0) {
            return false;
        }
        AudioFormat build = new AudioFormat.Builder().setSampleRate(jw0Var.A).setChannelMask(a).setEncoding(a2).build();
        if (njVar.g == null) {
            njVar.g = new mj(njVar);
        }
        AudioAttributes audioAttributes = njVar.g.a;
        if (i2 >= 31) {
            i = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, audioAttributes);
            if (isOffloadedPlaybackSupported) {
                i = (i2 == 30 && sb3.d.startsWith("Pixel")) ? 2 : 1;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return ((jw0Var.C != 0 || jw0Var.D != 0) && (this.l == 1)) ? false : true;
        }
        if (i == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (sb3.a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }
}
