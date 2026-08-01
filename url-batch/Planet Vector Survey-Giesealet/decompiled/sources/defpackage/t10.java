package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t10 extends t50 implements de0 {
    public float r;
    public boolean s;

    @Override // defpackage.de0
    public final Object Q(Object obj) {
        dm0 dm0Var = obj instanceof dm0 ? (dm0) obj : null;
        if (dm0Var == null) {
            dm0Var = new dm0();
            dm0Var.a = 0.0f;
            dm0Var.b = true;
        }
        dm0Var.a = this.r;
        dm0Var.b = this.s;
        return dm0Var;
    }
}
