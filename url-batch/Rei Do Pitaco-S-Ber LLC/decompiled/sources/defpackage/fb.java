package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fb implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ b3 g;

    public /* synthetic */ fb(b3 b3Var, int i) {
        this.f = i;
        this.g = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        b3 b3Var = this.g;
        switch (i) {
            case 0:
                pb.f(b3Var);
                break;
            default:
                b3Var.invalidateOptionsMenu();
                break;
        }
    }
}
