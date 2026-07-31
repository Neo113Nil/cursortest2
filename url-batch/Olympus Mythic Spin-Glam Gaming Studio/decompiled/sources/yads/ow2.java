package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes5.dex */
public final class ow2 implements xw0 {
    public final bx0 a;
    public final km b;
    public final yu2 c;
    public final u02 d;
    public final mt2 e;
    public final c52 f;
    public final v3 g;
    public final s22 h;
    public final gx0 i;
    public t8 j;
    public m12 k;
    public boolean l;

    public ow2(Context context, bx0 bx0Var, km kmVar, yu2 yu2Var) {
        u02 u02Var = new u02();
        this.a = bx0Var;
        this.b = kmVar;
        this.c = yu2Var;
        this.d = u02Var;
        v3 v3Var = kmVar.b;
        this.g = v3Var;
        this.h = new s22(v3Var);
        i5 i5Var = kmVar.a;
        this.e = new mt2(v3Var, yu2Var);
        this.f = new c52(context, v3Var, i5Var, yu2Var);
        this.i = new gx0(yu2Var);
    }

    @Override // yads.xw0
    public final String a() {
        return this.d.a(this.k);
    }

    @Override // yads.xw0
    public final List b() {
        u02 u02Var = this.d;
        m12 m12Var = this.k;
        u02Var.getClass();
        return u02.b(m12Var);
    }

    @Override // yads.xw0
    public final String getAdInfo() {
        return this.d.c(this.k);
    }

    @Override // yads.xw0
    public final void a(Context context) {
        this.l = true;
        this.j = null;
        this.k = null;
        this.f.b.a();
        boolean z = ob1.a;
    }

    @Override // yads.xw0
    public final void a(Context context, t8 t8Var) {
        if (this.l) {
            return;
        }
        this.j = t8Var;
        this.b.a.a(h5.c, null);
        this.f.a(t8Var, new nw2(this), new mw2(this, context, t8Var));
    }

    @Override // yads.xw0
    public final Object a(mx0 mx0Var, Activity activity) {
        Result.Companion companion = Result.INSTANCE;
        Object m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(n6.b));
        t8 t8Var = this.j;
        m12 m12Var = this.k;
        if (t8Var == null || m12Var == null) {
            return m8023constructorimpl;
        }
        v3 v3Var = this.g;
        Object a = this.i.a(activity, new w1(t8Var, v3Var, mx0Var.c, this.c, m12Var, v3Var.n, null, 64));
        this.j = null;
        this.k = null;
        return a;
    }
}
