package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes5.dex */
public final class el {
    public final Handler a;
    public final k5 b;
    public sq3 c;

    public el(Context context, v3 v3Var, nt3 nt3Var, i5 i5Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        k5 k5Var = new k5(context, v3Var, i5Var, nt3Var);
        this.a = handler;
        this.b = k5Var;
    }

    public final void a(final d4 d4Var) {
        this.b.a(d4Var.b, d4Var.c);
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this, d4Var);
            }
        });
    }

    public final void b() {
        this.b.a();
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                el.b(el.this);
            }
        });
    }

    public final void c() {
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                el.c(el.this);
            }
        });
    }

    public final void d() {
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                el.d(el.this);
            }
        });
    }

    public static final void c(el elVar) {
        sq3 sq3Var = elVar.c;
        if (sq3Var != null) {
            new CallbackStackTraceMarker(new oq3(sq3Var));
        }
    }

    public static final void d(el elVar) {
        sq3 sq3Var = elVar.c;
    }

    public static final void b(el elVar) {
        sq3 sq3Var = elVar.c;
        if (sq3Var != null) {
            new CallbackStackTraceMarker(new qq3(sq3Var));
        }
    }

    public static final void a(el elVar, d4 d4Var) {
        sq3 sq3Var = elVar.c;
        if (sq3Var != null) {
            new CallbackStackTraceMarker(new pq3(sq3Var, new AdRequestError(d4Var.a, d4Var.c, d4Var.d)));
        }
    }

    public final void a(final y4 y4Var) {
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this, y4Var);
            }
        });
    }

    public static final void a(el elVar, y4 y4Var) {
        sq3 sq3Var = elVar.c;
        if (sq3Var != null) {
            new CallbackStackTraceMarker(new rq3(sq3Var, y4Var != null ? new xq3(y4Var) : null));
        }
    }

    public final void a() {
        this.a.post(new Runnable() { // from class: yads.el$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                el.a(el.this);
            }
        });
    }

    public static final void a(el elVar) {
        sq3 sq3Var = elVar.c;
    }
}
