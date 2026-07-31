package yads;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class ak {
    public final Handler a;
    public final un0 b;

    public ak(Handler handler, un0 un0Var) {
        this.a = handler;
        this.b = un0Var;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.b(str, j, j2);
                }
            });
        }
    }

    public final void b(final cb0 cb0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.d(cb0Var);
                }
            });
        }
    }

    public final void c(cb0 cb0Var) {
        synchronized (cb0Var) {
        }
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).a(cb0Var);
        un0Var.a.getClass();
        un0Var.a.getClass();
    }

    public final void d(cb0 cb0Var) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a.getClass();
        ((wb0) un0Var.a.p).b(cb0Var);
    }

    public final void a(final jw0 jw0Var, final hb0 hb0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.b(jw0Var, hb0Var);
                }
            });
        }
    }

    public final void b(String str, long j, long j2) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).a(str, j, j2);
    }

    public final void a(long j) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).a(j);
    }

    public final void d(Exception exc) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).b(exc);
    }

    public final void b(jw0 jw0Var, hb0 hb0Var) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a.getClass();
        ((wb0) un0Var.a.p).a(jw0Var, hb0Var);
    }

    public final void a(int i, long j, long j2) {
        un0 un0Var = this.b;
        int i2 = sb3.a;
        ((wb0) un0Var.a.p).a(i, j, j2);
    }

    public final void c(Exception exc) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).a(exc);
    }

    public final void b(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.a(j);
                }
            });
        }
    }

    public final void a(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.b(str);
                }
            });
        }
    }

    public final void b(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.a(i, j, j2);
                }
            });
        }
    }

    public final void a(final cb0 cb0Var) {
        synchronized (cb0Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.c(cb0Var);
                }
            });
        }
    }

    public final void b(String str) {
        un0 un0Var = this.b;
        int i = sb3.a;
        ((wb0) un0Var.a.p).a(str);
    }

    public final void a(boolean z) {
        un0 un0Var = this.b;
        int i = sb3.a;
        un0Var.a(z);
    }

    public final void b(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.a(z);
                }
            });
        }
    }

    public final void a(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.c(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ak$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.d(exc);
                }
            });
        }
    }
}
