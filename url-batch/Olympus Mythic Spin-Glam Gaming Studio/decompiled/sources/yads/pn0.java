package yads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class pn0 {
    public final Context a;
    public final p53 b;
    public i53 c;
    public final i53 d;
    public final i53 e;
    public i53 f;
    public final i53 g;
    public final yx0 h;
    public final Looper i;
    public final nj j;
    public final int k;
    public final boolean l;
    public final nx2 m;
    public final ce0 n;
    public final long o;
    public final long p;
    public final boolean q;
    public boolean r;

    public pn0(final Context context) {
        this(context, new i53() { // from class: yads.pn0$$ExternalSyntheticLambda1
            @Override // yads.i53
            public final Object get() {
                return pn0.a(context);
            }
        }, new i53() { // from class: yads.pn0$$ExternalSyntheticLambda2
            @Override // yads.i53
            public final Object get() {
                return pn0.b(context);
            }
        });
    }

    public static /* synthetic */ de0 a(de0 de0Var) {
        return de0Var;
    }

    public static /* synthetic */ ve0 a(Context context) {
        return new ve0(context);
    }

    public static om1 b(Context context) {
        return new ie0(new ed0(context), new sd0());
    }

    public static /* synthetic */ ve0 b(ve0 ve0Var) {
        return ve0Var;
    }

    public static /* synthetic */ h83 c(Context context) {
        return new pf0(context);
    }

    public static dl d(Context context) {
        tc0 tc0Var;
        synchronized (tc0.class) {
            try {
                if (tc0.t == null) {
                    sc0 sc0Var = new sc0(context);
                    tc0.t = new tc0(sc0Var.a, sc0Var.b, sc0Var.c, sc0Var.d, sc0Var.e);
                }
                tc0Var = tc0.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tc0Var;
    }

    public final pn0 c(final ve0 ve0Var) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.c = new i53() { // from class: yads.pn0$$ExternalSyntheticLambda3
            @Override // yads.i53
            public final Object get() {
                return pn0.b(ve0.this);
            }
        };
        return this;
    }

    public pn0(final Context context, i53 i53Var, i53 i53Var2) {
        i53 i53Var3 = new i53() { // from class: yads.pn0$$ExternalSyntheticLambda4
            @Override // yads.i53
            public final Object get() {
                return pn0.c(context);
            }
        };
        i53 i53Var4 = new i53() { // from class: yads.pn0$$ExternalSyntheticLambda5
            @Override // yads.i53
            public final Object get() {
                return new de0();
            }
        };
        i53 i53Var5 = new i53() { // from class: yads.pn0$$ExternalSyntheticLambda6
            @Override // yads.i53
            public final Object get() {
                return pn0.d(context);
            }
        };
        yx0 yx0Var = new yx0() { // from class: yads.pn0$$ExternalSyntheticLambda7
            @Override // yads.yx0
            public final Object apply(Object obj) {
                return new wb0((tv) obj);
            }
        };
        this.a = context;
        this.c = i53Var;
        this.d = i53Var2;
        this.e = i53Var3;
        this.f = i53Var4;
        this.g = i53Var5;
        this.h = yx0Var;
        int i = sb3.a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = nj.h;
        this.k = 1;
        this.l = true;
        this.m = nx2.c;
        this.n = new ce0(sb3.a(20L), sb3.a(500L));
        this.b = tv.a;
        this.o = 500L;
        this.p = 2000L;
        this.q = true;
    }

    public final void b(final de0 de0Var) {
        if (!this.r) {
            this.f = new i53() { // from class: yads.pn0$$ExternalSyntheticLambda0
                @Override // yads.i53
                public final Object get() {
                    return pn0.a(de0.this);
                }
            };
            return;
        }
        throw new IllegalStateException();
    }
}
