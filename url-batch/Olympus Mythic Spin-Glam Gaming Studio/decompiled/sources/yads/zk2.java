package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* loaded from: classes6.dex */
public final class zk2 implements ex0 {
    public final dx0 a;
    public final Handler b;
    public jt3 c;

    public zk2(dx0 dx0Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = dx0Var;
        this.b = handler;
    }

    public static final void a(m6 m6Var, zk2 zk2Var) {
        String str = m6Var.b;
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new ft3(jt3Var, new xp3(str)));
        }
    }

    public static final void b(zk2 zk2Var) {
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new et3(jt3Var));
        }
    }

    public static final void c(zk2 zk2Var) {
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new ht3(jt3Var));
        }
        dx0 dx0Var = zk2Var.a;
        if (dx0Var != null) {
            dx0Var.onAdShown();
        }
    }

    @Override // yads.ex0
    public final void onAdClicked() {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                zk2.a(zk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdDismissed() {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                zk2.b(zk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdShown() {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zk2.c(zk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void a(final y4 y4Var) {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                zk2.a(zk2.this, y4Var);
            }
        });
    }

    public static final void a(zk2 zk2Var, y4 y4Var) {
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new gt3(jt3Var, y4Var != null ? new xq3(y4Var) : null));
        }
    }

    public final void a(final m6 m6Var) {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                zk2.a(m6.this, this);
            }
        });
    }

    public static final void a(zk2 zk2Var) {
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new dt3(jt3Var));
        }
    }

    public final void a(final rq2 rq2Var) {
        this.b.post(new Runnable() { // from class: yads.zk2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                zk2.a(zk2.this, rq2Var);
            }
        });
    }

    public static final void a(zk2 zk2Var, rq2 rq2Var) {
        jt3 jt3Var = zk2Var.c;
        if (jt3Var != null) {
            new CallbackStackTraceMarker(new it3(jt3Var, new bt3(rq2Var)));
        }
    }
}
