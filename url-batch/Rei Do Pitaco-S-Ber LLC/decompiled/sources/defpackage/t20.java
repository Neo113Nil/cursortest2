package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t20 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ u20 g;
    public final /* synthetic */ re h;

    public /* synthetic */ t20(re reVar, u20 u20Var, int i) {
        this.f = i;
        this.h = reVar;
        this.g = u20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        u20 u20Var = this.g;
        re reVar = this.h;
        switch (i) {
            case 0:
                if (reVar.b.contains(u20Var)) {
                    n20.a(u20Var.c.J, u20Var.a);
                    break;
                }
                break;
            default:
                reVar.b.remove(u20Var);
                reVar.c.remove(u20Var);
                break;
        }
    }
}
