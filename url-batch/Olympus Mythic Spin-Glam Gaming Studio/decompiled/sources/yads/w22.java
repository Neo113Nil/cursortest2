package yads;

/* loaded from: classes6.dex */
public final class w22 {
    public final v3 a;
    public final String b;
    public final t8 c;
    public final s12 d;
    public final i32 e;
    public d32 f = null;

    public w22(v3 v3Var, String str, t8 t8Var, s12 s12Var, i32 i32Var) {
        this.a = v3Var;
        this.b = str;
        this.c = t8Var;
        this.d = s12Var;
        this.e = i32Var;
    }

    public final io2 a() {
        io2 a = this.e.a(this.a, this.c, this.d);
        d32 d32Var = this.f;
        if (d32Var != null) {
            a.b(d32Var.b, "bind_type");
        }
        a.a(this.b, "native_ad_type");
        l03 l03Var = this.a.d.a;
        if (l03Var != null) {
            a.b(l03Var.b().b, "size_type");
            a.b(Integer.valueOf(l03Var.getWidth()), "width");
            a.b(Integer.valueOf(l03Var.getHeight()), "height");
        }
        a.b = this.c.i;
        return a;
    }
}
