package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ek2 implements cg1 {
    public final Uri a;
    public final c43 b;
    public final rq c;
    public final ik2 d;
    public final ry e;
    public volatile boolean g;
    public long i;
    public v30 j;
    public xs2 k;
    public boolean l;
    public final /* synthetic */ ik2 m;
    public final dg2 f = new dg2();
    public boolean h = true;

    public ek2(ik2 ik2Var, Uri uri, q30 q30Var, rq rqVar, ik2 ik2Var2, ry ryVar) {
        this.m = ik2Var;
        this.a = uri;
        this.b = new c43(q30Var);
        this.c = rqVar;
        this.d = ik2Var2;
        this.e = ryVar;
        wf1.a.getAndIncrement();
        Collections.emptyMap();
        String str = ik2Var.j;
        Map map = ik2.N;
        oh.a(uri, "The uri must be set.");
        this.j = new v30(uri, 0L, 1, null, map, 0L, -1L, str, 6, null);
    }

    @Override // yads.cg1
    public final void a() {
        q30 q30Var;
        long j;
        long j2;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j3 = this.f.a;
                Collections.emptyMap();
                Uri uri = this.a;
                String str = this.m.j;
                Map map = ik2.N;
                oh.a(uri, "The uri must be set.");
                v30 v30Var = new v30(uri, 0L, 1, null, map, j3, -1L, str, 6, null);
                this.j = v30Var;
                long a = this.b.a(v30Var);
                if (a != -1) {
                    a += j3;
                    this.m.h();
                }
                long j4 = a;
                this.m.s = t11.a(this.b.a.b());
                q30 q30Var2 = this.b;
                t11 t11Var = this.m.s;
                if (t11Var == null || (i = t11Var.g) == -1) {
                    q30Var = q30Var2;
                } else {
                    q30 q11Var = new q11(q30Var2, i, this);
                    ik2 ik2Var = this.m;
                    ik2Var.getClass();
                    xs2 a2 = ik2Var.a(new gk2(true, 0));
                    this.k = a2;
                    a2.a(ik2.O);
                    q30Var = q11Var;
                }
                long j5 = j3;
                this.c.a(q30Var, this.a, this.b.a.b(), j3, j4, this.d);
                if (this.m.s != null) {
                    tp0 tp0Var = this.c.b;
                    if (tp0Var instanceof wv1) {
                        ((wv1) tp0Var).p = true;
                    }
                }
                if (this.h) {
                    rq rqVar = this.c;
                    long j6 = this.i;
                    tp0 tp0Var2 = rqVar.b;
                    tp0Var2.getClass();
                    tp0Var2.a(j5, j6);
                    this.h = false;
                }
                while (true) {
                    long j7 = j5;
                    while (i2 == 0 && !this.g) {
                        try {
                            this.e.a();
                            rq rqVar2 = this.c;
                            dg2 dg2Var = this.f;
                            tp0 tp0Var3 = rqVar2.b;
                            tp0Var3.getClass();
                            pd0 pd0Var = rqVar2.c;
                            pd0Var.getClass();
                            i2 = tp0Var3.a(pd0Var, dg2Var);
                            pd0 pd0Var2 = this.c.c;
                            j5 = pd0Var2 != null ? pd0Var2.d : -1L;
                            if (j5 > this.m.k + j7) {
                                ry ryVar = this.e;
                                synchronized (ryVar) {
                                    ryVar.a = false;
                                }
                                ik2 ik2Var2 = this.m;
                                ik2Var2.q.post(ik2Var2.p);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    pd0 pd0Var3 = this.c.c;
                    if (pd0Var3 != null) {
                        j2 = pd0Var3.d;
                        j = -1;
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    if (j2 != j) {
                        this.f.a = pd0Var3 != null ? pd0Var3.d : -1L;
                    }
                }
                t30.a(this.b);
            } catch (Throwable th) {
                if (i2 != 1) {
                    pd0 pd0Var4 = this.c.c;
                    if ((pd0Var4 != null ? pd0Var4.d : -1L) != -1) {
                        this.f.a = pd0Var4 != null ? pd0Var4.d : -1L;
                    }
                }
                t30.a(this.b);
                throw th;
            }
        }
    }

    @Override // yads.cg1
    public final void b() {
        this.g = true;
    }
}
