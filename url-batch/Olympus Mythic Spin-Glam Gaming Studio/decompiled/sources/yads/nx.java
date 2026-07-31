package yads;

/* loaded from: classes3.dex */
public final class nx extends qx {
    public final /* synthetic */ ux f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ux uxVar) {
        super(uxVar);
        this.f = uxVar;
    }

    @Override // yads.qx
    public final Object a(int i) {
        return new sx(this.f, i);
    }
}
