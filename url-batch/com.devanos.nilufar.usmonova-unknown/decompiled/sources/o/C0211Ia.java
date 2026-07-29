package o;

/* renamed from: o.Ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211Ia extends AbstractC2367ze {
    public C0237Ja h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0237Ja k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211Ia(C0237Ja c0237Ja, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.k = c0237Ja;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
