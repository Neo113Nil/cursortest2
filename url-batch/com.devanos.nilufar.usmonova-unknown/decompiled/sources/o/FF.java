package o;

/* loaded from: classes.dex */
public final class FF extends AbstractC2367ze {
    public GF h;
    public JL i;
    public /* synthetic */ Object j;
    public final /* synthetic */ GF k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FF(GF gf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = gf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return GF.a(this.k, this);
    }
}
