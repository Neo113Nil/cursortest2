package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public c[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final s a;
    public boolean a0;
    public final x b;
    public boolean b0;
    public final c[] c;
    public long c0;
    public final o d;
    public final ConditionVariable e = new ConditionVariable(true);
    public final long[] f;
    public final k g;
    public final LinkedList h;
    public AudioTrack i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public com.fyber.inneractive.sdk.player.exoplayer2.s r;
    public com.fyber.inneractive.sdk.player.exoplayer2.s s;
    public long t;
    public long u;
    public ByteBuffer v;
    public int w;
    public int x;
    public int y;
    public long z;

    public r(c[] cVarArr, u uVar) {
        this.d = uVar;
        if (z.a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.a >= 19) {
            this.g = new l();
        } else {
            this.g = new k();
        }
        s sVar = new s();
        this.a = sVar;
        x xVar = new x();
        this.b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.n = 3;
        this.Z = 0;
        this.s = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
        this.W = -1;
        this.Q = new c[0];
        this.R = new ByteBuffer[0];
        this.h = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int minBufferSize;
        int i6 = z.a;
        if (i3 == Integer.MIN_VALUE) {
            i4 = i * 3;
        } else if (i3 == 1073741824) {
            i4 = i * 4;
        } else if (i3 == 2) {
            i4 = i * 2;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException();
            }
            i4 = i;
        }
        this.E = i4;
        this.a.d = iArr;
        boolean z = false;
        for (c cVar : this.c) {
            try {
                z |= cVar.a(i2, i, i3);
                if (cVar.d()) {
                    i = cVar.e();
                    i3 = 2;
                }
            } catch (b e) {
                throw new m(e);
            }
        }
        if (z) {
            h();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = com.fyber.inneractive.sdk.player.exoplayer2.b.a;
                break;
            default:
                throw new m(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unsupported channel count: ", i));
        }
        int i8 = z.a;
        if (i8 <= 23 && "foster".equals(z.b) && "NVIDIA".equals(z.c)) {
            if (i != 3 && i != 5) {
                if (i == 7) {
                    i7 = com.fyber.inneractive.sdk.player.exoplayer2.b.a;
                }
            }
            if (i8 <= 25) {
                "fugu".equals(z.b);
            }
            if (z && d() && this.l == i3 && this.j == i2 && this.k == i7) {
                return;
            }
            g();
            this.l = i3;
            this.o = false;
            this.j = i2;
            this.k = i7;
            this.m = 2;
            this.H = i * 2;
            minBufferSize = AudioTrack.getMinBufferSize(i2, i7, 2);
            if (minBufferSize != -2) {
                throw new IllegalStateException();
            }
            int i9 = 4 * minBufferSize;
            long j = this.j;
            int i10 = this.H;
            int i11 = ((int) ((250000 * j) / 1000000)) * i10;
            int max = (int) Math.max(minBufferSize, ((j * 750000) / 1000000) * i10);
            if (i9 < i11) {
                i9 = i11;
            } else if (i9 > max) {
                i9 = max;
            }
            this.p = i9;
            this.q = ((i9 / this.H) * 1000000) / this.j;
            a(this.s);
            return;
        }
        i7 = i5;
        if (i8 <= 25) {
        }
        if (z) {
        }
        g();
        this.l = i3;
        this.o = false;
        this.j = i2;
        this.k = i7;
        this.m = 2;
        this.H = i * 2;
        minBufferSize = AudioTrack.getMinBufferSize(i2, i7, 2);
        if (minBufferSize != -2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (r10 < r9) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.T;
            int i = 0;
            if (byteBuffer2 == null) {
                this.T = byteBuffer;
                if (z.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.U;
                    if (bArr == null || bArr.length < remaining) {
                        this.U = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.U, 0, remaining);
                    byteBuffer.position(position);
                    this.V = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int remaining2 = byteBuffer.remaining();
            if (z.a < 21) {
                int a = this.p - ((int) (this.I - (this.g.a() * this.H)));
                if (a > 0) {
                    i = this.i.write(this.U, this.V, Math.min(remaining2, a));
                    if (i > 0) {
                        this.V += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (!this.a0) {
                i = this.i.write(byteBuffer, remaining2, 1);
            } else {
                if (j == -9223372036854775807L) {
                    throw new IllegalStateException();
                }
                AudioTrack audioTrack = this.i;
                if (this.v == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.v = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.v.putInt(1431633921);
                }
                if (this.w == 0) {
                    this.v.putInt(4, remaining2);
                    this.v.putLong(8, j * 1000);
                    this.v.position(0);
                    this.w = remaining2;
                }
                int remaining3 = this.v.remaining();
                if (remaining3 > 0) {
                    int write = audioTrack.write(this.v, remaining3, 1);
                    if (write < 0) {
                        this.w = 0;
                        i = write;
                    }
                }
                int write2 = audioTrack.write(byteBuffer, remaining2, 1);
                if (write2 < 0) {
                    this.w = 0;
                } else {
                    this.w -= write2;
                }
                i = write2;
            }
            this.c0 = SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new q(i);
            }
            boolean z = this.o;
            if (!z) {
                this.I += i;
            }
            if (i == remaining2) {
                if (z) {
                    this.J += this.K;
                }
                this.T = null;
            }
        }
    }

    public final boolean c() {
        return d() && (b() > this.g.a() || (e() && this.i.getPlayState() == 2 && this.i.getPlaybackHeadPosition() == 0));
    }

    public final boolean d() {
        return this.i != null;
    }

    public final boolean e() {
        int i;
        return z.a < 23 && ((i = this.m) == 5 || i == 6);
    }

    public final void f() {
        this.Y = true;
        if (d()) {
            this.N = System.nanoTime() / 1000;
            this.i.play();
        }
    }

    public final void g() {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.r;
            if (sVar != null) {
                this.s = sVar;
                this.r = null;
            } else if (!this.h.isEmpty()) {
                this.s = ((p) this.h.getLast()).a;
            }
            this.h.clear();
            this.t = 0L;
            this.u = 0L;
            this.S = null;
            this.T = null;
            int i = 0;
            while (true) {
                c[] cVarArr = this.Q;
                if (i >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i];
                cVar.flush();
                this.R[i] = cVar.a();
                i++;
            }
            this.X = false;
            this.W = -1;
            this.v = null;
            this.w = 0;
            this.L = 0;
            this.O = 0L;
            this.z = 0L;
            this.y = 0;
            this.x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.i.getPlayState() == 3) {
                this.i.pause();
            }
            AudioTrack audioTrack = this.i;
            this.i = null;
            this.g.a(null, false);
            this.e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (c[]) arrayList.toArray(new c[size]);
        this.R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            c cVar2 = this.Q[i];
            cVar2.flush();
            this.R[i] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (z.a >= 21) {
                this.i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.i;
            float f = this.P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final long b() {
        return this.o ? this.J : this.I / this.H;
    }

    public final boolean a(ByteBuffer byteBuffer, long j) {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.e.block();
            if (this.a0) {
                this.i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.k).setEncoding(this.m).setSampleRate(this.j).build(), this.p, 1, this.Z);
            } else if (this.Z == 0) {
                this.i = new AudioTrack(this.n, this.j, this.k, this.m, this.p, 1);
            } else {
                this.i = new AudioTrack(this.n, this.j, this.k, this.m, this.p, 1, this.Z);
            }
            int state = this.i.getState();
            if (state == 1) {
                int audioSessionId = this.i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    u uVar = (u) this.d;
                    uVar.a.P.audioSessionId(audioSessionId);
                    uVar.a.getClass();
                }
                this.g.a(this.i, e());
                i();
                this.b0 = false;
                if (this.Y) {
                    f();
                }
            } else {
                try {
                    this.i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
                this.i = null;
                throw new n(state, this.j, this.k, this.p);
            }
        }
        if (e()) {
            if (this.i.getPlayState() == 2) {
                this.b0 = false;
                return false;
            }
            if (this.i.getPlayState() == 1 && this.g.a() != 0) {
                return false;
            }
        }
        boolean z = this.b0;
        boolean c = c();
        this.b0 = c;
        if (z && !c && this.i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c0;
            u uVar2 = (u) this.d;
            uVar2.a.P.audioTrackUnderrun(this.p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.q), elapsedRealtime);
            uVar2.a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.o && this.K == 0) {
                int i3 = this.m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    i2 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a.a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i3));
                }
                this.K = i2;
            }
            if (this.r != null) {
                if (!a()) {
                    return false;
                }
                this.h.add(new p(this.r, Math.max(0L, j), (b() * 1000000) / this.j));
                this.r = null;
                h();
            }
            int i4 = this.L;
            if (i4 == 0) {
                this.M = Math.max(0L, j);
                this.L = 1;
            } else {
                long j2 = (((this.o ? this.G : this.F / this.E) * 1000000) / this.j) + this.M;
                if (i4 != 1 || Math.abs(j2 - j) <= 200000) {
                    i = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j2 + ", got " + j + X3.j.e);
                    i = 2;
                    this.L = 2;
                }
                if (this.L == i) {
                    this.M = (j - j2) + this.M;
                    this.L = 1;
                    u uVar3 = (u) this.d;
                    uVar3.a.getClass();
                    uVar3.a.V = true;
                }
            }
            if (this.o) {
                this.G += this.K;
            } else {
                this.F += byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.o) {
            b(this.S, j);
        } else {
            a(j);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final void a(long j) {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.R[i - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = c.a;
                }
            }
            if (i == length) {
                b(byteBuffer, j);
            } else {
                c cVar = this.Q[i];
                cVar.a(byteBuffer);
                ByteBuffer a = cVar.a();
                this.R[i] = a;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        int i;
        c[] cVarArr;
        if (this.W == -1) {
            this.W = this.o ? this.Q.length : 0;
            z = true;
            i = this.W;
            cVarArr = this.Q;
            if (i < cVarArr.length) {
                c cVar = cVarArr[i];
                if (z) {
                    cVar.b();
                }
                a(-9223372036854775807L);
                if (!cVar.c()) {
                    return false;
                }
                this.W++;
                z = true;
                i = this.W;
                cVarArr = this.Q;
                if (i < cVarArr.length) {
                    ByteBuffer byteBuffer = this.T;
                    if (byteBuffer != null) {
                        b(byteBuffer, -9223372036854775807L);
                        if (this.T != null) {
                            return false;
                        }
                    }
                    this.W = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.W;
            cVarArr = this.Q;
            if (i < cVarArr.length) {
            }
        }
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
            this.s = sVar2;
            return sVar2;
        }
        x xVar = this.b;
        float f = sVar.a;
        xVar.getClass();
        int i = z.a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        xVar.e = max;
        x xVar2 = this.b;
        float f2 = sVar.b;
        xVar2.getClass();
        xVar2.f = Math.max(0.1f, Math.min(f2, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(max, f2);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.r;
        if (sVar4 == null) {
            if (!this.h.isEmpty()) {
                sVar4 = ((p) this.h.getLast()).a;
            } else {
                sVar4 = this.s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.r = sVar3;
            } else {
                this.s = sVar3;
            }
        }
        return this.s;
    }

    public final long a(boolean z) {
        long j;
        long j2;
        if (!d() || this.L == 0) {
            return Long.MIN_VALUE;
        }
        if (this.i.getPlayState() == 3) {
            long a = (this.g.a() * 1000000) / r1.c;
            if (a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.A >= 30000) {
                    long[] jArr = this.f;
                    int i = this.x;
                    jArr[i] = a - nanoTime;
                    this.x = (i + 1) % 10;
                    int i2 = this.y;
                    if (i2 < 10) {
                        this.y = i2 + 1;
                    }
                    this.A = nanoTime;
                    this.z = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.y;
                        if (i3 >= i4) {
                            break;
                        }
                        this.z = (this.f[i3] / i4) + this.z;
                        i3++;
                    }
                }
                if (!e() && nanoTime - this.C >= 500000) {
                    boolean e = this.g.e();
                    this.B = e;
                    if (e) {
                        long c = this.g.c() / 1000;
                        long b = this.g.b();
                        if (c < this.N) {
                            this.B = false;
                        } else if (Math.abs(c - nanoTime) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(c);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(this.o ? this.G : this.F / this.E);
                            sb.append(", ");
                            sb.append(b());
                            Log.w("AudioTrack", sb.toString());
                            this.B = false;
                        } else if (Math.abs(((b * 1000000) / this.j) - a) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(b);
                            sb2.append(", ");
                            sb2.append(c);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(a);
                            sb2.append(", ");
                            sb2.append(this.o ? this.G : this.F / this.E);
                            sb2.append(", ");
                            sb2.append(b());
                            Log.w("AudioTrack", sb2.toString());
                            this.B = false;
                        }
                    }
                    if (this.D != null && !this.o) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.i, null)).intValue() * 1000) - this.q;
                            this.O = intValue;
                            long max = Math.max(intValue, 0L);
                            this.O = max;
                            if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.O);
                                this.O = 0L;
                            }
                        } catch (Exception unused) {
                            this.D = null;
                        }
                    }
                    this.C = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.B) {
            j = ((this.g.b() + (((nanoTime2 - (this.g.c() / 1000)) * this.j) / 1000000)) * 1000000) / this.j;
        } else {
            if (this.y == 0) {
                j = (this.g.a() * 1000000) / r1.c;
            } else {
                j = nanoTime2 + this.z;
            }
            if (!z) {
                j -= this.O;
            }
        }
        long j3 = this.M;
        while (!this.h.isEmpty() && j >= ((p) this.h.getFirst()).c) {
            p pVar = (p) this.h.remove();
            this.s = pVar.a;
            this.u = pVar.c;
            this.t = pVar.b - this.M;
        }
        if (this.s.a == 1.0f) {
            j2 = (j + this.t) - this.u;
        } else {
            if (this.h.isEmpty()) {
                x xVar = this.b;
                long j4 = xVar.k;
                if (j4 >= 1024) {
                    j2 = this.t + z.a(j - this.u, xVar.j, j4);
                }
            }
            j2 = ((long) (this.s.a * (j - this.u))) + this.t;
        }
        return j3 + j2;
    }
}
