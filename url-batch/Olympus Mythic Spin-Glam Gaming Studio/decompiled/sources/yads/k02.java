package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class k02 implements e1 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public x00 b;

    public static final void c(k02 k02Var) {
        x00 x00Var = k02Var.b;
        if (x00Var != null) {
            x00Var.onReturnedToApplication();
        }
    }

    public final void a(final y4 y4Var) {
        this.a.post(new Runnable() { // from class: yads.k02$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                k02.a(k02.this, y4Var);
            }
        });
    }

    public final void b() {
        this.a.post(new Runnable() { // from class: yads.k02$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                k02.b(k02.this);
            }
        });
    }

    @Override // yads.e1
    public final void onReturnedToApplication() {
        this.a.post(new Runnable() { // from class: yads.k02$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                k02.c(k02.this);
            }
        });
    }

    public static final void a(k02 k02Var, y4 y4Var) {
        x00 x00Var = k02Var.b;
        if (x00Var != null) {
            x00Var.a(y4Var);
        }
    }

    public static final void b(k02 k02Var) {
        x00 x00Var = k02Var.b;
        if (x00Var != null) {
            x00Var.onAdClicked();
        }
        x00 x00Var2 = k02Var.b;
        if (x00Var2 != null) {
            x00Var2.onLeftApplication();
        }
    }

    public final void a() {
        this.a.post(new Runnable() { // from class: yads.k02$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                k02.a(k02.this);
            }
        });
    }

    public static final void a(k02 k02Var) {
        x00 x00Var = k02Var.b;
        if (x00Var != null) {
            x00Var.a();
        }
    }
}
