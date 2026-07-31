package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class l12 {
    public final g12 a;
    public final Handler b;
    public final k5 c;
    public a10 d;

    public l12(Context context, v3 v3Var, yu2 yu2Var, i5 i5Var, g12 g12Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        k5 k5Var = new k5(context, v3Var, i5Var, yu2Var);
        this.a = g12Var;
        this.b = handler;
        this.c = k5Var;
    }

    public final void a(final m12 m12Var) {
        d00 d00Var = e00.c;
        i4.a("native");
        this.c.a();
        this.b.post(new Runnable() { // from class: yads.l12$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                l12.a(l12.this, m12Var);
            }
        });
    }

    public static final void a(l12 l12Var, m12 m12Var) {
        a10 a10Var = l12Var.d;
        if (a10Var != null) {
            a10Var.a(m12Var);
        }
        l12Var.a.c();
    }

    public final void a(final ArrayList arrayList) {
        d00 d00Var = e00.c;
        i4.a("native");
        this.c.a();
        this.b.post(new Runnable() { // from class: yads.l12$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                l12.a(l12.this, arrayList);
            }
        });
    }

    public static final void a(l12 l12Var, List list) {
        l12Var.getClass();
        l12Var.a.c();
    }

    public final void a(final k32 k32Var) {
        d00 d00Var = e00.c;
        i4.a("native");
        this.c.a();
        this.b.post(new Runnable() { // from class: yads.l12$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l12.a(l12.this, k32Var);
            }
        });
    }

    public static final void a(l12 l12Var, k32 k32Var) {
        l12Var.getClass();
        l12Var.a.c();
    }

    public final void a(final d4 d4Var) {
        this.c.a(d4Var.b, d4Var.c);
        this.b.post(new Runnable() { // from class: yads.l12$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                l12.a(l12.this, d4Var);
            }
        });
    }

    public static final void a(l12 l12Var, d4 d4Var) {
        a10 a10Var = l12Var.d;
        if (a10Var != null) {
            a10Var.onAdFailedToLoad(d4Var);
        }
        l12Var.a.c();
    }
}
