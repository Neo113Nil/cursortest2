package yads;

import android.content.Context;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class xz1 implements Runnable {
    public final t8 b;
    public final s12 c;
    public final l02 d;
    public final uz1 e;
    public final z30 f;
    public final /* synthetic */ zz1 g;

    public xz1(zz1 zz1Var, t8 t8Var, s12 s12Var, l02 l02Var, uz1 uz1Var) {
        cq2 cq2Var = new cq2();
        this.g = zz1Var;
        this.b = t8Var;
        this.c = s12Var;
        this.d = l02Var;
        this.e = uz1Var;
        io2 b = cq2Var.b(zz1Var.b, t8Var);
        Context context = zz1Var.e;
        yu2 yu2Var = zz1Var.a;
        yu2Var.getClass();
        this.f = new z30(ud.a(context, new dq3(((nt3) yu2Var).a)), b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            s12 s12Var = this.c;
            if (s12Var == null) {
                this.e.a(e8.c);
            } else if (s12Var.a.isEmpty()) {
                this.e.a(e8.h);
            } else {
                s12 s12Var2 = this.c;
                t8 t8Var = this.b;
                zz1 zz1Var = this.g;
                dz1 dz1Var = new dz1(zz1Var.b, t8Var, s12Var2);
                uz1 uz1Var = this.e;
                i5 i5Var = zz1Var.c;
                wz1 wz1Var = new wz1(this, uz1Var, i5Var);
                i5Var.a(h5.n, null);
                zz1 zz1Var2 = this.g;
                z42 z42Var = zz1Var2.g;
                Context context = zz1Var2.e;
                v3 v3Var = zz1Var2.b;
                z30 z30Var = this.f;
                uz1 uz1Var2 = this.e;
                z42Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(z42Var.a, new a52(uz1Var2), null, new y42(context, uz1Var2, wz1Var, z42Var, v3Var, dz1Var, z30Var, null), 2, null);
            }
        } catch (Exception unused) {
            boolean z = ob1.a;
            this.e.a(e8.c);
        }
    }
}
