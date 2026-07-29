package o;

/* renamed from: o.Lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301Lm extends AbstractC2367ze {
    public C0426Qi h;
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ C0426Qi k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301Lm(C0426Qi c0426Qi, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.k = c0426Qi;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
