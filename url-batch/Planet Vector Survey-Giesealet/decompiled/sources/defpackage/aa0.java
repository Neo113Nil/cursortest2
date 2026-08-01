package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class aa0 {
    public t50 a;
    public int b;
    public l70 c;
    public l70 d;
    public boolean e;
    public final /* synthetic */ ca0 f;

    public aa0(ca0 ca0Var, t50 t50Var, int i, l70 l70Var, l70 l70Var2, boolean z) {
        this.f = ca0Var;
        this.a = t50Var;
        this.b = i;
        this.c = l70Var;
        this.d = l70Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        l70 l70Var = this.c;
        int i3 = this.b;
        s50 s50Var = (s50) l70Var.d[i + i3];
        s50 s50Var2 = (s50) this.d.d[i3 + i2];
        return nz.l(s50Var, s50Var2) || s50Var.getClass() == s50Var2.getClass();
    }
}
