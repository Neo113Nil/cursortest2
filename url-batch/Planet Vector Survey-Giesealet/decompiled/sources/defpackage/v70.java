package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v70 extends o01 implements n01 {
    public in0 a;
    public g20 b;

    @Override // defpackage.n01
    public final k01 a(Class cls) {
        g20 g20Var = this.b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            g8.r("Local and anonymous classes can not be ViewModels");
            return null;
        }
        if (g20Var == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        in0 in0Var = this.a;
        in0Var.getClass();
        g20Var.getClass();
        cn0 k = nk.k(in0Var, g20Var, canonicalName, null);
        w70 w70Var = new w70(k.e);
        w70Var.addCloseable("androidx.lifecycle.savedstate.vm.tag", k);
        return w70Var;
    }

    @Override // defpackage.n01
    public final k01 b(Class cls, m60 m60Var) {
        String str = (String) m60Var.a.get(p01.f);
        if (str == null) {
            g8.s("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        in0 in0Var = this.a;
        if (in0Var == null) {
            return new w70(x40.w(m60Var));
        }
        in0Var.getClass();
        g20 g20Var = this.b;
        g20Var.getClass();
        cn0 k = nk.k(in0Var, g20Var, str, null);
        w70 w70Var = new w70(k.e);
        w70Var.addCloseable("androidx.lifecycle.savedstate.vm.tag", k);
        return w70Var;
    }

    @Override // defpackage.n01
    public final k01 c(ld ldVar, m60 m60Var) {
        Class cls = ldVar.a;
        cls.getClass();
        return b(cls, m60Var);
    }

    @Override // defpackage.o01
    public final void d(k01 k01Var) {
        in0 in0Var = this.a;
        if (in0Var != null) {
            g20 g20Var = this.b;
            g20Var.getClass();
            nk.e(k01Var, in0Var, g20Var);
        }
    }
}
