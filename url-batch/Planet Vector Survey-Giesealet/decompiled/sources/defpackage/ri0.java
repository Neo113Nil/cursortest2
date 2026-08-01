package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ri0 {
    public bi a;
    public int b;
    public h2 c;
    public qu d;
    public int e;
    public w60 f;
    public a70 g;

    public ri0(bi biVar) {
        this.a = biVar;
    }

    public final boolean a() {
        if (this.a != null) {
            h2 h2Var = this.c;
            if (h2Var != null ? h2Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final vz b(Object obj) {
        vz n;
        bi biVar = this.a;
        return (biVar == null || (n = biVar.n(this, obj)) == null) ? vz.d : n;
    }

    public final void c() {
        bi biVar = this.a;
        if (biVar != null) {
            biVar.r = true;
            biVar.u.getClass();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
