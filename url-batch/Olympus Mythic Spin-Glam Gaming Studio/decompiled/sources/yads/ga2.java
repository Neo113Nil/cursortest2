package yads;

/* loaded from: classes5.dex */
public final class ga2 implements wp2, vp2 {
    public final String a;
    public final ja2 b;
    public final /* synthetic */ ha2 c;

    public ga2(ha2 ha2Var, String str, ja2 ja2Var) {
        this.c = ha2Var;
        this.a = str;
        this.b = ja2Var;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        ((qg1) this.c.b.a).a("YmadOmSdkJs", (String) obj);
        la2 la2Var = this.c.b;
        ((qg1) la2Var.a).a("YmadOmSdkJsUrl", this.a);
        this.b.a();
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        this.b.a();
    }
}
