package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public final class wb0 implements kd {
    public final tv a;
    public final d73 b;
    public final f73 c;
    public final vb0 d;
    public final SparseArray e;
    public rf1 f;
    public xn0 g;
    public s53 h;

    public wb0(tv tvVar) {
        tvVar.getClass();
        this.a = tvVar;
        int i = sb3.a;
        Looper myLooper = Looper.myLooper();
        this.f = new rf1(new CopyOnWriteArraySet(), myLooper == null ? Looper.getMainLooper() : myLooper, tvVar, new pf1() { // from class: yads.wb0$$ExternalSyntheticLambda25
            @Override // yads.pf1
            public final void a(Object obj, zu0 zu0Var) {
                wb0.a((sd) obj, zu0Var);
            }
        });
        d73 d73Var = new d73();
        this.b = d73Var;
        this.c = new f73();
        this.d = new vb0(d73Var);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void a(sd sdVar, zu0 zu0Var) {
    }

    public final void b(final cb0 cb0Var) {
        final qd b = b();
        a(b, 1007, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda24
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                cb0 cb0Var2 = cb0Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final void c() {
        s53 s53Var = this.h;
        s53Var.a.post(new Runnable() { // from class: yads.wb0$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                wb0.this.d();
            }
        });
    }

    public final void d(final cb0 cb0Var) {
        final qd b = b();
        a(b, 1015, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda43
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                cb0 cb0Var2 = cb0Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onCues(final List list) {
        final qd a = a();
        a(a, 27, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda11
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                List list2 = list;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onIsLoadingChanged(final boolean z) {
        final qd a = a();
        a(a, 3, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda40
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                boolean z2 = z;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onIsPlayingChanged(final boolean z) {
        final qd a = a();
        a(a, 7, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda16
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                boolean z2 = z;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final qd a = a();
        a(a, 5, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda20
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                boolean z2 = z;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onPlaybackStateChanged(final int i) {
        final qd a = a();
        a(a, 4, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda22
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final qd a = a();
        a(a, 6, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda23
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final qd a = a();
        a(a, -1, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda28
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                boolean z2 = z;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onRenderedFirstFrame() {
    }

    @Override // yads.we2
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final qd b = b();
        a(b, 23, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda51
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                boolean z2 = z;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final qd b = b();
        a(b, 24, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda36
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i3 = i;
                int i4 = i2;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void onVolumeChanged(final float f) {
        final qd b = b();
        a(b, 22, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda41
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                float f2 = f;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final xn0 xn0Var, Looper looper) {
        if (this.g != null && !this.d.b.isEmpty()) {
            throw new IllegalStateException();
        }
        xn0Var.getClass();
        this.g = xn0Var;
        this.h = ((p53) this.a).a(looper, null);
        rf1 rf1Var = this.f;
        pf1 pf1Var = new pf1() { // from class: yads.wb0$$ExternalSyntheticLambda31
            @Override // yads.pf1
            public final void a(Object obj, zu0 zu0Var) {
                wb0.this.a(xn0Var, (sd) obj, zu0Var);
            }
        };
        this.f = new rf1(rf1Var.d, looper, rf1Var.a, pf1Var);
    }

    public static void c(qd qdVar, cb0 cb0Var, sd sdVar) {
        dm1 dm1Var = (dm1) sdVar;
        dm1Var.x += cb0Var.g;
        dm1Var.y += cb0Var.e;
    }

    public final void b(final Exception exc) {
        final qd b = b();
        a(b, 1014, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda4
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                Exception exc2 = exc;
                ((sd) obj).getClass();
            }
        });
    }

    public final void d() {
        final qd a = a();
        a(a, 1028, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda50
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                ((sd) obj).getClass();
            }
        });
        rf1 rf1Var = this.f;
        Iterator it = rf1Var.d.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            pf1 pf1Var = rf1Var.c;
            qf1Var.d = true;
            if (qf1Var.c) {
                pf1Var.a(qf1Var.a, qf1Var.b.a());
            }
        }
        rf1Var.d.clear();
        rf1Var.g = true;
    }

    public final void b(final String str, final long j, final long j2) {
        final qd b = b();
        a(b, 1016, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda33
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                ((sd) obj).getClass();
            }
        });
    }

    public final void c(final Exception exc) {
        final qd b = b();
        a(b, 1030, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda13
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                Exception exc2 = exc;
                ((sd) obj).getClass();
            }
        });
    }

    public final void b(final jw0 jw0Var, final hb0 hb0Var) {
        final qd b = b();
        a(b, 1017, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda46
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                jw0 jw0Var2 = jw0Var;
                hb0 hb0Var2 = hb0Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final /* synthetic */ void a(ye2 ye2Var, sd sdVar, zu0 zu0Var) {
        ((dm1) sdVar).a(ye2Var, new rd(zu0Var, this.e));
    }

    @Override // yads.tm1
    public final void c(int i, pm1 pm1Var, final wf1 wf1Var, final yl1 yl1Var) {
        final qd a = a(i, pm1Var);
        a(a, 1002, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda44
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                wf1 wf1Var2 = wf1Var;
                yl1 yl1Var2 = yl1Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final String str, final long j, final long j2) {
        final qd b = b();
        a(b, 1008, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda34
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                ((sd) obj).getClass();
            }
        });
    }

    public final void b(final String str) {
        final qd b = b();
        a(b, 1019, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda32
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                String str2 = str;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final jw0 jw0Var, final hb0 hb0Var) {
        final qd b = b();
        a(b, 1009, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda6
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                jw0 jw0Var2 = jw0Var;
                hb0 hb0Var2 = hb0Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final void c(final cb0 cb0Var) {
        final qd a = a(this.d.e);
        a(a, 1020, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda0
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.c(qd.this, cb0Var, (sd) obj);
            }
        });
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, final wf1 wf1Var, final yl1 yl1Var) {
        final qd a = a(i, pm1Var);
        a(a, 1000, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda39
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                wf1 wf1Var2 = wf1Var;
                yl1 yl1Var2 = yl1Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final long j) {
        final qd b = b();
        a(b, 1010, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda17
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                long j2 = j;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, final yl1 yl1Var) {
        final qd a = a(i, pm1Var);
        a(a, 1004, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda3
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.a(qd.this, yl1Var, (sd) obj);
            }
        });
    }

    public final void a(final int i, final long j, final long j2) {
        final qd b = b();
        a(b, 1011, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda47
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final String str) {
        final qd b = b();
        a(b, 1012, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda26
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                String str2 = str;
                ((sd) obj).getClass();
            }
        });
    }

    public static void b(qd qdVar, int i, long j, long j2, sd sdVar) {
        String str;
        dm1 dm1Var = (dm1) sdVar;
        dm1Var.getClass();
        pm1 pm1Var = qdVar.d;
        if (pm1Var != null) {
            pe0 pe0Var = dm1Var.b;
            g73 g73Var = qdVar.b;
            synchronized (pe0Var) {
                str = pe0Var.a(g73Var.a(pm1Var.a, pe0Var.b).d, pm1Var).a;
            }
            Long l = (Long) dm1Var.h.get(str);
            Long l2 = (Long) dm1Var.g.get(str);
            dm1Var.h.put(str, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            dm1Var.g.put(str, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final void a(final Exception exc) {
        final qd b = b();
        a(b, 1029, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda12
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                Exception exc2 = exc;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final Object obj, final long j) {
        final qd b = b();
        a(b, 26, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda48
            @Override // yads.of1
            public final void invoke(Object obj2) {
                qd qdVar = qd.this;
                Object obj3 = obj;
                long j2 = j;
                ((sd) obj2).getClass();
            }
        });
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, final wf1 wf1Var, final yl1 yl1Var) {
        final qd a = a(i, pm1Var);
        a(a, 1001, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda9
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                wf1 wf1Var2 = wf1Var;
                yl1 yl1Var2 = yl1Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, final wf1 wf1Var, final yl1 yl1Var, final IOException iOException, final boolean z) {
        final qd a = a(i, pm1Var);
        a(a, 1003, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda37
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.a(qd.this, wf1Var, yl1Var, iOException, z, (sd) obj);
            }
        });
    }

    public final void b(final int i, final long j) {
        final qd a = a(this.d.e);
        a(a, 1021, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda7
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                long j2 = j;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    public static void a(qd qdVar, wf1 wf1Var, yl1 yl1Var, IOException iOException, boolean z, sd sdVar) {
        dm1 dm1Var = (dm1) sdVar;
        dm1Var.getClass();
        dm1Var.v = yl1Var.a;
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, final yl1 yl1Var) {
        final qd a = a(i, pm1Var);
        a(a, 1005, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda14
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                yl1 yl1Var2 = yl1Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final qd b() {
        return a(this.d.f);
    }

    public static void a(qd qdVar, yl1 yl1Var, sd sdVar) {
        String str;
        dm1 dm1Var = (dm1) sdVar;
        dm1Var.getClass();
        if (qdVar.d == null) {
            return;
        }
        jw0 jw0Var = yl1Var.c;
        jw0Var.getClass();
        int i = yl1Var.d;
        pe0 pe0Var = dm1Var.b;
        g73 g73Var = qdVar.b;
        pm1 pm1Var = qdVar.d;
        pm1Var.getClass();
        synchronized (pe0Var) {
            str = pe0Var.a(g73Var.a(pm1Var.a, pe0Var.b).d, pm1Var).a;
        }
        cm1 cm1Var = new cm1(jw0Var, i, str);
        int i2 = yl1Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                dm1Var.p = cm1Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                dm1Var.q = cm1Var;
                return;
            }
        }
        dm1Var.o = cm1Var;
    }

    public final void b(final int i, final long j, final long j2) {
        vb0 vb0Var = this.d;
        final qd a = a(vb0Var.b.isEmpty() ? null : (pm1) pc1.a(vb0Var.b));
        a(a, 1006, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda52
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.b(qd.this, i, j, j2, (sd) obj);
            }
        });
    }

    @Override // yads.we2
    public final void b(final ne2 ne2Var) {
        final qd a;
        im1 im1Var;
        if ((ne2Var instanceof nn0) && (im1Var = ((nn0) ne2Var).i) != null) {
            a = a(new pm1(im1Var));
        } else {
            a = a();
        }
        a(a, 10, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda38
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.a(qd.this, ne2Var, (sd) obj);
            }
        });
    }

    @Override // yads.we2
    public final void a(final int i) {
        vb0 vb0Var = this.d;
        xn0 xn0Var = this.g;
        xn0Var.getClass();
        vb0Var.d = vb0.a(xn0Var, vb0Var.b, vb0Var.e, vb0Var.a);
        xn0Var.q();
        vb0Var.a(xn0Var.b0.a);
        final qd a = a();
        a(a, 0, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda10
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final wl1 wl1Var, final int i) {
        final qd a = a();
        a(a, 1, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda27
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                wl1 wl1Var2 = wl1Var;
                int i2 = i;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final e93 e93Var) {
        final qd a = a();
        a(a, 2, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda5
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                e93 e93Var2 = e93Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final ve2 ve2Var) {
        final qd a = a();
        a(a, 13, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda19
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                ve2 ve2Var2 = ve2Var;
                ((sd) obj).getClass();
            }
        });
    }

    public static void a(qd qdVar, ne2 ne2Var, sd sdVar) {
        ((dm1) sdVar).n = ne2Var;
    }

    @Override // yads.we2
    public final void a(final xe2 xe2Var, final xe2 xe2Var2, final int i) {
        vb0 vb0Var = this.d;
        xn0 xn0Var = this.g;
        xn0Var.getClass();
        vb0Var.d = vb0.a(xn0Var, vb0Var.b, vb0Var.e, vb0Var.a);
        final qd a = a();
        a(a, 11, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda1
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.a(qd.this, i, xe2Var, xe2Var2, (sd) obj);
            }
        });
    }

    public static void a(qd qdVar, int i, xe2 xe2Var, xe2 xe2Var2, sd sdVar) {
        sdVar.getClass();
        dm1 dm1Var = (dm1) sdVar;
        if (i == 1) {
            dm1Var.u = true;
        }
        dm1Var.k = i;
    }

    @Override // yads.we2
    public final void a(final re2 re2Var) {
        final qd a = a();
        a(a, 12, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda18
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                re2 re2Var2 = re2Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final am1 am1Var) {
        final qd a = a();
        a(a, 14, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda21
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                am1 am1Var2 = am1Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final ht1 ht1Var) {
        final qd a = a();
        a(a, 28, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda29
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                ht1 ht1Var2 = ht1Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final u20 u20Var) {
        final qd a = a();
        a(a, 27, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda15
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                u20 u20Var2 = u20Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final mj3 mj3Var) {
        final qd b = b();
        a(b, 25, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda49
            @Override // yads.of1
            public final void invoke(Object obj) {
                wb0.a(qd.this, mj3Var, (sd) obj);
            }
        });
    }

    public static void a(qd qdVar, mj3 mj3Var, sd sdVar) {
        dm1 dm1Var = (dm1) sdVar;
        cm1 cm1Var = dm1Var.o;
        if (cm1Var != null) {
            jw0 jw0Var = cm1Var.a;
            if (jw0Var.s == -1) {
                iw0 iw0Var = new iw0(jw0Var);
                iw0Var.p = mj3Var.b;
                iw0Var.q = mj3Var.c;
                dm1Var.o = new cm1(new jw0(iw0Var), cm1Var.b, cm1Var.c);
            }
        }
        int i = mj3Var.b;
    }

    @Override // yads.we2
    public final void a(final qg0 qg0Var) {
        final qd a = a();
        a(a, 29, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda2
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                qg0 qg0Var2 = qg0Var;
                ((sd) obj).getClass();
            }
        });
    }

    @Override // yads.we2
    public final void a(final boolean z, final int i) {
        final qd a = a();
        a(a, 30, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda35
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                boolean z2 = z;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(qd qdVar, int i, of1 of1Var) {
        this.e.put(i, qdVar);
        rf1 rf1Var = this.f;
        rf1Var.a(i, of1Var);
        rf1Var.a();
    }

    public final qd a() {
        return a(this.d.d);
    }

    public final qd a(g73 g73Var, int i, pm1 pm1Var) {
        pm1 pm1Var2 = g73Var.c() ? null : pm1Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        xn0 xn0Var = this.g;
        xn0Var.q();
        boolean z = g73Var.equals(xn0Var.b0.a) && i == this.g.g();
        long j = 0;
        if (pm1Var2 == null || !pm1Var2.a()) {
            if (z) {
                j = this.g.d();
            } else if (!g73Var.c()) {
                j = sb3.b(g73Var.a(i, this.c, 0L).n);
            }
        } else if (z && this.g.e() == pm1Var2.b && this.g.f() == pm1Var2.c) {
            xn0 xn0Var2 = this.g;
            xn0Var2.q();
            j = sb3.b(xn0Var2.a(xn0Var2.b0));
        }
        pm1 pm1Var3 = this.d.d;
        xn0 xn0Var3 = this.g;
        xn0Var3.q();
        g73 g73Var2 = xn0Var3.b0.a;
        int g = this.g.g();
        xn0 xn0Var4 = this.g;
        xn0Var4.q();
        long b = sb3.b(xn0Var4.a(xn0Var4.b0));
        xn0 xn0Var5 = this.g;
        xn0Var5.q();
        return new qd(elapsedRealtime, g73Var, i, pm1Var2, j, g73Var2, g, pm1Var3, b, sb3.b(xn0Var5.b0.q));
    }

    public final qd a(pm1 pm1Var) {
        this.g.getClass();
        g73 g73Var = pm1Var == null ? null : (g73) this.d.c.get(pm1Var);
        if (pm1Var != null && g73Var != null) {
            return a(g73Var, g73Var.a(pm1Var.a, this.b).d, pm1Var);
        }
        int g = this.g.g();
        xn0 xn0Var = this.g;
        xn0Var.q();
        g73 g73Var2 = xn0Var.b0.a;
        if (g >= g73Var2.b()) {
            g73Var2 = g73.b;
        }
        return a(g73Var2, g, (pm1) null);
    }

    public final void a(final cb0 cb0Var) {
        final qd a = a(this.d.e);
        a(a, 1013, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda30
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                cb0 cb0Var2 = cb0Var;
                ((sd) obj).getClass();
            }
        });
    }

    public final void a(final int i, final long j) {
        final qd a = a(this.d.e);
        a(a, 1018, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda42
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                int i2 = i;
                long j2 = j;
                ((sd) obj).getClass();
            }
        });
    }

    public final qd a(int i, pm1 pm1Var) {
        this.g.getClass();
        if (pm1Var != null) {
            if (((g73) this.d.c.get(pm1Var)) != null) {
                return a(pm1Var);
            }
            return a(g73.b, i, pm1Var);
        }
        xn0 xn0Var = this.g;
        xn0Var.q();
        g73 g73Var = xn0Var.b0.a;
        if (i >= g73Var.b()) {
            g73Var = g73.b;
        }
        return a(g73Var, i, (pm1) null);
    }

    @Override // yads.we2
    public final void a(final ne2 ne2Var) {
        final qd a;
        im1 im1Var;
        if ((ne2Var instanceof nn0) && (im1Var = ((nn0) ne2Var).i) != null) {
            a = a(new pm1(im1Var));
        } else {
            a = a();
        }
        a(a, 10, new of1() { // from class: yads.wb0$$ExternalSyntheticLambda45
            @Override // yads.of1
            public final void invoke(Object obj) {
                qd qdVar = qd.this;
                ne2 ne2Var2 = ne2Var;
                ((sd) obj).getClass();
            }
        });
    }
}
