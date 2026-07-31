package yads;

/* loaded from: classes5.dex */
public final class gc1 implements dx0 {
    public final /* synthetic */ hc1 a;
    public final /* synthetic */ d8 b;

    public gc1(hc1 hc1Var, d8 d8Var) {
        this.a = hc1Var;
        this.b = d8Var;
    }

    @Override // yads.dx0
    public final void onAdShown() {
        this.a.e.invoke(this.b);
    }
}
