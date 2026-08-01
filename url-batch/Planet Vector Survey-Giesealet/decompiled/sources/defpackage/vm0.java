package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vm0 implements ck0 {
    public on0 d;
    public xm0 e;
    public String f;
    public Object g;
    public Object[] h;
    public t7 i;
    public final ab0 j = new ab0(2, this);

    public vm0(on0 on0Var, xm0 xm0Var, String str, Object obj, Object[] objArr) {
        this.d = on0Var;
        this.e = xm0Var;
        this.f = str;
        this.g = obj;
        this.h = objArr;
    }

    public final void a() {
        String i;
        xm0 xm0Var = this.e;
        if (this.i != null) {
            g8.o("entry(", this.i, ") is not null");
            return;
        }
        if (xm0Var != null) {
            ab0 ab0Var = this.j;
            Object a = ab0Var.a();
            if (a == null || xm0Var.b(a)) {
                this.i = xm0Var.a(this.f, ab0Var);
                return;
            }
            if (a instanceof yr0) {
                yr0 yr0Var = (yr0) a;
                if (yr0Var.d() == b2.G || yr0Var.d() == b2.M || yr0Var.d() == b2.K) {
                    i = "MutableState containing " + yr0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    i = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                i = ze0.i(a);
            }
            throw new IllegalArgumentException(i);
        }
    }

    @Override // defpackage.ck0
    public final void c() {
        a();
    }

    @Override // defpackage.ck0
    public final void d() {
        t7 t7Var = this.i;
        if (t7Var != null) {
            t7Var.C();
        }
    }

    @Override // defpackage.ck0
    public final void j() {
        t7 t7Var = this.i;
        if (t7Var != null) {
            t7Var.C();
        }
    }
}
