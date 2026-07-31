package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class k32 extends f42 implements m12 {
    public final j32 Q;
    public final ri2 R;

    public k32(Context context, j32 j32Var, ri2 ri2Var, np npVar, sz1 sz1Var) {
        super(context, npVar, sz1Var);
        this.Q = j32Var;
        this.R = ri2Var;
        v3 v3Var = npVar.a.c;
        e52 e52Var = e52.c;
        w22 w22Var = new w22(v3Var, "ad_unit", this.i, this.j, new u22());
        w22Var.f = d32.c;
        a(w22Var);
    }

    @Override // yads.m12
    public final String a() {
        return this.Q.a();
    }

    public final xz b(f22 f22Var) {
        vz vzVar;
        try {
            a(f22Var.c, this.R, new o22(f22Var));
            return wz.a;
        } catch (v02 e) {
            ab1.a("Ad binding failed: %s", e.b);
            vzVar = new vz(e.c, e);
            return vzVar;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Ad binding failed with unexpected exception";
            }
            ab1.a("Ad binding failed with unexpected error: %s", message);
            vzVar = new vz(null, th);
            return vzVar;
        }
    }

    @Override // yads.m12
    public final String c() {
        return this.Q.c();
    }

    @Override // yads.m12
    public final j00 e() {
        return this.Q.e();
    }

    @Override // yads.m12
    public final w00 getAdAssets() {
        return this.Q.getAdAssets();
    }

    @Override // yads.m12
    public final dq2 getAdType() {
        return this.Q.getAdType();
    }

    @Override // yads.m12
    public final String getInfo() {
        return this.Q.getInfo();
    }

    public final ArrayList k() {
        return new ArrayList(this.Q.a);
    }

    @Override // yads.f42, yads.m12
    public final void loadImages() {
        this.Q.loadImages();
    }

    @Override // yads.m12
    public final void a(f22 f22Var, ku kuVar) {
        this.Q.a(f22Var, kuVar);
    }

    @Override // yads.m12
    public final xz a(f22 f22Var) {
        return this.Q.a(f22Var);
    }

    @Override // yads.f42, yads.m12
    public final void a(x00 x00Var) {
        this.Q.a(x00Var);
    }

    @Override // yads.f42, yads.m12
    public final void a(zb zbVar) {
        this.I.k = zbVar;
        this.Q.a(zbVar);
    }

    public final void b(x00 x00Var) {
        super.a(x00Var);
    }
}
