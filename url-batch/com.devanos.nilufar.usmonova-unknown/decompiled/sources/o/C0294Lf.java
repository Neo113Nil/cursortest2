package o;

/* renamed from: o.Lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294Lf extends AbstractC2367ze {
    public C0657Zf h;
    public AT i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C0657Zf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294Lf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.l = c0657Zf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return C0657Zf.d(this.l, false, this);
    }
}
