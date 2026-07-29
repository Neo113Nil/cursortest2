package o;

/* renamed from: o.Ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138Ff extends AbstractC2367ze {
    public Object h;
    public C0657Zf i;
    public C2299yc j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C0657Zf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138Ff(C0657Zf c0657Zf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.l = c0657Zf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return C0657Zf.a(this.l, null, this);
    }
}
