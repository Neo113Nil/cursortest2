package o;

/* renamed from: o.Im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223Im extends AbstractC2367ze {
    public C0249Jm h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0249Jm k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223Im(C0249Jm c0249Jm, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.k = c0249Jm;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
