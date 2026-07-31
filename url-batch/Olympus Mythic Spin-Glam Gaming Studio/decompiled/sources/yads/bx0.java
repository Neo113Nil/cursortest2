package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class bx0 extends l01 {
    public final x12 A;
    public final zw0 B;
    public xw0 C;
    public xw0 D;
    public mx0 E;
    public final cx0 y;
    public final hx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(Context context, v3 v3Var, yu2 yu2Var, cx0 cx0Var, i5 i5Var, hx0 hx0Var, x12 x12Var) {
        super(context, v3Var, i5Var, yu2Var);
        zw0 zw0Var = new zw0(yu2Var);
        this.y = cx0Var;
        this.z = hx0Var;
        this.A = x12Var;
        this.B = zw0Var;
        a(l9.a.a);
    }

    public abstract xw0 a(yw0 yw0Var);

    @Override // yads.wm
    public final void c() {
        if (oa.a(this)) {
            return;
        }
        this.E = null;
        Context context = this.a;
        xw0[] xw0VarArr = {this.D, this.C};
        for (int i = 0; i < 2; i++) {
            xw0 xw0Var = xw0VarArr[i];
            if (xw0Var != null) {
                xw0Var.a(context);
            }
        }
        this.D = null;
        this.C = null;
        super.c();
    }

    @Override // yads.wm
    public final void d() {
        this.y.onAdFailedToLoad(e8.h);
    }

    @Override // yads.wm
    public final synchronized void e() {
        try {
            mx0 mx0Var = this.E;
            this.E = null;
            if (mx0Var != null) {
                this.y.a(mx0Var);
            } else {
                this.y.onAdFailedToLoad(e8.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // yads.wm
    public final void a(d4 d4Var) {
        this.y.onAdFailedToLoad(d4Var);
    }

    @Override // yads.wp2
    public void a(t8 t8Var) {
        yw0 lw2Var;
        synchronized (this) {
            this.b.a(h5.t);
            this.w = t8Var;
        }
        this.A.d = t8Var;
        zw0 zw0Var = this.B;
        Context context = this.a;
        zw0Var.getClass();
        vq1 vq1Var = t8Var.q;
        if (vq1Var != null) {
            lw2Var = new bp1(context, t8Var, vq1Var);
        } else {
            lw2Var = new lw2(context, zw0Var.a);
        }
        xw0 a = a(lw2Var);
        xw0 xw0Var = this.D;
        if (xw0Var != null) {
            xw0Var.a(this.a);
        }
        this.D = this.C;
        this.C = a;
        this.E = this.z.a(t8Var, this.c, a);
        Context a2 = h1.a();
        if (a2 != null) {
            boolean z = ob1.a;
        }
        if (a2 == null) {
            a2 = this.a;
        }
        a.a(a2, t8Var);
    }
}
