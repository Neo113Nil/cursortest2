package o;

/* loaded from: classes.dex */
public final class MF extends AbstractC2367ze {
    public C0935dv h;
    public C0935dv i;
    public IL j;
    public /* synthetic */ Object k;
    public final /* synthetic */ NF l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MF(NF nf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.l = nf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
