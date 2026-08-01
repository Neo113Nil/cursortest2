package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u4 extends xj {
    public final /* synthetic */ b5 o;
    public final /* synthetic */ e5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(e5 e5Var, e5 e5Var2, b5 b5Var) {
        super(e5Var2);
        this.p = e5Var;
        this.o = b5Var;
    }

    @Override // defpackage.xj
    public final b20 b() {
        return this.o;
    }

    @Override // defpackage.xj
    public final boolean c() {
        e5 e5Var = this.p;
        if (e5Var.getInternalPopup().b()) {
            return true;
        }
        e5Var.k.n(e5Var.getTextDirection(), e5Var.getTextAlignment());
        return true;
    }
}
