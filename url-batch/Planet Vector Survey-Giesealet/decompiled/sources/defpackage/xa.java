package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xa implements mu {
    public final /* synthetic */ wa d;
    public final /* synthetic */ ya e;
    public final /* synthetic */ ej0 f;

    public xa(wa waVar, ya yaVar, ej0 ej0Var) {
        this.d = waVar;
        this.e = yaVar;
        this.f = ej0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i;
        wa waVar = this.d;
        waVar.a = null;
        waVar.b = null;
        q8 q8Var = this.e.g;
        int i2 = this.f.d;
        do {
            i = q8Var.get();
        } while (!q8Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return ky0.a;
    }
}
