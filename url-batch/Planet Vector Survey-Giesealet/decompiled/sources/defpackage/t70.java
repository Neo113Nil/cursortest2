package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t70 implements fc, u01 {
    public final hc d;
    public final /* synthetic */ u70 e;

    public t70(u70 u70Var, hc hcVar) {
        this.e = u70Var;
        this.d = hcVar;
    }

    @Override // defpackage.u01
    public final void a(kp0 kp0Var, int i) {
        this.d.a(kp0Var, i);
    }

    @Override // defpackage.fc
    public final op d(Object obj, ru ruVar) {
        u70 u70Var = this.e;
        gc gcVar = new gc(u70Var, this);
        op d = this.d.d((ky0) obj, gcVar);
        if (d != null) {
            u70.g.set(u70Var, null);
        }
        return d;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.d.h;
    }

    @Override // defpackage.fc
    public final boolean j(Throwable th) {
        return this.d.j(th);
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }

    @Override // defpackage.fc
    public final void v(Object obj) {
        this.d.v(obj);
    }
}
