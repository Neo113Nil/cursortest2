package yads;

/* loaded from: classes4.dex */
public final class vg implements dx0 {
    public final /* synthetic */ wg a;
    public final /* synthetic */ d8 b;

    public vg(wg wgVar, d8 d8Var) {
        this.a = wgVar;
        this.b = d8Var;
    }

    @Override // yads.dx0
    public final void onAdShown() {
        this.a.e.invoke(this.b);
    }
}
