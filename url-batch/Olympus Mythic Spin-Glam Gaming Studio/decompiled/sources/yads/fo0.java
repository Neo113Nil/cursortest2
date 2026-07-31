package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public final class fo0 implements Handler.Callback, fm1, gf2 {
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public eo0 K;
    public long L;
    public int M;
    public boolean N;
    public nn0 O;
    public final fo[] b;
    public final Set c;
    public final fo[] d;
    public final h83 e;
    public final i83 f;
    public final de0 g;
    public final dl h;
    public final s53 i;
    public final HandlerThread j;
    public final Looper k;
    public final f73 l;
    public final d73 m;
    public final long n;
    public final fe0 o;
    public final ArrayList p;
    public final p53 q;
    public final co0 r;
    public final km1 s;
    public final ym1 t;
    public final ce0 u;
    public final long v;
    public nx2 w;
    public pe2 x;
    public bo0 y;
    public boolean z;
    public int E = 0;
    public boolean F = false;
    public boolean A = false;
    public long P = -9223372036854775807L;

    public fo0(fo[] foVarArr, h83 h83Var, i83 i83Var, de0 de0Var, dl dlVar, kd kdVar, nx2 nx2Var, ce0 ce0Var, long j, Looper looper, p53 p53Var, co0 co0Var, ff2 ff2Var) {
        this.r = co0Var;
        this.b = foVarArr;
        this.e = h83Var;
        this.f = i83Var;
        this.g = de0Var;
        this.h = dlVar;
        this.w = nx2Var;
        this.u = ce0Var;
        this.v = j;
        this.q = p53Var;
        this.n = de0Var.h;
        c73 c73Var = g73.b;
        pm1 pm1Var = pe2.s;
        pe2 pe2Var = new pe2(c73Var, pm1Var, -9223372036854775807L, 0L, 1, null, false, y73.e, i83Var, um2.f, pm1Var, false, 0, re2.e, 0L, 0L, 0L, false);
        this.x = pe2Var;
        this.y = new bo0(pe2Var);
        this.d = new fo[foVarArr.length];
        for (int i = 0; i < foVarArr.length; i++) {
            fo foVar = foVarArr[i];
            foVar.e = i;
            foVar.f = ff2Var;
            this.d[i] = foVar;
        }
        this.o = new fe0(this, p53Var);
        this.p = new ArrayList();
        this.c = az2.a();
        this.l = new f73();
        this.m = new d73();
        h83Var.a = this;
        h83Var.b = dlVar;
        this.N = true;
        Handler handler = new Handler(looper);
        this.s = new km1(kdVar, handler);
        this.t = new ym1(this, kdVar, handler, ff2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        this.i = p53Var.a(looper2, this);
    }

    public static boolean b(fo foVar) {
        return foVar.g != 0;
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        this.i.a(9, (gm1) iy2Var).b();
    }

    public final void c(if2 if2Var) {
        if (if2Var.f != this.k) {
            this.i.a(15, if2Var).b();
            return;
        }
        a(if2Var);
        int i = this.x.e;
        if (i == 3 || i == 2) {
            this.i.a.sendEmptyMessage(2);
        }
    }

    public final void d(final if2 if2Var) {
        Looper looper = if2Var.f;
        if (looper.getThread().isAlive()) {
            this.q.getClass();
            new Handler(looper, null).post(new Runnable() { // from class: yads.fo0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    fo0.this.b(if2Var);
                }
            });
        } else {
            gh1.d("TAG", "Trying to send message on a dead thread.");
            if2Var.a(false);
        }
    }

    public final void e() {
        a(this.t.a(), true);
    }

    public final void f() {
        this.y.a(1);
        throw null;
    }

    public final void g() {
        this.y.a(1);
        a(false, false, false, true);
        this.g.a(false);
        b(this.x.a.c() ? 4 : 2);
        ym1 ym1Var = this.t;
        tc0 tc0Var = (tc0) this.h;
        tc0Var.getClass();
        if (ym1Var.k) {
            throw new IllegalStateException();
        }
        ym1Var.l = tc0Var;
        for (int i = 0; i < ym1Var.b.size(); i++) {
            xm1 xm1Var = (xm1) ym1Var.b.get(i);
            ym1Var.a(xm1Var);
            ym1Var.i.add(xm1Var);
        }
        ym1Var.k = true;
        this.i.a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.z && this.j.isAlive()) {
            this.i.a.sendEmptyMessage(7);
            a(new i53() { // from class: yads.fo0$$ExternalSyntheticLambda0
                @Override // yads.i53
                public final Object get() {
                    return fo0.this.c();
                }
            }, this.v);
            return this.z;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        hm1 hm1Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((eo0) message.obj);
                    break;
                case 4:
                    a((re2) message.obj);
                    break;
                case 5:
                    this.w = (nx2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((gm1) message.obj);
                    break;
                case 9:
                    b((gm1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    if2 if2Var = (if2) message.obj;
                    if2Var.getClass();
                    c(if2Var);
                    break;
                case 15:
                    d((if2) message.obj);
                    break;
                case 16:
                    re2 re2Var = (re2) message.obj;
                    a(re2Var, re2Var.b, true, false);
                    break;
                case 17:
                    a((ao0) message.obj);
                    break;
                case 18:
                    a((ao0) message.obj, message.arg1);
                    break;
                case 19:
                    yn0.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (hz2) message.obj);
                    break;
                case 21:
                    a((hz2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (IOException e) {
            a(e, 2000);
        } catch (RuntimeException e2) {
            nn0 nn0Var = new nn0(2, e2, ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) ? 1004 : 1000);
            gh1.b("ExoPlayerImplInternal", gh1.a("Playback error", nn0Var));
            a(true, false);
            this.x = this.x.a(nn0Var);
        } catch (cc2 e3) {
            int i = e3.c;
            if (i == 1) {
                r4 = e3.b ? 3001 : 3003;
            } else if (i == 4) {
                r4 = e3.b ? 3002 : 3004;
            }
            a(e3, r4);
        } catch (nn0 e4) {
            e = e4;
            if (e.d == 1 && (hm1Var = this.s.i) != null) {
                pm1 pm1Var = hm1Var.f.a;
                String message2 = e.getMessage();
                int i2 = sb3.a;
                e = new nn0(message2, e.getCause(), e.b, e.d, e.e, e.f, e.g, e.h, pm1Var, e.c, e.j);
            }
            if (e.j && this.O == null) {
                gh1.d("ExoPlayerImplInternal", gh1.a("Recoverable renderer error", e));
                this.O = e;
                s53 s53Var = this.i;
                r53 a = s53Var.a(25, e);
                Handler handler = s53Var.a;
                Message message3 = a.a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                a.a();
                z = false;
            } else {
                nn0 nn0Var2 = this.O;
                if (nn0Var2 != null) {
                    nn0Var2.addSuppressed(e);
                    e = this.O;
                }
                gh1.b("ExoPlayerImplInternal", gh1.a("Playback error", e));
                z = false;
                a(true, false);
                this.x = this.x.a(e);
            }
        } catch (r30 e5) {
            a(e5, e5.b);
        } catch (ro e6) {
            a(e6, 1002);
        } catch (wk0 e7) {
            a(e7, e7.b);
        }
        z = false;
        bo0 bo0Var = this.y;
        pe2 pe2Var = this.x;
        boolean z2 = bo0Var.a | (bo0Var.b != pe2Var ? true : z);
        bo0Var.a = z2;
        bo0Var.b = pe2Var;
        if (!z2) {
            return true;
        }
        this.r.a(bo0Var);
        this.y = new bo0(this.x);
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        this.g.a(true);
        b(1);
        this.j.quit();
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }

    public final void j() {
        int i;
        float f = this.o.getPlaybackParameters().b;
        km1 km1Var = this.s;
        hm1 hm1Var = km1Var.h;
        hm1 hm1Var2 = km1Var.i;
        boolean z = true;
        for (hm1 hm1Var3 = hm1Var; hm1Var3 != null && hm1Var3.d; hm1Var3 = hm1Var3.l) {
            i83 a = hm1Var3.j.a(hm1Var3.i, hm1Var3.m, hm1Var3.f.a, this.x.a);
            for (xo0 xo0Var : a.c) {
                if (xo0Var != null) {
                    xo0Var.a(f);
                }
            }
            i83 i83Var = hm1Var3.n;
            if (i83Var != null && i83Var.c.length == a.c.length) {
                for (0; i < a.c.length; i + 1) {
                    i = (sb3.a(a.b[i], i83Var.b[i]) && sb3.a(a.c[i], i83Var.c[i])) ? i + 1 : 0;
                }
                if (hm1Var3 == hm1Var2) {
                    z = false;
                }
            }
            if (z) {
                km1 km1Var2 = this.s;
                hm1 hm1Var4 = km1Var2.h;
                boolean a2 = km1Var2.a(hm1Var4);
                boolean[] zArr = new boolean[this.b.length];
                long a3 = hm1Var4.a(a, this.x.r, a2, zArr);
                pe2 pe2Var = this.x;
                boolean z2 = (pe2Var.e == 4 || a3 == pe2Var.r) ? false : true;
                pe2 pe2Var2 = this.x;
                this.x = a(pe2Var2.b, a3, pe2Var2.c, pe2Var2.d, z2, 5);
                if (z2) {
                    b(a3);
                }
                boolean[] zArr2 = new boolean[this.b.length];
                int i2 = 0;
                while (true) {
                    fo[] foVarArr = this.b;
                    if (i2 >= foVarArr.length) {
                        break;
                    }
                    fo foVar = foVarArr[i2];
                    boolean b = b(foVar);
                    zArr2[i2] = b;
                    ys2 ys2Var = hm1Var4.c[i2];
                    if (b) {
                        if (ys2Var != foVar.h) {
                            a(foVar);
                        } else if (zArr[i2]) {
                            long j = this.L;
                            foVar.l = false;
                            foVar.k = j;
                            foVar.a(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                a(zArr2);
            } else {
                this.s.a(hm1Var3);
                if (hm1Var3.d) {
                    hm1Var3.a(a, Math.max(hm1Var3.f.b, this.L - hm1Var3.o), false, new boolean[hm1Var3.i.length]);
                }
            }
            a(true);
            if (this.x.e != 4) {
                d();
                o();
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        hm1 hm1Var = this.s.h;
        this.B = hm1Var != null && hm1Var.f.h && this.A;
    }

    public final boolean l() {
        pe2 pe2Var = this.x;
        return pe2Var.l && pe2Var.m == 0;
    }

    public final void m() {
        int i;
        fe0 fe0Var = this.o;
        fe0Var.g = false;
        u33 u33Var = fe0Var.b;
        if (u33Var.c) {
            u33Var.a(u33Var.a());
            u33Var.c = false;
        }
        for (fo foVar : this.b) {
            if (b(foVar) && (i = foVar.g) == 2) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                foVar.g = 1;
                foVar.j();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yads.iy2] */
    public final void n() {
        hm1 hm1Var = this.s.j;
        boolean z = this.D || (hm1Var != null && hm1Var.a.isLoading());
        pe2 pe2Var = this.x;
        if (z != pe2Var.g) {
            this.x = new pe2(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, pe2Var.e, pe2Var.f, z, pe2Var.h, pe2Var.i, pe2Var.j, pe2Var.k, pe2Var.l, pe2Var.m, pe2Var.n, pe2Var.p, pe2Var.q, pe2Var.r, pe2Var.o);
        }
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, yads.iy2] */
    public final void o() {
        long j;
        hm1 hm1Var = this.s.h;
        if (hm1Var == null) {
            return;
        }
        long readDiscontinuity = hm1Var.d ? hm1Var.a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            b(readDiscontinuity);
            if (readDiscontinuity != this.x.r) {
                pe2 pe2Var = this.x;
                this.x = a(pe2Var.b, readDiscontinuity, pe2Var.c, readDiscontinuity, true, 5);
            }
        } else {
            fe0 fe0Var = this.o;
            boolean z = hm1Var != this.s.i;
            fo foVar = fe0Var.d;
            if (foVar == null || foVar.e() || (!fe0Var.d.f() && (z || fe0Var.d.d()))) {
                fe0Var.f = true;
                if (fe0Var.g) {
                    u33 u33Var = fe0Var.b;
                    if (!u33Var.c) {
                        u33Var.b.getClass();
                        u33Var.e = SystemClock.elapsedRealtime();
                        u33Var.c = true;
                    }
                }
            } else {
                tj1 tj1Var = fe0Var.e;
                tj1Var.getClass();
                long a = tj1Var.a();
                if (fe0Var.f) {
                    if (a < fe0Var.b.a()) {
                        u33 u33Var2 = fe0Var.b;
                        if (u33Var2.c) {
                            u33Var2.a(u33Var2.a());
                            u33Var2.c = false;
                        }
                    } else {
                        fe0Var.f = false;
                        if (fe0Var.g) {
                            u33 u33Var3 = fe0Var.b;
                            if (!u33Var3.c) {
                                u33Var3.b.getClass();
                                u33Var3.e = SystemClock.elapsedRealtime();
                                u33Var3.c = true;
                            }
                        }
                    }
                }
                fe0Var.b.a(a);
                re2 playbackParameters = tj1Var.getPlaybackParameters();
                if (!playbackParameters.equals(fe0Var.b.f)) {
                    fe0Var.b.a(playbackParameters);
                    fe0Var.c.i.a(16, playbackParameters).b();
                }
            }
            long a2 = fe0Var.a();
            this.L = a2;
            long j2 = a2 - hm1Var.o;
            long j3 = this.x.r;
            if (!this.p.isEmpty() && !this.x.b.a()) {
                if (this.N) {
                    this.N = false;
                }
                pe2 pe2Var2 = this.x;
                pe2Var2.a.a(pe2Var2.b.a);
                int min = Math.min(this.M, this.p.size());
                if (min > 0 && this.p.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.p.size() && this.p.get(min) != null) {
                    throw new ClassCastException();
                }
                this.M = min;
            }
            this.x.r = j2;
        }
        hm1 hm1Var2 = this.s.j;
        pe2 pe2Var3 = this.x;
        if (hm1Var2.d) {
            long bufferedPositionUs = hm1Var2.e ? hm1Var2.a.getBufferedPositionUs() : Long.MIN_VALUE;
            j = bufferedPositionUs == Long.MIN_VALUE ? hm1Var2.f.e : bufferedPositionUs;
        } else {
            j = hm1Var2.f.b;
        }
        pe2Var3.p = j;
        pe2 pe2Var4 = this.x;
        pe2Var4.q = a(pe2Var4.p);
        pe2 pe2Var5 = this.x;
        if (pe2Var5.l && pe2Var5.e == 3 && a(pe2Var5.a, pe2Var5.b)) {
            pe2 pe2Var6 = this.x;
            float f = 1.0f;
            if (pe2Var6.n.b == 1.0f) {
                ce0 ce0Var = this.u;
                long a3 = a(pe2Var6.a, pe2Var6.b.a, pe2Var6.r);
                long a4 = a(this.x.p);
                if (ce0Var.c != -9223372036854775807L) {
                    long j4 = a3 - a4;
                    long j5 = ce0Var.m;
                    if (j5 == -9223372036854775807L) {
                        ce0Var.m = j4;
                        ce0Var.n = 0L;
                    } else {
                        ce0Var.m = Math.max(j4, (long) ((j4 * 9.999871E-4f) + (j5 * 0.999f)));
                        ce0Var.n = (long) ((Math.abs(j4 - r12) * 9.999871E-4f) + (ce0Var.n * 0.999f));
                    }
                    if (ce0Var.l == -9223372036854775807L || SystemClock.elapsedRealtime() - ce0Var.l >= 1000) {
                        ce0Var.l = SystemClock.elapsedRealtime();
                        long j6 = (ce0Var.n * 3) + ce0Var.m;
                        if (ce0Var.h > j6) {
                            float a5 = sb3.a(1000L);
                            long[] jArr = {j6, ce0Var.e, ce0Var.h - (((long) ((ce0Var.k - 1.0f) * a5)) + ((long) ((ce0Var.i - 1.0f) * a5)))};
                            long j7 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j8 = jArr[i];
                                if (j8 > j7) {
                                    j7 = j8;
                                }
                            }
                            ce0Var.h = j7;
                        } else {
                            long max = a3 - ((long) (Math.max(0.0f, ce0Var.k - 1.0f) / 1.0E-7f));
                            long j9 = ce0Var.h;
                            int i2 = sb3.a;
                            long max2 = Math.max(j9, Math.min(max, j6));
                            ce0Var.h = max2;
                            long j10 = ce0Var.g;
                            if (j10 != -9223372036854775807L && max2 > j10) {
                                ce0Var.h = j10;
                            }
                        }
                        long j11 = a3 - ce0Var.h;
                        if (Math.abs(j11) < ce0Var.a) {
                            ce0Var.k = 1.0f;
                        } else {
                            float f2 = ce0Var.j;
                            float f3 = ce0Var.i;
                            int i3 = sb3.a;
                            ce0Var.k = Math.max(f2, Math.min((j11 * 1.0E-7f) + 1.0f, f3));
                        }
                        f = ce0Var.k;
                    } else {
                        f = ce0Var.k;
                    }
                }
                if (this.o.getPlaybackParameters().b != f) {
                    this.o.a(new re2(f, this.x.n.c));
                    a(this.x.n, this.o.getPlaybackParameters().b, false, false);
                }
            }
        }
    }

    public final void b(int i) {
        pe2 pe2Var = this.x;
        if (pe2Var.e != i) {
            if (i != 2) {
                this.P = -9223372036854775807L;
            }
            this.x = pe2Var.a(i);
        }
    }

    public final void a(IOException iOException, int i) {
        nn0 nn0Var = new nn0(0, iOException, i);
        hm1 hm1Var = this.s.h;
        if (hm1Var != null) {
            pm1 pm1Var = hm1Var.f.a;
            String message = nn0Var.getMessage();
            int i2 = sb3.a;
            nn0Var = new nn0(message, nn0Var.getCause(), nn0Var.b, nn0Var.d, nn0Var.e, nn0Var.f, nn0Var.g, nn0Var.h, pm1Var, nn0Var.c, nn0Var.j);
        }
        gh1.b("ExoPlayerImplInternal", gh1.a("Playback error", nn0Var));
        a(false, false);
        this.x = this.x.a(nn0Var);
    }

    public final void e(boolean z) {
        this.F = z;
        km1 km1Var = this.s;
        g73 g73Var = this.x.a;
        km1Var.g = z;
        if (!km1Var.a(g73Var)) {
            b(true);
        }
        a(false);
    }

    public final void b(boolean z) {
        pm1 pm1Var = this.s.h.f.a;
        long a = a(pm1Var, this.x.r, true, false);
        if (a != this.x.r) {
            pe2 pe2Var = this.x;
            this.x = a(pm1Var, a, pe2Var.c, pe2Var.d, z, 5);
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.z);
    }

    public final void c(boolean z) {
        if (z == this.I) {
            return;
        }
        this.I = z;
        if (z || !this.x.o) {
            return;
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void d(boolean z) {
        this.A = z;
        k();
        if (this.B) {
            km1 km1Var = this.s;
            if (km1Var.i != km1Var.h) {
                b(true);
                a(false);
            }
        }
    }

    public static void a(fo foVar, long j) {
        foVar.l = true;
        if (foVar instanceof m63) {
            m63 m63Var = (m63) foVar;
            if (m63Var.l) {
                m63Var.B = j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void b(long j) {
        hm1 hm1Var = this.s.h;
        long j2 = j + (hm1Var == null ? 1000000000000L : hm1Var.o);
        this.L = j2;
        this.o.b.a(j2);
        for (fo foVar : this.b) {
            if (b(foVar)) {
                long j3 = this.L;
                foVar.l = false;
                foVar.k = j3;
                foVar.a(j3, false);
            }
        }
        for (hm1 hm1Var2 = this.s.h; hm1Var2 != null; hm1Var2 = hm1Var2.l) {
            for (xo0 xo0Var : hm1Var2.n.c) {
                if (xo0Var != null) {
                    xo0Var.i();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yads.iy2] */
    public final void d() {
        int i;
        hm1 hm1Var = this.s.j;
        if (hm1Var != null) {
            if ((!hm1Var.d ? 0L : hm1Var.a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                hm1 hm1Var2 = this.s.j;
                long a = a(hm1Var2.d ? hm1Var2.a.getNextLoadPositionUs() : 0L);
                hm1 hm1Var3 = this.s.h;
                de0 de0Var = this.g;
                float f = this.o.getPlaybackParameters().b;
                ub0 ub0Var = de0Var.a;
                synchronized (ub0Var) {
                    i = ub0Var.b * 65536;
                }
                boolean z = i >= de0Var.i;
                long j = de0Var.b;
                if (f > 1.0f) {
                    int i2 = sb3.a;
                    if (f != 1.0f) {
                        j = Math.round(j * f);
                    }
                    j = Math.min(j, de0Var.c);
                }
                if (a < Math.max(j, 500000L)) {
                    r1 = de0Var.g || !z;
                    de0Var.j = r1;
                    if (!r1 && a < 500000) {
                        gh1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (a >= de0Var.c || z) {
                    de0Var.j = false;
                }
                r1 = de0Var.j;
            }
        }
        this.D = r1;
        if (r1) {
            hm1 hm1Var4 = this.s.j;
            long j2 = this.L;
            if (hm1Var4.l == null) {
                hm1Var4.a.c(j2 - hm1Var4.o);
            } else {
                throw new IllegalStateException();
            }
        }
        n();
    }

    @Override // yads.fm1
    public final void a(gm1 gm1Var) {
        this.i.a(8, gm1Var).b();
    }

    public final synchronized void a(i53 i53Var, long j) {
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) i53Var.get()).booleanValue() && j > 0) {
            try {
                this.q.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.q.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yads.gm1] */
    public final void c(gm1 gm1Var) {
        hm1 hm1Var = this.s.j;
        if (hm1Var == null || hm1Var.a != gm1Var) {
            return;
        }
        float f = this.o.getPlaybackParameters().b;
        g73 g73Var = this.x.a;
        hm1Var.d = true;
        y73 trackGroups = hm1Var.a.getTrackGroups();
        hm1Var.m = trackGroups;
        i83 a = hm1Var.j.a(hm1Var.i, trackGroups, hm1Var.f.a, g73Var);
        for (xo0 xo0Var : a.c) {
            if (xo0Var != null) {
                xo0Var.a(f);
            }
        }
        jm1 jm1Var = hm1Var.f;
        long j = jm1Var.b;
        long j2 = jm1Var.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = hm1Var.a(a, j, false, new boolean[hm1Var.i.length]);
        long j3 = hm1Var.o;
        jm1 jm1Var2 = hm1Var.f;
        long j4 = jm1Var2.b;
        hm1Var.o = (j4 - a2) + j3;
        if (a2 != j4) {
            jm1Var2 = new jm1(jm1Var2.a, a2, jm1Var2.c, jm1Var2.d, jm1Var2.e, jm1Var2.f, jm1Var2.g, jm1Var2.h, jm1Var2.i);
        }
        hm1Var.f = jm1Var2;
        a(hm1Var.n);
        if (hm1Var == this.s.h) {
            b(hm1Var.f.b);
            a(new boolean[this.b.length]);
            pe2 pe2Var = this.x;
            pm1 pm1Var = pe2Var.b;
            long j5 = hm1Var.f.b;
            this.x = a(pm1Var, j5, pe2Var.c, j5, false, 5);
        }
        d();
    }

    public final void a(ao0 ao0Var) {
        this.y.a(1);
        if (ao0Var.c != -1) {
            this.K = new eo0(new vf2(ao0Var.a, ao0Var.b), ao0Var.c, ao0Var.d);
        }
        ym1 ym1Var = this.t;
        ArrayList arrayList = ao0Var.a;
        hz2 hz2Var = ao0Var.b;
        ym1Var.a(0, ym1Var.b.size());
        a(ym1Var.a(ym1Var.b.size(), arrayList, hz2Var), false);
    }

    public final void b(if2 if2Var) {
        try {
            a(if2Var);
        } catch (nn0 e) {
            gh1.b("ExoPlayerImplInternal", gh1.a("Unexpected error delivering message on external thread.", e));
            throw new RuntimeException(e);
        }
    }

    public final long b() {
        hm1 hm1Var = this.s.i;
        if (hm1Var == null) {
            return 0L;
        }
        long j = hm1Var.o;
        if (!hm1Var.d) {
            return j;
        }
        int i = 0;
        while (true) {
            fo[] foVarArr = this.b;
            if (i >= foVarArr.length) {
                return j;
            }
            if (b(foVarArr[i])) {
                fo foVar = this.b[i];
                if (foVar.h != hm1Var.c[i]) {
                    continue;
                } else {
                    long j2 = foVar.k;
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(j2, j);
                }
            }
            i++;
        }
    }

    public final void a(ao0 ao0Var, int i) {
        this.y.a(1);
        ym1 ym1Var = this.t;
        if (i == -1) {
            i = ym1Var.b.size();
        }
        a(ym1Var.a(i, ao0Var.a, ao0Var.b), false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yads.iy2] */
    public final void b(gm1 gm1Var) {
        ?? r1;
        hm1 hm1Var = this.s.j;
        if (hm1Var == null || (r1 = hm1Var.a) != gm1Var) {
            return;
        }
        long j = this.L;
        if (hm1Var.l == null) {
            if (hm1Var.d) {
                r1.reevaluateBuffer(j - hm1Var.o);
            }
            d();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(int i, int i2, hz2 hz2Var) {
        this.y.a(1);
        ym1 ym1Var = this.t;
        ym1Var.getClass();
        if (i >= 0 && i <= i2 && i2 <= ym1Var.b.size()) {
            ym1Var.j = hz2Var;
            ym1Var.a(i, i2);
            a(ym1Var.a(), false);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a(hz2 hz2Var) {
        this.y.a(1);
        ym1 ym1Var = this.t;
        int size = ym1Var.b.size();
        if (hz2Var.b.length != size) {
            hz2Var = new hz2(new Random(hz2Var.a.nextLong())).a(size);
        }
        ym1Var.j = hz2Var;
        a(ym1Var.a(), false);
    }

    public final void a(boolean z, int i, boolean z2, int i2) {
        this.y.a(z2 ? 1 : 0);
        bo0 bo0Var = this.y;
        bo0Var.a = true;
        bo0Var.f = true;
        bo0Var.g = i2;
        pe2 pe2Var = this.x;
        this.x = new pe2(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, pe2Var.e, pe2Var.f, pe2Var.g, pe2Var.h, pe2Var.i, pe2Var.j, pe2Var.k, z, i, pe2Var.n, pe2Var.p, pe2Var.q, pe2Var.r, pe2Var.o);
        this.C = false;
        for (hm1 hm1Var = this.s.h; hm1Var != null; hm1Var = hm1Var.l) {
            for (xo0 xo0Var : hm1Var.n.c) {
                if (xo0Var != null) {
                    xo0Var.a(z);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i3 = this.x.e;
        if (i3 != 3) {
            if (i3 == 2) {
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.C = false;
        fe0 fe0Var = this.o;
        fe0Var.g = true;
        u33 u33Var = fe0Var.b;
        if (!u33Var.c) {
            u33Var.b.getClass();
            u33Var.e = SystemClock.elapsedRealtime();
            u33Var.c = true;
        }
        for (fo foVar : this.b) {
            if (b(foVar)) {
                if (foVar.g == 1) {
                    foVar.g = 2;
                    foVar.i();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void a(int i) {
        this.E = i;
        km1 km1Var = this.s;
        g73 g73Var = this.x.a;
        km1Var.f = i;
        if (!km1Var.a(g73Var)) {
            b(true);
        }
        a(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x051d, code lost:
    
        if (l() == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x05c5, code lost:
    
        if (r2 >= r4.i) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x063b, code lost:
    
        if (l() == false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x063e, code lost:
    
        if (r3 == false) goto L407;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.lang.Object, yads.iy2] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, yads.iy2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        pe2 pe2Var;
        int i;
        hm1 hm1Var;
        ys2 ys2Var;
        jm1 a;
        int i2;
        hm1 hm1Var2;
        hm1 hm1Var3;
        boolean z4;
        hm1 hm1Var4;
        hm1 hm1Var5;
        hm1 a2;
        boolean z5;
        int i3;
        fo[] foVarArr;
        boolean z6;
        this.q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.i.a.removeMessages(2);
        int i4 = 0;
        if (this.x.a.c() || !this.t.k) {
            j = -9223372036854775807L;
        } else {
            km1 km1Var = this.s;
            long j2 = this.L;
            hm1 hm1Var6 = km1Var.j;
            if (hm1Var6 != null) {
                if (hm1Var6.l == null) {
                    if (hm1Var6.d) {
                        hm1Var6.a.reevaluateBuffer(j2 - hm1Var6.o);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            km1 km1Var2 = this.s;
            hm1 hm1Var7 = km1Var2.j;
            if (hm1Var7 == null || (!hm1Var7.f.i && hm1Var7.d && ((!hm1Var7.e || hm1Var7.a.getBufferedPositionUs() == Long.MIN_VALUE) && km1Var2.j.f.e != -9223372036854775807L && km1Var2.k < 100))) {
                km1 km1Var3 = this.s;
                long j3 = this.L;
                pe2 pe2Var2 = this.x;
                hm1 hm1Var8 = km1Var3.j;
                if (hm1Var8 == null) {
                    g73 g73Var = pe2Var2.a;
                    pm1 pm1Var = pe2Var2.b;
                    long j4 = pe2Var2.c;
                    long j5 = pe2Var2.r;
                    g73Var.a(pm1Var.a, km1Var3.a);
                    if (pm1Var.a()) {
                        a = km1Var3.a(g73Var, pm1Var.a, pm1Var.b, pm1Var.c, j4, pm1Var.d);
                    } else {
                        a = km1Var3.a(g73Var, pm1Var.a, j5, j4, pm1Var.d);
                    }
                } else {
                    a = km1Var3.a(pe2Var2.a, hm1Var8, j3);
                }
                if (a != null) {
                    km1 km1Var4 = this.s;
                    fo[] foVarArr2 = this.d;
                    h83 h83Var = this.e;
                    ub0 ub0Var = this.g.a;
                    ym1 ym1Var = this.t;
                    i83 i83Var = this.f;
                    hm1 hm1Var9 = km1Var4.j;
                    hm1 hm1Var10 = new hm1(foVarArr2, hm1Var9 == null ? 1000000000000L : (hm1Var9.o + hm1Var9.f.e) - a.b, h83Var, ub0Var, ym1Var, a, i83Var);
                    hm1 hm1Var11 = km1Var4.j;
                    if (hm1Var11 != null) {
                        if (hm1Var10 != hm1Var11.l) {
                            hm1Var11.a();
                            hm1Var11.l = hm1Var10;
                        }
                    } else {
                        km1Var4.h = hm1Var10;
                        km1Var4.i = hm1Var10;
                    }
                    km1Var4.l = null;
                    km1Var4.j = hm1Var10;
                    km1Var4.k++;
                    km1Var4.c();
                    hm1Var10.a.a(this, a.b);
                    if (this.s.h == hm1Var10) {
                        b(a.b);
                    }
                    a(false);
                }
            }
            if (this.D) {
                hm1 hm1Var12 = this.s.j;
                if (hm1Var12 != null) {
                    if ((!hm1Var12.d ? 0L : hm1Var12.a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                        z6 = true;
                        this.D = z6;
                        n();
                    }
                }
                z6 = false;
                this.D = z6;
                n();
            } else {
                d();
            }
            hm1 hm1Var13 = this.s.i;
            if (hm1Var13 != null) {
                if (hm1Var13.l != null && !this.B) {
                    if (hm1Var13.d) {
                        int i5 = 0;
                        while (true) {
                            fo[] foVarArr3 = this.b;
                            if (i5 < foVarArr3.length) {
                                fo foVar = foVarArr3[i5];
                                ys2 ys2Var2 = hm1Var13.c[i5];
                                if (foVar.h != ys2Var2) {
                                    break;
                                }
                                if (ys2Var2 != null && !foVar.d()) {
                                    hm1 hm1Var14 = hm1Var13.l;
                                    if (!hm1Var13.f.f) {
                                        break;
                                    }
                                    if (!hm1Var14.d) {
                                        break;
                                    }
                                    if (!(foVar instanceof m63) && !(foVar instanceof kt1) && foVar.k < hm1Var14.f.b + hm1Var14.o) {
                                        break;
                                    }
                                }
                                i5++;
                            } else {
                                hm1 hm1Var15 = hm1Var13.l;
                                if (hm1Var15.d || this.L >= hm1Var15.f.b + hm1Var15.o) {
                                    i83 i83Var2 = hm1Var13.n;
                                    km1 km1Var5 = this.s;
                                    hm1 hm1Var16 = km1Var5.i;
                                    if (hm1Var16 != null && (hm1Var2 = hm1Var16.l) != null) {
                                        km1Var5.i = hm1Var2;
                                        km1Var5.c();
                                        hm1 hm1Var17 = km1Var5.i;
                                        i83 i83Var3 = hm1Var17.n;
                                        g73 g73Var2 = this.x.a;
                                        i2 = 1;
                                        a(g73Var2, hm1Var17.f.a, g73Var2, hm1Var13.f.a, -9223372036854775807L);
                                        if (hm1Var17.d && hm1Var17.a.readDiscontinuity() != -9223372036854775807L) {
                                            long j6 = hm1Var17.f.b + hm1Var17.o;
                                            for (fo foVar2 : this.b) {
                                                if (foVar2.h != null) {
                                                    a(foVar2, j6);
                                                }
                                            }
                                        } else {
                                            for (int i6 = 0; i6 < this.b.length; i6++) {
                                                boolean a3 = i83Var2.a(i6);
                                                boolean a4 = i83Var3.a(i6);
                                                if (a3 && !this.b[i6].l) {
                                                    boolean z7 = this.d[i6].b == -2;
                                                    on2 on2Var = i83Var2.b[i6];
                                                    on2 on2Var2 = i83Var3.b[i6];
                                                    if (!a4 || !on2Var2.equals(on2Var) || z7) {
                                                        a(this.b[i6], hm1Var17.f.b + hm1Var17.o);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i2 = 1;
                    if (hm1Var13.f.i || this.B) {
                        int i7 = 0;
                        while (true) {
                            fo[] foVarArr4 = this.b;
                            if (i7 >= foVarArr4.length) {
                                break;
                            }
                            fo foVar3 = foVarArr4[i7];
                            ys2 ys2Var3 = hm1Var13.c[i7];
                            if (ys2Var3 != null && foVar3.h == ys2Var3 && foVar3.d()) {
                                long j7 = hm1Var13.f.e;
                                a(foVar3, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + hm1Var13.o);
                            }
                            i7++;
                        }
                    }
                }
                km1 km1Var6 = this.s;
                hm1Var3 = km1Var6.i;
                if (hm1Var3 != null && km1Var6.h != hm1Var3 && !hm1Var3.g) {
                    i83 i83Var4 = hm1Var3.n;
                    i3 = 0;
                    boolean z8 = false;
                    while (true) {
                        foVarArr = this.b;
                        if (i3 >= foVarArr.length) {
                            fo foVar4 = foVarArr[i3];
                            if (b(foVar4)) {
                                int i8 = foVar4.h != hm1Var3.c[i3] ? i2 : i4;
                                if (!i83Var4.a(i3) || i8 != 0) {
                                    if (!foVar4.l) {
                                        xo0 xo0Var = i83Var4.c[i3];
                                        int g = xo0Var != null ? xo0Var.g() : i4;
                                        jw0[] jw0VarArr = new jw0[g];
                                        for (int i9 = i4; i9 < g; i9++) {
                                            jw0VarArr[i9] = xo0Var.a(i9);
                                        }
                                        ys2 ys2Var4 = hm1Var3.c[i3];
                                        long j8 = hm1Var3.f.b;
                                        long j9 = hm1Var3.o;
                                        long j10 = j8 + j9;
                                        if (!foVar4.l) {
                                            foVar4.h = ys2Var4;
                                            if (foVar4.k == Long.MIN_VALUE) {
                                                foVar4.k = j10;
                                            }
                                            foVar4.i = jw0VarArr;
                                            foVar4.j = j9;
                                            foVar4.a(jw0VarArr, j10, j9);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else if (foVar4.e()) {
                                        a(foVar4);
                                    } else {
                                        z8 = true;
                                    }
                                }
                            }
                            i3++;
                            i4 = 0;
                            i2 = 1;
                        } else if (!z8) {
                            a(new boolean[foVarArr.length]);
                        }
                    }
                }
                z4 = false;
                while (l() && !this.B && (hm1Var4 = this.s.h) != null && (hm1Var5 = hm1Var4.l) != null && this.L >= hm1Var5.f.b + hm1Var5.o && hm1Var5.g) {
                    if (z4) {
                        bo0 bo0Var = this.y;
                        pe2 pe2Var3 = this.x;
                        boolean z9 = bo0Var.a | (bo0Var.b != pe2Var3);
                        bo0Var.a = z9;
                        bo0Var.b = pe2Var3;
                        if (z9) {
                            this.r.a(bo0Var);
                            this.y = new bo0(this.x);
                        }
                    }
                    a2 = this.s.a();
                    a2.getClass();
                    if (this.x.b.a.equals(a2.f.a.a)) {
                        pm1 pm1Var2 = this.x.b;
                        if (pm1Var2.b == -1) {
                            pm1 pm1Var3 = a2.f.a;
                            if (pm1Var3.b == -1 && pm1Var2.e != pm1Var3.e) {
                                z5 = true;
                                jm1 jm1Var = a2.f;
                                pm1 pm1Var4 = jm1Var.a;
                                long j11 = jm1Var.b;
                                this.x = a(pm1Var4, j11, jm1Var.c, j11, !z5, 0);
                                k();
                                o();
                                z4 = true;
                            }
                        }
                    }
                    z5 = false;
                    jm1 jm1Var2 = a2.f;
                    pm1 pm1Var42 = jm1Var2.a;
                    long j112 = jm1Var2.b;
                    this.x = a(pm1Var42, j112, jm1Var2.c, j112, !z5, 0);
                    k();
                    o();
                    z4 = true;
                }
                j = -9223372036854775807L;
            }
            i2 = 1;
            km1 km1Var62 = this.s;
            hm1Var3 = km1Var62.i;
            if (hm1Var3 != null) {
                i83 i83Var42 = hm1Var3.n;
                i3 = 0;
                boolean z82 = false;
                while (true) {
                    foVarArr = this.b;
                    if (i3 >= foVarArr.length) {
                    }
                    i3++;
                    i4 = 0;
                    i2 = 1;
                }
            }
            z4 = false;
            while (l()) {
                if (z4) {
                }
                a2 = this.s.a();
                a2.getClass();
                if (this.x.b.a.equals(a2.f.a.a)) {
                }
                z5 = false;
                jm1 jm1Var22 = a2.f;
                pm1 pm1Var422 = jm1Var22.a;
                long j1122 = jm1Var22.b;
                this.x = a(pm1Var422, j1122, jm1Var22.c, j1122, !z5, 0);
                k();
                o();
                z4 = true;
            }
            j = -9223372036854775807L;
        }
        int i10 = this.x.e;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        hm1 hm1Var18 = this.s.h;
        if (hm1Var18 == null) {
            this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
            return;
        }
        t73.a("doSomeWork");
        o();
        if (hm1Var18.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            hm1Var18.a.a(this.x.r - this.n);
            boolean z10 = true;
            z = true;
            int i11 = 0;
            while (true) {
                fo[] foVarArr5 = this.b;
                if (i11 >= foVarArr5.length) {
                    break;
                }
                fo foVar5 = foVarArr5[i11];
                if (b(foVar5)) {
                    foVar5.a(this.L, elapsedRealtime);
                    z10 = z10 && foVar5.e();
                    boolean z11 = hm1Var18.c[i11] != foVar5.h;
                    boolean z12 = z11 || (!z11 && foVar5.d()) || foVar5.f() || foVar5.e();
                    z = z && z12;
                    if (!z12) {
                        ys2 ys2Var5 = foVar5.h;
                        ys2Var5.getClass();
                        ys2Var5.a();
                    }
                }
                i11++;
            }
            z2 = z10;
        } else {
            hm1Var18.a.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j12 = hm1Var18.f.e;
        boolean z13 = z2 && hm1Var18.d && (j12 == j || j12 <= this.x.r);
        if (z13 && this.B) {
            this.B = false;
            a(false, this.x.m, false, 5);
        }
        if (z13 && hm1Var18.f.i) {
            b(4);
            m();
        } else {
            pe2 pe2Var4 = this.x;
            if (pe2Var4.e == 2) {
                if (this.J == 0) {
                    hm1 hm1Var19 = this.s.h;
                    long j13 = hm1Var19.f.e;
                    if (hm1Var19.d) {
                        if (j13 != j) {
                            if (pe2Var4.r >= j13) {
                            }
                        }
                        b(3);
                        this.O = null;
                        if (l()) {
                            this.C = false;
                            fe0 fe0Var = this.o;
                            z3 = true;
                            fe0Var.g = true;
                            u33 u33Var = fe0Var.b;
                            if (!u33Var.c) {
                                u33Var.b.getClass();
                                u33Var.e = SystemClock.elapsedRealtime();
                                u33Var.c = true;
                            }
                            for (fo foVar6 : this.b) {
                                if (b(foVar6)) {
                                    if (foVar6.g == 1) {
                                        foVar6.g = 2;
                                        foVar6.i();
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                            if (this.x.e == 2) {
                                int i12 = 0;
                                while (true) {
                                    fo[] foVarArr6 = this.b;
                                    if (i12 >= foVarArr6.length) {
                                        break;
                                    }
                                    if (b(foVarArr6[i12]) && (ys2Var = this.b[i12].h) == hm1Var18.c[i12]) {
                                        ys2Var.getClass();
                                        ys2Var.a();
                                    }
                                    i12++;
                                }
                                pe2 pe2Var5 = this.x;
                                if (!pe2Var5.g && pe2Var5.q < 500000 && (hm1Var = this.s.j) != null) {
                                    if ((hm1Var.d ? hm1Var.a.getNextLoadPositionUs() : 0L) != Long.MIN_VALUE) {
                                        if (this.P == j) {
                                            this.q.getClass();
                                            this.P = SystemClock.elapsedRealtime();
                                        } else {
                                            this.q.getClass();
                                            if (SystemClock.elapsedRealtime() - this.P >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                        }
                                        boolean z14 = (l() || this.x.e != 3) ? false : z3;
                                        if (this.I || !this.H || !z14) {
                                            z3 = false;
                                        }
                                        pe2Var = this.x;
                                        if (pe2Var.o != z3) {
                                            this.x = new pe2(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, pe2Var.e, pe2Var.f, pe2Var.g, pe2Var.h, pe2Var.i, pe2Var.j, pe2Var.k, pe2Var.l, pe2Var.m, pe2Var.n, pe2Var.p, pe2Var.q, pe2Var.r, z3);
                                        }
                                        this.H = false;
                                        if (!z3 || (i = this.x.e) == 4) {
                                            return;
                                        }
                                        if (!z14 && i != 2) {
                                            if (i == 3 && this.J != 0) {
                                                this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + 1000);
                                            }
                                        } else {
                                            this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                                        }
                                        t73.a();
                                        return;
                                    }
                                }
                            }
                            this.P = j;
                            if (l()) {
                            }
                            if (this.I) {
                            }
                            z3 = false;
                            pe2Var = this.x;
                            if (pe2Var.o != z3) {
                            }
                            this.H = false;
                            if (z3) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (z) {
                    if (pe2Var4.g) {
                        long j14 = a(pe2Var4.a, this.s.h.f.a) ? this.u.h : j;
                        hm1 hm1Var20 = this.s.j;
                        boolean z15 = hm1Var20.d && (!hm1Var20.e || hm1Var20.a.getBufferedPositionUs() == Long.MIN_VALUE) && hm1Var20.f.i;
                        boolean z16 = hm1Var20.f.a.a() && !hm1Var20.d;
                        if (!z15 && !z16) {
                            de0 de0Var = this.g;
                            long a5 = a(this.x.p);
                            float f = this.o.getPlaybackParameters().b;
                            boolean z17 = this.C;
                            de0Var.getClass();
                            if (f != 1.0f) {
                                a5 = Math.round(a5 / f);
                            }
                            long j15 = z17 ? de0Var.e : de0Var.d;
                            if (j14 != j) {
                                j15 = Math.min(j14 / 2, j15);
                            }
                            if (j15 > 0 && a5 < j15) {
                                if (!de0Var.g) {
                                    ub0 ub0Var2 = de0Var.a;
                                    synchronized (ub0Var2) {
                                        int i13 = ub0Var2.b * 65536;
                                    }
                                }
                            }
                        }
                    }
                    b(3);
                    this.O = null;
                    if (l()) {
                    }
                }
            }
            z3 = true;
            pe2 pe2Var6 = this.x;
            if (pe2Var6.e == 3) {
                if (this.J == 0) {
                    hm1 hm1Var21 = this.s.h;
                    long j16 = hm1Var21.f.e;
                    if (hm1Var21.d) {
                        if (j16 != j) {
                            if (pe2Var6.r >= j16) {
                            }
                        }
                    }
                    this.C = l();
                    b(2);
                    if (this.C) {
                        for (hm1 hm1Var22 = this.s.h; hm1Var22 != null; hm1Var22 = hm1Var22.l) {
                            for (xo0 xo0Var2 : hm1Var22.n.c) {
                                if (xo0Var2 != null) {
                                    xo0Var2.j();
                                }
                            }
                        }
                        ce0 ce0Var = this.u;
                        long j17 = ce0Var.h;
                        if (j17 != j) {
                            long j18 = j17 + ce0Var.b;
                            ce0Var.h = j18;
                            long j19 = ce0Var.g;
                            if (j19 != j && j18 > j19) {
                                ce0Var.h = j19;
                            }
                            ce0Var.l = j;
                        }
                    }
                    m();
                }
            }
            if (this.x.e == 2) {
            }
            this.P = j;
            if (l()) {
            }
            if (this.I) {
            }
            z3 = false;
            pe2Var = this.x;
            if (pe2Var.o != z3) {
            }
            this.H = false;
            if (z3) {
            }
        }
        z3 = true;
        if (this.x.e == 2) {
        }
        this.P = j;
        if (l()) {
        }
        if (this.I) {
        }
        z3 = false;
        pe2Var = this.x;
        if (pe2Var.o != z3) {
        }
        this.H = false;
        if (z3) {
        }
    }

    public final long a(g73 g73Var, Object obj, long j) {
        long elapsedRealtime;
        g73Var.a(g73Var.a(obj, this.m).d, this.l, 0L);
        f73 f73Var = this.l;
        if (f73Var.g != -9223372036854775807L && f73Var.a()) {
            f73 f73Var2 = this.l;
            if (f73Var2.j) {
                long j2 = f73Var2.h;
                int i = sb3.a;
                if (j2 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j2 + SystemClock.elapsedRealtime();
                }
                return sb3.a(elapsedRealtime - this.l.g) - (j + this.m.f);
            }
        }
        return -9223372036854775807L;
    }

    public final boolean a(g73 g73Var, pm1 pm1Var) {
        if (pm1Var.a() || g73Var.c()) {
            return false;
        }
        g73Var.a(g73Var.a(pm1Var.a, this.m).d, this.l, 0L);
        if (!this.l.a()) {
            return false;
        }
        f73 f73Var = this.l;
        return f73Var.j && f73Var.g != -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, yads.gm1] */
    public final void a(eo0 eo0Var) {
        long j;
        long j2;
        pm1 pm1Var;
        boolean z;
        long j3;
        long j4;
        long j5;
        pe2 pe2Var;
        int i;
        this.y.a(1);
        Pair a = a(this.x.a, eo0Var, true, this.E, this.F, this.l, this.m);
        if (a == null) {
            Pair a2 = a(this.x.a);
            pm1Var = (pm1) a2.first;
            long longValue = ((Long) a2.second).longValue();
            z = !this.x.a.c();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = a.first;
            long longValue2 = ((Long) a.second).longValue();
            long j6 = eo0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            pm1 a3 = this.s.a(this.x.a, obj, longValue2);
            if (a3.a()) {
                this.x.a.a(a3.a, this.m);
                longValue2 = this.m.a(a3.b) == a3.c ? this.m.h.c : 0L;
            } else if (eo0Var.c != -9223372036854775807L) {
                j = longValue2;
                j2 = j6;
                pm1Var = a3;
                z = false;
            }
            j = longValue2;
            j2 = j6;
            pm1Var = a3;
            z = true;
        }
        try {
            if (this.x.a.c()) {
                this.K = eo0Var;
            } else if (a == null) {
                if (this.x.e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (pm1Var.equals(this.x.b)) {
                    hm1 hm1Var = this.s.h;
                    long a4 = (hm1Var == null || !hm1Var.d || j == 0) ? j : hm1Var.a.a(j, this.w);
                    if (sb3.b(a4) == sb3.b(this.x.r) && ((i = (pe2Var = this.x).e) == 2 || i == 3)) {
                        long j7 = pe2Var.r;
                        this.x = a(pm1Var, j7, j2, j7, z, 2);
                        return;
                    }
                    j4 = a4;
                } else {
                    j4 = j;
                }
                boolean z2 = this.x.e == 4;
                km1 km1Var = this.s;
                long a5 = a(pm1Var, j4, km1Var.h != km1Var.i, z2);
                boolean z3 = (j != a5) | z;
                try {
                    pe2 pe2Var2 = this.x;
                    g73 g73Var = pe2Var2.a;
                    a(g73Var, pm1Var, g73Var, pe2Var2.b, j2);
                    z = z3;
                    j5 = a5;
                    this.x = a(pm1Var, j5, j2, j5, z, 2);
                } catch (Throwable th) {
                    th = th;
                    z = z3;
                    j3 = a5;
                    this.x = a(pm1Var, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j5 = j;
            this.x = a(pm1Var, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, yads.gm1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, yads.gm1] */
    public final long a(pm1 pm1Var, long j, boolean z, boolean z2) {
        km1 km1Var;
        long j2;
        hm1 hm1Var;
        m();
        this.C = false;
        if (z2 || this.x.e == 3) {
            b(2);
        }
        hm1 hm1Var2 = this.s.h;
        hm1 hm1Var3 = hm1Var2;
        while (hm1Var3 != null && !pm1Var.equals(hm1Var3.f.a)) {
            hm1Var3 = hm1Var3.l;
        }
        if (z || hm1Var2 != hm1Var3 || (hm1Var3 != null && hm1Var3.o + j < 0)) {
            for (fo foVar : this.b) {
                a(foVar);
            }
            if (hm1Var3 != null) {
                while (true) {
                    km1Var = this.s;
                    if (km1Var.h == hm1Var3) {
                        break;
                    }
                    km1Var.a();
                }
                km1Var.a(hm1Var3);
                hm1Var3.o = 1000000000000L;
                a(new boolean[this.b.length]);
            }
        }
        if (hm1Var3 != null) {
            this.s.a(hm1Var3);
            if (!hm1Var3.d) {
                jm1 jm1Var = hm1Var3.f;
                if (j == jm1Var.b) {
                    hm1Var = hm1Var3;
                } else {
                    hm1Var = hm1Var3;
                    jm1Var = new jm1(jm1Var.a, j, jm1Var.c, jm1Var.d, jm1Var.e, jm1Var.f, jm1Var.g, jm1Var.h, jm1Var.i);
                }
                hm1Var.f = jm1Var;
            } else {
                hm1 hm1Var4 = hm1Var3;
                if (hm1Var4.e) {
                    j2 = hm1Var4.a.seekToUs(j);
                    hm1Var4.a.a(j2 - this.n);
                    b(j2);
                    d();
                }
            }
            j2 = j;
            b(j2);
            d();
        } else {
            this.s.b();
            b(j);
            j2 = j;
        }
        a(false);
        this.i.a.sendEmptyMessage(2);
        return j2;
    }

    public final void a(re2 re2Var) {
        this.o.a(re2Var);
        re2 playbackParameters = this.o.getPlaybackParameters();
        a(playbackParameters, playbackParameters.b, true, true);
    }

    public final void a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.G != z) {
            this.G = z;
            if (!z) {
                for (fo foVar : this.b) {
                    if (!b(foVar) && this.c.remove(foVar)) {
                        if (foVar.g == 0) {
                            kw0 kw0Var = foVar.c;
                            kw0Var.a = null;
                            kw0Var.b = null;
                            foVar.h();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        a(z || !this.G, false, true, false);
        this.y.a(z2 ? 1 : 0);
        this.g.a(true);
        b(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (r5.equals(r29.x.b) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        List list;
        boolean z5 = true;
        this.i.a.removeMessages(2);
        this.O = null;
        this.C = false;
        fe0 fe0Var = this.o;
        fe0Var.g = false;
        u33 u33Var = fe0Var.b;
        if (u33Var.c) {
            u33Var.a(u33Var.a());
            u33Var.c = false;
        }
        this.L = 1000000000000L;
        for (fo foVar : this.b) {
            try {
                a(foVar);
            } catch (RuntimeException | nn0 e) {
                gh1.b("ExoPlayerImplInternal", gh1.a("Disable failed.", e));
            }
        }
        if (z) {
            for (fo foVar2 : this.b) {
                if (this.c.remove(foVar2)) {
                    try {
                        if (foVar2.g == 0) {
                            kw0 kw0Var = foVar2.c;
                            kw0Var.a = null;
                            kw0Var.b = null;
                            foVar2.h();
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (RuntimeException e2) {
                        gh1.b("ExoPlayerImplInternal", gh1.a("Reset failed.", e2));
                    }
                }
            }
        }
        this.J = 0;
        pe2 pe2Var = this.x;
        pm1 pm1Var = pe2Var.b;
        long j2 = pe2Var.r;
        if (!this.x.b.a()) {
            pe2 pe2Var2 = this.x;
            d73 d73Var = this.m;
            pm1 pm1Var2 = pe2Var2.b;
            g73 g73Var = pe2Var2.a;
            if (!g73Var.c() && !g73Var.a(pm1Var2.a, d73Var).g) {
                j = this.x.r;
                if (z2) {
                    this.K = null;
                    Pair a = a(this.x.a);
                    pm1Var = (pm1) a.first;
                    j2 = ((Long) a.second).longValue();
                    j = -9223372036854775807L;
                }
                z5 = false;
                pm1 pm1Var3 = pm1Var;
                long j3 = j2;
                this.s.b();
                this.D = false;
                pe2 pe2Var3 = this.x;
                g73 g73Var2 = pe2Var3.a;
                int i = pe2Var3.e;
                nn0 nn0Var = z4 ? null : pe2Var3.f;
                y73 y73Var = !z5 ? y73.e : pe2Var3.h;
                i83 i83Var = !z5 ? this.f : pe2Var3.i;
                if (!z5) {
                    i41 i41Var = l41.c;
                    list = um2.f;
                } else {
                    list = pe2Var3.j;
                }
                this.x = new pe2(g73Var2, pm1Var3, j, j3, i, nn0Var, false, y73Var, i83Var, list, pm1Var3, pe2Var3.l, pe2Var3.m, pe2Var3.n, j3, 0L, j3, false);
                if (z3) {
                    return;
                }
                ym1 ym1Var = this.t;
                for (wm1 wm1Var : ym1Var.h.values()) {
                    try {
                        wm1Var.a.c(wm1Var.b);
                    } catch (RuntimeException e3) {
                        gh1.b("MediaSourceList", gh1.a("Failed to release child source.", e3));
                    }
                    wm1Var.a.a((tm1) wm1Var.c);
                    wm1Var.a.a((zk0) wm1Var.c);
                }
                ym1Var.h.clear();
                ym1Var.i.clear();
                ym1Var.k = false;
                return;
            }
        }
        j = this.x.c;
        if (z2) {
        }
        z5 = false;
        pm1 pm1Var32 = pm1Var;
        long j32 = j2;
        this.s.b();
        this.D = false;
        pe2 pe2Var32 = this.x;
        g73 g73Var22 = pe2Var32.a;
        int i2 = pe2Var32.e;
        nn0 nn0Var2 = z4 ? null : pe2Var32.f;
        y73 y73Var2 = !z5 ? y73.e : pe2Var32.h;
        i83 i83Var2 = !z5 ? this.f : pe2Var32.i;
        if (!z5) {
        }
        this.x = new pe2(g73Var22, pm1Var32, j, j32, i2, nn0Var2, false, y73Var2, i83Var2, list, pm1Var32, pe2Var32.l, pe2Var32.m, pe2Var32.n, j32, 0L, j32, false);
        if (z3) {
        }
    }

    public final Pair a(g73 g73Var) {
        long j = 0;
        if (g73Var.c()) {
            return Pair.create(pe2.s, 0L);
        }
        Pair a = g73Var.a(this.l, this.m, g73Var.a(this.F), -9223372036854775807L);
        pm1 a2 = this.s.a(g73Var, a.first, 0L);
        long longValue = ((Long) a.second).longValue();
        if (a2.a()) {
            g73Var.a(a2.a, this.m);
            if (a2.c == this.m.a(a2.b)) {
                j = this.m.h.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(a2, Long.valueOf(j));
    }

    public static void a(if2 if2Var) {
        synchronized (if2Var) {
        }
        try {
            if2Var.a.a(if2Var.d, if2Var.e);
        } finally {
            if2Var.a(true);
        }
    }

    public final void a(g73 g73Var, g73 g73Var2) {
        if (g73Var.c() && g73Var2.c()) {
            return;
        }
        int size = this.p.size() - 1;
        if (size < 0) {
            Collections.sort(this.p);
        } else {
            yn0.a(this.p.get(size));
            throw null;
        }
    }

    public final void a(fo foVar) {
        if (b(foVar)) {
            fe0 fe0Var = this.o;
            if (foVar == fe0Var.d) {
                fe0Var.e = null;
                fe0Var.d = null;
                fe0Var.f = true;
            }
            int i = foVar.g;
            if (i == 2) {
                if (i == 2) {
                    foVar.g = 1;
                    foVar.j();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (foVar.g == 1) {
                kw0 kw0Var = foVar.c;
                kw0Var.a = null;
                kw0Var.b = null;
                foVar.g = 0;
                foVar.h = null;
                foVar.i = null;
                foVar.l = false;
                foVar.g();
                this.J--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v55 ??, still in use, count: 1, list:
          (r0v55 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v55 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v55 ??, still in use, count: 1, list:
          (r0v55 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v55 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void a(g73 g73Var, pm1 pm1Var, g73 g73Var2, pm1 pm1Var2, long j) {
        if (!a(g73Var, pm1Var)) {
            re2 re2Var = pm1Var.a() ? re2.e : this.x.n;
            if (this.o.getPlaybackParameters().equals(re2Var)) {
                return;
            }
            this.o.a(re2Var);
            return;
        }
        g73Var.a(g73Var.a(pm1Var.a, this.m).d, this.l, 0L);
        ce0 ce0Var = this.u;
        ql1 ql1Var = this.l.l;
        int i = sb3.a;
        ce0Var.getClass();
        ce0Var.c = sb3.a(ql1Var.b);
        ce0Var.f = sb3.a(ql1Var.c);
        ce0Var.g = sb3.a(ql1Var.d);
        float f = ql1Var.e;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ce0Var.j = f;
        float f2 = ql1Var.f;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ce0Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ce0Var.c = -9223372036854775807L;
        }
        ce0Var.a();
        if (j != -9223372036854775807L) {
            ce0 ce0Var2 = this.u;
            ce0Var2.d = a(g73Var, pm1Var.a, j);
            ce0Var2.a();
        } else {
            if (sb3.a(!g73Var2.c() ? g73Var2.a(g73Var2.a(pm1Var2.a, this.m).d, this.l, 0L).b : null, this.l.b)) {
                return;
            }
            ce0 ce0Var3 = this.u;
            ce0Var3.d = -9223372036854775807L;
            ce0Var3.a();
        }
    }

    public final void a(re2 re2Var, float f, boolean z, boolean z2) {
        int i;
        fo0 fo0Var = this;
        if (z) {
            if (z2) {
                fo0Var.y.a(1);
            }
            pe2 pe2Var = fo0Var.x;
            fo0Var = this;
            fo0Var.x = new pe2(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, pe2Var.e, pe2Var.f, pe2Var.g, pe2Var.h, pe2Var.i, pe2Var.j, pe2Var.k, pe2Var.l, pe2Var.m, re2Var, pe2Var.p, pe2Var.q, pe2Var.r, pe2Var.o);
        }
        float f2 = re2Var.b;
        hm1 hm1Var = fo0Var.s.h;
        while (true) {
            i = 0;
            if (hm1Var == null) {
                break;
            }
            xo0[] xo0VarArr = hm1Var.n.c;
            int length = xo0VarArr.length;
            while (i < length) {
                xo0 xo0Var = xo0VarArr[i];
                if (xo0Var != null) {
                    xo0Var.a(f2);
                }
                i++;
            }
            hm1Var = hm1Var.l;
        }
        fo[] foVarArr = fo0Var.b;
        int length2 = foVarArr.length;
        while (i < length2) {
            fo foVar = foVarArr[i];
            if (foVar != null) {
                foVar.a(f, re2Var.b);
            }
            i++;
        }
    }

    public final pe2 a(pm1 pm1Var, long j, long j2, long j3, boolean z, int i) {
        y73 y73Var;
        i83 i83Var;
        List list;
        y73 y73Var2;
        i83 i83Var2;
        um2 um2Var;
        i83 i83Var3;
        hm1 hm1Var;
        this.N = (!this.N && j == this.x.r && pm1Var.equals(this.x.b)) ? false : true;
        k();
        pe2 pe2Var = this.x;
        y73 y73Var3 = pe2Var.h;
        i83 i83Var4 = pe2Var.i;
        List list2 = pe2Var.j;
        if (this.t.k) {
            hm1 hm1Var2 = this.s.h;
            if (hm1Var2 == null) {
                y73Var2 = y73.e;
            } else {
                y73Var2 = hm1Var2.m;
            }
            y73 y73Var4 = y73Var2;
            if (hm1Var2 == null) {
                i83Var2 = this.f;
            } else {
                i83Var2 = hm1Var2.n;
            }
            i83 i83Var5 = i83Var2;
            xo0[] xo0VarArr = i83Var5.c;
            h41 h41Var = new h41();
            boolean z2 = false;
            for (xo0 xo0Var : xo0VarArr) {
                if (xo0Var != null) {
                    ht1 ht1Var = xo0Var.a(0).k;
                    if (ht1Var == null) {
                        h41Var.a(new ht1(new gt1[0]));
                    } else {
                        h41Var.a(ht1Var);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                um2Var = h41Var.a();
            } else {
                i41 i41Var = l41.c;
                um2Var = um2.f;
            }
            um2 um2Var2 = um2Var;
            if (hm1Var2 != null) {
                jm1 jm1Var = hm1Var2.f;
                long j4 = jm1Var.c;
                if (j4 != j2) {
                    if (j2 == j4) {
                        i83Var3 = i83Var5;
                        hm1Var = hm1Var2;
                    } else {
                        i83Var3 = i83Var5;
                        hm1Var = hm1Var2;
                        jm1Var = new jm1(jm1Var.a, jm1Var.b, j2, jm1Var.d, jm1Var.e, jm1Var.f, jm1Var.g, jm1Var.h, jm1Var.i);
                    }
                    hm1Var.f = jm1Var;
                    y73Var = y73Var4;
                    list = um2Var2;
                    i83Var = i83Var3;
                }
            }
            i83Var3 = i83Var5;
            y73Var = y73Var4;
            list = um2Var2;
            i83Var = i83Var3;
        } else if (pm1Var.equals(pe2Var.b)) {
            y73Var = y73Var3;
            i83Var = i83Var4;
            list = list2;
        } else {
            y73Var = y73.e;
            i83Var = this.f;
            list = um2.f;
        }
        if (z) {
            bo0 bo0Var = this.y;
            if (!bo0Var.d || bo0Var.e == 5) {
                bo0Var.a = true;
                bo0Var.d = true;
                bo0Var.e = i;
            } else if (i != 5) {
                throw new IllegalArgumentException();
            }
        }
        pe2 pe2Var2 = this.x;
        return pe2Var2.a(pm1Var, j, j2, j3, a(pe2Var2.p), y73Var, i83Var, list);
    }

    public final void a(boolean[] zArr) {
        hm1 hm1Var;
        i83 i83Var;
        int i;
        tj1 tj1Var;
        hm1 hm1Var2 = this.s.i;
        i83 i83Var2 = hm1Var2.n;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            if (!i83Var2.a(i2) && this.c.remove(this.b[i2])) {
                fo foVar = this.b[i2];
                if (foVar.g == 0) {
                    kw0 kw0Var = foVar.c;
                    kw0Var.a = null;
                    kw0Var.b = null;
                    foVar.h();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        int i3 = 0;
        while (i3 < this.b.length) {
            if (i83Var2.a(i3)) {
                boolean z = zArr[i3];
                fo foVar2 = this.b[i3];
                if (!b(foVar2)) {
                    km1 km1Var = this.s;
                    hm1 hm1Var3 = km1Var.i;
                    boolean z2 = hm1Var3 == km1Var.h;
                    i83 i83Var3 = hm1Var3.n;
                    on2 on2Var = i83Var3.b[i3];
                    xo0 xo0Var = i83Var3.c[i3];
                    int g = xo0Var != null ? xo0Var.g() : 0;
                    jw0[] jw0VarArr = new jw0[g];
                    for (int i4 = 0; i4 < g; i4++) {
                        jw0VarArr[i4] = xo0Var.a(i4);
                    }
                    boolean z3 = l() && this.x.e == 3;
                    boolean z4 = !z && z3;
                    this.J++;
                    this.c.add(foVar2);
                    ys2 ys2Var = hm1Var3.c[i3];
                    i = i3;
                    long j = this.L;
                    long j2 = hm1Var3.f.b;
                    hm1Var = hm1Var2;
                    i83Var = i83Var2;
                    long j3 = hm1Var3.o;
                    long j4 = j2 + j3;
                    if (foVar2.g == 0) {
                        foVar2.d = on2Var;
                        foVar2.g = 1;
                        foVar2.a(z2);
                        if (!foVar2.l) {
                            foVar2.h = ys2Var;
                            if (foVar2.k == Long.MIN_VALUE) {
                                foVar2.k = j4;
                            }
                            foVar2.i = jw0VarArr;
                            foVar2.j = j3;
                            foVar2.a(jw0VarArr, j4, j3);
                            foVar2.l = false;
                            foVar2.k = j;
                            foVar2.a(j, z4);
                            foVar2.a(11, new zn0(this));
                            fe0 fe0Var = this.o;
                            fe0Var.getClass();
                            tj1 b = foVar2.b();
                            if (b != null && b != (tj1Var = fe0Var.e)) {
                                if (tj1Var == null) {
                                    fe0Var.e = b;
                                    fe0Var.d = foVar2;
                                    ((zj1) b).a(fe0Var.b.f);
                                } else {
                                    throw new nn0(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                                }
                            }
                            if (!z3) {
                                continue;
                            } else if (foVar2.g == 1) {
                                foVar2.g = 2;
                                foVar2.i();
                            } else {
                                throw new IllegalStateException();
                            }
                            i3 = i + 1;
                            hm1Var2 = hm1Var;
                            i83Var2 = i83Var;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            hm1Var = hm1Var2;
            i83Var = i83Var2;
            i = i3;
            i3 = i + 1;
            hm1Var2 = hm1Var;
            i83Var2 = i83Var;
        }
        hm1Var2.g = true;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, yads.iy2] */
    public final void a(boolean z) {
        long j;
        hm1 hm1Var = this.s.j;
        pm1 pm1Var = hm1Var == null ? this.x.b : hm1Var.f.a;
        boolean equals = this.x.k.equals(pm1Var);
        if (!equals) {
            this.x = this.x.a(pm1Var);
        }
        pe2 pe2Var = this.x;
        if (hm1Var == null) {
            j = pe2Var.r;
        } else if (!hm1Var.d) {
            j = hm1Var.f.b;
        } else {
            long bufferedPositionUs = hm1Var.e ? hm1Var.a.getBufferedPositionUs() : Long.MIN_VALUE;
            j = bufferedPositionUs == Long.MIN_VALUE ? hm1Var.f.e : bufferedPositionUs;
        }
        pe2Var.p = j;
        pe2 pe2Var2 = this.x;
        pe2Var2.q = a(pe2Var2.p);
        if ((!equals || z) && hm1Var != null && hm1Var.d) {
            a(hm1Var.n);
        }
    }

    public final long a(long j) {
        hm1 hm1Var = this.s.j;
        if (hm1Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.L - hm1Var.o));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(i83 i83Var) {
        de0 de0Var = this.g;
        fo[] foVarArr = this.b;
        xo0[] xo0VarArr = i83Var.c;
        int i = de0Var.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < foVarArr.length) {
                    if (xo0VarArr[i2] != null) {
                        switch (foVarArr[i2].b) {
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        de0Var.i = i;
        de0Var.a.a(i);
    }

    public static Pair a(g73 g73Var, eo0 eo0Var, boolean z, int i, boolean z2, f73 f73Var, d73 d73Var) {
        Pair a;
        Object a2;
        g73 g73Var2 = eo0Var.a;
        if (g73Var.c()) {
            return null;
        }
        g73 g73Var3 = g73Var2.c() ? g73Var : g73Var2;
        try {
            a = g73Var3.a(f73Var, d73Var, eo0Var.b, eo0Var.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g73Var.equals(g73Var3)) {
            return a;
        }
        if (g73Var.a(a.first) != -1) {
            return (g73Var3.a(a.first, d73Var).g && g73Var3.a(d73Var.d, f73Var, 0L).p == g73Var3.a(a.first)) ? g73Var.a(f73Var, d73Var, g73Var.a(a.first, d73Var).d, eo0Var.c) : a;
        }
        if (z && (a2 = a(f73Var, d73Var, i, z2, a.first, g73Var3, g73Var)) != null) {
            return g73Var.a(f73Var, d73Var, g73Var.a(a2, d73Var).d, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(f73 f73Var, d73 d73Var, int i, boolean z, Object obj, g73 g73Var, g73 g73Var2) {
        int a = g73Var.a(obj);
        int a2 = g73Var.a();
        int i2 = a;
        int i3 = -1;
        for (int i4 = 0; i4 < a2 && i3 == -1; i4++) {
            i2 = g73Var.a(i2, d73Var, f73Var, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = g73Var2.a(g73Var.a(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return g73Var2.a(i3);
    }
}
