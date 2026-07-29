package o;

/* renamed from: o.Xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605Xf extends AbstractC2367ze {
    public C1230iM h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0657Zf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605Xf(C0657Zf c0657Zf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c0657Zf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, false, this);
    }
}
