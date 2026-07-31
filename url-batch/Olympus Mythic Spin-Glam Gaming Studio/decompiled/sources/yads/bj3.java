package yads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes14.dex */
public final class bj3 {
    public final Handler a;
    public final un0 b;

    public bj3(Handler handler, un0 un0Var) {
        this.a = handler;
        this.b = un0Var;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.b(str, j, j2);
                }
            });
        }
    }

    public final void b(final cb0 cb0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.d(cb0Var);
                }
            });
        }
    }

    public final void c(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.a(j, i);
                }
            });
        }
    }

    public final void d(cb0 cb0Var) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a.getClass();
        ((wb0) un0Var.a.p).d(cb0Var);
    }

    public final void a(final jw0 jw0Var, final hb0 hb0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.b(jw0Var, hb0Var);
                }
            });
        }
    }

    public final void b(String str, long j, long j2) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).b(str, j, j2);
    }

    public final void c(cb0 cb0Var) {
        synchronized (cb0Var) {
        }
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).c(cb0Var);
        un0Var.a.getClass();
        un0Var.a.getClass();
    }

    public final void a(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.b(i, j);
                }
            });
        }
    }

    public final void b(jw0 jw0Var, hb0 hb0Var) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a.getClass();
        ((wb0) un0Var.a.p).b(jw0Var, hb0Var);
    }

    public final void a(long j, int i) {
        un0 un0Var = this.b;
        int i2 = sb3.a;
        ((wb0) un0Var.a.p).b(i, j);
    }

    public final void a(mj3 mj3Var) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a(mj3Var);
    }

    public final void b(int i, long j) {
        un0 un0Var = this.b;
        int i2 = sb3.a;
        ((wb0) un0Var.a.p).a(i, j);
    }

    public final void a(final Object obj) {
        if (this.a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.a(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void b(final mj3 mj3Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.a(mj3Var);
                }
            });
        }
    }

    public final void a(Object obj, long j) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a(obj, j);
    }

    public final void b(String str) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).b(str);
    }

    public final void a(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.b(str);
                }
            });
        }
    }

    public final void a(final cb0 cb0Var) {
        synchronized (cb0Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.c(cb0Var);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.bj3$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    bj3.this.a(exc);
                }
            });
        }
    }

    public final void a(Exception exc) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).c(exc);
    }
}
