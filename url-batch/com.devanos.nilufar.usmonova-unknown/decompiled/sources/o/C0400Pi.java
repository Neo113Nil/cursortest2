package o;

/* renamed from: o.Pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400Pi extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public final /* synthetic */ C0426Qi i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400Pi(C0426Qi c0426Qi, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.i = c0426Qi;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.emit(null, this);
    }
}
