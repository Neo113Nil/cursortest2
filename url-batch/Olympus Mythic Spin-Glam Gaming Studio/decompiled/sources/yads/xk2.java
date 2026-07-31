package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* loaded from: classes14.dex */
public final class xk2 implements ex0 {
    public final dx0 a;
    public final Handler b;
    public gs3 c;

    public xk2(dx0 dx0Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = dx0Var;
        this.b = handler;
    }

    public static final void a(m6 m6Var, xk2 xk2Var) {
        String str = m6Var.b;
        gs3 gs3Var = xk2Var.c;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new ds3(gs3Var, new xp3(str)));
        }
    }

    public static final void b(xk2 xk2Var) {
        gs3 gs3Var = xk2Var.c;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new cs3(gs3Var));
        }
    }

    public static final void c(xk2 xk2Var) {
        gs3 gs3Var = xk2Var.c;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new fs3(gs3Var));
        }
        dx0 dx0Var = xk2Var.a;
        if (dx0Var != null) {
            dx0Var.onAdShown();
        }
    }

    @Override // yads.ex0
    public final void onAdClicked() {
        this.b.post(new Runnable() { // from class: yads.xk2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                xk2.a(xk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdDismissed() {
        this.b.post(new Runnable() { // from class: yads.xk2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                xk2.b(xk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdShown() {
        this.b.post(new Runnable() { // from class: yads.xk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                xk2.c(xk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void a(final y4 y4Var) {
        this.b.post(new Runnable() { // from class: yads.xk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                xk2.a(xk2.this, y4Var);
            }
        });
    }

    public static final void a(xk2 xk2Var, y4 y4Var) {
        gs3 gs3Var = xk2Var.c;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new es3(gs3Var, y4Var != null ? new xq3(y4Var) : null));
        }
    }

    public final void a(final m6 m6Var) {
        this.b.post(new Runnable() { // from class: yads.xk2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                xk2.a(m6.this, this);
            }
        });
    }

    public static final void a(xk2 xk2Var) {
        gs3 gs3Var = xk2Var.c;
        if (gs3Var != null) {
            new CallbackStackTraceMarker(new bs3(gs3Var));
        }
    }
}
