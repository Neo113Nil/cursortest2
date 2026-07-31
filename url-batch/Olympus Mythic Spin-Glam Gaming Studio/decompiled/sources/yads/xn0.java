package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class xn0 extends eo implements ye2 {
    public final long A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public final nx2 F;
    public hz2 G;
    public ve2 H;
    public am1 I;
    public AudioTrack J;
    public Surface K;
    public Surface L;
    public SurfaceHolder M;
    public boolean O;
    public TextureView P;
    public final int Q;
    public int R;
    public int S;
    public final int T;
    public final nj U;
    public float V;
    public boolean W;
    public final boolean X;
    public boolean Y;
    public qg0 Z;
    public am1 a0;
    public final i83 b;
    public pe2 b0;
    public final ve2 c;
    public int c0;
    public final ry d = new ry();
    public long d0;
    public final Context e;
    public final xn0 f;
    public final fo[] g;
    public final h83 h;
    public final s53 i;
    public final fo0 j;
    public final rf1 k;
    public final CopyOnWriteArraySet l;
    public final d73 m;
    public final ArrayList n;
    public final boolean o;
    public final kd p;
    public final Looper q;
    public final dl r;
    public final p53 s;
    public final un0 t;
    public final vn0 u;
    public final qj v;
    public final wj w;
    public final n43 x;
    public final fn3 y;
    public final vo3 z;

    static {
        go0.a("goog.exo.exoplayer");
    }

    public xn0(pn0 pn0Var) {
        int i;
        boolean equals;
        try {
            gh1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + sb3.e + X3.j.e);
            this.e = pn0Var.a.getApplicationContext();
            this.p = (kd) pn0Var.h.apply(pn0Var.b);
            this.U = pn0Var.j;
            this.Q = pn0Var.k;
            this.W = false;
            this.A = pn0Var.p;
            un0 un0Var = new un0(this);
            this.t = un0Var;
            this.u = new vn0();
            Handler handler = new Handler(pn0Var.i);
            fo[] a = ((ve0) pn0Var.c.get()).a(handler, un0Var, un0Var, un0Var, un0Var);
            this.g = a;
            if (a.length <= 0) {
                throw new IllegalStateException();
            }
            this.h = (h83) pn0Var.e.get();
            this.r = (dl) pn0Var.g.get();
            this.o = pn0Var.l;
            this.F = pn0Var.m;
            Looper looper = pn0Var.i;
            this.q = looper;
            p53 p53Var = pn0Var.b;
            this.s = p53Var;
            this.f = this;
            this.k = new rf1(new CopyOnWriteArraySet(), looper, p53Var, new pf1() { // from class: yads.xn0$$ExternalSyntheticLambda3
                @Override // yads.pf1
                public final void a(Object obj, zu0 zu0Var) {
                    xn0.this.a((we2) obj, zu0Var);
                }
            });
            this.l = new CopyOnWriteArraySet();
            this.n = new ArrayList();
            this.G = new hz2(new Random());
            this.b = new i83(new on2[a.length], new xo0[a.length], e93.c, null);
            this.m = new d73();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i2 = 0; i2 < 21; i2++) {
                sparseBooleanArray.append(iArr[i2], true);
            }
            this.h.getClass();
            sparseBooleanArray.append(29, true);
            zu0 zu0Var = new zu0(sparseBooleanArray);
            this.c = new ve2(zu0Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < zu0Var.a.size(); i3++) {
                sparseBooleanArray2.append(zu0Var.a(i3), true);
            }
            sparseBooleanArray2.append(4, true);
            sparseBooleanArray2.append(10, true);
            this.H = new ve2(new zu0(sparseBooleanArray2));
            p53 p53Var2 = this.s;
            Looper looper2 = this.q;
            p53Var2.getClass();
            this.i = new s53(new Handler(looper2, null));
            co0 co0Var = new co0() { // from class: yads.xn0$$ExternalSyntheticLambda4
                @Override // yads.co0
                public final void a(bo0 bo0Var) {
                    xn0.this.b(bo0Var);
                }
            };
            i83 i83Var = this.b;
            c73 c73Var = g73.b;
            pm1 pm1Var = pe2.s;
            this.b0 = new pe2(c73Var, pm1Var, -9223372036854775807L, 0L, 1, null, false, y73.e, i83Var, um2.f, pm1Var, false, 0, re2.e, 0L, 0L, 0L, false);
            ((wb0) this.p).a(this.f, this.q);
            int i4 = sb3.a;
            this.j = new fo0(this.g, this.h, this.b, (de0) pn0Var.f.get(), this.r, this.p, this.F, pn0Var.n, pn0Var.o, this.q, this.s, co0Var, i4 < 31 ? new ff2() : tn0.a(this.e, this, pn0Var.q));
            this.V = 1.0f;
            am1 am1Var = am1.H;
            this.I = am1Var;
            this.a0 = am1Var;
            this.c0 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.J;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.J.release();
                    this.J = null;
                }
                if (this.J == null) {
                    this.J = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.T = this.J.getAudioSessionId();
            } else {
                this.T = sb3.a(this.e);
            }
            int i5 = u20.$r8$clinit;
            this.X = true;
            kd kdVar = this.p;
            kdVar.getClass();
            rf1 rf1Var = this.k;
            if (!rf1Var.g) {
                rf1Var.d.add(new qf1(kdVar));
            }
            dl dlVar = this.r;
            Handler handler2 = new Handler(this.q);
            kd kdVar2 = this.p;
            tc0 tc0Var = (tc0) dlVar;
            tc0Var.getClass();
            kdVar2.getClass();
            bl blVar = tc0Var.b;
            blVar.getClass();
            Iterator it = blVar.a.iterator();
            while (it.hasNext()) {
                al alVar = (al) it.next();
                if (alVar.b == kdVar2) {
                    alVar.c = true;
                    blVar.a.remove(alVar);
                }
            }
            blVar.a.add(new al(handler2, kdVar2));
            this.l.add(this.t);
            qj qjVar = new qj(pn0Var.a, handler, this.t);
            this.v = qjVar;
            if (qjVar.c) {
                qjVar.a.unregisterReceiver(qjVar.b);
                qjVar.c = false;
            }
            wj wjVar = new wj(pn0Var.a, handler, this.t);
            this.w = wjVar;
            if (!sb3.a((Object) null, (Object) null)) {
                wjVar.e = 0;
            }
            n43 n43Var = new n43(pn0Var.a, handler, this.t);
            this.x = n43Var;
            int i6 = this.U.d;
            if (i6 != 13) {
                switch (i6) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    default:
                        i = 3;
                        break;
                }
            } else {
                i = 1;
            }
            if (n43Var.g != i) {
                n43Var.g = i;
                n43Var.c();
                ((un0) n43Var.c).a();
            }
            this.y = new fn3(pn0Var.a);
            this.z = new vo3(pn0Var.a);
            this.Z = new qg0(0, n43Var.a(), n43Var.d.getStreamMaxVolume(n43Var.g));
            int i7 = mj3.$r8$clinit;
            h83 h83Var = this.h;
            nj njVar = this.U;
            pf0 pf0Var = (pf0) h83Var;
            synchronized (pf0Var.c) {
                equals = pf0Var.h.equals(njVar);
                pf0Var.h = njVar;
            }
            if (!equals) {
                pf0Var.b();
            }
            a(1, 10, Integer.valueOf(this.T));
            a(2, 10, Integer.valueOf(this.T));
            a(1, 3, this.U);
            a(2, 4, Integer.valueOf(this.Q));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.W));
            a(2, 7, this.u);
            a(6, 8, this.u);
            this.d.d();
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    public final /* synthetic */ void a(we2 we2Var, zu0 zu0Var) {
        we2Var.getClass();
    }

    public final void b(final bo0 bo0Var) {
        s53 s53Var = this.i;
        s53Var.a.post(new Runnable() { // from class: yads.xn0$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                xn0.this.a(bo0Var);
            }
        });
    }

    public final void c(we2 we2Var) {
        we2Var.getClass();
        rf1 rf1Var = this.k;
        Iterator it = rf1Var.d.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            if (qf1Var.a.equals(we2Var)) {
                pf1 pf1Var = rf1Var.c;
                qf1Var.d = true;
                if (qf1Var.c) {
                    pf1Var.a(qf1Var.a, qf1Var.b.a());
                }
                rf1Var.d.remove(qf1Var);
            }
        }
    }

    public final long d() {
        q();
        q();
        if (!this.b0.b.a()) {
            q();
            return sb3.b(a(this.b0));
        }
        pe2 pe2Var = this.b0;
        pe2Var.a.a(pe2Var.b.a, this.m);
        pe2 pe2Var2 = this.b0;
        return pe2Var2.c == -9223372036854775807L ? sb3.b(pe2Var2.a.a(g(), this.a, 0L).n) : sb3.b(this.m.f) + sb3.b(this.b0.c);
    }

    public final int e() {
        q();
        q();
        if (this.b0.b.a()) {
            return this.b0.b.b;
        }
        return -1;
    }

    public final int f() {
        q();
        q();
        if (this.b0.b.a()) {
            return this.b0.b.c;
        }
        return -1;
    }

    public final int g() {
        q();
        int h = h();
        if (h == -1) {
            return 0;
        }
        return h;
    }

    public final int h() {
        if (this.b0.a.c()) {
            return this.c0;
        }
        pe2 pe2Var = this.b0;
        return pe2Var.a.a(pe2Var.b.a, this.m).d;
    }

    public final long i() {
        q();
        q();
        if (this.b0.b.a()) {
            pe2 pe2Var = this.b0;
            pm1 pm1Var = pe2Var.b;
            pe2Var.a.a(pm1Var.a, this.m);
            return sb3.b(this.m.a(pm1Var.b, pm1Var.c));
        }
        q();
        g73 g73Var = this.b0.a;
        if (g73Var.c()) {
            return -9223372036854775807L;
        }
        return sb3.b(g73Var.a(g(), this.a, 0L).o);
    }

    public final boolean j() {
        q();
        return this.b0.b.a();
    }

    public final void k() {
        q();
        q();
        boolean z = this.b0.l;
        int a = this.w.a(z, 2);
        a(a, (!z || a == 1) ? 1 : 2, z);
        pe2 pe2Var = this.b0;
        if (pe2Var.e != 1) {
            return;
        }
        pe2 a2 = pe2Var.a((nn0) null);
        pe2 a3 = a2.a(a2.a.c() ? 4 : 2);
        this.B++;
        s53 s53Var = this.j.i;
        s53Var.getClass();
        r53 a4 = s53.a();
        a4.a = s53Var.a.obtainMessage(0);
        a4.b();
        a(a3, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void l() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.18.1] [");
        sb.append(sb3.e);
        sb.append("] [");
        synchronized (go0.class) {
            str = go0.b;
        }
        sb.append(str);
        sb.append(X3.j.e);
        gh1.c("ExoPlayerImpl", sb.toString());
        q();
        if (sb3.a < 21 && (audioTrack = this.J) != null) {
            audioTrack.release();
            this.J = null;
        }
        qj qjVar = this.v;
        if (qjVar.c) {
            qjVar.a.unregisterReceiver(qjVar.b);
            qjVar.c = false;
        }
        this.x.b();
        this.y.getClass();
        this.z.getClass();
        wj wjVar = this.w;
        wjVar.c = null;
        wjVar.a();
        if (!this.j.h()) {
            rf1 rf1Var = this.k;
            rf1Var.a(10, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda2
                @Override // yads.of1
                public final void invoke(Object obj) {
                    xn0.a((we2) obj);
                }
            });
            rf1Var.a();
        }
        rf1 rf1Var2 = this.k;
        Iterator it = rf1Var2.d.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            pf1 pf1Var = rf1Var2.c;
            qf1Var.d = true;
            if (qf1Var.c) {
                pf1Var.a(qf1Var.a, qf1Var.b.a());
            }
        }
        rf1Var2.d.clear();
        rf1Var2.g = true;
        this.i.a.removeCallbacksAndMessages(null);
        dl dlVar = this.r;
        kd kdVar = this.p;
        bl blVar = ((tc0) dlVar).b;
        Iterator it2 = blVar.a.iterator();
        while (it2.hasNext()) {
            al alVar = (al) it2.next();
            if (alVar.b == kdVar) {
                alVar.c = true;
                blVar.a.remove(alVar);
            }
        }
        pe2 a = this.b0.a(1);
        this.b0 = a;
        pe2 a2 = a.a(a.b);
        this.b0 = a2;
        a2.p = a2.r;
        this.b0.q = 0L;
        ((wb0) this.p).c();
        this.h.a();
        m();
        Surface surface = this.L;
        if (surface != null) {
            surface.release();
            this.L = null;
        }
        int i = u20.$r8$clinit;
    }

    public final void n() {
        q();
        q();
        wj wjVar = this.w;
        q();
        wjVar.a(this.b0.l, 1);
        a((nn0) null);
        int i = u20.$r8$clinit;
    }

    public final void o() {
        int a;
        int a2;
        ve2 ve2Var = this.H;
        xn0 xn0Var = this.f;
        ve2 ve2Var2 = this.c;
        int i = sb3.a;
        xn0Var.q();
        boolean a3 = xn0Var.b0.b.a();
        xn0Var.q();
        g73 g73Var = xn0Var.b0.a;
        boolean z = !g73Var.c() && g73Var.a(xn0Var.g(), xn0Var.a, 0L).i;
        xn0Var.q();
        g73 g73Var2 = xn0Var.b0.a;
        if (g73Var2.c()) {
            a = -1;
        } else {
            int g = xn0Var.g();
            xn0Var.q();
            xn0Var.q();
            a = g73Var2.a(g, 0);
        }
        boolean z2 = a != -1;
        xn0Var.q();
        g73 g73Var3 = xn0Var.b0.a;
        if (g73Var3.c()) {
            a2 = -1;
        } else {
            int g2 = xn0Var.g();
            xn0Var.q();
            xn0Var.q();
            a2 = g73Var3.a(g2, 0, false);
        }
        boolean z3 = a2 != -1;
        xn0Var.q();
        g73 g73Var4 = xn0Var.b0.a;
        boolean z4 = !g73Var4.c() && g73Var4.a(xn0Var.g(), xn0Var.a, 0L).a();
        xn0Var.q();
        g73 g73Var5 = xn0Var.b0.a;
        boolean z5 = !g73Var5.c() && g73Var5.a(xn0Var.g(), xn0Var.a, 0L).j;
        xn0Var.q();
        boolean c = xn0Var.b0.a.c();
        ue2 ue2Var = new ue2();
        yu0 yu0Var = ue2Var.a;
        zu0 zu0Var = ve2Var2.b;
        yu0Var.getClass();
        for (int i2 = 0; i2 < zu0Var.a.size(); i2++) {
            yu0Var.a(zu0Var.a(i2));
        }
        boolean z6 = !a3;
        ve2 ve2Var3 = new ve2(ue2Var.a(z6, 4).a(z && !a3, 5).a(z2 && !a3, 6).a(!c && (z2 || !z4 || z) && !a3, 7).a(z3 && !a3, 8).a(!c && (z3 || (z4 && z5)) && !a3, 9).a(z6, 10).a(z && !a3, 11).a(z && !a3, 12).a.a());
        this.H = ve2Var3;
        if (ve2Var3.equals(ve2Var)) {
            return;
        }
        this.k.a(13, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda20
            @Override // yads.of1
            public final void invoke(Object obj) {
                xn0.this.b((we2) obj);
            }
        });
    }

    public final void p() {
        q();
        int i = this.b0.e;
        if (i != 1) {
            if (i == 2 || i == 3) {
                q();
                boolean z = this.b0.o;
                fn3 fn3Var = this.y;
                q();
                boolean z2 = this.b0.l;
                fn3Var.getClass();
                vo3 vo3Var = this.z;
                q();
                boolean z3 = this.b0.l;
                vo3Var.getClass();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        this.y.getClass();
        this.z.getClass();
    }

    public final void q() {
        this.d.b();
        if (Thread.currentThread() != this.q.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.q.getThread().getName();
            int i = sb3.a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.X) {
                throw new IllegalStateException(str);
            }
            gh1.d("ExoPlayerImpl", gh1.a(str, this.Y ? null : new IllegalStateException()));
            this.Y = true;
        }
    }

    public final void a(ao aoVar) {
        q();
        List singletonList = Collections.singletonList(aoVar);
        q();
        q();
        h();
        q();
        a(this.b0);
        int i = sb3.a;
        this.B++;
        if (!this.n.isEmpty()) {
            b(this.n.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            xm1 xm1Var = new xm1((ao) singletonList.get(i2), this.o);
            arrayList.add(xm1Var);
            this.n.add(i2, new wn0(xm1Var.b, xm1Var.a.o));
        }
        this.G = this.G.a(arrayList.size());
        vf2 vf2Var = new vf2(this.n, this.G);
        if (!vf2Var.c() && -1 >= vf2Var.e) {
            throw new h21();
        }
        int a = vf2Var.a(false);
        pe2 a2 = a(this.b0, vf2Var, a(vf2Var, a, -9223372036854775807L));
        int i3 = a2.e;
        if (a != -1 && i3 != 1) {
            i3 = (vf2Var.c() || a >= vf2Var.e) ? 4 : 2;
        }
        pe2 a3 = a2.a(i3);
        this.j.i.a(17, new ao0(arrayList, this.G, a, sb3.a(-9223372036854775807L))).b();
        a(a3, 0, 1, (this.b0.b.a.equals(a3.b.a) || this.b0.a.c()) ? false : true, 4, a(a3));
    }

    public static void h(pe2 pe2Var, we2 we2Var) {
        we2Var.onIsPlayingChanged(pe2Var.e == 3 && pe2Var.l && pe2Var.m == 0);
    }

    public static long b(pe2 pe2Var) {
        f73 f73Var = new f73();
        d73 d73Var = new d73();
        pe2Var.a.a(pe2Var.b.a, d73Var);
        long j = pe2Var.c;
        if (j == -9223372036854775807L) {
            return pe2Var.a.a(d73Var.d, f73Var, 0L).n;
        }
        return d73Var.f + j;
    }

    public final am1 c() {
        q();
        g73 g73Var = this.b0.a;
        if (g73Var.c()) {
            return this.a0;
        }
        wl1 wl1Var = g73Var.a(g(), this.a, 0L).d;
        am1 am1Var = this.a0;
        am1Var.getClass();
        zl1 zl1Var = new zl1(am1Var);
        am1 am1Var2 = wl1Var.e;
        if (am1Var2 != null) {
            CharSequence charSequence = am1Var2.b;
            if (charSequence != null) {
                zl1Var.a = charSequence;
            }
            CharSequence charSequence2 = am1Var2.c;
            if (charSequence2 != null) {
                zl1Var.b = charSequence2;
            }
            CharSequence charSequence3 = am1Var2.d;
            if (charSequence3 != null) {
                zl1Var.c = charSequence3;
            }
            CharSequence charSequence4 = am1Var2.e;
            if (charSequence4 != null) {
                zl1Var.d = charSequence4;
            }
            CharSequence charSequence5 = am1Var2.f;
            if (charSequence5 != null) {
                zl1Var.e = charSequence5;
            }
            CharSequence charSequence6 = am1Var2.g;
            if (charSequence6 != null) {
                zl1Var.f = charSequence6;
            }
            CharSequence charSequence7 = am1Var2.h;
            if (charSequence7 != null) {
                zl1Var.g = charSequence7;
            }
            ul2 ul2Var = am1Var2.i;
            if (ul2Var != null) {
                zl1Var.h = ul2Var;
            }
            ul2 ul2Var2 = am1Var2.j;
            if (ul2Var2 != null) {
                zl1Var.i = ul2Var2;
            }
            byte[] bArr = am1Var2.k;
            if (bArr != null) {
                Integer num = am1Var2.l;
                zl1Var.j = (byte[]) bArr.clone();
                zl1Var.k = num;
            }
            Uri uri = am1Var2.m;
            if (uri != null) {
                zl1Var.l = uri;
            }
            Integer num2 = am1Var2.n;
            if (num2 != null) {
                zl1Var.m = num2;
            }
            Integer num3 = am1Var2.o;
            if (num3 != null) {
                zl1Var.n = num3;
            }
            Integer num4 = am1Var2.p;
            if (num4 != null) {
                zl1Var.o = num4;
            }
            Boolean bool = am1Var2.q;
            if (bool != null) {
                zl1Var.p = bool;
            }
            Integer num5 = am1Var2.r;
            if (num5 != null) {
                zl1Var.q = num5;
            }
            Integer num6 = am1Var2.s;
            if (num6 != null) {
                zl1Var.q = num6;
            }
            Integer num7 = am1Var2.t;
            if (num7 != null) {
                zl1Var.r = num7;
            }
            Integer num8 = am1Var2.u;
            if (num8 != null) {
                zl1Var.s = num8;
            }
            Integer num9 = am1Var2.v;
            if (num9 != null) {
                zl1Var.t = num9;
            }
            Integer num10 = am1Var2.w;
            if (num10 != null) {
                zl1Var.u = num10;
            }
            Integer num11 = am1Var2.x;
            if (num11 != null) {
                zl1Var.v = num11;
            }
            CharSequence charSequence8 = am1Var2.y;
            if (charSequence8 != null) {
                zl1Var.w = charSequence8;
            }
            CharSequence charSequence9 = am1Var2.z;
            if (charSequence9 != null) {
                zl1Var.x = charSequence9;
            }
            CharSequence charSequence10 = am1Var2.A;
            if (charSequence10 != null) {
                zl1Var.y = charSequence10;
            }
            Integer num12 = am1Var2.B;
            if (num12 != null) {
                zl1Var.z = num12;
            }
            Integer num13 = am1Var2.C;
            if (num13 != null) {
                zl1Var.A = num13;
            }
            CharSequence charSequence11 = am1Var2.D;
            if (charSequence11 != null) {
                zl1Var.B = charSequence11;
            }
            CharSequence charSequence12 = am1Var2.E;
            if (charSequence12 != null) {
                zl1Var.C = charSequence12;
            }
            CharSequence charSequence13 = am1Var2.F;
            if (charSequence13 != null) {
                zl1Var.D = charSequence13;
            }
            Bundle bundle = am1Var2.G;
            if (bundle != null) {
                zl1Var.E = bundle;
            }
        }
        return new am1(zl1Var);
    }

    public final void m() {
        TextureView textureView = this.P;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.t) {
                gh1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.P.setSurfaceTextureListener(null);
            }
            this.P = null;
        }
        SurfaceHolder surfaceHolder = this.M;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.t);
            this.M = null;
        }
    }

    public final /* synthetic */ void b(we2 we2Var) {
        we2Var.a(this.H);
    }

    public final void b(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.n.remove(i2);
        }
        hz2 hz2Var = this.G;
        int[] iArr = new int[hz2Var.b.length - i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = hz2Var.b;
            if (i3 < iArr2.length) {
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= i;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            } else {
                this.G = new hz2(iArr, new Random(hz2Var.a.nextLong()));
                return;
            }
        }
    }

    public static /* synthetic */ void d(pe2 pe2Var, we2 we2Var) {
        boolean z = pe2Var.g;
        we2Var.getClass();
        we2Var.onIsLoadingChanged(pe2Var.g);
    }

    public final void a(boolean z) {
        q();
        wj wjVar = this.w;
        q();
        int a = wjVar.a(z, this.b0.e);
        int i = 1;
        if (z && a != 1) {
            i = 2;
        }
        a(a, i, z);
    }

    public static void a(we2 we2Var) {
        we2Var.b(new nn0(2, new vo0(1), 1003));
    }

    public final void a(TextureView textureView) {
        q();
        if (textureView == null) {
            q();
            m();
            a((Surface) null);
            a(0, 0);
            return;
        }
        m();
        this.P = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            gh1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.L = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(float f) {
        q();
        int i = sb3.a;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.V == max) {
            return;
        }
        this.V = max;
        a(1, 2, Float.valueOf(this.w.f * max));
        rf1 rf1Var = this.k;
        rf1Var.a(22, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda0
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).onVolumeChanged(max);
            }
        });
        rf1Var.a();
    }

    public final void a(nn0 nn0Var) {
        pe2 pe2Var = this.b0;
        pe2 a = pe2Var.a(pe2Var.b);
        a.p = a.r;
        a.q = 0L;
        pe2 a2 = a.a(1);
        if (nn0Var != null) {
            a2 = a2.a(nn0Var);
        }
        pe2 pe2Var2 = a2;
        this.B++;
        s53 s53Var = this.j.i;
        s53Var.getClass();
        r53 a3 = s53.a();
        a3.a = s53Var.a.obtainMessage(6);
        a3.b();
        a(pe2Var2, 0, 1, pe2Var2.a.c() && !this.b0.a.c(), 4, a(pe2Var2));
    }

    public final long a(pe2 pe2Var) {
        if (pe2Var.a.c()) {
            return sb3.a(this.d0);
        }
        if (pe2Var.b.a()) {
            return pe2Var.r;
        }
        g73 g73Var = pe2Var.a;
        pm1 pm1Var = pe2Var.b;
        long j = pe2Var.r;
        g73Var.a(pm1Var.a, this.m);
        return j + this.m.f;
    }

    public final void a(bo0 bo0Var) {
        boolean z;
        int i = this.B - bo0Var.c;
        this.B = i;
        boolean z2 = true;
        if (bo0Var.d) {
            this.C = bo0Var.e;
            this.D = true;
        }
        if (bo0Var.f) {
            this.E = bo0Var.g;
        }
        if (i == 0) {
            g73 g73Var = bo0Var.b.a;
            if (!this.b0.a.c() && g73Var.c()) {
                this.c0 = -1;
                this.d0 = 0L;
            }
            if (!g73Var.c()) {
                List asList = Arrays.asList(((vf2) g73Var).i);
                if (asList.size() == this.n.size()) {
                    for (int i2 = 0; i2 < asList.size(); i2++) {
                        ((wn0) this.n.get(i2)).b = (g73) asList.get(i2);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j = -9223372036854775807L;
            if (this.D) {
                if (bo0Var.b.b.equals(this.b0.b) && bo0Var.b.d == this.b0.r) {
                    z2 = false;
                }
                if (z2) {
                    if (!g73Var.c() && !bo0Var.b.b.a()) {
                        pe2 pe2Var = bo0Var.b;
                        pm1 pm1Var = pe2Var.b;
                        long j2 = pe2Var.d;
                        g73Var.a(pm1Var.a, this.m);
                        j = j2 + this.m.f;
                    } else {
                        j = bo0Var.b.d;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            long j3 = j;
            this.D = false;
            a(bo0Var.b, 1, this.E, z, this.C, j3);
        }
    }

    public final void a(final pe2 pe2Var, final int i, final int i2, boolean z, final int i3, long j) {
        Pair pair;
        int i4;
        final wl1 wl1Var;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        int i5;
        wl1 wl1Var2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long j4;
        long b;
        Object obj3;
        wl1 wl1Var3;
        Object obj4;
        int i7;
        pe2 pe2Var2 = this.b0;
        this.b0 = pe2Var;
        boolean equals = pe2Var2.a.equals(pe2Var.a);
        g73 g73Var = pe2Var2.a;
        g73 g73Var2 = pe2Var.a;
        if (g73Var2.c() && g73Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (g73Var2.c() != g73Var.c()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!g73Var.a(g73Var.a(pe2Var2.b.a, this.m).d, this.a, 0L).b.equals(g73Var2.a(g73Var2.a(pe2Var.b.a, this.m).d, this.a, 0L).b)) {
            if (z && i3 == 0) {
                i4 = 1;
            } else if (z && i3 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i3 == 0 && pe2Var2.b.d < pe2Var.b.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        am1 am1Var = this.I;
        if (booleanValue) {
            wl1Var = !pe2Var.a.c() ? pe2Var.a.a(pe2Var.a.a(pe2Var.b.a, this.m).d, this.a, 0L).d : null;
            this.a0 = am1.H;
        } else {
            wl1Var = null;
        }
        if (booleanValue || !pe2Var2.j.equals(pe2Var.j)) {
            am1 am1Var2 = this.a0;
            am1Var2.getClass();
            zl1 zl1Var = new zl1(am1Var2);
            List list = pe2Var.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ht1 ht1Var = (ht1) list.get(i8);
                int i9 = 0;
                while (true) {
                    gt1[] gt1VarArr = ht1Var.b;
                    if (i9 < gt1VarArr.length) {
                        gt1VarArr[i9].a(zl1Var);
                        i9++;
                    }
                }
            }
            this.a0 = new am1(zl1Var);
            am1Var = c();
        }
        boolean equals2 = am1Var.equals(this.I);
        this.I = am1Var;
        boolean z5 = pe2Var2.l != pe2Var.l;
        boolean z6 = pe2Var2.e != pe2Var.e;
        if (z6 || z5) {
            p();
        }
        boolean z7 = pe2Var2.g != pe2Var.g;
        if (!pe2Var2.a.equals(pe2Var.a)) {
            this.k.a(0, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda5
                @Override // yads.of1
                public final void invoke(Object obj5) {
                    xn0.a(pe2.this, i, (we2) obj5);
                }
            });
        }
        if (z) {
            d73 d73Var = new d73();
            if (pe2Var2.a.c()) {
                z2 = z6;
                z3 = z7;
                obj = null;
                i5 = -1;
                wl1Var2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = pe2Var2.b.a;
                pe2Var2.a.a(obj5, d73Var);
                int i10 = d73Var.d;
                int a = pe2Var2.a.a(obj5);
                z2 = z6;
                z3 = z7;
                obj2 = obj5;
                obj = pe2Var2.a.a(i10, this.a, 0L).b;
                wl1Var2 = this.a.d;
                i5 = i10;
                i6 = a;
            }
            if (i3 == 0) {
                if (pe2Var2.b.a()) {
                    pm1 pm1Var = pe2Var2.b;
                    j4 = d73Var.a(pm1Var.b, pm1Var.c);
                    b = b(pe2Var2);
                } else if (pe2Var2.b.e != -1) {
                    j4 = b(this.b0);
                    b = j4;
                } else {
                    j2 = d73Var.f;
                    j3 = d73Var.e;
                    j4 = j2 + j3;
                    b = j4;
                }
            } else if (pe2Var2.b.a()) {
                j4 = pe2Var2.r;
                b = b(pe2Var2);
            } else {
                j2 = d73Var.f;
                j3 = pe2Var2.r;
                j4 = j2 + j3;
                b = j4;
            }
            long b2 = sb3.b(j4);
            long b3 = sb3.b(b);
            pm1 pm1Var2 = pe2Var2.b;
            final xe2 xe2Var = new xe2(obj, i5, wl1Var2, obj2, i6, b2, b3, pm1Var2.b, pm1Var2.c);
            int g = g();
            if (this.b0.a.c()) {
                obj3 = null;
                wl1Var3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                pe2 pe2Var3 = this.b0;
                Object obj6 = pe2Var3.b.a;
                pe2Var3.a.a(obj6, this.m);
                i7 = this.b0.a.a(obj6);
                obj3 = this.b0.a.a(g, this.a, 0L).b;
                wl1Var3 = this.a.d;
                obj4 = obj6;
            }
            long b4 = sb3.b(j);
            long b5 = this.b0.b.a() ? sb3.b(b(this.b0)) : b4;
            pm1 pm1Var3 = this.b0.b;
            final xe2 xe2Var2 = new xe2(obj3, g, wl1Var3, obj4, i7, b4, b5, pm1Var3.b, pm1Var3.c);
            this.k.a(11, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda10
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    xn0.a(i3, xe2Var, xe2Var2, (we2) obj7);
                }
            });
        } else {
            z2 = z6;
            z3 = z7;
        }
        if (booleanValue) {
            rf1 rf1Var = this.k;
            of1 of1Var = new of1() { // from class: yads.xn0$$ExternalSyntheticLambda11
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).a(wl1.this, intValue);
                }
            };
            z4 = true;
            rf1Var.a(1, of1Var);
        } else {
            z4 = true;
        }
        if (pe2Var2.f != pe2Var.f) {
            this.k.a(10, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda12
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).a(pe2.this.f);
                }
            });
            if (pe2Var.f != null) {
                this.k.a(10, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda13
                    @Override // yads.of1
                    public final void invoke(Object obj7) {
                        ((we2) obj7).b(pe2.this.f);
                    }
                });
            }
        }
        i83 i83Var = pe2Var2.i;
        i83 i83Var2 = pe2Var.i;
        if (i83Var != i83Var2) {
            h83 h83Var = this.h;
            ei1 ei1Var = i83Var2.e;
            ((fi1) h83Var).getClass();
            this.k.a(2, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda14
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).a(pe2.this.i.d);
                }
            });
        }
        if (!equals2) {
            final am1 am1Var3 = this.I;
            this.k.a(14, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda15
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).a(am1.this);
                }
            });
        }
        if (z3) {
            this.k.a(3, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda16
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    xn0.d(pe2.this, (we2) obj7);
                }
            });
        }
        if (z2 || z5) {
            this.k.a(-1, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda17
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).onPlayerStateChanged(r0.l, pe2.this.e);
                }
            });
        }
        if (z2) {
            this.k.a(4, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda18
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).onPlaybackStateChanged(pe2.this.e);
                }
            });
        }
        if (z5) {
            this.k.a(5, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda6
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    we2 we2Var = (we2) obj7;
                    we2Var.onPlayWhenReadyChanged(pe2.this.l, i2);
                }
            });
        }
        if (pe2Var2.m != pe2Var.m) {
            this.k.a(6, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda7
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).onPlaybackSuppressionReasonChanged(pe2.this.m);
                }
            });
        }
        if (((pe2Var2.e == 3 && pe2Var2.l && pe2Var2.m == 0) ? z4 : false) != ((pe2Var.e == 3 && pe2Var.l && pe2Var.m == 0) ? z4 : false)) {
            this.k.a(7, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda8
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    xn0.h(pe2.this, (we2) obj7);
                }
            });
        }
        if (!pe2Var2.n.equals(pe2Var.n)) {
            this.k.a(12, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda9
                @Override // yads.of1
                public final void invoke(Object obj7) {
                    ((we2) obj7).a(pe2.this.n);
                }
            });
        }
        o();
        this.k.a();
        if (pe2Var2.o != pe2Var.o) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((un0) ((on0) it.next())).a.p();
            }
        }
    }

    public static /* synthetic */ void a(pe2 pe2Var, int i, we2 we2Var) {
        g73 g73Var = pe2Var.a;
        we2Var.a(i);
    }

    public static /* synthetic */ void a(int i, xe2 xe2Var, xe2 xe2Var2, we2 we2Var) {
        we2Var.getClass();
        we2Var.a(xe2Var, xe2Var2, i);
    }

    public final pe2 a(pe2 pe2Var, vf2 vf2Var, Pair pair) {
        pm1 pm1Var;
        i83 i83Var;
        List list;
        pe2 a;
        long j;
        if (!vf2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        g73 g73Var = pe2Var.a;
        pe2 a2 = pe2Var.a(vf2Var);
        if (vf2Var.c()) {
            pm1 pm1Var2 = pe2.s;
            long a3 = sb3.a(this.d0);
            pe2 a4 = a2.a(pm1Var2, a3, a3, a3, 0L, y73.e, this.b, um2.f).a(pm1Var2);
            a4.p = a4.r;
            return a4;
        }
        Object obj = a2.b.a;
        int i = sb3.a;
        boolean equals = obj.equals(pair.first);
        pm1 pm1Var3 = !equals ? new pm1(pair.first) : a2.b;
        long longValue = ((Long) pair.second).longValue();
        long a5 = sb3.a(d());
        if (!g73Var.c()) {
            a5 -= g73Var.a(obj, this.m).f;
        }
        if (!equals || longValue < a5) {
            if (!pm1Var3.a()) {
                y73 y73Var = !equals ? y73.e : a2.h;
                if (equals) {
                    pm1Var = pm1Var3;
                    i83Var = a2.i;
                } else {
                    pm1Var = pm1Var3;
                    i83Var = this.b;
                }
                i83 i83Var2 = i83Var;
                if (!equals) {
                    i41 i41Var = l41.c;
                    list = um2.f;
                } else {
                    list = a2.j;
                }
                pe2 a6 = a2.a(pm1Var, longValue, longValue, longValue, 0L, y73Var, i83Var2, list).a(pm1Var);
                a6.p = longValue;
                return a6;
            }
            throw new IllegalStateException();
        }
        if (longValue == a5) {
            int a7 = vf2Var.a(a2.k.a);
            if (a7 != -1 && vf2Var.a(a7, this.m, false).d == vf2Var.a(pm1Var3.a, this.m).d) {
                return a2;
            }
            vf2Var.a(pm1Var3.a, this.m);
            if (pm1Var3.a()) {
                j = this.m.a(pm1Var3.b, pm1Var3.c);
            } else {
                j = this.m.e;
            }
            a = a2.a(pm1Var3, a2.r, a2.r, a2.d, j - a2.r, a2.h, a2.i, a2.j).a(pm1Var3);
            a.p = j;
        } else if (!pm1Var3.a()) {
            long max = Math.max(0L, a2.q - (longValue - a5));
            long j2 = a2.p;
            if (a2.k.equals(a2.b)) {
                j2 = longValue + max;
            }
            a = a2.a(pm1Var3, longValue, longValue, longValue, max, a2.h, a2.i, a2.j);
            a.p = j2;
        } else {
            throw new IllegalStateException();
        }
        return a;
    }

    public final Pair a(vf2 vf2Var, int i, long j) {
        if (vf2Var.c()) {
            this.c0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.d0 = j;
            return null;
        }
        if (i == -1 || i >= vf2Var.e) {
            i = vf2Var.a(false);
            j = sb3.b(vf2Var.a(i, this.a, 0L).n);
        }
        return vf2Var.a(this.a, this.m, i, sb3.a(j));
    }

    public final if2 a(hf2 hf2Var) {
        int h = h();
        fo0 fo0Var = this.j;
        g73 g73Var = this.b0.a;
        if (h == -1) {
            h = 0;
        }
        return new if2(fo0Var, hf2Var, g73Var, h, this.s, fo0Var.k);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.L = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (fo foVar : this.g) {
            if (foVar.b == 2) {
                if2 a = a(foVar);
                boolean z2 = a.g;
                if (!z2) {
                    a.d = 1;
                    if (!z2) {
                        a.e = surface;
                        arrayList.add(a.a());
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        Surface surface2 = this.K;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((if2) it.next()).a(this.A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Surface surface3 = this.K;
            Surface surface4 = this.L;
            if (surface3 == surface4) {
                surface4.release();
                this.L = null;
            }
        }
        this.K = surface;
        if (z) {
            a(new nn0(2, new vo0(3), 1003));
        }
    }

    public final void a(final int i, final int i2) {
        if (i == this.R && i2 == this.S) {
            return;
        }
        this.R = i;
        this.S = i2;
        rf1 rf1Var = this.k;
        rf1Var.a(24, new of1() { // from class: yads.xn0$$ExternalSyntheticLambda1
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        rf1Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = (!z || i == -1) ? 0 : 1;
        if (i4 != 0 && i != 1) {
            i3 = 1;
        }
        pe2 pe2Var = this.b0;
        if (pe2Var.l == i4 && pe2Var.m == i3) {
            return;
        }
        this.B++;
        pe2 pe2Var2 = new pe2(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, pe2Var.e, pe2Var.f, pe2Var.g, pe2Var.h, pe2Var.i, pe2Var.j, pe2Var.k, i4, i3, pe2Var.n, pe2Var.p, pe2Var.q, pe2Var.r, pe2Var.o);
        s53 s53Var = this.j.i;
        s53Var.getClass();
        r53 a = s53.a();
        a.a = s53Var.a.obtainMessage(1, i4, i3);
        a.b();
        a(pe2Var2, 0, i2, false, 5, -9223372036854775807L);
    }

    public final void a(int i, int i2, Object obj) {
        for (fo foVar : this.g) {
            if (foVar.b == i) {
                if2 a = a(foVar);
                boolean z = a.g;
                if (!z) {
                    a.d = i2;
                    if (!z) {
                        a.e = obj;
                        a.a();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
