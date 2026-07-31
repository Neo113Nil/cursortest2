package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.my.target.ka;
import com.my.target.va;
import com.my.target.wh;
import com.my.target.x1;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class n9 {
    private final fe a;
    private final Context b;
    private boolean c = true;

    private n9(fe feVar, Context context) {
        this.b = context;
        this.a = feVar;
    }

    public static n9 a(fe feVar, Context context) {
        return new n9(feVar, context);
    }

    private y0 c() {
        return new y0(this.b);
    }

    public h0 b() {
        return new h0(this.b);
    }

    public l1 d() {
        return new l1(this.b);
    }

    public Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public z5 f() {
        return new z5(this.b);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public sa a(ra raVar) {
        return new sa(b(), d(), f(), raVar, this.b);
    }

    public pa a(oa oaVar) {
        return new pa(b(), d(), c(), oaVar, this.b);
    }

    public va a(d9 d9Var, va.a aVar, r9 r9Var, x1.b bVar, ka.a aVar2) {
        if (!d9Var.g0().isEmpty() && d9Var.W()) {
            return new la(this.b, aVar, aVar2, bVar);
        }
        if (!d9Var.g0().isEmpty()) {
            return new l9(aVar, bVar, this.b);
        }
        if (d9Var.j0() != null && r9Var != null) {
            return new ua(b(), d(), a(r9Var), null, aVar, r9Var, this.b);
        }
        return new ma(b(), d(), f(), null, aVar, this.b);
    }

    public bj a(r9 r9Var) {
        e0 a = a();
        return new bj(ib.a(this.c, a.getContext()), a, this.b, r9Var);
    }

    public e0 a() {
        return new e0(this.b);
    }

    public oe a(eb ebVar, wh.c cVar) {
        return oe.a(ebVar, this.a, cVar, this.b);
    }
}
