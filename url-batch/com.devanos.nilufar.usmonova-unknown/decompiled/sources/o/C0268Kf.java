package o;

/* renamed from: o.Kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268Kf extends AbstractC2367ze {
    public C0657Zf h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0657Zf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268Kf(C0657Zf c0657Zf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = c0657Zf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
