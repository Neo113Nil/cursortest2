package o;

/* loaded from: classes.dex */
public final class EH extends AbstractC2367ze {
    public P3 h;
    public InterfaceC2114vp i;
    public /* synthetic */ Object j;
    public final /* synthetic */ P3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(P3 p3, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = p3;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(null, this);
    }
}
