package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class qb implements dl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qb(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.dl
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                nf nfVar = new nf();
                ((rb) obj).c().a().b(nfVar);
                return nfVar;
            case 1:
                return new pv(new p1(5, (rb) obj));
            default:
                return new nv((pv) obj);
        }
    }
}
